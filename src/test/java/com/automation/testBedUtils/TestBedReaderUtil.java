package com.automation.testBedUtils;

import com.automation.mobile.models.HttpResponse;
import com.automation.mobile.util.GlobalVar;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static com.automation.testBedUtils.GetResponseUtil.getPatientLookUpAPIBody;
import static com.automation.testBedUtils.GetResponseUtil.getRxAPIBody;
import static com.automation.testBedUtils.GetRxStatusByPatientIDUtil.*;
import static com.automation.testBedUtils.GetRxStatusUtil.*;

/*
@Author- Subhankar Das
 */
public class TestBedReaderUtil {
    private static final String path = System.getProperty("user.dir");
    private static final String fileName = "Pharmacy_TestBed.xlsx";
    private static final String fileLocation = path + "/src/test/resources/TestBed/" + fileName;
    public static String DRUG_NAME = null;

    public ArrayList<Object> readRxFromTestBed(ExcelUtil excelUtil) {
        ArrayList<Object> rxList = new ArrayList<>();
        int rows = excelUtil.getRowCount();
        for (int i = 1; i < rows; i++) {
            rxList.add(excelUtil.getCellData("Rx#", i));
        }
        return rxList;
    }




    public HashSet<Object> readPatientIDFromTestBed(ExcelUtil excelUtil) {
        ArrayList<Object> patientList = new ArrayList<>();
        int rows = excelUtil.getRowCount();
        for (int i = 1; i < rows; i++) {
            patientList.add(excelUtil.getCellData("PatientID", i));
        }
        return new HashSet<>(patientList);
    }

    public String readChainFromTestBed(ExcelUtil excelUtil, String columnReference) {
        int index = excelUtil.getCellIndex(columnReference);
        return (String) excelUtil.getCellData("Chain", index);
    }

    public ArrayList<Object> readRxFromTestBedByPatientID(ExcelUtil excelUtil, String patientID) {
        ArrayList<Object> rxList = new ArrayList<>();
        int rows = excelUtil.getRowCount();
        for (int i = 1; i < rows; i++) {
            String pID = excelUtil.getCellData("PatientID", i).toString();
            if (pID.equalsIgnoreCase(patientID)) {
                rxList.add(excelUtil.getCellData("Rx#", i));
            }
        }
        return rxList;
    }

    public String readEmailFromTestBed(String PatientID) {
        ExcelUtil excelUtil = new ExcelUtil(fileLocation, "Credentials");
        int index = excelUtil.getCellIndex(PatientID);
        return (String) excelUtil.getCellData("Email", index);
    }

    public String readPasswordFromTestBed(String PatientID) {
        ExcelUtil excelUtil = new ExcelUtil(fileLocation, "Credentials");
        int index = excelUtil.getCellIndex(PatientID);
        return (String) excelUtil.getCellData("Password", index);
    }

    public String readFirstNameFromTestBed(String Rx) {
        ExcelUtil excelUtil = new ExcelUtil(fileLocation, "Input_"+getBanner());
        int index = excelUtil.getCellIndex(Rx);
        return (String) excelUtil.getCellData("FirstName", index);
    }

    public String readLastNameFromTestBed(String Rx) {
        ExcelUtil excelUtil = new ExcelUtil(fileLocation, "Input_"+getBanner());
        int index = excelUtil.getCellIndex(Rx);
        return (String) excelUtil.getCellData("LastName", index);
    }

    public String readDOBFromTestBed(String Rx) {
        ExcelUtil excelUtil = new ExcelUtil(fileLocation, "Input_"+getBanner());
//        ExcelUtil excelUtil = new ExcelUtil(fileLocation, "Input_unitedsupermarkets");
        int index = excelUtil.getCellIndex(Rx);
        return excelUtil.getCellData("DOB", index).toString();
    }

    public String readStoreNumFromTestBed(String Rx) {
        ExcelUtil excelUtil = new ExcelUtil(fileLocation, "Input_"+getBanner());
//        ExcelUtil excelUtil = new ExcelUtil(fileLocation, "Input_unitedsupermarkets");
        int index = excelUtil.getCellIndex(Rx);
        return excelUtil.getCellData("Store#", index).toString();
    }

