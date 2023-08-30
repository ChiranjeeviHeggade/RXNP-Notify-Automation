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

import static com.automation.testBedUtils.GetResponseUtil.getPatientLookUpAPIBody;

/*
@Author-Subhankar Das
 */
public class GetRxStatusByPatientIDUtil {

    public static boolean isRxActiveByPatientID(HttpResponse response, String Rx) throws ParseException {
        boolean flag = false, flag1 = false, flag2 = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //check JSON object of the given Rx
        String st = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "status");

        //check status
        if (st.equalsIgnoreCase("Y")) {
            //  System.out.println("Rx status is Y");
            flag1 = true;
        }
        //check expire date is greater than current date
        String expire = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "expire");
        String[] date = expire.split("T");
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

    public static boolean isRefillEligibleByPatientID(HttpResponse response, String Rx) throws ParseException {
        boolean flag = false, flag1 = false, flag2 = false, flag3 = false, flag4 = false, flag5 = true;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition-1: Rx is not expired
        String expire = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "expire");
        String[] date = expire.split("T");
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdformat.parse(date[0]);
        Date d2 = sdformat.parse(java.time.LocalDate.now().toString());

        if (d1.compareTo(d2) > 0) {
            // System.out.println("Expire date is greater than Current date");
            flag1 = true;
        }
        if (flag1) {

            //condition-2 refrem>0
            String RefRem = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "refRem");
            int actualRefRem = Integer.parseInt(RefRem);
            if (actualRefRem > 0) {
                // System.out.println("RefRem:" + actualRefRem);
                flag2 = true;
            }
            if (flag2) {
                //condition-3 WillCall = N of latest Txn
                String RefNum = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "refNum");
                int actualRefNum = Integer.parseInt(RefNum);
                //System.out.println("RefNum:" + actualRefNum);
                int index = getObjectIndexByReferringKeyValue(arr, "rxnum", Rx);
                JSONObject js = arr.getJSONObject(index);
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

    public static boolean isAutoRefillONByPatientID(HttpResponse response, String Rx) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //check autoRefill =true
        String autoRefill = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "autoRefill");
        if (autoRefill.equalsIgnoreCase("true")) {
            //  System.out.println("Auto Refill is true");
            flag = true;
        }
        return flag;
    }

    public static boolean isAutoRefillOFFByPatientID(HttpResponse response, String Rx) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //check autoRefill =false
        String autoRefill = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "autoRefill");
        if (autoRefill.equalsIgnoreCase("false")) {
            // System.out.println("Auto Refill is false");
            flag = true;
        }
        return flag;
    }

    public static boolean isRenewEligibleByPatientID(HttpResponse response, String Rx) throws ParseException {
        boolean flag = false, flag1 = false, flag2 = false, flag3 = false, flag4 = false, flag5 = true;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition-1 refrem=0 Or expire data is less than today's date
        String RefRem = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "refRem");
        int actualRefRem = Integer.parseInt(RefRem);
        if (actualRefRem == 0) {
            // System.out.println("RefRem:" + actualRefRem);
            flag1 = true;
        }

        String expire = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "expire");
        String[] date = expire.split("T");
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdformat.parse(date[0]);
        Date d2 = sdformat.parse(java.time.LocalDate.now().toString());

        if (d1.compareTo(d2) < 0) {
            // System.out.println("Expire date is less than Current date");
            flag2 = true;
        }
        if (flag1 || flag2) {

            //condition-2 WillCall = N of latest Txn
            String RefNum = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "refNum");
            int actualRefNum = Integer.parseInt(RefNum);
            //  System.out.println("RefNum:" + actualRefNum);

            int index = getObjectIndexByReferringKeyValue(arr, "rxnum", Rx);
            JSONObject js = arr.getJSONObject(index);
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

            //condition-4 Tx status is NOT in R, N, D, E, S, I , C or H (Cancelled, Credit returned, Hold)
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

    public static boolean isPickupEligibleByPatientID(HttpResponse response, String Rx) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition  if Will Call = Y of latest Txn
        String RefNum = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "refNum");
        int actualRefNum = Integer.parseInt(RefNum);
        // System.out.println("RefNum:" + actualRefNum);

        int index = getObjectIndexByReferringKeyValue(arr, "rxnum", Rx);
        JSONObject js = arr.getJSONObject(index);
        JSONArray jArr = js.getJSONArray("transactionDetails");

        String willCall;
        willCall = getKeyValueByReferringAnotherKey(jArr, "refillNumber", actualRefNum, "willCallReady");
        if (willCall.equalsIgnoreCase("Y")) {
            flag = true;
        }

        return flag;
    }

    public static boolean isDeliveryEligibleByPatientID(HttpResponse response, String Rx) throws ParseException {
        boolean flag = false, flag1 = false, flag2 = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition-1 dispenseDrugSchedule is not = 2
        String drugSchedule = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "dispensedDrugSchedule");
        int dispensedDrugSchedule = Integer.parseInt(drugSchedule);
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

    public static boolean isNoRefillsRemainingByPatientID(HttpResponse response, String Rx) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition-1 refrem=0
        String RefRem = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "refRem");
        int actualRefRem = Integer.parseInt(RefRem);
        if (actualRefRem == 0) {
            //     System.out.println("RefRem:" + actualRefRem);
            flag = true;
        }
        return flag;
    }

    public static boolean isRefillRequestedByPatientID(HttpResponse response, String Rx) throws ParseException {
        boolean flag = false, flag1 = false, flag2 = false, flag3 = true;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //condition  if Will Call = N of latest Txn
        String RefNum = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "refNum");
        int actualRefNum = Integer.parseInt(RefNum);
        // System.out.println("RefNum:" + actualRefNum);

        int index = getObjectIndexByReferringKeyValue(arr, "rxnum", Rx);
        JSONObject js = arr.getJSONObject(index);
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

    public static boolean isExpiredByPatientID(HttpResponse response, String Rx) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");
        String expire = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "expire");
        String[] date = expire.split("T");
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdformat.parse(date[0]);
        Date d2 = sdformat.parse(java.time.LocalDate.now().toString());

        if (d1.compareTo(d2) < 0) {
            //System.out.println("Rx is expired");
            flag = true;
        }
        return flag;
    }

    public static boolean iSExpiringOnByPatientID(HttpResponse response, String Rx) throws ParseException {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");
        String expire = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "expire");
        String[] date = expire.split("T");
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

    public static boolean isRxOnFileByPatientID(HttpResponse response, String Rx) {
        boolean flag = false;
        JSONArray arr = response.getJsonResponse().getJSONArray("prescription");

        //check status
        String st = getKeyValueByReferringAnotherKey(arr, "rxnum", Rx, "status");
        if (st.equalsIgnoreCase("H")) {
            //    System.out.println("Rx status is H");
            flag = true;
        }
        return flag;
    }

    private static List<String> getValuesForGivenKey(JSONArray jsonArray, String key) {
        return IntStream.range(0, jsonArray.length())
                .mapToObj(index -> ((JSONObject) jsonArray.get(index)).optString(key))
                .collect(Collectors.toList());
    }

    private static String getKeyValueByReferringAnotherKey(JSONArray jsonArray, String key, Object value, String anotherKey) {
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

    private static int getObjectIndexByReferringKeyValue(JSONArray jsonArray, String key, Object value) {
        int Obindex = 0;
        List<String> arr = IntStream.range(0, jsonArray.length())
                .mapToObj(index -> ((JSONObject) jsonArray.get(index)).optString(key))
                .collect(Collectors.toList());
        for (int k = 0; k < arr.size(); k++) {
            if (arr.get(k).equals(value.toString())) {
                Obindex = k;

            }
        }
        return Obindex;
    }

    public static void main(String[] args) {
//       HttpResponse response= new GetResponseUtil().getRxData(
//                getPatientLookUpAPIBody("UNITED", "19268040"));
//        try {
//            isRefillRequestedByPatientID(response,"6236705");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }
}
