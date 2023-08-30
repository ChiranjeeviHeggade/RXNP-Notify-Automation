package com.automation.EmailAPIUtils;
import com.automation.mobile.handlers.HttpHandler;
import com.automation.mobile.models.HttpRequest;
import com.automation.mobile.models.HttpResponse;
import com.automation.mobile.util.GlobalVar;
import com.automation.pages.date_selection;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/*
@ClassName- GetResponseUtilForTransferRequest
@usage- The class contains API methods which required to generate Marketing emails
@Author-Basagouda Patil
*/
public class GetResponseUtilForRefillRequestEmail {

    private String setBaseUrl()
    {
        return GlobalVar.data.get("BASE_URL");
    }
    private static Map<String, String> setHeaders()
    {
        Map<String, String> headers = new HashMap<>();
        //headers.put("Content-Type",HEADERS_Content_Type.val());
        headers.put("Content-Type",GlobalVar.data.get("HEADERS_Content_Type"));
        return headers;
    }

/*
@methodName-setMarketingMailAPIBody()
@usage-The method is used to set the marketing email body for POST API
*/
    public static String setMarketingMailAPIBody()
    {
        JSONObject body = new JSONObject();
        body.put("requestId",GlobalVar.data.get("REQUEST_ID"));
        body.put("notificationSource",GlobalVar.data.get("Notification_Source"));
        body.put("transactionStatus",GlobalVar.data.get("TRANSACTION_STATUS"));

        JSONObject patient = new JSONObject();
        patient.put("id",GlobalVar.data.get("ID"));
        patient.put("firstName",  GlobalVar.data.get("FIRST_Name"));
        patient.put("lastName",GlobalVar.data.get("LAST_Name"));
        body.put("patient", patient);

        JSONObject pharmacy = new JSONObject();
        // pharmacy.put("banner",BANNER.val());
        pharmacy.put("store Number", GlobalVar.data.get("STORE_NUM"));
        pharmacy.put("banner", GlobalVar.data.get("BANNER"));
        body.put("pharmacy",pharmacy);

        //newly written code for Dosage Remainder
        JSONObject rxDetails = new JSONObject();
        rxDetails.put("rxId", GlobalVar.data.get("PRESCRIPTION_NUMBER"));
        date_selection s = new date_selection();
        String date = s.date();
        rxDetails.put("prescriptionExpiryDate",date);
        rxDetails.put("refillDate",date);
        rxDetails.put("deliveryMode","delivery");
        body.put("rxDetails",rxDetails);

        JSONArray devices = new JSONArray();

        JSONObject obj = new JSONObject();

        obj.put("id",GlobalVar.data.get("OBJ_ID"));
        obj.put("platform",GlobalVar.data.get("PLATFORM"));
        obj.put("lastAccessed","2022-12-13T09:15:38.036Z");
        devices.put(obj);
        body.put("devices",devices);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%"+body+"%%%%%%%%%%%%%");
        return body.toString();

    }

    /*
    @methodName-getAPIResponse()
    @usage-The method is used to retrieve the marketing email POST API response
    */
    public HttpResponse getAPIResponse() throws InterruptedException {
        HttpRequest request = new HttpRequest();

        Thread.sleep(5000);
        request.setUrl(setBaseUrl());
        request.setHeaders(setHeaders());
        Thread.sleep(5000);
        request.setStringBody(setMarketingMailAPIBody());
        HttpResponse response = null;
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@"+request+"@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("********* now i am entering into try block for getting sresponse ***** ");

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

}


