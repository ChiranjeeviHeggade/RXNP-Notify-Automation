package com.automation.pages;

import com.automation.mobile.util.CommonActions;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;

public class PharmacyProfileAndSettingsPage extends PageManager{
    public PharmacyProfileAndSettingsPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickPersonalDetailsCTA() {
        waitForElementToAppear(pharmacyPageElements.pharmacy_personalDetails_link, 20);
        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.pharmacy_personalDetails_link);
    }

    public void verifyFirstNameAndLastNAmeIsDisabled() throws InterruptedException {
        waitForLoadingComplete();
        Thread.sleep(4000);

        tapElement(pharmacyPageElements.personalDetails_legalAndPreferredName_link);
        Assert.assertTrue(isElementDisplayed(pharmacyPageElements.personalDetails_dialog_close_icon, 20), "Legal and Prefered name are editable");
        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.personalDetails_dialog_close_icon);
    }

    public void verifyDOBIsDisabled() throws InterruptedException {
        waitForLoadingComplete();
        Thread.sleep(4000);

        tapElement(pharmacyPageElements.personalDetails_dob_icon);
        waitForDisplayed(pharmacyPageElements.personalDetails_dialog_close_icon, 20);
        Assert.assertTrue(isElementDisplayed(pharmacyPageElements.personalDetails_dialog_close_icon, 20), "dob is editable");
        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.personalDetails_dialog_close_icon);
    }

    public void clickIdentityVerificationCTA() {
        waitForElementToAppear(pharmacyPageElements.pharmacy_IdentityVerification_link, 20);
        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.pharmacy_IdentityVerification_link);
    }

    public void verifyStatusAsVerified() {
        waitForDisplayed(pharmacyPageElements.verified_status_text, 20);
        Assert.assertTrue(isElementDisplayed(pharmacyPageElements.verified_status_text, 20));
    }

    public void verifyNeedAditionalHelpText() {
        waitForDisplayed(pharmacyPageElements.need_additional_help_text, 20);
        Assert.assertTrue(isElementDisplayed(pharmacyPageElements.need_additional_help_text, 20));
    }

    public void verifyContactCustomerService() {
        waitForDisplayed(pharmacyPageElements.contact_customer_service_link, 20);
        Assert.assertTrue(isElementDisplayed(pharmacyPageElements.contact_customer_service_link, 20));
    }

    public void verifyGoBackCTA() {
        waitForDisplayed(pharmacyPageElements.back_arrow, 20);
        Assert.assertTrue(isElementDisplayed(pharmacyPageElements.back_arrow, 20));
    }

    public void clickOnIdentityVerificationIcon(){
        waitForElementToAppear(hwPharmacyLinkElements.identityVerificationIcon,10);
        new CommonActions(driver).new ClickAction().clickElement(hwPharmacyLinkElements.identityVerificationIcon);
    }

    public void clickOnVerifyMyProfileCTA(){
        waitForElementToAppear(hwPharmacyLinkElements.verifyMyProfileCTA,10);
        new CommonActions(driver).new ClickAction().clickElement(hwPharmacyLinkElements.verifyMyProfileCTA);
    }
}
