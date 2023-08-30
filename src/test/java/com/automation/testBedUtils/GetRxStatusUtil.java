package com.automation.testBedUtils;

import com.automation.mobile.models.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
@Author-Subhankar Das
 */
public class GetRxStatusUtil {

    public static boolean isRxActive(HttpResponse response) throws ParseException {
        boolean flag = false, flag1 = false, flag2 = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //check status
        List<String> st = getValuesForGivenKey(arr, "status");
        if (st.get(0).equalsIgnoreCase("Y")) {
            //  System.out.println("Rx status is Y");
            flag1 = true;
        }

        //check expire
        List<String> expire = getValuesForGivenKey(arr, "expire");
        String[] date = expire.get(0).split("T");
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdformat.parse(date[0]);
        Date d2 = sdformat.parse(java.time.LocalDate.now().toString());

        if (d1.compareTo(d2) > 0) {
            //System.out.println("Expire date is greater than Current date");
            flag2 = true;
        }

        if (flag1 && flag2) {
            flag = true;
        }

        return flag;
    }

    public static boolean isRefillEligible(HttpResponse response) throws ParseException {
        boolean flag = false, flag1 = false, flag2 = false, flag3 = false, flag4 = false, flag5 = true;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition-1: Rx is not expired
        List<String> expire = getValuesForGivenKey(arr, "expire");
        String[] date = expire.get(0).split("T");
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdformat.parse(date[0]);
        Date d2 = sdformat.parse(java.time.LocalDate.now().toString());

        if (d1.compareTo(d2) > 0) {
            // System.out.println("Expire date is greater than Current date");
            flag1 = true;
        }
        if (flag1) {
            //condition-2 refrem>0
            List<String> RefRem = getValuesForGivenKey(arr, "refRem");
            int actualRefRem = Integer.parseInt(RefRem.get(0));
            if (actualRefRem > 0) {
                // System.out.println("RefRem:" + actualRefRem);
                flag2 = true;
            }
            if (flag2) {
                //condition-3 WillCall = N of latest Txn
                List<String> RefNum = getValuesForGivenKey(arr, "refNum");
                int actualRefNum = Integer.parseInt(RefNum.get(0));
                //System.out.println("RefNum:" + actualRefNum);

                JSONObject js = arr.getJSONObject(0);
                JSONArray jArr = js.getJSONArray("transactionDetails");

                String willCall;
                willCall = getKeyValueByReferringAnotherKey(jArr, "refillNumber", actualRefNum, "willCallReady");
                if (willCall.equalsIgnoreCase("N")) {
                    flag3 = true;
                }
                //condition-4 Sold Date is not blank of Txn
                String sold = null;
                try {
                    sold = getKeyValueByReferringAnotherKey(jArr, "refillNumber", actualRefNum, "sold");
                } catch (Exception e) {

                }

                if (sold != null) {
                    flag4 = true;
                }

                //condition-5 Tx status is NOT in R, N, D, E, S, I , C or H (Cancelled, Credit returned, Hold)
                String txstatus;
                txstatus = getKeyValueByReferringAnotherKey(jArr, "refillNumber", actualRefNum, "txstatus");

                String[] str =
                        {"R", "N", "D", "E", "S", "I", "C", "H"};
                for (String tx : str) {
                    if (txstatus.equalsIgnoreCase(tx)) {
                        flag5 = false;
                        break;
                    }
                }
                if (flag3 && flag4 && flag5) {
                    flag = true;
                }
            }
        }

        return flag;
    }