    public enum RxCondition {
        IsRxActive,
        IsRefillEligible,
        IsAutoRefillON,
        IsAutoRefillOFF,
        IsRenewEligible,
        IsPickupEligible,
        IsDeliveryEligible,
        IsNoRefillsRemaining,
        IsRefillRequested,
        IsRefillCancelledBeforeWillCall,
        IsRefillCancelledAfterWillCall,
        IsExpired,
        IsExpiringOn,
        IsRxOnFile
    }

    public String getBanner() {
        return System.getProperty("banner");
    }

    public String getEnv() {
        return System.getProperty("mobileEnv");
    }


    public String getEligibleRx(String condition) {
        HttpResponse response;
        String Rx;
        String EligibleRx = null;
        String chain;
        String store;
        // String patient = null;
        ExcelUtil excelUtil = new ExcelUtil(fileLocation, "Input");
        ArrayList<Object> rxList = readRxFromTestBed(excelUtil);
        for (int i = 1; i <= rxList.size(); i++) {
            Rx = (String) rxList.get(i - 1);
            chain = (String) excelUtil.getCellData("Chain", i);
            store = (String) excelUtil.getCellData("Store#", i);
            response = new GetResponseUtil().getRxData(
                    getRxAPIBody(chain, Rx, store));
            switch (condition) {
                case "IsRxActive":
                    try {
                        if (isRxActive(response)) {
                            System.out.println("Rx: " + Rx + " is active");
                            EligibleRx = Rx;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "IsRefillEligible":
                    try {
                        if (isRefillEligible(response)) {
                            System.out.println("Rx: " + Rx + " is Eligible for Refill");
                            EligibleRx = Rx;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "IsAutoRefillOFF":
                    try {
                        if (isAutoRefillOFF(response)) {
                            System.out.println("Rx: " + Rx + " is not Eligible for Auto Refill");
                            EligibleRx = Rx;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "IsAutoRefillON":
                    try {
                        if (isAutoRefillON(response)) {
                            System.out.println("Rx: " + Rx + " is Eligible for Auto Refill");
                            EligibleRx = Rx;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "IsRenewEligible":
                    try {
                        if (isRenewEligible(response)) {
                            System.out.println("Rx: " + Rx + " is Eligible for Renew");
                            EligibleRx = Rx;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;

                case "IsPickupEligible":
                    try {
                        if (isPickupEligible(response)) {
                            System.out.println("Rx: " + Rx + " is Eligible for Pickup");
                            EligibleRx = Rx;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "IsDeliveryEligible":
                    try {
                        if (isDeliveryEligible(response)) {
                            System.out.println("Rx: " + Rx + " is Eligible for Delivery");
                            EligibleRx = Rx;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "IsNoRefillsRemaining":
                    try {
                        if (isNoRefillsRemaining(response)) {
                            System.out.println("Rx: " + Rx + " has No Refill remaining");
                            EligibleRx = Rx;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "IsRefillRequested":
                    try {
                        if (isRefillRequested(response)) {
                            System.out.println("Rx: " + Rx + " has Refill requested");
                            EligibleRx = Rx;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "IsRefillCancelledBeforeWillCall":
                case "IsRefillCancelledAfterWillCall":
                    //code to add
                    break;
                case "IsExpired":
                    try {
                        if (isExpired(response)) {
                            System.out.println("Rx: " + Rx + " is expired");
                            EligibleRx = Rx;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "IsExpiringOn":
                    try {
                        if (iSExpiringOn(response)) {
                            System.out.println("Rx: " + Rx + " is expiring within 7days");
                            EligibleRx = Rx;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "IsRxOnFile":
                    if (isRxOnFile(response)) {
                        System.out.println("Rx: " + Rx + " is expiring within 7days");
                        EligibleRx = Rx;
                    }
                    break;

                default:
                    System.out.println("Please provide Rx conditions as mentioned in the code");
                    break;
            }
            if (EligibleRx != null) {
                //get drug name
                try {
                    DRUG_NAME = getDrugName(response);
                    GlobalVar.ELIGIBLE_PATIENT_ID = getPatientID(response);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        if (EligibleRx == null) {
            System.out.println("No Rx found with matched condition:" + condition);
        }
        return EligibleRx;

    }

    public String getEligibleRxByPatientID(String condition) {
        HttpResponse response;
        String Rx;
        String EligibleRx = null;
        String chain;
        String patientID;

        String banner = getBanner();
        ExcelUtil excelUtil;
        if (banner != null) {
            excelUtil = new ExcelUtil(fileLocation, "Input_" + banner);
        } else {
            excelUtil = new ExcelUtil(fileLocation, "Input_unitedsupermarkets");
        }

        //Get Patient ID from Test Bed
        HashSet<Object> hsPatientID = readPatientIDFromTestBed(excelUtil);

        for (Object pID : hsPatientID) {
            patientID = pID.toString();
            chain = readChainFromTestBed(excelUtil, patientID);
            response = new GetResponseUtil().getRxData(
                    getPatientLookUpAPIBody(chain, patientID));

            System.out.println("Received API response for Patient ID:" + patientID);
            //Get Rx List related to the PatientID
            ArrayList<Object> rxList = readRxFromTestBedByPatientID(excelUtil, patientID);

            for (int i = 1; i <= rxList.size(); i++) {
                Rx = (String) rxList.get(i - 1);
                switch (condition) {
                    case "IsRxActive":
                        try {
                            if (isRxActiveByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is active");
                                EligibleRx = Rx;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsRefillEligible":
                        try {
                            if (isRefillEligibleByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is Eligible for Refill");
                                EligibleRx = Rx;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsAutoRefillOFF":
                        try {
                            if (isAutoRefillOFFByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is not Eligible for Auto Refill");
                                EligibleRx = Rx;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsAutoRefillON":
                        try {
                            if (isAutoRefillONByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is Eligible for Auto Refill");
                                EligibleRx = Rx;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsRenewEligible":
                        try {
                            if (isRenewEligibleByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is Eligible for Renew");
                                EligibleRx = Rx;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;

                    case "IsPickupEligible":
                        try {
                            if (isPickupEligibleByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is Eligible for Pickup");
                                EligibleRx = Rx;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsDeliveryEligible":
                        try {
                            if (isDeliveryEligibleByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is Eligible for Delivery");
                                EligibleRx = Rx;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsNoRefillsRemaining":
                        try {
                            if (isNoRefillsRemainingByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " has No Refill remaining");
                                EligibleRx = Rx;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsRefillRequested":
                        try {
                            if (isRefillRequestedByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " has Refill requested");
                                EligibleRx = Rx;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsRefillCancelledBeforeWillCall":
                    case "IsRefillCancelledAfterWillCall":
                        //code to add
                        break;
                    case "IsExpired":
                        try {
                            if (isExpiredByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is expired");
                                EligibleRx = Rx;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsExpiringOn":
                        try {
                            if (iSExpiringOnByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is expiring within 7days");
                                EligibleRx = Rx;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsRxOnFile":
                        if (isRxOnFileByPatientID(response, Rx)) {
                            System.out.println("Rx: " + Rx + " is expiring within 7days");
                            EligibleRx = Rx;
                        }
                        break;

                    default:
                        System.out.println("Please provide Rx conditions as mentioned in the code");
                        break;
                }
                if (EligibleRx != null) {
                    GlobalVar.ELIGIBLE_PATIENT_ID = patientID;
                    break;
                }
            }
            if (EligibleRx != null) {
                break;
            }
        }
        if (EligibleRx == null) {
            System.out.println("No Rx found with matched condition:" + condition);
        }

        return EligibleRx;

    }


    public List<String> getMultipleEligibleRxByPatientID(String condition, int numberOfEligibleRx) {
        HttpResponse response;
        String Rx;
        String chain;
        String patientID;
        List<String> eligibleRxList = new ArrayList();
        String banner = getBanner();
        ExcelUtil excelUtil;
        if (banner != null) {
            excelUtil = new ExcelUtil(fileLocation, "Input_" + banner);
        } else {
            excelUtil = new ExcelUtil(fileLocation, "Input_unitedsupermarkets");
        }

        HashSet<Object> hsPatientID = readPatientIDFromTestBed(excelUtil);

        for (Object pID : hsPatientID) {
            patientID = pID.toString();
            chain = readChainFromTestBed(excelUtil, patientID);
            response = new GetResponseUtil().getRxData(
                    getPatientLookUpAPIBody(chain, patientID));

            System.out.println("Received API response for Patient ID:" + patientID);
            //Get Rx List related to the PatientID
            ArrayList<Object> rxList = readRxFromTestBedByPatientID(excelUtil, patientID);

            for (int i = 1; i <= rxList.size(); i++) {
                Rx = (String) rxList.get(i - 1);
                switch (condition) {
                    case "IsRxActive":
                        try {
                            if (isRxActiveByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is active");
                                eligibleRxList.add(Rx);
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsRefillEligible":
                        try {
                            if (isRefillEligibleByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is Eligible for Refill");
                                eligibleRxList.add(Rx);
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsAutoRefillOFF":
                        try {
                            if (isAutoRefillOFFByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is not Eligible for Auto Refill");
                                eligibleRxList.add(Rx);
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsAutoRefillON":
                        try {
                            if (isAutoRefillONByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is Eligible for Auto Refill");
                                eligibleRxList.add(Rx);
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsRenewEligible":
                        try {
                            if (isRenewEligibleByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is Eligible for Renew");
                                eligibleRxList.add(Rx);
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;

                    case "IsPickupEligible":
                        try {
                            if (isPickupEligibleByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is Eligible for Pickup");
                                eligibleRxList.add(Rx);
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsDeliveryEligible":
                        try {
                            if (isDeliveryEligibleByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is Eligible for Delivery");
                                eligibleRxList.add(Rx);
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsNoRefillsRemaining":
                        try {
                            if (isNoRefillsRemainingByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " has No Refill remaining");
                                eligibleRxList.add(Rx);
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsRefillRequested":
                        try {
                            if (isRefillRequestedByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " has Refill requested");
                                eligibleRxList.add(Rx);
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsRefillCancelledBeforeWillCall":
                    case "IsRefillCancelledAfterWillCall":
                        //code to add
                        break;
                    case "IsExpired":
                        try {
                            if (isExpiredByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is expired");
                                eligibleRxList.add(Rx);
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsExpiringOn":
                        try {
                            if (iSExpiringOnByPatientID(response, Rx)) {
                                System.out.println("Rx: " + Rx + " is expiring within 7days");
                                eligibleRxList.add(Rx);
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "IsRxOnFile":
                        if (isRxOnFileByPatientID(response, Rx)) {
                            System.out.println("Rx: " + Rx + " is expiring within 7days");
                            eligibleRxList.add(Rx);
                        }
                        break;

                    default:
                        System.out.println("Please provide Rx conditions as mentioned in the code");
                        break;
                }

                if (i <= rxList.size() && eligibleRxList.size() == numberOfEligibleRx) {
                    System.out.println("Required Rx count found:" + eligibleRxList.size() + "in the test bed, Hence breaking the loop!!");
                    break;
                }
            }
            if (eligibleRxList.size() == numberOfEligibleRx) {
                System.out.println("Required Rx count found:" + eligibleRxList.size() + "in the test bed, Hence breaking the loop!!");
                break;
            }
        }
        if (eligibleRxList == null) {
            System.out.println("No Rx found with matched condition:" + condition);
        }
        return eligibleRxList;

    }

    public static void main(String[] args) throws InterruptedException {
        TestBedReaderUtil testBedReaderUtil = new TestBedReaderUtil();
        List<String> Rx = testBedReaderUtil.getMultipleEligibleRxByPatientID(RxCondition.IsDeliveryEligible.toString(), 10);
//        getEligibleRx(RxCondition.IsRefillRequested.toString());
//        System.out.println("Eligible Rx:" + Rx.size());
//        System.out.println("Patient ID:" + GlobalVar.ELIGIBLE_PATIENT_ID);
//        System.out.println("email: " + testBedReaderUtil.readEmailFromTestBed(GlobalVar.ELIGIBLE_PATIENT_ID));
//        System.out.println("pwd: " + testBedReaderUtil.readPasswordFromTestBed(GlobalVar.ELIGIBLE_PATIENT_ID));

    }
}


