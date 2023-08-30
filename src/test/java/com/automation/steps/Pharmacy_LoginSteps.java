package com.automation.steps;

import com.automation.mobile.appium.AppiumDriverManager;

import com.automation.pages.Pharmacy_LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Pharmacy_LoginSteps {
    AppiumDriver driver = AppiumDriverManager.getDriver();
    Pharmacy_LoginPage pharmacyLoginPage = new Pharmacy_LoginPage(driver);

    @And("user login to Pharmacy App")
    public void userLoginToPharmacyApp() throws InterruptedException {
        pharmacyLoginPage.loginToPharmacyAPP("ymlData");
    }

    @And("user login to Pharmacy App using test bed")
    public void userLoginToPharmacyAppUsingTestBed() {
        pharmacyLoginPage.loginToPharmacyAPP("testbed");
    }

    @And("user login to Pharmacy App using random email")
    public void userLoginToPharmacyAppUsingRandomEmail() {
        pharmacyLoginPage.loginToPharmacyAPP("random");
    }

    @Then("enter pin for mail confirmation for ACI")
    public void enterPinForMailConfirmationForACI() {
        pharmacyLoginPage.confirmPin();
    }

    @And("user logout from Pharmacy and Grocery.")
    public void userLogoutFromPharmacyAndGrocery() throws InterruptedException {
        pharmacyLoginPage.clickonBackToGrocery();
        pharmacyLoginPage.clickonMemberCTA();
    }
}
