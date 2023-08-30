package com.automation.pages;

import com.automation.mobile.util.CommonActions;
import com.automation.mobile.util.WaitAction;
import io.appium.java_client.AppiumDriver;

import java.util.NoSuchElementException;

public class PharmacyDosageReminderPage extends PageManager {
    public PharmacyDosageReminderPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickOnPrescription() {
        try {
            waitForElementToAppear(pharmacyPageElements.prescriptionSelection, 10);
            scrollDownForElement(pharmacyPageElements.prescriptionSelection);
            tapElement(pharmacyPageElements.prescriptionSelection);
        } catch (NoSuchElementException e) {
            System.out.println("user is on pharmacy dashboard");
        }
    }

    public void clickOnEditIcon() {
        new WaitAction(driver).waitForElementToBeClickable(pharmacyPageElements.editIcon, 10);
        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.editIcon);
    }

    public void selectDayForReminder() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementToAppear(pharmacyPageElements.daySelect, 20);
        clickElement(pharmacyPageElements.daySelect);
//        tapElement(pharmacyPageElements.daySelect);
    }

    public void clickOnAddTimeBtn() {
        waitForElementToAppear(pharmacyPageElements.daySelect, 10);
        // scrollDownForElement(pharmacyPageElements.addTimeBtn);
        scrollDown();
        new WaitAction(driver).waitForElementToBeClickable(pharmacyPageElements.addTimeBtn, 10);
        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.addTimeBtn);
    }

    public void selectTimeForReminder() {
        for (int i = 1; i <= Integer.parseInt(data.get("Time")); i++) {
            tapElement(pharmacyPageElements.nextHourBtn);
        }
    }

    public void clickOnSaveBtn() {
        new WaitAction(driver).waitForElementToBeClickable(pharmacyPageElements.saveButton, 10);
        new CommonActions(driver).new ClickAction().clickElement(pharmacyPageElements.saveButton);
        waitForLoadingComplete();
    }
}
