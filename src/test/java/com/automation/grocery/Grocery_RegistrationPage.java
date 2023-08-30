package com.automation.grocery;


import com.automation.mobile.util.CommonActions;
import com.automation.mobile.util.GlobalVar;
import com.automation.mobile.util.ReadMail7Util;
import com.automation.mobile.util.WaitAction;
import com.automation.pages.PageManager;
import io.appium.java_client.AppiumDriver;

public class Grocery_RegistrationPage extends PageManager {

    public Grocery_RegistrationPage(AppiumDriver driver) {
        super(driver);
    }

    //-------------------United Registration Methods----------------------------
    public void resetGroceryApp() {
        // ResetAppOnce();
        if (isElementDisplayed(homePageElements.OK_button)) {
            new WaitAction(driver).waitForElementToBeClickable(homePageElements.OK_button, 20);
            new CommonActions(driver).new ClickAction().clickElement(homePageElements.OK_button);
        }
        if (isElementDisplayed(homePageElements.loc_accept_button, 20)) {
            new WaitAction(driver).waitForElementToBeClickable(homePageElements.loc_accept_button, 20);
            new CommonActions(driver).new ClickAction().clickElement(homePageElements.loc_accept_button);
        }
        new WaitAction(driver).waitForLoadingComplete();
        if (isElementDisplayed(homePageElements.back_button, 20)) {
            new WaitAction(driver).waitForElementToBeClickable(homePageElements.back_button, 20);
            new CommonActions(driver).new ClickAction().clickElement(homePageElements.back_button);
        }

    }


    public void clickOnSignUpButton() {
        new WaitAction(driver).waitForLoadingComplete();
        new WaitAction(driver).waitForElementToBeClickable(homePageElements.signUp_button, 20);
        new CommonActions(driver).new ClickAction().clickElement(homePageElements.signUp_button);
    }


    public void enterEmail() {
        waitForElementToAppear(homePageElements.email_address, 20);
        enterKey(homePageElements.email_address, generateRandomEmail(8));
    }

    public void enterPassword() {
        new WaitAction(driver).waitForLoadingComplete();
        enterKey(homePageElements.password, data.get("PASSWORD"));
    }


    public void enterPhoneNumber() {
        hideKeyBoard();
        enterKey(homePageElements.phoneNumber, generateRandomPhoneNumber(14));
    }


    public void enterFirstName() {
        hideKeyBoard();
        new WaitAction(driver).waitForLoadingComplete();
        enterKey(homePageElements.firstName, data.get("FIRSTNAME"));
    }


    public void enterLastName() {
        hideKeyBoard();
        new WaitAction(driver).waitForLoadingComplete();
        enterKey(homePageElements.lastName, data.get("LASTNAME"));
    }


    public void enterAddress() {
        hideKeyBoard();
        new WaitAction(driver).waitForLoadingComplete();
        enterKey(homePageElements.address, data.get("ADDRESS"));
    }


    public void enterCity() {
        hideKeyBoard();
        new WaitAction(driver).waitForLoadingComplete();
        enterKey(homePageElements.city, data.get("CITY"));
    }


    public void enterState() {
        hideKeyBoard();
        new WaitAction(driver).waitForLoadingComplete();
        new WaitAction(driver).waitForElementToBeClickable(homePageElements.state, 20);
        new CommonActions(driver).new ClickAction().clickElement(homePageElements.state);

        new WaitAction(driver).waitForElementToBeClickable(homePageElements.state_option, 20);
        new CommonActions(driver).new ClickAction().clickElement(homePageElements.state_option);

        new WaitAction(driver).waitForElementToBeClickable(homePageElements.state_ok, 20);
        new CommonActions(driver).new ClickAction().clickElement(homePageElements.state_ok);
    }


    public void enterZipCode() {
        hideKeyBoard();
        new WaitAction(driver).waitForLoadingComplete();
        enterKey(homePageElements.zip, data.get("ZIPCODE"));
        hideKeyBoard();
    }


    public void united_enterEmailOtp() {
        String user = GlobalVar.Random_User;
        System.out.println(user);
        waitForElementToAppear(homePageElements.email_OTP_verification, 25);
        new WaitAction(driver).waitForLoadingComplete();

        enterKey(homePageElements.email_OTP_verification, united_GetEmailOTPForRegistration(user));
    }

    public String united_GetEmailOTPForRegistration(String user) {
        ReadMail7Util mail7Util = new ReadMail7Util(user);
        return mail7Util.retrieveLatestOTPFromEmail("Grocery", 30);
    }

    public void clickGroceryPickup() throws InterruptedException {
        Thread.sleep(5000);
        if (isElementDisplayed(homePageElements.Grocery_Pickup, 45)) {
            tapElement(homePageElements.Grocery_Pickup);
            waitForLoadingComplete();
        }
        Thread.sleep(5000);
        if (isElementDisplayed(homePageElements.Grocery_Pickup, 25)) {
            tapElement(homePageElements.Grocery_Pickup);
        }
        Thread.sleep(5000);
    }