    public static boolean isAutoRefillON(HttpResponse response) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //check autoRefill =true
        List<String> st = getValuesForGivenKey(arr, "autoRefill");
        if (st.get(0).equalsIgnoreCase("true")) {
            //  System.out.println("Auto Refill is true");
            flag = true;
        }
        return flag;
    }

    public static boolean isAutoRefillOFF(HttpResponse response) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //check autoRefill =false
        List<String> st = getValuesForGivenKey(arr, "autoRefill");
        if (st.get(0).equalsIgnoreCase("false")) {
            // System.out.println("Auto Refill is false");
            flag = true;
        }
        return flag;
    }

    public static boolean isRenewEligible(HttpResponse response) throws ParseException {
        boolean flag = false, flag1 = false, flag2 = false, flag3 = false, flag4 = false, flag5 = true;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition-1 refrem=0 Or expire data is less than today's date
        List<String> RefRem = getValuesForGivenKey(arr, "refRem");
        int actualRefRem = Integer.parseInt(RefRem.get(0));
        if (actualRefRem == 0) {
            // System.out.println("RefRem:" + actualRefRem);
            flag1 = true;
        }

        List<String> expire = getValuesForGivenKey(arr, "expire");
        String[] date = expire.get(0).split("T");
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdformat.parse(date[0]);
        Date d2 = sdformat.parse(java.time.LocalDate.now().toString());

        if (d1.compareTo(d2) < 0) {
            // System.out.println("Expire date is less than Current date");
            flag2 = true;
        }
        if (flag1 || flag2) {

            //condition-2 WillCall = N of latest Txn
            List<String> RefNum = getValuesForGivenKey(arr, "refNum");
            int actualRefNum = Integer.parseInt(RefNum.get(0));
            //  System.out.println("RefNum:" + actualRefNum);

            JSONObject js = arr.getJSONObject(0);
            JSONArray jArr = js.getJSONArray("transactionDetails");

            String willCall;
            willCall = getKeyValueByReferringAnotherKey(jArr, "refillNumber", actualRefNum, "willCallReady");
            if (willCall.equalsIgnoreCase("N")) {
                flag3 = true;
            }

            //condition-3 Sold Date is not blank of Txn
            String sold = null;
            try {
                sold = getKeyValueByReferringAnotherKey(jArr, "refillNumber", actualRefNum, "sold");
            } catch (Exception e) {

            }
            if (sold != null) {
                flag4 = true;
            }

            //condition-5 Tx status is NOT in R, N, D, E, S, I , C or H (Cancelled, Credit returned, Hold)
            String txstatus;
            txstatus = getKeyValueByReferringAnotherKey(jArr, "refillNumber", actualRefNum, "txstatus");

            String[] str =
                    {"R", "N", "D", "E", "S", "I", "C", "H"};
            for (String tx : str) {
                if (txstatus.equalsIgnoreCase(tx)) {
                    flag5 = false;
                    break;
                }
            }

            if (flag3 && flag4 && flag5) {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean isPickupEligible(HttpResponse response) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition  if Will Call = Y of latest Txn
        List<String> RefNum = getValuesForGivenKey(arr, "refNum");
        int actualRefNum = Integer.parseInt(RefNum.get(0));
        // System.out.println("RefNum:" + actualRefNum);

        JSONObject js = arr.getJSONObject(0);
        JSONArray jArr = js.getJSONArray("transactionDetails");

        String willCall;
        willCall = getKeyValueByReferringAnotherKey(jArr, "refillNumber", actualRefNum, "willCallReady");
        if (willCall.equalsIgnoreCase("Y")) {
            flag = true;
        }


        return flag;
    }

    public static boolean isDeliveryEligible(HttpResponse response) throws ParseException {
        boolean flag = false, flag1 = false, flag2 = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition-1 dispenseDrugSchedule is not = 2
        List<String> drugScheduleList = getValuesForGivenKey(arr, "dispensedDrugSchedule");
        int dispensedDrugSchedule = Integer.parseInt(drugScheduleList.get(0));
        if (dispensedDrugSchedule != 2) {
            // System.out.println("dispensedDrugSchedule:" + dispensedDrugSchedule);
            flag1 = true;
        }
        //condition-2 Insurance plan name is not Medicare
        JSONArray InsuranceArr = response.getJsonResponse().getJSONArray("insurance");
        List<String> planNameList = getValuesForGivenKey(InsuranceArr, "planName");
        String planName = planNameList.get(0);
        if (!planName.equalsIgnoreCase("Medicare")) {
            //   System.out.println("planName:" + planName);
            flag2 = true;
        }

        if (flag1 && flag2) {
            flag = true;
        }
        return flag;
    }

    public static boolean isNoRefillsRemaining(HttpResponse response) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition-1 refrem=0
        List<String> RefRem = getValuesForGivenKey(arr, "refRem");
        int actualRefRem = Integer.parseInt(RefRem.get(0));
        if (actualRefRem == 0) {
            //     System.out.println("RefRem:" + actualRefRem);
            flag = true;
        }
        return flag;
    }

    public static boolean isRefillRequested(HttpResponse response) throws ParseException {
        boolean flag = false, flag1 = false, flag2 = false, flag3 = true;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition  if Will Call = N of latest Txn
        List<String> RefNum = getValuesForGivenKey(arr, "refNum");
        int actualRefNum = Integer.parseInt(RefNum.get(0));
        // System.out.println("RefNum:" + actualRefNum);

        JSONObject js = arr.getJSONObject(0);
        JSONArray jArr = js.getJSONArray("transactionDetails");

        String willCall;
        willCall = getKeyValueByReferringAnotherKey(jArr, "refillNumber", actualRefNum, "willCallReady");
        if (willCall.equalsIgnoreCase("N")) {
            flag1 = true;
        }


        //condition-2 Sold Date is blank of Txn
        String sold = null;
        try {
            sold = getKeyValueByReferringAnotherKey(jArr, "refillNumber", actualRefNum, "sold");
        } catch (Exception e) {

        }

        if (sold == null) {
            flag2 = true;
        }

        //condition-3 Tx status is NOT in N,C,H (Cancelled, Credit returned, Hold)
        String txstatus;
        txstatus = getKeyValueByReferringAnotherKey(jArr, "refillNumber", actualRefNum, "txstatus");

        String[] str =
                {"N", "C", "H"};
        for (String tx : str) {
            if (txstatus.equalsIgnoreCase(tx)) {
                flag3 = false;
                break;
            }
        }

        if (flag1 && flag2 && flag3) {
            flag = true;
        }

        return flag;
    }

    public static boolean isExpired(HttpResponse response) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");
        List<String> expire = getValuesForGivenKey(arr, "expire");
        String[] date = expire.get(0).split("T");
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdformat.parse(date[0]);
        Date d2 = sdformat.parse(java.time.LocalDate.now().toString());

        if (d1.compareTo(d2) < 0) {
            //System.out.println("Rx is expired");
            flag = true;
        }
        return flag;
    }

    public static boolean iSExpiringOn(HttpResponse response) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");
        List<String> expire = getValuesForGivenKey(arr, "expire");
        String[] date = expire.get(0).split("T");
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateAfter = sdformat.parse(date[0]);
        Date currentDate = sdformat.parse(java.time.LocalDate.now().toString());

        // Calculate the number of days between dates
        long timeDiff = Math.abs(dateAfter.getTime() - currentDate.getTime());
        long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
        System.out.println("The number of days between dates: " + daysDiff);

        if (dateAfter.compareTo(currentDate) > 0) {
            if (daysDiff < 7) {
                //System.out.println("Rx is expiring");
                flag = true;
            }

        }
        return flag;
    }

    public static boolean isRxOnFile(HttpResponse response) {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //check status
        List<String> st = getValuesForGivenKey(arr, "status");
        if (st.get(0).equalsIgnoreCase("H")) {
            //    System.out.println("Rx status is H");
            flag = true;
        }
        return flag;
    }

    private static List<String> getValuesForGivenKey(JSONArray jsonArray, String key) {
        //   JSONArray jsonArray = new JSONArray(jsonArrayStr);
        return IntStream.range(0, jsonArray.length())
                .mapToObj(index -> ((JSONObject) jsonArray.get(index)).optString(key))
                .collect(Collectors.toList());
    }

    private static String getKeyValueByReferringAnotherKey(JSONArray jsonArray, String key, Object value, String anotherKey) {
        //   JSONArray jsonArray = new JSONArray(jsonArrayStr);
        String keyValue = null;
        List<String> arr = IntStream.range(0, jsonArray.length())
                .mapToObj(index -> ((JSONObject) jsonArray.get(index)).optString(key))
                .collect(Collectors.toList());

        for (int k = 0; k < arr.size(); k++) {
            if (arr.get(k).equals(value.toString())) {

                keyValue = ((JSONObject) jsonArray.get(k)).optString(anotherKey);
                if (keyValue != null) {
//                    System.out.println("Key Value:" + keyValue);
                    break;
                }

            }
        }
        return keyValue;
    }

    public static String getDrugName(HttpResponse response) throws ParseException {
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");
        List<String> drugNum = getValuesForGivenKey(arr, "prescDrugName");
        return drugNum.get(0);
    }

    public static String getPatientID(HttpResponse response) throws ParseException {
        JSONObject ob = response.getJsonResponse().getJSONObject("patient");
        return ob.optString("patientId");
    }

    public static void main(String[] args) throws ParseException {
//        HttpResponse response= new GetResponseUtil().getRxData(getRxAPIBody("ALBERTSONS", "6004481", "9601"));
//        System.out.println( isDeliveryEligible(response));

    }
}
