package com.automation.mobile.util;
import io.restassured.RestAssured;
import io.restassured.config.FailureConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import javax.net.ssl.SSLException;
import java.net.SocketException;

public class DeviceRegistrationAPI {

    public static void main(String[] a) throws Exception{
        System.out.println("Mayank Mahadane:  "+DeviceRegistrationAPI.getDevice("048e7018-aa97-4686-b46d-2fab5e0b08f8"));
    }

    private static String getAuthCodeFromCRM(){
        RestAssured.baseURI= "https://login.microsoftonline.com/b7f604a0-00a9-4188-9248-42f3a5aac2e9/oauth2/token";

        RequestSpecification httpRequest = RestAssured.given().accept("application/json")
                .contentType("application/x-www-form-urlencoded")
                .header("Cookie","fpc=AsLK5khs5FNJtba7vp1ahH0gq5vqAQAAAKigj9oOAAAAa852AQEAAAA4oY_aDgAAAA; stsservicecookie=estsfd; x-ms-gateway-slice=estsfd")
                .formParam("grant_type","client_credentials")
                .formParam("client_id","0a50324c-916f-4c50-aa8b-21d1b4b26d86")
                .formParam("client_secret","5OP8Q~HscRNNMH1NwKZ_R7N3l2W~h3XVEmpEib6k")
                .formParam("resource","https://abs-healthwellness-mgmt-qa.crm.dynamics.com");

        Response res = httpRequest.post();
        JsonPath path = res.jsonPath();

        return path.get("access_token");
    }

    public static String getDevice(String UUID){
        RestAssured.baseURI= "https://apim-dev-01.albertsons.com/abs/qa2/rxwa/d365service/v2/user/"+UUID+"/device";
        RequestSpecification httpRequest = RestAssured.given().accept("application/json")
                .header("Cookie","incap_ses_1162_1738018=kBIuLplARSN2uQM+i0EgECYa/2IAAAAA8QmJRmzADfeaehLwl1gnVQ==; incap_ses_144_1738018=7EWhFrC2sVEjW8ml9Jf/ASOg/WIAAAAAdjHntHybohkqdPhTQYowMQ==; incap_ses_257_1738018=QLd2TJgUVSSlVE32bQyRA9/F/mIAAAAA1dpvvEOYpWvM2c9pyN5q7A==; incap_ses_32_1738018=NGFbS6ByYXjK/lJG569xAP3L/WIAAAAATN8XgIixAVuS4Ov4S2x0LA==; incap_ses_32_1775727=ffu1JrV5iHg5XYlD569xAHE0+2IAAAAABSuEQswSOkRMiGCOlQ5gmg==; incap_ses_32_2684974=uNkbPxUdKgZ8Mu5E569xADF2/GIAAAAAQvzhnG9l6xbq0wp/Dk5jwQ==; incap_ses_543_2684974=vJKWExXh0BJEl4h2XiCJByQ0/GIAAAAA/+4ten6oBPgIQqPinwjpLA==; incap_ses_553_1738018=W/QEfmWorTpVwfY8RaesB3a9+mIAAAAAehkIGMYVptkJiQOmjZZ7CA==; incap_ses_553_1775727=J/7zM0/GbyEY2wA9RaesB7HN+mIAAAAATGHErNWX+pudlHfDDYEV/Q==; incap_ses_618_2684974=8WSkS8YV5iZXKJISdJSTCAig/WIAAAAAU+pfWN0GrMoPAarsNXMJRA==; incap_ses_78_1738018=YjbkW8sm/S3dGASYJh0VAQDr+2IAAAAAQOfEUgq8MrozqzDhOKc3Lg==; incap_ses_84_1738018=yGTdL2QfVzkHz5Xg6G0qAXIDAGMAAAAAXb8AuJh4Y31Jl+DDaigu+w==; nlbi_1738018=TgE1dVrwBR6hNtUMGkhmggAAAADtByTR79cTCWp6aPaWjvcj; nlbi_1775727=rqJGWCjVZHv/1a1LtEagJwAAAAAixs/GXFTLtu5dr1wq8+ga; visid_incap_1651909=afC1QhGwSpmz/N/wNyn4NCVLvmIAAAAAQUIPAAAAAADvgiAUv2LN6utH4YHWnLwY; visid_incap_1738018=9wGc6ttGQPSliHeEtg8A47A872IAAAAAQUIPAAAAAABOl/LynTbC5t13BFquno32; visid_incap_1775727=S1z9LvMWTWmACkmlSIS0yDL76WIAAAAAQUIPAAAAAACoKC0235GylIEwx0vwQN99; visid_incap_2684974=A4GU1l2iQkGtQYenhDWd9IaCo2IAAAAAQUIPAAAAAABkQY0xFsCUuUIeVzst1mS8; JSESSIONID=BBCC40DA2EE8DBDD87B466DB850C4607; ReqClientId=11b7e833-6e93-496e-871e-26736a2e8bcd; incap_ses_1163_1329592=tu6VDbIH2EFkFVXdCc8jEMcF+2IAAAAAKDXilOVD7/uDI/lEIqU46Q==; nlbi_1329592=P4m9V0Ot4AyhsAekj8gm+AAAAAAla8c3kLYEE2sU/27Iso87; orgId=dd179464-4f28-48d4-adb0-0edd2049ccaf; visid_incap_1329592=QjnqpdxRQpymgT4Dmzruy8Ma32IAAAAAQUIPAAAAAABsMvpwlnKPKX9KediIxIlG")
                .auth().oauth2(getAuthCodeFromCRM());

        Response res = null;

        for(int i=1; i <= 5; i++) {
            try {
                res = httpRequest.get();
                if(res.statusCode() == 200)
                    break;
            }catch(Exception e){
                System.out.println("API call failed hence retrying "+i+" time");
            }
        }

        JsonPath path = res.jsonPath();

        return path.get("mobileDevices[0].deviceID").toString();
    }
}