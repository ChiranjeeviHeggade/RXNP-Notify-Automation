package com.automation.steps;

import com.automation.grocery.Grocery_DashboardPage;
import com.automation.mobile.appium.AppiumDriverManager;
//import com.automation.pages.grocery.Grocery_DashboardPage;
//import com.automation.pages.grocery.Grocery_LoginPage;
//import com.automation.pages.grocery.Grocery_RegistrationPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Grocery_Steps {


    AppiumDriver driver = AppiumDriverManager.getDriver();
    //Grocery_LoginPage groceryLoginPage = new Grocery_LoginPage(driver);
    //Grocery_RegistrationPage groceryRegistrationPage = new Grocery_RegistrationPage(driver);
    Grocery_DashboardPage groceryDashboardPage = new Grocery_DashboardPage(driver);

    //Sign up steps
//    @When("user sign up into Grocery")
//    public void userSignUpIntoGrocery() throws InterruptedException {
//        groceryRegistrationPage.signUpintoGrocery();
//
//    }
//
//    //Login Steps
//    @When("user login to Grocery as a guest")
//    public void userLoginToGroceryAsAGuest() throws InterruptedException {
//        groceryLoginPage.loginAsGuest();
//    }
//
//    @When("user login to Grocery with semi auth user")
//    public void userLoginToGroceryWithSemiAuthUser() throws InterruptedException {
//        groceryLoginPage.loginAsSemiAuth();
//    }
//
//    @When("user login to Grocery with auth user")
//    public void userLoginToGroceryWithAuthUser() throws InterruptedException {
//        groceryLoginPage.loginAsAuthUser();
//    }
//
//    @When("user login to Grocery with auth user using test bed")
//    public void userLoginToGroceryWithAuthUserUsingTestBed() throws InterruptedException {
//        groceryLoginPage.loginAsAuthUserUsingTestBed();
//    }
//
//    @When("user login to Grocery using Registration")
//    public void userLoginToGroceryUsingRegistation() throws InterruptedException {
//        groceryLoginPage.loginUsingRegistration();
//    }

    //Dashboard steps
    @When("user click on pharmacy CTA")
    public void user_click_on_pharmacy_cta() {
        groceryDashboardPage.clickPharmacyCTA();
    }

//    @When("user login to Grocery as a guest for first time")
//    public void LoginToGroceryAsAGuestForFirstTime() throws InterruptedException {
//        groceryLoginPage.userLoginAsGuest();
//    }
//
//
//    @Then("user logout from Grocery")
//    public void userLogoutFromGrocery() {
//        groceryLoginPage.LogoutFromGrocery();
//        ////*[@text="more"]
//
//    }

//    @Then("finally user logout from the grocery account")
//    public void finallyUserLogoutFromTheGroceryAccount() {
//        groceryLoginPage.LogoutFromGrocery();
//    }
//}
}
