package com.automation.EmailAPIUtils;

import com.automation.mobile.handlers.HttpHandler;
import com.automation.mobile.models.HttpRequest;
import com.automation.mobile.models.HttpResponse;
import com.google.common.util.concurrent.Uninterruptibles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/*
@ClassName- ReadMail7UtilForMarketingEmail
@usage- The class contains API methods which required to validate Marketing emails using mail7.io domain
like(subject line, pre header, body, sender details)
@Author-Subhankar Das
 */
public class ReadMail7UtilForMarketingEmail {

    private static final int GET_MAIL_MAX_RETRIES = 3;
    String HOST = "https://api.mail7.io";
    String API_KEY = "7ae87aa6-78d5-440e-877e-31dcdcbb4334";
    String DOMAIN = "mail7.io";
    Logger logger = LogManager.getLogger(getClass());
    String userName;

    public ReadMail7UtilForMarketingEmail(String userName) {
        this.userName = userName;
    }

    /*
     @methodName-getAllEmails()
     @usage-The method is used to get all the emails from Inbox using API call
     [only from mail7.io domain]
     */
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

    /*
     @methodName-getAuthHeaders()
     @usage-The method is used to set the headers for API
     */
    private Map<String, String> getAuthHeaders() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("accept", "application/json");
        headers.put("Content-Type", "text/plain");
        return headers;
    }

    /*
   @methodName-getWithRetry()
   @usage-The method is used to get the mail7 API response with retry (incase of failure)
   */

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

    /*
    @methodName-getMailSubjectLine()
    @usage-The method is used to get the subject line of the latest email using mail7 API response
    */
    public String getMailSubjectLine() throws InterruptedException {
        Optional<JSONObject> mailObj = null;
        for (int i = 1; i <= 30; i++) {
            try {
                mailObj = Optional.ofNullable(getAllEmails().getJSONObject(0));
                break;
            } catch (JSONException js) {
                logger.info("no email found -retrying after 4secs!");
                Thread.sleep(5000);
            }
        }
        return ((JSONObject) mailObj.get().get("mail_source")).getString("subject");
    }

    /*
    @methodName-getMailPreHeader()
    @usage-The method is used to get the  pre-header of the latest email using mail7 API response
    */
    public String getMailPreHeader() throws InterruptedException {
        Optional<JSONObject> mailObj = Optional.ofNullable(getAllEmails().getJSONObject(0));
        return ((JSONObject) mailObj.get().get("mail_source")).getString("text");
    }

    /*
    @methodName-getMailBody()
    @usage-The method is used to get the  body of the latest email using mail7 API response
    */
    public String getMailBody() {
        Optional<JSONObject> mailObj = Optional.ofNullable(getAllEmails().getJSONObject(0));
        return ((JSONObject) mailObj.get().get("mail_source")).getString("html");
    }

    /*
    @methodName-getSender()
    @usage-The method is used to get the sender email id for the latest email using mail7 API response
    */
    public String getSender() {
        Optional<JSONObject> mailObj = Optional.ofNullable(getAllEmails().getJSONObject(0));
        JSONObject from = mailObj.get().getJSONObject("mail_source");
        JSONObject nj = from.getJSONObject("from");
        return nj.getString("text");
    }

   /* public static void main(String[] args) throws InterruptedException {
        System.out.println(new ReadMail7Util("testmarketing").getMailSubjectLine());
        System.out.println(new ReadMail7Util("testmarketing").getMailBody());
        System.out.println(new ReadMail7UtilForMarketingEmail("testmarketing").getMailPreHeader());
    }*/

}
