package com.automation.pages;


import com.automation.grocery.Grocery_DashboardPage;
import com.automation.grocery.Grocery_LoginPage;
import com.automation.grocery.Grocery_RegistrationPage;
import com.automation.mobile.util.CommonActions;
import com.automation.mobile.util.GlobalVar;
import com.automation.mobile.util.ReadMail7Util;
import com.automation.mobile.util.WaitAction;
import io.appium.java_client.AppiumDriver;

public class GroceryLoginPage extends PageManager {

    public GroceryLoginPage(AppiumDriver driver) {
        super(driver);
    }

//    public boolean isGroceryLoggedIn(){
//        if(!getCurrentBanner().equalsIgnoreCase("unitedsupermarkets")){
//            //if it is an ACI banner then just return true
//            return true;
//        }
//        boolean loggedIn = true;
//        if(isElementDisplayed(homePageElements.emailAddress_textbox, 20)) {
//            loggedIn = false;
//        }
//        return loggedIn;
//    }
//
//    public void enterEmailText() {
//        waitForElementToAppear(homePageElements.emailAddress_textbox, 20);
//        TestOutputUtil testOutputUtil = new TestOutputUtil();
//        String test = testOutputUtil.readTxt();
//        GlobalVar.random_email = test;
//        GlobalVar.Random_User = test.substring(0,14);
//        System.out.println(GlobalVar.Random_User);
//        enterKey(homePageElements.emailAddress_textbox, GlobalVar.random_email);
//        hideKeyBoard();
//    }
//
//    public void enterPasswordText(){
//        new WaitAction(driver).waitForLoadingComplete();
//        enterKey(homePageElements.password_textbox,"Welcome1");
//        hideKeyBoard();
//    }
//
//    public void clickonLoginButton() throws InterruptedException {
//        new WaitAction(driver).waitForElementToBeClickable(homePageElements.login_button,20);
//        new CommonActions(driver).new ClickAction().clickElement(homePageElements.login_button);
//    }
//
//    public void clickGroceryPickup() throws InterruptedException {
//        if(isElementDisplayed(homePageElements.Grocery_Pickup,20)) {
//            tapElement(homePageElements.Grocery_Pickup);
//        }
//    }
//
//    public void clickOrderGroceriesCTA() {
//        if(isElementDisplayed(homePageElements.order_grocery,10)) {
//            tapElement(homePageElements.order_grocery);
//        }
//        if(isElementDisplayed(homePageElements.order_grocery,10)) {
//            tapElement(homePageElements.order_grocery);
//        }
//    }
//}

//code from sachin framework=========================================================================================================================


    public void enterEmailText() {
        waitForElementToAppear(homePageElements.emailAddress_textbox, 40);
        enterKey(homePageElements.emailAddress_textbox, data.get("EMAIL"));
        hideKeyBoard();
    }

    public void enterPasswordText() {
        new WaitAction(driver).waitForLoadingComplete();
        enterKey(homePageElements.password_textbox, data.get("PASSWORD"));
        hideKeyBoard();

    }

    public void clickonLoginButton() {
        new WaitAction(driver).waitForElementToBeClickable(homePageElements.login_button, 20);
        new CommonActions(driver).new ClickAction().clickElement(homePageElements.login_button);

    }

    public void clickGroceryPickup() {
        if (isElementDisplayed(homePageElements.Grocery_Pickup, 20)) {
            tapElement(homePageElements.Grocery_Pickup);
        }

    }

    public void clickOrderGroceriesCTA() {
        if (isElementDisplayed(homePageElements.order_grocery, 10)) {
            tapElement(homePageElements.order_grocery);
        }
        if (isElementDisplayed(homePageElements.order_grocery, 10)) {
            tapElement(homePageElements.order_grocery);
        }
    }

    public void enterEmailFromTestBed() throws InterruptedException {
        waitForElementToAppear(homePageElements.emailAddress_textbox, 20);
        enterKey(homePageElements.emailAddress_textbox, GlobalVar.ELIGIBLE_EMAIL);
        hideKeyBoard();

    }

    public void enterPasswordFromTestBed() {
        new WaitAction(driver).waitForLoadingComplete();
        enterKey(homePageElements.password_textbox, GlobalVar.ELIGIBLE_PASSWORD);
        hideKeyBoard();

    }

