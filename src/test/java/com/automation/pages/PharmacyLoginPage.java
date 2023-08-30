package com.automation.pages;

import com.automation.mobile.util.CommonActions;
import com.automation.mobile.util.GlobalVar;
import com.automation.mobile.util.ReadEmailOTP;
import com.automation.mobile.util.WaitAction;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.NoSuchElementException;

public class PharmacyLoginPage extends PageManager {
    public String EMAIL_OTP;

    public PharmacyLoginPage(AppiumDriver driver) {
        super(driver);
    }

    public PharmacyDashboardPage enterReceivedOTP() {

        if (isElementDisplayed(healthPageElements.health_EnterOtp_textbox1, 20)) {
            callEmailApiAndReturnOTP(data.get("EMAIL"));
            enterOTP();
        }
        return new PharmacyDashboardPage(driver);
    }

    public void callEmailApiAndReturnOTP(String emailID) {

        String key = new GlobalVar().MAIL_SAC_LOGIN_KEY;
        ReadEmailOTP email = new ReadEmailOTP("healthsignup", emailID, key);
        EMAIL_OTP = email.readOTP();

    }

    public void enterOTP() {
        String otp = EMAIL_OTP;
        int s;

        String otp_digit1 = String.valueOf(otp.charAt(0));
        String otp_digit2 = String.valueOf(otp.charAt(1));
        String otp_digit3 = String.valueOf(otp.charAt(2));
        String otp_digit4 = String.valueOf(otp.charAt(3));
        String otp_digit5 = String.valueOf(otp.charAt(4));
        String otp_digit6 = String.valueOf(otp.charAt(5));

        new WaitAction(driver).waitForDisplayed(healthPageElements.health_EnterOtp_textbox1, 20);
        typeFromKeyboard(healthPageElements.health_EnterOtp_textbox1, otp_digit1);
        // hideKeyBoard();

        new WaitAction(driver).waitForDisplayed(healthPageElements.health_EnterOtp_textbox2, 20);
        typeFromKeyboard(healthPageElements.health_EnterOtp_textbox2, otp_digit2);
        //hideKeyBoard();

        new WaitAction(driver).waitForDisplayed(healthPageElements.health_EnterOtp_textbox3, 20);
        typeFromKeyboard(healthPageElements.health_EnterOtp_textbox3, otp_digit3);
        // hideKeyBoard();

        new WaitAction(driver).waitForDisplayed(healthPageElements.health_EnterOtp_textbox4, 20);
        typeFromKeyboard(healthPageElements.health_EnterOtp_textbox4, otp_digit4);
        // hideKeyBoard();

        new WaitAction(driver).waitForDisplayed(healthPageElements.health_EnterOtp_textbox5, 20);
        typeFromKeyboard(healthPageElements.health_EnterOtp_textbox5, otp_digit5);
        // hideKeyBoard();

        new WaitAction(driver).waitForDisplayed(healthPageElements.health_EnterOtp_textbox6, 20);
        typeFromKeyboard(healthPageElements.health_EnterOtp_textbox6, otp_digit6);
        //hideKeyBoard();


    }

}
