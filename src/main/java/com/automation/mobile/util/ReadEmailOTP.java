package com.automation.mobile.util;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ReadEmailOTP {

    String user;
    String mailSacKey;

    String messageType;

    public ReadEmailOTP(String messageType, String user, String mailSacKey){
        this.user=user;
        this.mailSacKey=mailSacKey;
        this.messageType=messageType;
    }

    public  String readOTP( ){

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        Date date = cal.getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = format1.format(date);
        //Get Message ID
        RestAssured.baseURI= "https://mailsac.com/api/addresses";
        RequestSpecification httpRequest1 = RestAssured.given().accept("application/json");
        //Passing the resource details
        Response res1 = httpRequest1.pathParam("email",user).queryParam("until",date1).queryParam("limit","1").queryParam("_mailsacKey",mailSacKey).queryParam("download","NaN").get("/{email}/messages");
        //Retrieving the response body using getBody() method
        ResponseBody body1 = res1.body();
        //Converting the response body to string object
        //JsonPath.with(res1).param("name", "getName").get("findAll { a -> a.name == name  }")
        JsonPath jp = res1.jsonPath();
        List<String> rf = jp.getList("_id");
        String messageID = rf.get(0);

        RestAssured.baseURI= "https://mailsac.com/api/text";
        RequestSpecification httpRequest = RestAssured.given();
        //Passing the resource details
        Response res = httpRequest.pathParam("email",user).pathParam("messageId",messageID).queryParam("_mailsacKey",mailSacKey).queryParam("download","NaN").get("/{email}/{messageId}");
        //Retrieving the response body using getBody() method
        ResponseBody body = res.body();
        //Converting the response body to string object
        String rbdy = body.asString();
        String otp = rbdy.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
        String otp1;
        if(messageType.equalsIgnoreCase("grocery")) {
            otp1 = otp.substring(otp.indexOf("THISCODEWILLEXPIRE") - 8, otp.indexOf("THISCODEWILLEXPIRE"));
        }
        else if(messageType.equalsIgnoreCase("healthsignup")){
            otp1 = otp.substring(otp.indexOf("Ifyoudidnotrequest") - 6, otp.indexOf("Ifyoudidnotrequest"));
        }
        else if(messageType.equalsIgnoreCase("tomthumb")){
            otp1 = otp.substring(otp.indexOf("Foryourprivacy") - 6, otp.indexOf("Foryourprivacy"));
        }
        else{
            otp1 = otp.substring(otp.indexOf("Ifyouarenottryingtolog") - 6, otp.indexOf("Ifyouarenottryingtolog"));
        }


        System.out.println(otp1);
        return otp1;
    }


}
