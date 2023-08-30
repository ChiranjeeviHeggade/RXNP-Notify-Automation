//package com.automation.steps;
//
//import com.automation.mobile.appium.AppiumDriverManager;
//import com.automation.pages.GroceryDashboardPage;
//import io.appium.java_client.AppiumDriver;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//
//public class GrocerySignupSteps {
//    AppiumDriver driver = AppiumDriverManager.getDriver();
//    GrocerySignupPage grocerySignupPage = new GrocerySignupPage(driver);
//    GroceryDashboardPage groceryDashboardPage = new GroceryDashboardPage(driver);
//
//    @Then("^user tabs on BACK$")
//    public void user_tabs_on_back() {
//        grocerySignupPage.clickOnBackButton();
//    }
//
//    @And("^click on Sign Up button$")
//    public void click_signup_button() {
//        grocerySignupPage.clickOnSignUpButton();
//    }
//
//    @Then("user enter Email Address")
//    public void user_enter_email() {
//        grocerySignupPage.enterEmail();
//    }
//
//    @And("user enter Password")
//    public void user_enter_password() {
//        grocerySignupPage.enterPassword();
//    }
//
//
//    @And("user enter Phone Number")
//    public void user_enter_phone_number() {
//        grocerySignupPage.enterPhoneNumber();
//    }
//
//
//    @And("user enter First Name")
//    public void user_enter_first_name() {
//        grocerySignupPage.enterFirstName();
//    }
//
//
//    @And("user enter Last Name")
//    public void user_enter_last_name() {
//        grocerySignupPage.enterLastName();
//    }
//
//
//    @And("user enter Address")
//    public void user_enter_address() {
//        grocerySignupPage.enterAddress();
//    }
//
//
//    @And("user enter City")
//    public void user_enter_city() {
//        grocerySignupPage.enterCity();
//    }
//
//
//    @And("user enter State")
//    public void user_enter_state() {
//        grocerySignupPage.enterState();
//    }
//
//
//    @And("user enter Zip Code")
//    public void user_enter_zip_code() {
//        grocerySignupPage.enterZipCode();
//    }
//
//
//    @Then("user enters received otp for Grocery sign up confirmation")
//    public void user_enters_received_otp() throws InterruptedException {
//        grocerySignupPage.enterEmailOtp();
//    }
//
//    @And("user click on grocery pick up image")
//    public void user_is_on_grocery_home_page() throws InterruptedException {
//        grocerySignupPage.clickGroceryPickup();
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////    @And("Verify device is registered in D365")
////    public void verifyDeviceRegisteredInD365() throws Exception{
////        groceryDashboardPage.navigateToAppLogsOption();
////
////        String UUID = groceryDashboardPage.getUUIDFromLogs();
////        String DeviceID = groceryDashboardPage.getDeviceIDFromLogs();
////
////        Assert.assertEquals(DeviceRegistrationAPI.getDevice(UUID), DeviceID);
////    }
//
//}