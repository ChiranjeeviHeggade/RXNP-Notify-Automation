package com.automation.steps;

import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.pages.PharmacyDashboardPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;

public class PharmacyRegistrationSteps {
    AppiumDriver driver = AppiumDriverManager.getDriver();
    PharmacyDashboardPage pharmacyDashboardPage = new PharmacyDashboardPage(driver);

    @Then("user verify pharmacy dashboard page after signup")
    public void userVerifyPharmacyDashboardPageAfterSignup() throws InterruptedException {
        pharmacyDashboardPage.verifyPharmacyDashboardAfterSignUp();
    }
}