    public void enterEmailFromRandomVar() {
        waitForElementToAppear(homePageElements.emailAddress_textbox, 60);
        enterKey(homePageElements.emailAddress_textbox, GlobalVar.random_email);
    }

//    public void logoutFromGrocery() throws InterruptedException {
//        if (isElementDisplayed(homePageElements.more_button_element, 80)) {
//            tapElement(homePageElements.more_button_element);
//
//            waitForLoadingComplete();
//            waitForElementToAppear(homePageElements.about_Our_App_element, 20);
//            scrollDownForElement(homePageElements.logout_button);
//            scrollDownBySmallAmount();
//            tapElement(homePageElements.logout_button);
//
//            waitForLoadingComplete();
//            Thread.sleep(5000);
//            if (isElementDisplayed(homePageElements.loginOrSignUp_button, 40)) {
//                tapElement(homePageElements.loginOrSignUp_button);
//            }
//            waitForDisplayed(homePageElements.emailAddress_textbox, 40);
//        } else {
//            System.out.println("more button is not displayed");
//        }
//
//
//    }

    //------------------ACI Grocery Login Methods---------------------------------
    public void aci_enterLoginEmail() {
        waitForElementToAppear(aciGroceryPageElements.email_address, 20);
        tapElement(aciGroceryPageElements.email_address);
        enterKey(aciGroceryPageElements.email_address, data.get("EMAIL"));

    }
//
//    public void aci_enterLoginEmailForAccountLinking() {
//        waitForElementToAppear(aciGroceryPageElements.email_address, 20);
//        tapElement(aciGroceryPageElements.email_address);
//        enterKey(aciGroceryPageElements.email_address, GlobalVar.random_email);
//    }


    String grocery_login_email_otp;

    public void aci_GetEmailOTPForGroceryLogin(String emailType) throws InterruptedException {
        Thread.sleep(20000);
        String user = null;

        if (emailType.equalsIgnoreCase("ymldata")) {
            user = returnUserFromEmail(data.get("EMAIL"));
        } else if (emailType.equalsIgnoreCase("random")) {
            user = returnUserFromEmail(GlobalVar.random_email);
        } else if (emailType.equalsIgnoreCase("testbed")) {
            user = returnUserFromEmail(GlobalVar.ELIGIBLE_EMAIL);
        }

        ReadMail7Util mail7Util = new ReadMail7Util(user);

//        if(getCurrentBanner().equalsIgnoreCase("vons")){
//            grocery_login_email_otp = mail7Util.retrieveLatestOTPFromEmail("ACIVONS", 300);
//        }
//        else {
        grocery_login_email_otp = mail7Util.retrieveLatestOTPFromEmail("ACI", 300);
//        }
        System.out.println(grocery_login_email_otp);

    }


    public void aci_enterGroceryLoginOtp() throws InterruptedException {
        String otp = grocery_login_email_otp;
        int s;

        String otp_digit1 = String.valueOf(otp.charAt(0));
        String otp_digit2 = String.valueOf(otp.charAt(1));
        String otp_digit3 = String.valueOf(otp.charAt(2));
        String otp_digit4 = String.valueOf(otp.charAt(3));
        String otp_digit5 = String.valueOf(otp.charAt(4));
        String otp_digit6 = String.valueOf(otp.charAt(5));
        Thread.sleep(500);


        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox1, otp);
//        Thread.sleep(500);

//        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox2, otp_digit2);
//        Thread.sleep(500);
//
//        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox3, otp_digit3);
//        Thread.sleep(500);
//
//        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox4, otp_digit4);
//        Thread.sleep(500);
//
//        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox5, otp_digit5);
//        Thread.sleep(500);
//
//        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox6, otp_digit6);
        hideKeyBoard();

    }

    public void aci_clickDontAllowButton() {
        if (isElementDisplayed(aciGroceryPageElements.DontAllow_button, 5)) {
            tapElement(aciGroceryPageElements.DontAllow_button);
        }
    }

    public void aci_clickAllowButton() {
        waitForDisplayed(aciGroceryPageElements.Allow_button, 130);
        tapElement(aciGroceryPageElements.Allow_button);
    }

    public void aci_clickContinueButton() {
        if (isElementDisplayed(aciGroceryPageElements.continueButton, 10))
            tapElement(aciGroceryPageElements.continueButton);
    }

    public void aci_ClickCreateANewAccountLink() {
        if (isElementDisplayed(aciGroceryPageElements.aci_create_new_account_link, 10)) {
            tapElement(aciGroceryPageElements.aci_create_new_account_link);
        }
    }

    //-------------------Common Login Methods---------------------------------------
