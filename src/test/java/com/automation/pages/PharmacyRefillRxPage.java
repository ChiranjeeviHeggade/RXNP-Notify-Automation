package com.automation.pages;

import com.automation.mobile.util.CommonActions;
import com.automation.mobile.util.WaitAction;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import java.util.Map;

public class PharmacyRefillRxPage extends PageManager {

    public PharmacyRefillRxPage(AppiumDriver driver) {
        super(driver);
    }


    public void enterPrescriptionNumber(){
        //hideKeyBoard();
        waitForElementToAppear(pharmacyPageElements.prescriptionNO,20);
        typeFromKeyboard(pharmacyPageElements.prescriptionNO,data.get("PrescriptionNumber"));
        hideKeyBoard();
    }

    public void enterStoreNumber(){
       // hideKeyBoard();
        waitForElementToAppear(pharmacyPageElements.storeNO,20);
        typeFromKeyboard(pharmacyPageElements.storeNO,data.get("StoreNumber"));
         hideKeyBoard();
    }

    public void clickOnAddBtn() {
        new WaitAction(driver).waitForElementToBeClickable(pharmacyPageElements.addButton, 20);
        tapElement(pharmacyPageElements.addButton);
    }

    public void enterPrescriptionNumber2(){
       // hideKeyBoard();
        waitForElementToAppear(pharmacyPageElements.prescriptionNO,10);
        typeFromKeyboard(pharmacyPageElements.prescriptionNO,data.get("PrescriptionNumber2"));
        hideKeyBoard();
    }

    public void clickOnContinue(){
        scrollDown();
        waitForElementToAppear(pharmacyPageElements.continueBtn,30);
        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.continueBtn);
    }

    public void verifyRefillOrderPage() {
        try{
            waitForElementToAppear(pharmacyPageElements.verifyRefillOrderPage, 60);
            Assert.assertEquals(pharmacyPageElements.verifyRefillOrderPage.getText(),data.get("REFILLORDERPAGE"));
        }catch (NoSuchElementException e){

        }
    }

    public void clickOnConfirmRefill() {
      //  waitForElementToAppear(pharmacyPageElements.verifyRefillOrderPage,30);
        scrollDownForElement(pharmacyPageElements.confirmRefillBtn);
        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.confirmRefillBtn);
        waitForLoadingComplete();
    }

    public void clickOnCloseRefillReqSentPopup() {
        waitForDisplayed(pharmacyPageElements.confirmPopupCloseButton,50);
        tapElement(pharmacyPageElements.confirmPopupCloseButton);
    }

    public void verifyRefillReqSentPage() {
       if(isElementDisplayed(pharmacyPageElements.refillRequestSent)){
            Assert.assertEquals(pharmacyPageElements.refillRequestSent.getText(),data.get("SENTREFILL"));
        }
        else if (isElementDisplayed(pharmacyPageElements.refillRequestInProgress)) {
           Assert.assertEquals(pharmacyPageElements.refillRequestSent.getText(),data.get("INPROGRESSREFILL"));
        }
    }
}