    //-------------------ACI Registration Methods----------------------------
    public void aci_switchToEmail() throws InterruptedException {
        driver.resetApp();
        Thread.sleep(4000);

        if (driver.getPlatformName().equalsIgnoreCase("android"))
        {
            if (isElementDisplayed(aciGroceryPageElements.aci_create_new_account_link, 10)) {
                tapElement(aciGroceryPageElements.aci_create_new_account_link);
            }
            Thread.sleep(2000);
            scrollDown();

            waitForElementToAppear(aciGroceryPageElements.SwitchButton, 20);
            Thread.sleep(2000);
            tapCoordinate(690,700);
            int count=1;
            Thread.sleep(4000);
            do{
                tapElement(aciGroceryPageElements.SwitchButton);
                if(aciGroceryPageElements.SwitchButton.equals(driver.switchTo().activeElement())){
                if(aciGroceryPageElements.SwitchButton.isEnabled())
                clickElement(aciGroceryPageElements.SwitchButton);
                Thread.sleep(2000);
                if(count>=5){
                    break;
                }}
            }while(!isElementDisplayed(aciGroceryPageElements.email_address,10));{
                count++;
            }


        } else {
            if (isElementDisplayed(aciGroceryPageElements.CancelLocationPopup, 5)) {
                tapElement(aciGroceryPageElements.CancelLocationPopup);
            }
            tapElement(aciGroceryPageElements.SwitchButton);
            System.out.println("iOS");
        }
    }

    public void aci_enterRandomEmail() {
        waitForElementToAppear(aciGroceryPageElements.email_address, 20);
        tapElement(aciGroceryPageElements.email_address);
        enterKey(aciGroceryPageElements.email_address, generateRandomEmail(8));
    }


    public String aci_GetEmailOTPForRegistration() throws InterruptedException {
        Thread.sleep(40000);
        String randomUser = GlobalVar.Random_User;
        ReadMail7Util mail7Util = new ReadMail7Util(randomUser);
//        if(getCurrentBanner().equalsIgnoreCase("vons")) {
//            return mail7Util.retrieveLatestOTPFromEmail("ACIVONS", 300);
//        }else
            return mail7Util.retrieveLatestOTPFromEmail("ACI", 300);
    }

    public void aci_enterEmailOtp() throws InterruptedException {
        String otp = aci_GetEmailOTPForRegistration();

        String otp_digit1 = String.valueOf(otp.charAt(0));
        String otp_digit2 = String.valueOf(otp.charAt(1));
        String otp_digit3 = String.valueOf(otp.charAt(2));
        String otp_digit4 = String.valueOf(otp.charAt(3));
        String otp_digit5 = String.valueOf(otp.charAt(4));
        String otp_digit6 = String.valueOf(otp.charAt(5));
        Thread.sleep(5000);

        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox1, otp_digit1);
        Thread.sleep(1000);

        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox2, otp_digit2);
        Thread.sleep(1000);

        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox3, otp_digit3);
        Thread.sleep(1000);

        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox4, otp_digit4);
        Thread.sleep(1000);

        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox5, otp_digit5);
        Thread.sleep(1000);

        enterFromKeyboard(aciGroceryPageElements.pharmacy_EnterOtp_textbox6, otp_digit6);
        hideKeyBoard();

