package com.automation.pages;

import com.automation.mobile.util.CommonUtil;
import com.automation.mobile.util.GlobalVar;
import com.automation.mobile.util.ReadMail7Util;
import com.automation.mobile.util.WaitAction;
import io.appium.java_client.AppiumDriver;

public class Pharmacy_LoginPage extends PageManager {
public String bannername=null;
    public Pharmacy_LoginPage(AppiumDriver driver) {
        super(driver);
    }

    //----------------COMMON Pharmacy LOGIN Methods------------------
    public void loginToPharmacyAPP(String userEmailType)
    {
        if (getCurrentBanner().equalsIgnoreCase("unitedsupermarkets"))
        {
               bannername=getCurrentBanner();
            //check login button is displayed after clicking pharmacy CTA
            if (isElementDisplayed(homePageElements.login_button, 30))
            {
                //Verify Login CTA should be enabled & Clickable
               // Assert.assertTrue(homePageElements.login_button.isEnabled());
                //click on login
                clickElement(homePageElements.login_button);
                united_enterPin();

//                    if (isElementDisplayed(pharmacyPageElements.WelcomePage, 20)) {
//                        scrollDown();
//                        tapElement(pharmacyPageElements.pharmacy_accept_and_close_button);
//                    }
//                    waitForElementToAppear(pharmacyPageElements.WelcomeBackPage,10);
//                    Assert.assertTrue(isElementDisplayed(pharmacyPageElements.textMeCodeCTA));
//                    Assert.assertTrue(isElementDisplayed(pharmacyPageElements.notYouCTA));
//                    tapElement(pharmacyPageElements.notYouCTA);
//                    waitForElementToAppear(pharmacyPageElements.createYourGroceyAccount,10);
//                    Assert.assertTrue(isElementDisplayed(pharmacyPageElements.loginToMyGroceryAccountCTA));
//                    tapElement(pharmacyPageElements.createNewGroceryAccountCloseIcon);
//                    waitForElementToAppear(pharmacyPageElements.WelcomeBackPage,10);

                //click 'send me an email' button
//                    tapElement(pharmacyPageElements.pharmacy_sendMeAnEmail_button);
//                    Thread.sleep(8000);
//
//                    //enter new OTP
//                    if (userEmailType.equalsIgnoreCase("testbed"))
//                    {
//                        enterReceivedOTP("testbed");
//                    }
//                    else if (userEmailType.equalsIgnoreCase("random")) {
//                        enterReceivedOTP("random");
//                    }
//                    else
//                    {
//                        enterReceivedOTP("ymlData");
//                    }

            }

            else
            {
                System.out.println("User is already logged into Pharmacy App");
            }
        }
        else {
            //For Aci banner
            aci_clickLoginButton();
            aci_enterPin();
            if(isElementDisplayed(aciPharmacyPageElements.sincerelyLaterText,10)){
               // multipleScrollDown(2);
                scrollDownForElement(aciPharmacyPageElements.maybeLater);
                clickElement(aciPharmacyPageElements.maybeLater);
            }
        }

    }

    //---------------United Pharmacy LOGIN Methods------------------------------
    public void enterReceivedOTP(String emailType) {

        if (isElementDisplayed(pharmacyPageElements.enterOtp_textbox1, 20)) {

            enterOTP(retrieveNewOTP(emailType));
        } else {
            System.err.println("Enter OTP text box is not able to locate..");
        }
    }

    public String retrieveNewOTP(String emailType) {
        ReadMail7Util readMail7Util;
        if (emailType.equalsIgnoreCase("testbed")) {
            readMail7Util = new ReadMail7Util(returnUserFromEmail(GlobalVar.ELIGIBLE_EMAIL));
        } else if (emailType.equalsIgnoreCase("random")) {
            readMail7Util = new ReadMail7Util(returnUserFromEmail(GlobalVar.random_email));
        }else if (emailType.equalsIgnoreCase("update")) {
            readMail7Util = new ReadMail7Util(returnUserFromEmail(data.get("NewEmailID")));
        }
        else {
            readMail7Util = new ReadMail7Util(returnUserFromEmail(data.get("EMAIL")));
        }
//        else if(emailType.equalsIgnoreCase("ACIVONS")){
//            readMail7Util = new ReadMail7Util(returnUserFromEmail(GlobalVar.random_email));
//        }
        return readMail7Util.retrieveLatestOTPFromEmail("login", 300);

    }
    String grocery_login_email_otp;
    public void retrieveVerificationOTP(String emailType) throws InterruptedException {
        Thread.sleep(15000);
        String user = null;
        if (emailType.equalsIgnoreCase("random")) {
            user = GlobalVar.Random_User + "@mail7.io";
        } else if (emailType.equalsIgnoreCase("testbed")) {
            user = returnUserFromEmail(GlobalVar.ELIGIBLE_EMAIL);
        }
        ReadMail7Util mail7Util = new ReadMail7Util(user);
        grocery_login_email_otp = mail7Util.retrieveLatestOTPFromEmail("ACIVONS", 300);
        System.out.println(grocery_login_email_otp);
    }

