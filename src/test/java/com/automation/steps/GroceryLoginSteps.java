package com.automation.steps;

import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.mobile.util.GlobalVar;
import com.automation.pages.GroceryDashboardPage;
import com.automation.pages.GroceryLoginPage;
import io.appium.java_client.AppiumDriver;
import com.automation.testBedUtils.TestBedReaderUtil;
import com.automation.testBedUtils.TestOutputUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GroceryLoginSteps {
    AppiumDriver driver = AppiumDriverManager.getDriver();
    GroceryLoginPage groceryLoginPage = new GroceryLoginPage(driver);
    GroceryDashboardPage groceryDashboardPage = new GroceryDashboardPage(driver);

    TestBedReaderUtil testBedReaderUtil = new TestBedReaderUtil();
    TestOutputUtil testOutputUtil = new TestOutputUtil();

    @When("user enter email address")
    public void user_enter_email_address() throws InterruptedException {
        groceryLoginPage.enterEmailText();
    }

    @And("user enter login Password")
    public void user_enter_password() {
        groceryLoginPage.enterPasswordText();
    }

    @When("user click on login button")
    public void user_click_on_login_button() throws InterruptedException {
        groceryLoginPage.clickonLoginButton();

    }

    @When("user click on Grocery pickup button")
    public void user_click_on_GroceryPickUp_button() throws InterruptedException {
        groceryLoginPage.clickGroceryPickup();

    }

    @And("user click on Order Groceries button if exist")
    public void userClickOnOrderGroceriesButtonIfExist() {
        groceryLoginPage.clickOrderGroceriesCTA();
    }

    @Then("verify Grocery home screen is displayed")
    public void verify_grocery_home_screen_is_displayed() throws InterruptedException {
        groceryDashboardPage.verifyGroceryHomePage();

    }

    @Then("verify Grocery home screen is displayed for reg")
    public void verify_grocery_home_screen_is_displayed_reg() throws InterruptedException {
        groceryDashboardPage.verifyGroceryHomePageForReg();
    }

    @And("user switch to QA2 Environment")
    public void switch_Environment() throws InterruptedException {
        groceryDashboardPage.switchGroceryQA2Env();

    }

    @And("user goes back to grocery dashboard")
    public void userGoesBackToDashboard() {
        groceryDashboardPage.backToDashbord();

    }

//    @Given("Login to Grocery if not logged in")
//    public void loginToGrocery() throws Exception{
//        if(!groceryLoginPage.isGroceryLoggedIn()){
//            System.out.println("User is not logged in");
//            String test = testOutputUtil.readTxt();
//            GlobalVar.random_email = test;
//            GlobalVar.Random_User = test.substring(0,14);
//            System.out.println(GlobalVar.Random_User);
//            groceryLoginPage.enterEmailText();
//            groceryLoginPage.enterPasswordText();
//            groceryLoginPage.clickonLoginButton();
//            groceryLoginPage.clickGroceryPickup();
//            groceryLoginPage.clickOrderGroceriesCTA();
//            groceryDashboardPage.verifyGroceryHomePage();
//        }
//        else{
//            System.out.println("User is logged in");
//        }
//    }

    @Then("user writes registered email to excel Report")
    public void userWritesRegisteredEmailToExcelReport() {
//        testOutputUtil.writeTestOutputToExcel("Grocery", "Grocery and Pharmacy registration", GlobalVar.random_email, "Email ID stored for future reference");
        testOutputUtil.writeTxt(GlobalVar.random_email);
    }

    @When("user login to Grocery with auth user")
    public void userLoginToGroceryWithAuthUser() throws InterruptedException {
        groceryLoginPage.loginAsAuthUser();
    }
}
