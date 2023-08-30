package com.automation.mobile.util;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalVar {
    public static Map<String, Map<String, String>> DEVICE_LIST = new HashMap<String, Map<String, String>>();
    public static Map<String, String> data = new HashMap<>();
    public static Map<String, JSONObject> BITRISE_DATA = new HashMap<String, JSONObject>();
    public static Map<AppiumDriverLocalService, String> APPIUM_SERVER_LIST = new HashMap<>();
    public static Map<String, Map<String, String>> GLOBAL_PARAMS = new HashMap<>();
    public static boolean testrail = false;

    //Mailsac
    public static String OLD_OTP = null;
    public static String random_email = null;
    public static String MAIL_SAC_KEY = "k_iErvZkndgEgaTem48R13zRNHrq20Vsqx5iIF6Uv0dg4e";
    public static String MAIL_SAC_LOGIN_KEY = "k_fddc354VupF4iWq0b6rzMNM2eQufJ7vCmp859w4e8";

    //mail7.io
    public static String Random_User= null;

    //MOBILE OTP
    public static final String ACCOUNT_SID = "AC13592eb83ba108e721c94319b0bfe74b";
    //ACbdb9d379813b74db47390f91e180cf05
    //AC13592eb83ba108e721c94319b0bfe74b
    public static final String AUTH_TOKEN = "3df3448e5abe258f2959056e5701be33";
    //3df3448e5abe258f2959056e5701be33
    //fa055ff2d864d96817724e336d5bc058
    public static final String MOBILE_NUMBER = "+18586677929";
    public static final String MOBILE_NUMBER_WITHOUT_CODE = "8586677929";

    //TEST BED VARIABLES
    public static String ELIGIBLE_RX;
    public static List<String> ELIGIBLE_RX_LIST;
    public static String ELIGIBLE_PATIENT_ID;
    public static String ELIGIBLE_EMAIL;
    public static String ELIGIBLE_PASSWORD;



}
