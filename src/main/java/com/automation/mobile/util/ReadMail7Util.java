package com.automation.mobile.util;

import com.automation.mobile.handlers.HttpHandler;
import com.automation.mobile.models.HttpRequest;
import com.automation.mobile.models.HttpResponse;
import com.google.common.util.concurrent.Uninterruptibles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/*
@Author-Subhankar das
 */
public class ReadMail7Util {

    private static final int GET_MAIL_MAX_RETRIES = 2;
    String HOST = "https://api.mail7.io";
    String API_KEY = "7ae87aa6-78d5-440e-877e-31dcdcbb4334";
            //"9c08d406-59fd-49ae-b5fd-bdddc1d6cecb";
    String DOMAIN = "mail7.io";
    Logger logger = LogManager.getLogger(getClass());
    String userName;

    public ReadMail7Util(String userName) {
        this.userName = userName;
    }

    private JSONArray getAllEmails() {
        String url = HOST + "/inbox";
        HttpRequest request = new HttpRequest();
        request.setUrl(url);

        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("to", userName);
        queryParams.put("domain", DOMAIN);
        queryParams.put("apikey", API_KEY);
        request.setParams(queryParams);

        request.setHeaders(getAuthHeaders());
        HttpResponse response = getWithRetry("Get all emails", request);

        if (response.getStatusCode() != 200 && response.getStatusCode() != 201) {
            logger.info(String.format("Get all emails request: %s", request));
            logger.info(String.format("Get all emails response: %s", response));
        }

        return response.getJsonResponse().getJSONArray("data");
    }

    private Map<String, String> getAuthHeaders() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("accept", "application/json");
        headers.put("Content-Type", "text/plain");
        return headers;
    }

    //Get with retry in case of failure
    private HttpResponse getWithRetry(String resourceName, HttpRequest request) {
        HttpResponse response = null;
        for (int retryCounter = 1; retryCounter <= GET_MAIL_MAX_RETRIES; retryCounter++) {
            response = HttpHandler.get(request);
            if (response.getStatusCode() == 200) {
                break;
            } else {
                Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
                logger.info(resourceName + " request failed, retrying...");
            }
        }
        return response;
    }

    private String retrieveOTP(String messageType) {
        String OTP;

        Optional<JSONObject> mailObj = Optional.ofNullable(getAllEmails().getJSONObject(0));

        if (mailObj.isPresent()) {
            String mailBody = ((JSONObject) mailObj.get().get("mail_source")).getString("html");
            //return retrieveOTP(mailBody, messageType);
            if (messageType.equalsIgnoreCase("grocery")) {
                String text2 = mailBody.split("email verification page:")[1].
                        split("<h3>")[1];
                String otpText = text2.split("</h2>")[0];
                OTP = otpText.substring(otpText.length() - 8);
            }
            else if (messageType.equalsIgnoreCase("ACI")) {
                String text2 = mailBody.split("code for verification:")[1];
                String otpText = text2. split("</span>")[0];
                OTP = otpText.substring(otpText.length() - 10);
            }
//            else if (messageType.equalsIgnoreCase("ACIVONS")) {
//                String text2 = mailBody.split("code for verification:")[1];
//                String otpText = text2. split("</span>")[0];
//                OTP = otpText.substring(otpText.length() - 6);
//            }
            else {
                String text2 = mailBody.split("verify your email address:")[1].
                        split("</td>")[0];
                String otpText = text2.split("<span")[1].split("</span>")[0];
                OTP = otpText.substring(otpText.length() - 6);
            }
        } else {
            return null;
        }

        return OTP;

    }

    public String retrieveLatestOTPFromEmail(String messageType, int timeInSeconds) {
        //check response
        String otp = null;
        int count = timeInSeconds / 10;
        for (int i = 0; i <= count; i++) {
            otp= retrieveOTP(messageType);
            //condition-1
            if (otp == null) {
                waitFor();
            }else{
                break;
            }
        }
        if (otp == null) {
            System.out.println("OTP could not retrieved after waiting for: " + timeInSeconds + "seconds..");
        }

        return otp;

    }

    private void waitFor() {
        try {
            //wait for 10 secs
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
