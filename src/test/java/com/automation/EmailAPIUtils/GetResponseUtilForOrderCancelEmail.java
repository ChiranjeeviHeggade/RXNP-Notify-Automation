package com.automation.EmailAPIUtils;
import com.automation.mobile.handlers.HttpHandler;
import com.automation.mobile.models.HttpRequest;
import com.automation.mobile.models.HttpResponse;
import com.automation.mobile.util.GlobalVar;
import com.automation.pages.date_selection;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/*
@ClassName- GetResponseUtilForOrderCancelEmail
@usage- The class contains API methods which required to generate emails
@Author-Basagouda Patil
*/
public class GetResponseUtilForOrderCancelEmail {

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
    public static String setEmailAPIBody() throws IOException {

        File xmlfile = new File("src/test/java/Payloads/OrderCancel.xml");

        String content = new String(Files.readAllBytes(Paths.get(String.valueOf(xmlfile))));

        content = content.replace("$CLIENTID",GlobalVar.data.get("CLIENT_ID"));
        content = content.replace("$PATIENTID",GlobalVar.data.get("ID"));//pt id
        content = content.replace("$FN",GlobalVar.data.get("FIRST_Name"));
        content = content.replace("$LN",GlobalVar.data.get("LAST_Name"));
        content = content.replace("$DOB",GlobalVar.data.get("DATE_OF_BIRTH"));
        content = content.replace("$MOBILENUM",GlobalVar.data.get("MOBILE_NUMBER"));
        content = content.replace("$RXID",GlobalVar.data.get("PRESCRIPTION_NUMBER"));
//        date_selection Date = new date_selection();
//        String Past_Day = Date.date1();
//        content = content.replace("$WCRDATE",Past_Day);
        return content;
    }

    /*
    @methodName-getAPIResponse()
    @usage-The method is used to retrieve the marketing email POST API response
    */
    public HttpResponse getAPIResponse() throws InterruptedException, IOException {
        HttpRequest request = new HttpRequest();

        Thread.sleep(5000);
        request.setUrl(setBaseUrl());
        request.setHeaders(setHeaders());
        Thread.sleep(5000);
        request.setStringBody(setEmailAPIBody());
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


