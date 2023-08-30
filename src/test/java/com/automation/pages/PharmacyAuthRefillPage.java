package com.automation.pages;

import com.automation.mobile.util.CommonActions;
import com.automation.mobile.util.WaitAction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class PharmacyAuthRefillPage extends PageManager {

    public PharmacyAuthRefillPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickOnManagePrescription() {
//        try {
//            waitForElementToAppear(pharmacyPageElements.seeAllBtn,10);
//            scrollDownBySmallAmount();
//            //scrollDown(1);
//            waitForDisplayed(pharmacyPageElements.managePrescription,10);
//            new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.managePrescription);
//           // tapElement(pharmacyPageElements.managePrescription);
//        }catch (NoSuchElementException e) {
//            System.out.println("User is on Dashboard");
//        }
//    }
//
//    public void verifyIDProofing(){
//        waitForElementToAppear(pharmacyPageElements.idProofingBtn, 10);
//        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.idProofingBtn);
//    }
//
//    public void clickOnRefillCTA(){
//        try{
//            waitForElementToAppear(pharmacyPageElements.waitForAllPrescriptionIcon,10);
//            scrollDownForElement(pharmacyPageElements.refillCTA);
//            scrollDownBySmallAmount();
//            new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.refillCTA);
//        }
//        catch (NoSuchElementException e){
//            System.out.println("User is on My Prescription page");
//        }
//
//    }
//
//    public void clickOnOrderBtn() throws InterruptedException {
//        waitForLoadingComplete();
//        Thread.sleep(5000);
////        waitForElementToAppear(pharmacyPageElements.orderBtn,20);
//         tapElement(pharmacyPageElements.orderBtn);
////        tapCoordinate(540,1680);
////        tapCoordinate(700,1500);
//
//        Thread.sleep(5000);
//       // new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.orderBtn);
//
//    }
//
//    public void verifyOderDetails() throws InterruptedException {
//        try{
//            waitForElementToAppear(pharmacyPageElements.verifyOderPage, 60);
//            Assert.assertEquals(pharmacyPageElements.verifyOderPage.getText(),data.get("ODERRPAGE"));
//        }catch (NoSuchElementException e){
//
//        }
//
//    }
//
//    public void clickOnPharmacyPhoneNumber() throws InterruptedException {
//        waitForDisplayed(pharmacyPageElements.verifyOderPage,10);
//        scrollDownForElement(pharmacyPageElements.scrollToSelectButton);
//        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.pharmacyPhone);
//        switchToNativeContext();
//    }
//
//    public void clickOnConfirmOrder() {
//        waitForDisplayed(pharmacyPageElements.confirmOrderBtn, 30);
//        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.confirmOrderBtn);
//    }
    }
}
