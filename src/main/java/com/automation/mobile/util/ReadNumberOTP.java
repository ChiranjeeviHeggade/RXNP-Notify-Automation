package com.automation.mobile.util;

import com.twilio.Twilio;

/**
 * @Author-Subhankar
 */
public class ReadNumberOTP extends GetMessageUtil {
    static String ACCOUNT_SID;
    static String AUTH_TOKEN;
    static String messageNumber;

    public ReadNumberOTP(String messageNumber, String ACCOUNT_SID, String AUTH_TOKEN) {
        this.messageNumber = messageNumber;
        this.ACCOUNT_SID = ACCOUNT_SID;
        this.AUTH_TOKEN = AUTH_TOKEN;
    }

    public String readOTP() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        String smsBody = getMessage(messageNumber, ACCOUNT_SID);
        System.out.println(smsBody);
        String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
        System.out.println(OTPNumber);
        return OTPNumber;
    }

}
