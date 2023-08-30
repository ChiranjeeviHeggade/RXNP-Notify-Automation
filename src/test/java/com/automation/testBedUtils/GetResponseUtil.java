package com.automation.testBedUtils;

import com.automation.mobile.handlers.HttpHandler;
import com.automation.mobile.models.HttpRequest;
import com.automation.mobile.models.HttpResponse;
import org.json.JSONObject;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

/*
@Author-Subhankar Das
 */
public class GetResponseUtil {
    private static final String authURL = "https://uat2unitedapi.relationshop.net/V6/identityGateway/api/gettoken?UserName=UnitedHealApiUser&Password=!UnitedRS@2022!";
    private static String authToken;
    private static final String KEY = "67faad4e8a844b998bb3dbd97d6ede8b";

    private static String getBaseUrl() {
        String env = System.getProperty("mobileEnv");
        if (env != null) {
            return "https://rxie." + env + ".westus.aks.az.albertsons.com/patient";
        } else
            return "https://rxie.qa2.westus.aks.az.albertsons.com/patient";

    }

    private static String getPatientLookUpURL() {
        return getBaseUrl().concat("/lookup");
    }

    public static String getAuthToken() {
        HttpRequest request = new HttpRequest();
        request.setUrl(authURL);

        request.setHeaders(getAuthHeaders());

        HttpResponse response = HttpHandler.post(request);

        return response.getJsonResponse().getString("AccessToken");

    }


    private static Map<String, String> getAuthHeaders() {

        Map<String, String> headers = new HashMap<>();

        headers.put("accept", "application/json");

        headers.put("Content-Type", "text/plain");

        return headers;
    }

    private static Map<String, String> getHeaders(String key, String token) {

        Map<String, String> headers = new HashMap<>();
        headers.put("accept", "*/*");
        headers.put("Content-Type", "application/json");
        headers.put("Ocp-Apim-Subscription-Key", key);
        headers.put("internal_call", "true");
//        headers.put("Authorization", "Bearer " + token);

        return headers;
    }

    public HttpResponse getRxData(String body) {
        HttpRequest request = new HttpRequest();
        request.setUrl(getPatientLookUpURL());
        request.setStringBody(body);
        HttpResponse response = null;
        request.setHeaders(getHeaders(KEY, authToken));
        try {
            response = HttpHandler.post(request);
            int statusCode = response.getStatusCode();
            // Assert that correct status code is returned.
            Assert.assertEquals(statusCode, 200, "correct status code not returned: ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return response;
    }


    public static String getPatientLookUpAPIBody(String chain, String patientId) {
        JSONObject body = new JSONObject();
        body.put("chain", chain);

        JSONObject patient = new JSONObject();
        patient.put("patientId", patientId);

        body.put("patient", patient);

        return body.toString();
    }

    public static String getRxAPIBody(String chain, String prescriptionNumber, String storeNumber) {
        JSONObject body = new JSONObject();
        body.put("chain", chain);
        body.put("prescriptionNumber", prescriptionNumber);
        body.put("storeNumber", storeNumber);

        return body.toString();
    }

}
