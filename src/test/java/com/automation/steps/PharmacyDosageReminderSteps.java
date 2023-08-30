package com.automation.steps;

import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.pages.PharmacyDosageReminderPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;

public class PharmacyDosageReminderSteps {

    AppiumDriver driver = AppiumDriverManager.getDriver();

    PharmacyDosageReminderPage dosageReminderPage = new PharmacyDosageReminderPage(driver);

    @And("user click on any Prescription")
    public void userClickOnAnyPrescription() {
        dosageReminderPage.clickOnPrescription();
    }

    @And("user click on edit icon")
    public void userClickOnEditIcon() {
        dosageReminderPage.clickOnEditIcon();
    }

    @And("user select Day as dosage reminder")
    public void userSelectDayAsDosageReminder() throws InterruptedException {
        dosageReminderPage.selectDayForReminder();
    }

    @And("user click on Add Time button")
    public void userClickOnAddTimeButton() {
        dosageReminderPage.clickOnAddTimeBtn();
    }

    @And("user select Time for dosage reminder")
    public void userSelectTimeForDosageReminder() {
        dosageReminderPage.selectTimeForReminder();
    }

    @And("user click on save")
    public void userClickOnSave() {
        dosageReminderPage.clickOnSaveBtn();
    }
}
