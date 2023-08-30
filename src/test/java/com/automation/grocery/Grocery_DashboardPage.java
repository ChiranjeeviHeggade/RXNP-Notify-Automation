package com.automation.grocery;

import com.automation.mobile.util.CommonActions;
import com.automation.mobile.util.WaitAction;
import com.automation.pages.PageManager;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

public class Grocery_DashboardPage extends PageManager {
    public Grocery_DashboardPage(AppiumDriver driver) {
        super(driver);
    }

    public void verifyGroceryHomePage() {
        Assert.assertTrue(isElementDisplayed(homePageElements.grocery_home, 180));
    }

    public void verifyGroceryHomePageForReg() throws InterruptedException {
        waitForDisplayed(homePageElements.grocery_home, 130);
        Assert.assertTrue(isElementDisplayed(homePageElements.grocery_home, 120));
        Thread.sleep(7000);
        if (isElementDisplayed(homePageElements.Grocery_Pickup, 25)) {
            tapElement(homePageElements.Grocery_Pickup);
            Thread.sleep(5000);
        }
    }

    public void clickPharmacyCTA() {
        if (getCurrentBanner().equalsIgnoreCase("unitedsupermarkets"))
        {
            new WaitAction(driver).waitForElementToBeClickable(homePageElements.pharmacy_icon, 20);
            new CommonActions(driver).new ClickAction().clickElement(homePageElements.pharmacy_icon);
        } else {
            waitForElementToAppear(homePageElements.pharmacy_icon_aci, 20);
            tapElement(homePageElements.pharmacy_icon_aci);
        }
    }



    public void switchGroceryQA2Env() throws InterruptedException {
        if (getCurrentEnv().equalsIgnoreCase("qa2")) {
            waitForElementToAppear(homePageElements.more_button_element, 120);
            tapElement(homePageElements.more_button_element);

            waitForElementToAppear(homePageElements.about_Our_App_element, 120);
            tapElement(homePageElements.about_Our_App_element);

            waitForElementToAppear(homePageElements.switch_to_env_element, 120);
            tapElement(homePageElements.switch_to_env_element);

            Thread.sleep(3000);
            waitForLoadingComplete();

            tapElement(homePageElements.QA2_env_element);
        }
    }

    public void backToDashbord() {
        if (isElementDisplayed(homePageElements.back_button, 40)) {
            tapElement(homePageElements.back_button);
        }

        waitForLoadingComplete();
        if (isElementDisplayed(homePageElements.back_button, 40)) {
            tapElement(homePageElements.back_button);
        }
    }

    public void clickAcceptAndCloseButton() throws InterruptedException {
        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            if (isElementDisplayed(pharmacyPageElements.WelcomePage, 20)) {
                scrollDown();
                tapElement(pharmacyPageElements.pharmacy_accept_and_close_button);
                Thread.sleep(5000);
            }
        }
        if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
            try {
                waitForElementToAppear(pharmacyPageElements.Accept_And_close_button, 80);
                tapElement(pharmacyPageElements.Accept_And_close_button);
            } catch (NoSuchElementException e) {
                System.out.println("User is on Dashboard");
            }

        }
    }


}
