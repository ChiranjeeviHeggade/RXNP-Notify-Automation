package com.automation.pages;

import com.automation.mobile.util.CommonActions;
import com.automation.mobile.util.WaitAction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class PharmacyArchivePrescriptionPage extends PageManager {

    public PharmacyArchivePrescriptionPage(AppiumDriver driver) {
        super(driver);
    }

    public void selectArchiveCTA() throws InterruptedException {
        waitForElementToAppear(pharmacyPageElements.archivePrescription, 40);
        tapElement(pharmacyPageElements.archivePrescription);
    }

    public void Prescription() {
        waitForElementToAppear(pharmacyPageElements.selectPrescription, 20);
        // scrollDownForElement(pharmacyPageElements.scrollToSelectButton);
        pharmacyPageElements.selectPrescription.click();
        //   pharmacyPageElements.selectPrescription.isDisplayed();

    }

    public void selectPrescriptionForArchive() {
        new WaitAction(driver).waitForLoadingComplete();
        Prescription();
    }

    public void selectArchiveButton() throws InterruptedException {
        Thread.sleep(10000);
        pharmacyPageElements.archiveButton.click();
//        tapCoordinate(521,1494);
//        tapCoordinate(679, 2409);
//        Thread.sleep(5000);
        //  waitForElementToAppear(pharmacyPageElements.archiveButton, 40);
        //  tapElement(pharmacyPageElements.archiveButton);
    }


    public void closeSuccessMessage() {
        new WaitAction(driver).waitForLoadingComplete();
        waitForElementToAppear(pharmacyPageElements.prescriptionArchived, 40);
        tapElement(pharmacyPageElements.prescriptionArchived);
    }

    public void verifyArchivedPrescription() {

        clickAllPrescription();
        clickArchivedTab();
        clickAllArchivedOption();
        clickApplyFilter();
        restoreFilter();

    }


    public void clickAllPrescription() {
        waitForElementToAppear(pharmacyPageElements.AllPrescription, 40);
        tapElement(pharmacyPageElements.AllPrescription);
    }


    public void clickArchivedTab() {
        waitForElementToAppear(pharmacyPageElements.ArchivedTab, 40);
        tapElement(pharmacyPageElements.ArchivedTab);
    }


    public void clickAllArchivedOption() {
        waitForElementToAppear(pharmacyPageElements.AllArchivedOption, 40);
        tapElement(pharmacyPageElements.AllArchivedOption);
    }


    public void clickApplyFilter() {
        waitForElementToAppear(pharmacyPageElements.ApplyFilter, 40);
        tapElement(pharmacyPageElements.ApplyFilter);
    }

    public void restoreFilter() {
        waitForElementToAppear(pharmacyPageElements.searchRestoreFilter, 40);
        tapElement(pharmacyPageElements.RestoreFilter);
        new WaitAction(driver).waitForLoadingComplete();
        waitForElementToAppear(pharmacyPageElements.PrescriptionRestored, 40);
        tapElement(pharmacyPageElements.PrescriptionRestored);
    }


    public void backToMyPrescription() {
        waitForElementToAppear(pharmacyPageElements.BackToPrescription, 40);
        tapElement(pharmacyPageElements.BackToPrescription);
    }
}