//    public void loginAsGuest() throws InterruptedException {
//        Grocery_RegistrationPage groceryRegistrationPage = new Grocery_RegistrationPage(driver);
//        Grocery_ContinueAsGuestPage groceryContinueAsGuestPage = new Grocery_ContinueAsGuestPage(driver);
//        Grocery_DashboardPage groceryDashboardPage = new Grocery_DashboardPage(driver);
//
//
//        if (getCurrentBanner().equalsIgnoreCase("unitedsupermarkets")) {
//            groceryRegistrationPage.resetGroceryApp();
//            groceryContinueAsGuestPage.clickContinueAsGuest();
//            groceryContinueAsGuestPage.selectFirstBanner();
//            groceryContinueAsGuestPage.clickOnFirstGroceryPickup();
//            groceryDashboardPage.verifyGroceryHomePage();
//            groceryDashboardPage.switchGroceryQA2Env();
//            groceryDashboardPage.backToDashbord();
//        } else {
//            if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
////                reset();
//                groceryContinueAsGuestPage.clickContinueAsGuest();
//                groceryRegistrationPage.aci_allowNotifications();
//                groceryRegistrationPage.aci_handleLocation();
//                aci_clickDontAllowButton();
//                groceryRegistrationPage.aci_enterStoreZipCode();
//                groceryRegistrationPage.aci_clickContinueHomePage();
//                aci_clickDontAllowButton();
//                try {
//                    groceryRegistrationPage.aci_clickContinueHomePage();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //  guestUser.clickContinueButton();
//            }
//            if (driver.getPlatformName().equalsIgnoreCase("Android")) {
//                reset();
//                aci_ClickCreateANewAccountLink();
//                groceryContinueAsGuestPage.clickContinueAsGuest();
//                groceryRegistrationPage.aci_handleLocation();
//                groceryRegistrationPage.aci_enterStoreZipCode();
//                groceryRegistrationPage.aci_clickContinueHomePage();
//            }
//
//        }
//
//    }