//        if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
//            aciGroceryPageElements.nextButton.click();
//        }
    }

    public void aci_handleLocation() {
        waitForLoadingComplete();
        if (isElementDisplayed(aciGroceryPageElements.LocationServicesDisabled, 7)) {
            tapElement(aciGroceryPageElements.LocationServicesDisabled);
        }

        try {
            Thread.sleep(2000);
            tapCoordinate(105, 351);
            tapCoordinate(351, 351);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void aci_enterStoreZipCode() {
        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            if (isElementDisplayed(aciGroceryPageElements.start_Shopping, 20)) {
                clickElement(aciGroceryPageElements.store_ZIP_code);
                clearElement( aciGroceryPageElements.store_ZIP_code);
                typeFromKeyboard(aciGroceryPageElements.store_ZIP_code, data.get("ZIP"));

                waitForElementToAppear(aciGroceryPageElements.search_pharmacy, 10);
                tapElement(aciGroceryPageElements.search_pharmacy);

                waitForElementToAppear(aciGroceryPageElements.start_Shopping, 30);
                tapElement(aciGroceryPageElements.start_Shopping);


//                if(!isElementDisplayed(aciGroceryPageElements.continueHomeButton, 10)){
//                    tapElement(aciGroceryPageElements.start_Shopping);
//                }

            }
        }

        if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
            if (isElementDisplayed(aciGroceryPageElements.store_ZIP_code, 10)) {
                if(aciGroceryPageElements.store_ZIP_code.isEnabled())
                {
                    waitForElementToAppear(aciGroceryPageElements.store_ZIP_code, 30);
                    aciGroceryPageElements.store_ZIP_code.clear();
                    typeFromKeyboard(aciGroceryPageElements.store_ZIP_code, data.get("ZIP"));
                }
                else{
                    waitForElementToBeClickable(aciGroceryPageElements.store_ZIP_code,50);
                    aciGroceryPageElements.store_ZIP_code.clear();
                    typeFromKeyboard(aciGroceryPageElements.store_ZIP_code, data.get("ZIP"));
                }
                try{
                    Thread.sleep(2000);
                }catch (Exception e){
                }
                aciGroceryPageElements.enterButton.click();
            }
            if(isElementDisplayed(aciGroceryPageElements.start_Shopping,6)){
                tapElement(aciGroceryPageElements.start_Shopping);
            }
        }

    }

    public void aci_clickNextButton() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        aciGroceryPageElements.enterButton.click();

    }

    public void aci_clickStartShoppingButton() throws InterruptedException {
        if (isElementDisplayed(aciGroceryPageElements.startShoppingButton, 10)) {
            clickElement(aciGroceryPageElements.startShoppingButton);
            waitForLoadingComplete();
            Thread.sleep(5000);
        }
    }

    public void aci_clickContinueHomePage() throws InterruptedException {
        if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
            if (isElementDisplayed(aciGroceryPageElements.CancelLocationPopup, 10)) {
                tapElement(aciGroceryPageElements.CancelLocationPopup);
            }
            if (isElementDisplayed(aciGroceryPageElements.learnMore_done_button, 10)) {
                tapElement(aciGroceryPageElements.learnMore_done_button);
            }
            if (isElementDisplayed(aciGroceryPageElements.nextPickUpToolTip, 10)) {
                waitForElementToAppear(aciGroceryPageElements.nextPickUpToolTip, 20);
                tapElement(aciGroceryPageElements.nextPickUpToolTip);

                waitForElementToAppear(aciGroceryPageElements.NextDealsToolTip, 20);
                tapElement(aciGroceryPageElements.NextDealsToolTip);

                waitForElementToAppear(aciGroceryPageElements.NextWalletToolTip, 20);
                tapElement(aciGroceryPageElements.NextWalletToolTip);
            }

            if (isElementDisplayed(aciGroceryPageElements.continueHomeButton)) {
                waitForElementToAppear(aciGroceryPageElements.continueHomeButton, 20);
                tapElement(aciGroceryPageElements.continueHomeButton);
            }

        }
        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            waitForElementToAppear(aciGroceryPageElements.continueHomeButton, 13);
            tapElement(aciGroceryPageElements.continueHomeButton);
            Thread.sleep(3000);
            tapCoordinate(902, 392);
        }
    }

    //-----------------------Common Registration Methods----------------------------------
    public void signUpintoGrocery() throws InterruptedException {
        Grocery_DashboardPage groceryDashboardPage = new Grocery_DashboardPage(driver);
        Grocery_LoginPage grocery_LoginPage = new Grocery_LoginPage(driver);
        if (getCurrentBanner().equalsIgnoreCase("unitedsupermarkets")) {
            resetGroceryApp();
            clickOnSignUpButton();
            enterEmail();
            enterPassword();
            enterPhoneNumber();
            enterFirstName();
            enterLastName();
            enterAddress();
            enterCity();
            enterState();
            enterZipCode();
            clickOnSignUpButton();
            united_enterEmailOtp();
            clickGroceryPickup();
            groceryDashboardPage.verifyGroceryHomePageForReg();
            groceryDashboardPage.switchGroceryQA2Env();
            groceryDashboardPage.backToDashbord();
        } else {
            if (driver.getPlatformName().equalsIgnoreCase("iOS")) {

                aci_switchToEmail();
                aci_enterRandomEmail();
                aci_enterEmailOtp();
                aci_allowNotifications();
                aci_handleLocation();
                grocery_LoginPage.aci_clickDontAllowButton();
                aci_enterStoreZipCode();
                aci_clickContinueHomePage();
                try {
                    aci_clickContinueHomePage();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (driver.getPlatformName().equalsIgnoreCase("Android")) {
                aci_switchToEmail();
                aci_enterRandomEmail();
                aci_enterEmailOtp();
                aci_handleLocation();
                aci_enterStoreZipCode();
                aci_clickContinueHomePage();
            }
        }
    }


    public void aci_allowNotifications() {
        if (isElementDisplayed(aciGroceryPageElements.allowNotifications, 10)) {
            waitForElementToAppear(aciGroceryPageElements.allowNotifications, 40);
            tapElement(aciGroceryPageElements.allowNotifications);
        }
    }

}

