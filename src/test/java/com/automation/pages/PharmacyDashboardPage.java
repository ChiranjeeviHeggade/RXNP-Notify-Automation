package com.automation.pages;

import com.automation.mobile.util.CommonActions;
import com.automation.mobile.util.WaitAction;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;

import java.util.NoSuchElementException;

public class PharmacyDashboardPage extends PageManager {
    public PharmacyDashboardPage(AppiumDriver driver) {
        super(driver);
    }

    public void verifyPharmacyDashboard() {
        if (isElementDisplayed(pharmacyPageElements.closeButton, 20)) {
            tapElement(pharmacyPageElements.closeButton);
        }
        waitForDisplayed(pharmacyPageElements.pharmacy_profile_menu, 40);
        Assert.assertTrue(isElementDisplayed(pharmacyPageElements.pharmacy_profile_menu, 40));

    }

    public void verifyPharmacyDashboardAfterSignUp() throws InterruptedException {
        Thread.sleep(5000);
        scrollDown();
        if (isElementDisplayed(healthPageElements.Continue_button)) {
            tapElement(healthPageElements.Continue_button);
        }

        if (isElementDisplayed(pharmacyPageElements.closeButton, 20)) {
            tapElement(pharmacyPageElements.closeButton);
        }

        waitForDisplayed(pharmacyPageElements.pharmacy_profile_menu, 40);
        Assert.assertTrue(isElementDisplayed(pharmacyPageElements.pharmacy_profile_menu, 40));

    }

    public void clickVerifyBtn() throws InterruptedException {
        scrollDown(16);
        Thread.sleep(3000);
        new WaitAction(driver).waitForElementToBeClickable(hwPharmacyLinkElements.verify_btn, 140);
        new CommonActions(driver).new ClickAction().clickElement(hwPharmacyLinkElements.verify_btn);
    }

    public void clickLetsDoItBtn() {
        new WaitAction(driver).waitForElementToBeClickable(hwPharmacyLinkElements.lets_do_it_btn, 140);
        new CommonActions(driver).new ClickAction().clickElement(hwPharmacyLinkElements.lets_do_it_btn);
    }

    public void enterStoreNumber() {
        String storeId = "";
        if(getCurrentBanner().equalsIgnoreCase("unitedsupermarkets")) {
            storeId = "0546";
        } else {
            storeId = "9816";
        }
        new WaitAction(driver).waitForElementToBeClickable(hwPharmacyLinkElements.store_number, 140);
        typeFromKeyboard(hwPharmacyLinkElements.store_number, storeId);
        // hideKeyBoard();
    }

    public void enterPrescriptionNumber() {
        new WaitAction(driver).waitForElementToBeClickable(hwPharmacyLinkElements.prescription_number, 140);
        typeFromKeyboard(hwPharmacyLinkElements.prescription_number, data.get("prescriptionId"));
        hideKeyBoard();
    }

    public void verifyCouponDetails() {

        waitForElementToAppear(hwPharmacyLinkElements.verifyAccLinKNotification, 60);
        Assert.assertTrue(isElementDisplayed(hwPharmacyLinkElements.verifyAccLinKNotification));


    }

    public void imageContinueButton() {
        new WaitAction(driver).waitForElementToBeClickable(hwPharmacyLinkElements.imageContinue_btn, 140);
        new CommonActions(driver).new ClickAction().clickElement(hwPharmacyLinkElements.imageContinue_btn);
        waitForLoadingComplete();
    }

    public void clickTransferRxLink() {
        scrollDown();
        scrollDownForElement(pharmacyPageElements.transfer_prescriptions_link, 30);
        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.transfer_prescriptions_link);
    }

    public void clickProfileAndSettings() throws InterruptedException {
        Thread.sleep(3000);
        waitForElementToBeClickable(pharmacyPageElements.pharmacy_profile_menu, 20);
        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.pharmacy_profile_menu);
    }

    public void tapOnRefillPrescriptions() {
        try {
            waitForElementToAppear(pharmacyPageElements.verifyLogin, 20);
            scrollDown();
            tapElement(pharmacyPageElements.refillPrescription);
        } catch (NoSuchElementException e) {
            if (isElementDisplayed(pharmacyPageElements.closeButton, 20)) {
                tapElement(pharmacyPageElements.closeButton);
            } else {
                System.out.println(e.getMessage());
            }
        }

    }

    public void tapOnManagePrescription() {

        waitForElementToAppear(pharmacyPageElements.verifyPharmacyDashboard, 20);
        scrollDown();
        waitForElementToAppear(pharmacyPageElements.managePrescription, 10);
        tapElement(pharmacyPageElements.managePrescription);

    }
}