//    public void userLoginAsGuest() throws InterruptedException{
//        Grocery_RegistrationPage groceryRegistrationPage = new Grocery_RegistrationPage(driver);
//        Grocery_ContinueAsGuestPage groceryContinueAsGuestPage = new Grocery_ContinueAsGuestPage(driver);
//        Grocery_DashboardPage groceryDashboardPage = new Grocery_DashboardPage(driver);
//
//
//        if (getCurrentBanner().equalsIgnoreCase("unitedsupermarkets")) {
//            groceryRegistrationPage.resetGroceryApp();
//            groceryContinueAsGuestPage.clickContinueAsGuest();
//            groceryContinueAsGuestPage.selectFirstBanner();
//            groceryContinueAsGuestPage.clickOnFirstGroceryPickup();
//            groceryDashboardPage.verifyGroceryHomePage();
//            groceryDashboardPage.switchGroceryQA2Env();
//            groceryDashboardPage.backToDashbord();
//        } else {
//            if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
//                reset();
//                groceryContinueAsGuestPage.clickContinueAsGuest();
//                groceryRegistrationPage.aci_allowNotifications();
//                groceryRegistrationPage.aci_handleLocation();
//                aci_clickDontAllowButton();
//                groceryRegistrationPage.aci_enterStoreZipCode();
//                groceryRegistrationPage.aci_clickContinueHomePage();
//                aci_clickDontAllowButton();
//                try {
//                    groceryRegistrationPage.aci_clickContinueHomePage();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //  guestUser.clickContinueButton();
//            }
//            if (driver.getPlatformName().equalsIgnoreCase("Android")) {
//                reset();
//                aci_ClickCreateANewAccountLink();
//                groceryContinueAsGuestPage.clickContinueAsGuest();
//                groceryRegistrationPage.aci_handleLocation();
//                groceryRegistrationPage.aci_enterStoreZipCode();
//                groceryRegistrationPage.aci_clickContinueHomePage();
//            }
//
//        }
//
//    }
//
//    public void loginAsSemiAuth() throws InterruptedException {
//        Grocery_RegistrationPage groceryRegistrationPage = new Grocery_RegistrationPage(driver);
//        Grocery_DashboardPage groceryDashboardPage = new Grocery_DashboardPage(driver);
//        Grocery_LoginPage grocery_LoginPage = new Grocery_LoginPage(driver);
//        if (getCurrentBanner().equalsIgnoreCase("unitedsupermarkets")) {
//            groceryRegistrationPage.resetGroceryApp();
//            enterEmailText();
//            enterPasswordText();
//            clickonLoginButton();
//            clickGroceryPickup();
//            clickOrderGroceriesCTA();
//            groceryDashboardPage.verifyGroceryHomePage();
//            groceryDashboardPage.switchGroceryQA2Env();
//            groceryDashboardPage.backToDashbord();
//        } else {
//            if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
//                groceryRegistrationPage.aci_switchToEmail();
//                aci_enterLoginEmail();
//                aci_GetEmailOTPForGroceryLogin("ymldata");
//                aci_enterGroceryLoginOtp();
//                groceryRegistrationPage.aci_allowNotifications();
//                groceryRegistrationPage.aci_handleLocation();
//                grocery_LoginPage.aci_clickDontAllowButton();
//                groceryRegistrationPage.aci_enterStoreZipCode();
//                groceryRegistrationPage.aci_clickContinueHomePage();
//                grocery_LoginPage.aci_clickDontAllowButton();
//                groceryRegistrationPage.aci_clickContinueHomePage();
//            }
//            if (driver.getPlatformName().equalsIgnoreCase("Android")) {
//                groceryRegistrationPage.aci_switchToEmail();
//                aci_enterLoginEmail();
//                aci_GetEmailOTPForGroceryLogin("ymldata");
//                aci_enterGroceryLoginOtp();
//                groceryRegistrationPage.aci_handleLocation();
//                groceryRegistrationPage.aci_enterStoreZipCode();
//                groceryRegistrationPage.aci_clickContinueHomePage();
//            }
//        }
//    }

    public void  loginAsAuthUser() throws InterruptedException {
        Grocery_RegistrationPage groceryRegistrationPage = new Grocery_RegistrationPage(driver);
        Grocery_DashboardPage groceryDashboardPage = new Grocery_DashboardPage(driver);
        Grocery_LoginPage grocery_LoginPage = new Grocery_LoginPage(driver);

        if (getCurrentBanner().equalsIgnoreCase("unitedsupermarkets")) {
            groceryRegistrationPage.resetGroceryApp();
            enterEmailText();
            enterPasswordText();
            clickonLoginButton();
//            clickGroceryPickup();
//            clickOrderGroceriesCTA();
//            groceryDashboardPage.verifyGroceryHomePage();
//            groceryDashboardPage.switchGroceryQA2Env();
//            groceryDashboardPage.backToDashbord();
        } else {
            if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
                groceryRegistrationPage.aci_switchToEmail();
                aci_enterLoginEmail();
                aci_GetEmailOTPForGroceryLogin("ymldata");
                aci_enterGroceryLoginOtp();
                groceryRegistrationPage.aci_allowNotifications();
                groceryRegistrationPage.aci_handleLocation();
                grocery_LoginPage.aci_clickDontAllowButton();
                groceryRegistrationPage.aci_enterStoreZipCode();
                groceryRegistrationPage.aci_clickContinueHomePage();
                grocery_LoginPage.aci_clickDontAllowButton();
            }
            if (driver.getPlatformName().equalsIgnoreCase("Android")) {
                groceryRegistrationPage.aci_switchToEmail();
                aci_enterLoginEmail();
                aci_GetEmailOTPForGroceryLogin("ymldata");
                aci_enterGroceryLoginOtp();
                groceryRegistrationPage.aci_handleLocation();
                groceryRegistrationPage.aci_enterStoreZipCode();
                groceryRegistrationPage.aci_clickContinueHomePage();
            }
        }
    }