    public void enterOTP(String otp) {
        String otp_digit1 = String.valueOf(otp.charAt(0));
        String otp_digit2 = String.valueOf(otp.charAt(1));
        String otp_digit3 = String.valueOf(otp.charAt(2));
        String otp_digit4 = String.valueOf(otp.charAt(3));
        String otp_digit5 = String.valueOf(otp.charAt(4));
        String otp_digit6 = String.valueOf(otp.charAt(5));

        new WaitAction(driver).waitForDisplayed(pharmacyPageElements.enterOtp_textbox1, 20);
        typeFromKeyboard(pharmacyPageElements.enterOtp_textbox1, otp_digit1);


        new WaitAction(driver).waitForDisplayed(pharmacyPageElements.enterOtp_textbox2, 20);
        typeFromKeyboard(pharmacyPageElements.enterOtp_textbox2, otp_digit2);


        new WaitAction(driver).waitForDisplayed(pharmacyPageElements.enterOtp_textbox3, 20);
        typeFromKeyboard(pharmacyPageElements.enterOtp_textbox3, otp_digit3);


        new WaitAction(driver).waitForDisplayed(pharmacyPageElements.enterOtp_textbox4, 20);
        typeFromKeyboard(pharmacyPageElements.enterOtp_textbox4, otp_digit4);


        new WaitAction(driver).waitForDisplayed(pharmacyPageElements.enterOtp_textbox5, 20);
        typeFromKeyboard(pharmacyPageElements.enterOtp_textbox5, otp_digit5);

        new WaitAction(driver).waitForDisplayed(pharmacyPageElements.enterOtp_textbox6, 20);
        typeFromKeyboard(pharmacyPageElements.enterOtp_textbox6, otp_digit6);

    }

    //----------------------ACI Pharmacy LOGIN Methods--------------------------------
    public void aci_clickLoginButton() {
        waitForElementToAppear(aciPharmacyPageElements.LogInButton, 120);
        tapElement(aciPharmacyPageElements.LogInButton);
    }

    public void aci_enterPin() {
        waitForElementToAppear(aciPharmacyPageElements.SignInToYourAccount, 40);

        String otp =GlobalVar.data.get("PIN");
        String pin_digit1 = String.valueOf(otp.charAt(0));
        String pin_digit2 = String.valueOf(otp.charAt(1));
        String pin_digit3 = String.valueOf(otp.charAt(2));
        String pin_digit4 = String.valueOf(otp.charAt(3));

        enterFromKeyboard(aciPharmacyPageElements.EnterPin_textbox1, pin_digit1);
        enterFromKeyboard(aciPharmacyPageElements.EnterPin_textbox2, pin_digit2);
        enterFromKeyboard(aciPharmacyPageElements.EnterPin_textbox3, pin_digit3);
        enterFromKeyboard(aciPharmacyPageElements.EnterPin_textbox4, pin_digit4);
    }
    public void united_enterPin()
    {
        String otp = data.get("PIN");
        String pin_digit1 = String.valueOf(otp.charAt(0));
        String pin_digit2 = String.valueOf(otp.charAt(1));
        String pin_digit3 = String.valueOf(otp.charAt(2));
        String pin_digit4 = String.valueOf(otp.charAt(3));

        enterFromKeyboard(unitedPharmacyPageElements.EnterPin_textbox1, pin_digit1);
        enterFromKeyboard(unitedPharmacyPageElements.EnterPin_textbox2, pin_digit2);
        enterFromKeyboard(unitedPharmacyPageElements.EnterPin_textbox3, pin_digit3);
        enterFromKeyboard(unitedPharmacyPageElements.EnterPin_textbox4, pin_digit4);

    }


    public void confirmPin() {
        if (!getCurrentBanner().equalsIgnoreCase("unitedsupermarkets")) {
            waitForElementToAppear(pharmacyPageElements.confirmPinPage, 40);

            String otp = data.get("PIN");
            String pin_digit1 = String.valueOf(otp.charAt(0));
            String pin_digit2 = String.valueOf(otp.charAt(1));
            String pin_digit3 = String.valueOf(otp.charAt(2));
            String pin_digit4 = String.valueOf(otp.charAt(3));

            enterFromKeyboard(aciPharmacyPageElements.EnterPin_txtbox1, pin_digit1);
            enterFromKeyboard(aciPharmacyPageElements.EnterPin_txtbox2, pin_digit2);
            enterFromKeyboard(aciPharmacyPageElements.EnterPin_txtbox3, pin_digit3);
            enterFromKeyboard(aciPharmacyPageElements.EnterPin_txtbox4, pin_digit4);
        }
    }

    public void acceptcookies() {
        waitForElementToAppear(aciPharmacyPageElements.acceptcookies,10);
        tapElement(aciPharmacyPageElements.acceptcookies);

    }
    public void clickonBackToGrocery()
    {
        tapElement(aciPharmacyPageElements.backtogrocerypage);
    }
    public void clickonMemberCTA() throws InterruptedException {
        tapElement(aciPharmacyPageElements.memberCTA);
        Thread.sleep(3000);
        tapElement(aciPharmacyPageElements.accountCTA);
        scrollDown();
        tapElement(aciPharmacyPageElements.signoutCTA);
        tapElement(aciPharmacyPageElements.confirmtoLogout);
    }
}
