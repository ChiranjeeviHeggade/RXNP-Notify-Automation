package com.automation.pages;

import com.automation.mobile.util.CommonActions;
import com.automation.mobile.util.WaitAction;
import com.aventstack.extentreports.gherkin.model.ScenarioOutline;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.json.JSONObject;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class GroceryDashboardPage extends PageManager{
    public GroceryDashboardPage(AppiumDriver driver) {
        super(driver);
    }
    //HW_ACI_RegistrationPage registrationSteps = new HW_ACI_RegistrationPage(driver);


    public void verifyGroceryHomePage() throws InterruptedException {
        waitForDisplayed(homePageElements.grocery_home,130);
        Assert.assertTrue(isElementDisplayed( homePageElements.grocery_home,120));

        Thread.sleep(5000);
        if (isElementDisplayed(homePageElements.Grocery_Pickup, 25)) {
            //tapElement(homePageElements.Grocery_Pickup);
            waitForClickableAndClick(homePageElements.Grocery_Pickup);
            //waitForLoadingComplete();
        }

//        Thread.sleep(7000);
//        if (isElementDisplayed(homePageElements.Grocery_Pickup, 25)) {
//            tapElement(homePageElements.Grocery_Pickup);
//            Thread.sleep(5000);
//        }
    }

    public void verifyGroceryHomePageForReg() throws InterruptedException {
        waitForDisplayed(homePageElements.grocery_home,130);
        Assert.assertTrue(isElementDisplayed( homePageElements.grocery_home,120));

        Thread.sleep(7000);
        if (isElementDisplayed(homePageElements.Grocery_Pickup, 25)) {
            tapElement(homePageElements.Grocery_Pickup);
            Thread.sleep(5000);
        }
    }

    public void clickPharmacyCTA(){
        if (getCurrentBanner().equalsIgnoreCase("unitedsupermarkets"))
        {
            new WaitAction(driver).waitForElementToBeClickable(homePageElements.pharmacy_icon, 20);
            new CommonActions(driver).new ClickAction().clickElement(homePageElements.pharmacy_icon);
        } else {
            waitForElementToAppear(homePageElements.pharmacy_icon_aci, 10);
            tapElement(homePageElements.pharmacy_icon_aci);
        }
    }

//    public void clickHealthCTA() throws InterruptedException{
//
//        if (getCurrentBanner().equalsIgnoreCase("unitedsupermarkets")) {
//            new WaitAction(driver).waitForElementToBeClickable(homePageElements.health_icon,140);
//            new CommonActions(driver).new ClickAction().clickElement(homePageElements.health_icon);
//            new HealthLoginPage(driver);
//            waitForLoadingComplete();
//        } else {
//
////            registrationSteps.clickPharmacyCTA();
////            registrationSteps.clickHealthFooter();
//            registrationSteps.clickHealthCTA();
//            Thread.sleep(2000);
//            if(isElementDisplayed(homePageElements.login_button,20)) {
//                waitForClickableAndClick(homePageElements.login_button);
//            }
//            Thread.sleep(2000);
//            if(isElementDisplayed(registrationElements.login_pin,20)) {
//                typeFromKeyboard(registrationElements.login_pin, "11111");
//            }
//            Thread.sleep(10000);
//            if(isElementDisplayed(registrationElements.login_pin,8)) {
//                typeFromKeyboard(registrationElements.login_pin, "11111");
//            }
//            Thread.sleep(3000);
//            if(isElementDisplayed(biometricsElements.laterBiometrics,10)) {
//                waitForClickableAndClick(biometricsElements.laterBiometrics);
//            }
//
//            //registrationSteps.clickHealthFooter();
//
//        }
//    }

    public void switchGroceryQA2Env() throws InterruptedException {

        Thread.sleep(5000);
        if (isElementDisplayed(homePageElements.Grocery_Pickup, 25)) {
            //tapElement(homePageElements.Grocery_Pickup);
            waitForClickableAndClick(homePageElements.Grocery_Pickup);
            //waitForLoadingComplete();
        }

        waitForElementToAppear(homePageElements.more_button_element,120);
        tapElement(homePageElements.more_button_element);

        waitForElementToAppear(homePageElements.about_Our_App_element,120);
        tapElement(homePageElements.about_Our_App_element);

        waitForElementToAppear(homePageElements.switch_to_env_element,120);
        tapElement(homePageElements.switch_to_env_element);

        Thread.sleep(3000);
        waitForLoadingComplete();

        tapElement(homePageElements.QA2_env_element);

    }

    public void backToDashbord() {
        if(isElementDisplayed(homePageElements.back_button,40)) {
            tapElement(homePageElements.back_button);
        }

        waitForLoadingComplete();
        if(isElementDisplayed(homePageElements.back_button,40)) {
            tapElement(homePageElements.back_button);
        }
    }
    public void clickAcceptAndCloseButton() throws InterruptedException {
      //  Thread.sleep(5000);
        if(isElementDisplayed(healthPageElements.WelcomeToHealthPage,20)&& driver.getPlatformName().equalsIgnoreCase("Android")){
            //scrollDown();
            //new CommonActions(driver).new ClickAction().clickElement(healthPageElements.health_Accept_And_close_button);
            tapElement(healthPageElements.health_Accept_And_close_button);

            Thread.sleep(5000);
        }
    }

//    public void navigateToAppLogsOption() throws Exception{
//        waitForElementToAppear(homePageElements.more_button_element,120);
//        tapElement(homePageElements.more_button_element);
//        Thread.sleep(3000);
//        waitForLoadingComplete();
//
//        scrollDown();
//
//        waitForElementToAppear(homePageElements.log_button,120);
//        tapElement(homePageElements.log_button);
//
//        Thread.sleep(5000);
//        waitForLoadingComplete();
//    }
//
//    public String getUUIDFromLogs(){
//        scrollDown();
//        scrollDown();
//        scrollDown();
//        scrollDown();
//        scrollDown();
//
//        waitForElementToAppear(homePageElements.logTextForUUIDandDeviceID,120);
//        JSONObject json = new JSONObject(getText(homePageElements.logTextForUUIDandDeviceID));
//
//        return json.get("groceryUUID").toString();
//    }
//
//    public String getDeviceIDFromLogs(){
//        waitForElementToAppear(homePageElements.logTextForUUIDandDeviceID,120);
//        JSONObject json = new JSONObject(getText(homePageElements.logTextForUUIDandDeviceID));
//
//        return json.getJSONArray("deviceIds").getJSONObject(0).get("deviceID").toString();
//    }
}