//    public void loginAsAuthUserUsingTestBed() throws InterruptedException {
//        Grocery_RegistrationPage groceryRegistrationPage = new Grocery_RegistrationPage(driver);
//        Grocery_DashboardPage groceryDashboardPage = new Grocery_DashboardPage(driver);
//
//        if (getCurrentBanner().equalsIgnoreCase("unitedsupermarkets")) {
//            groceryRegistrationPage.resetGroceryApp();
//            enterEmailFromTestBed();
//            enterPasswordFromTestBed();
//            clickonLoginButton();
//            clickGroceryPickup();
//            clickOrderGroceriesCTA();
//            groceryDashboardPage.verifyGroceryHomePage();
//            groceryDashboardPage.switchGroceryQA2Env();
//            groceryDashboardPage.backToDashbord();
//        } else {
//            if (driver.getPlatformName().equalsIgnoreCase("Android")) {
//                groceryRegistrationPage.aci_switchToEmail();
//                enterKey(aciGroceryPageElements.email_address, GlobalVar.ELIGIBLE_EMAIL);
//                aci_GetEmailOTPForGroceryLogin("testbed");
//                aci_enterGroceryLoginOtp();
//                groceryRegistrationPage.aci_handleLocation();
//                groceryRegistrationPage.aci_enterStoreZipCode();
//                groceryRegistrationPage.aci_clickContinueHomePage();
//            }
//            if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
//                groceryRegistrationPage.aci_switchToEmail();
//                enterKey(aciGroceryPageElements.email_address, GlobalVar.ELIGIBLE_EMAIL);
//                aci_GetEmailOTPForGroceryLogin("testbed");
//                aci_enterGroceryLoginOtp();
//                groceryRegistrationPage.aci_allowNotifications();
//                groceryRegistrationPage.aci_handleLocation();
//                aci_clickDontAllowButton();
//                groceryRegistrationPage.aci_enterStoreZipCode();
//                groceryRegistrationPage.aci_clickContinueHomePage();
//                aci_clickDontAllowButton();
//
//            }
//        }
//    }


//    public void loginUsingRegistration() throws InterruptedException {
//        Grocery_RegistrationPage groceryRegistrationPage = new Grocery_RegistrationPage(driver);
//        Grocery_DashboardPage groceryDashboardPage = new Grocery_DashboardPage(driver);
//        Grocery_LoginPage grocery_LoginPage = new Grocery_LoginPage(driver);
//        if (getCurrentBanner().equalsIgnoreCase("unitedsupermarkets")) {
//            groceryRegistrationPage.resetGroceryApp();
//            enterEmailFromRandomVar();
//            enterPasswordText();
//            clickonLoginButton();
//            clickGroceryPickup();
//            clickOrderGroceriesCTA();
//            groceryDashboardPage.verifyGroceryHomePage();
//            groceryDashboardPage.switchGroceryQA2Env();
//            groceryDashboardPage.backToDashbord();
//        } else {
//            if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
//                groceryRegistrationPage.aci_switchToEmail();
//                aci_enterLoginEmailForAccountLinking();
//                aci_GetEmailOTPForGroceryLogin("random");
//                aci_enterGroceryLoginOtp();
//                groceryRegistrationPage.aci_allowNotifications();
//                groceryRegistrationPage.aci_handleLocation();
//                grocery_LoginPage.aci_clickDontAllowButton();
//                groceryRegistrationPage.aci_enterStoreZipCode();
//                groceryRegistrationPage.aci_clickContinueHomePage();
//                try {
//                    groceryRegistrationPage.aci_clickContinueHomePage();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (driver.getPlatformName().equalsIgnoreCase("Android")) {
//                groceryRegistrationPage.aci_switchToEmail();
//                aci_enterLoginEmailForAccountLinking();
//                aci_GetEmailOTPForGroceryLogin("random");
//                aci_enterGroceryLoginOtp();
//                groceryRegistrationPage.aci_clickContinueHomePage();
//            }
//        }
//    }

    public void LogoutFromGrocery() {
        //aciGroceryPageElements.click_on_more();
        tapElement(aciGroceryPageElements.aci_more_options);
        waitForElementToDisappear(aciGroceryPageElements.logout_button,20);
        tapElement(aciGroceryPageElements.logout_button);
    }
}
