package com.automation.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

public class PharmacyTransferRxPage extends PageManager {
    public PharmacyTransferRxPage(AppiumDriver driver) {
        super(driver);
    }

    public void verifyTransferRxPage() {
        try{
            waitForElementToAppear(pharmacyPageElements.transfer_from, 120);
            Assert.assertEquals(pharmacyPageElements.transfer_from.getText(),data.get("FROMPAGENAME"));
        }catch (NoSuchElementException e){

        }

    }

    public void enterNonACIZipCode() {
        waitForDisplayed(pharmacyPageElements.transfer_from_input, 20);
        enterKey(pharmacyPageElements.transfer_from_input, data.get("NONACIZIPCODE"));
        hideKeyBoard();
    }

    public void verifyListNonACI() {
        waitForDisplayed(pharmacyPageElements.transfer_from_ListView, 40);
        Assert.assertTrue(isElementDisplayed(pharmacyPageElements.transfer_from_ListView, 120));
    }

    public void selectAnPharmacyFromNonACIList() {
        waitForClickableAndClick(pharmacyPageElements.select_pharmacy_button_transfer_from);
    }

    public void verifyWhichRxTotransferPage() {
        try{
            waitForElementToAppear(pharmacyPageElements.whichRxtoTransfer_text, 60);
            Assert.assertEquals(pharmacyPageElements.whichRxtoTransfer_text.getText(),data.get("RXLISTTEXT"));
        }catch (NoSuchElementException e){

        }
    }

    public void SelectRxToTransfer() {
        tapElement(pharmacyPageElements.all_eligible_button);
    }

    public void clickContinueButton() {
        waitForClickableAndClick(pharmacyPageElements.continue_button);
    }

    public void verifyTransferToPage() {
        try{
            waitForElementToAppear(pharmacyPageElements.transfer_to, 60);
            Assert.assertEquals(pharmacyPageElements.transfer_to.getText(),data.get("TOPAGENAME"));
        }catch (NoSuchElementException e){

        }
    }

    public void enterACIZipCode() {
        waitForDisplayed(pharmacyPageElements.transfer_from_input, 20);
        enterKey(pharmacyPageElements.transfer_from_input, data.get("ACIZIPCODE"));
        hideKeyBoard();
    }

    public void verifyListACI() {
        waitForDisplayed(pharmacyPageElements.transfer_from_ListView, 40);
        Assert.assertTrue(isElementDisplayed(pharmacyPageElements.transfer_from_ListView, 40));
    }

    public void selectAnPharmacyFromACIList() {
        waitForClickableAndClick(pharmacyPageElements.select_pharmacy_button_transfer_from);
    }

    public void verifyDetailsOnTransferRxPage() {
        try{
            waitForElementToAppear(pharmacyPageElements.transfer_Rx_text, 60);
            Assert.assertEquals(pharmacyPageElements.transfer_Rx_text.getText(),data.get("CONFIRMORDERPAGE"));
        }catch (NoSuchElementException e){

        }
    }

    public void verifyAndClickChangeCTAForTransferFrom() {
        waitForLoadingComplete();
        scrollDownForElement(pharmacyPageElements.transfer_from_change_cta);
        waitForClickableAndClick(pharmacyPageElements.transfer_from_change_cta);
    }

    public void changeTransferFromPharmacy() {
        verifyTransferRxPage();
        enterNonACIZipCode();
        verifyListNonACI();
        selectAnPharmacyFromNonACIList();
    }

    public void verifyAndClickChangeCTAForTransferTo() {
        verifyDetailsOnTransferRxPage();
        waitForLoadingComplete();
        scrollDownForElement(pharmacyPageElements.transfer_to_change_cta);
        waitForClickableAndClick(pharmacyPageElements.transfer_to_change_cta);
    }

    public void changeTransferToPharmacy() {
        enterACIZipCode();
        verifyListACI();
        selectAnPharmacyFromACIList();
    }

    public void clickConfirmTransferCTA() {
        scrollDownForElement(pharmacyPageElements.confirm_transfer_cta);
        waitForClickableAndClick(pharmacyPageElements.confirm_transfer_cta);
    }

    public void clickEnableNotifications() {

    }

    public void verifyTransferRecordInEPS() {
    }


    public void clickContinueAsGuestLink() {
        waitForDisplayed(pharmacyPageElements.continue_as_guest_link, 20);
        tapElement(pharmacyPageElements.continue_as_guest_link);
    }

    public void verifyTransferRequestPage() {
        try{
            waitForElementToAppear(pharmacyPageElements.transfer_req_sent_message, 60);
            Assert.assertEquals(pharmacyPageElements.transfer_req_sent_message.getText(),data.get("POPUPMESSAGE"));
        }catch (NoSuchElementException e){

        }
    }

    public void enterGuestFirstName() {
        waitForElementToAppear(pharmacyPageElements.guest_firstName, 20);
        typeFromKeyboard(pharmacyPageElements.guest_firstName, data.get("FIRSTNAME"));
    }

    public void enterGuestLastName() {
        waitForElementToAppear(pharmacyPageElements.guest_lastName, 20);
        typeFromKeyboard(pharmacyPageElements.guest_lastName, data.get("LASTNAME"));
    }

    public void clickContinueButtonAfterEnteringMobileNum() throws InterruptedException {
        waitForLoadingComplete();
        Thread.sleep(3000);
        waitForClickableAndClick(pharmacyPageElements.mobileNumber_continue_button);
    }

    public void clickContinueButtonGuestTransferFlow() throws InterruptedException {
        waitForLoadingComplete();
        scrollDownForElement(pharmacyPageElements.continue_button);
        waitForClickableAndClick(pharmacyPageElements.continue_button);
    }

    public void enterDOB() {
        waitForElementToAppear(pharmacyPageElements.guest_dob_month, 20);
        typeFromKeyboard(pharmacyPageElements.guest_dob_month, data.get("MONTH"));
        hideKeyBoard();

        waitForElementToAppear(pharmacyPageElements.guest_dob_date, 20);
        typeFromKeyboard(pharmacyPageElements.guest_dob_date, data.get("DAY"));
        hideKeyBoard();

        waitForElementToAppear(pharmacyPageElements.guest_dob_year, 20);
        typeFromKeyboard(pharmacyPageElements.guest_dob_year, data.get("YEAR"));
        hideKeyBoard();
    }

    public void enterMobileNumberGuestTransferFlow() {
        waitForElementToAppear(pharmacyPageElements.guest_phone, 20);
        typeFromKeyboard(pharmacyPageElements.guest_phone, data.get("PHONE"));
        hideKeyBoard();
        scrollDown();
    }

    public void clickContinueAsGuestLinkForGuestFlow() {
        waitForElementToAppear(pharmacyPageElements.continue_As_guest_link, 50);
        tapElement(pharmacyPageElements.continue_As_guest_link);
    }
}
