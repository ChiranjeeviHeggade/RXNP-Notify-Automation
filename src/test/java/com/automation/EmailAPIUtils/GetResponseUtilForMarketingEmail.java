package com.automation.EmailAPIUtils;

import com.automation.mobile.handlers.HttpHandler;
import com.automation.mobile.models.HttpRequest;
import com.automation.mobile.models.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

/*
@ClassName- GetResponseUtilForMarketingEmail
@usage- The class contains API methods which required to generate Marketing emails
@Author-Subhankar Das
 */
public class GetResponseUtilForMarketingEmail {
    private static final String authURL = "https://rxie.qa2.westus.aks.az.albertsons.com/rxieeventrestlistener/v1/event/rxwa-pharmacy/notification/";


    /*
     @methodName-setBaseUrl()
     @usage-The method is used to set the base url for POST API
     */
    private static String setBaseUrl() {
        String env = System.getProperty("mobileEnv");
        if (env != null) {
            return "https://rxie." + env + ".westus.aks.az.albertsons.com/rxieeventrestlistener/v1/event/rxwa-pharmacy/notification/";
        } else
            return authURL;

    }

    /*
    @methodName-setHeaders()
    @usage-The method is used to set the headers for POST API
    */
    private static Map<String, String> setHeaders() {

        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    /*
    @methodName-setMarketingMailAPIBody()
    @usage-The method is used to set the marketing email body for POST API
    */
    public static String setMarketingMailAPIBody(String transactionStatus, String profileId, String banner) {
        JSONObject body = new JSONObject();
        body.put("requestId", "8afa928e-58f0-4cfd-86ca-a9d63c1e5dbe");
        body.put("notificationSource", "RXWA");
        body.put("transactionStatus", transactionStatus);

        JSONObject patient = new JSONObject();
        patient.put("profileId", profileId);
        patient.put("firstName", "test");
        patient.put("lastName", "test");
        body.put("patient", patient);

        JSONObject pharmacy = new JSONObject();
        pharmacy.put("banner", banner);
        body.put("pharmacy", pharmacy);

        JSONObject commData = new JSONObject();
        JSONArray contactPreference = new JSONArray();
        contactPreference.put("email");
        commData.put("contactPreference", contactPreference);
        commData.put("contactEmailAddress", "albertsontesting1+VONS3@gmail.com");
        commData.put("msgTxt", "How to goal-ing on your healthy journey");
        commData.put("subject", "How to goal-ing on your healthy journey");
        body.put("commData", commData);

        JSONObject publisherData = new JSONObject();

        JSONObject customParameters = new JSONObject();
        customParameters.put("encodedUUID", "6791858db5b9121e486597f233db6dca78f20776ee708a9ed508bbd4cdd38f0b71bdb0e80b7bbfb64576070ed51ab51d93f74c2e54d93d8aedc39ffb762e8910");
        customParameters.put("reward_1", "$1 OFF Produce");
        customParameters.put("reward_2", "$1 OFF any Signature SELECT Frozen Vegetables, 16oz");
        customParameters.put("reward_3", "$1 OFF Open Nature Almond Milk, 64oz");
        customParameters.put("earnedPoints", "4000");
        customParameters.put("goal", "");
        customParameters.put("redeemMyPoints", "");
        customParameters.put("setMyGoals", "");
        customParameters.put("seeMyGoals", "");
        customParameters.put("linkMyPharmacyAccount", "");
        customParameters.put("connectADevice", "");
        customParameters.put("connectMyDevice", "");
        customParameters.put("getMyHealthScore", "");
        customParameters.put("linkYourPharmacyAccount", "");
        customParameters.put("discoverYourHealthScore", "");
        customParameters.put("creatingYourFirstGoal", "");

        publisherData.put("customParameters", customParameters);
        body.put("publisherData", publisherData);

        JSONArray devices = new JSONArray();
        JSONObject obj = new JSONObject(devices);
        obj.put("platform", "Android");

        body.put("devices", devices);

        return body.toString();
    }

    /*
    @methodName-getAPIResponse()
    @usage-The method is used to retrieve the marketing email POST API response
    */
    public HttpResponse getAPIResponse(String transactionStatus, String profileId, String banner) {
        HttpRequest request = new HttpRequest();
        request.setUrl(setBaseUrl());
        request.setHeaders(setHeaders());
        request.setStringBody(setMarketingMailAPIBody(transactionStatus, profileId, banner));
        HttpResponse response = null;

        try {
            response = HttpHandler.post(request);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return response;
    }

     /*
     @methodName-getStatusCode()
     @usage-The method is used to retrieve the status code from marketing email POST API response
    */

    public int getStatusCode(HttpResponse response) {
        int statusCode = 0;
        try {
            statusCode = response.getStatusCode();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return statusCode;
    }

    /*
    @methodName-verifyResponseStatus(int statusCode)
    @usage-The method is used to verify the status code from marketing email POST API response
    */
    public void verifyResponseStatus(int statusCode) {
        Assert.assertEquals(statusCode, 200, "correct status code not returned: " + statusCode);
    }

   /* public static void main(String[] args) {
        System.out.println(new GetResponseUtilForMarketingEmail().getResponseBody("HEALTH_USER_WELCOME", "7ac5835f-eee1-44cb-b554-75fd5108084c", "SAFEWAY"));
    }*/


}
