package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Caregiver_PageElements {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Manage Profiles\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Manage Profiles']")
    public MobileElement manage_Profile;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Add Profile\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Add Profile\"]")
    public MobileElement add_Profiles;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Get Started\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Get Started\"]")
    public MobileElement get_StartedBtn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Month\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Your birthday, month']")
    public MobileElement input_Month;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Date\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Your birthday, day']")
    public MobileElement input_Day;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Year\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Your birthday, year']")
    public MobileElement input_Year;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'notificationS')])[2]")
    @AndroidFindBy(xpath = "(//android.widget.RadioButton)[2]")
    public MobileElement verifyAddedMinor;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Switched to']")
    @AndroidFindBy(xpath = "//*[contains(@text,'Switched to')]")
    public MobileElement toast_Message;


    @iOSXCUITFindBy(xpath = "(//*[contains(@label,'Revoke access for')])[1]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'Revoke access for')]")
    public MobileElement remove_CTA;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Add Profile\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Add_Profile_Caregiver_Manage_Profiles\"]")
    public MobileElement addProfile_CTA;

    //Expiry Reminder Button
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Expiry reminders\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Expiry reminders\"]")
    public MobileElement expiry_ReminderBtn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Manage Profiles\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"profileIcon\"]")
    public MobileElement minors_ProfilePage;

    @iOSXCUITFindBy(xpath = "(//*[contains(@label,'Revoke access')])[1]")
    @AndroidFindBy(xpath = "(//android.widget.Button[contains(@text,'Revoke access')])[1]")
    public MobileElement revokeButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Access Revoked\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Access Revoked']")
    public MobileElement access_Revoked;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label=\"Ready for Pick Up\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Ready for Pick Up\"]")
    public MobileElement ready_ForPickupOption;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to dashboard\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Back to dashboard']")
    public MobileElement backFromManageRxPage;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'notificationS')])[3]")
    @AndroidFindBy(xpath = "(//android.widget.RadioButton)[3]")
    public MobileElement switch_User2;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'notificationS')])[4]")
    @AndroidFindBy(xpath = "(//android.widget.RadioButton)[4]")
    public MobileElement switch_User3;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label=\"Auto Refill On\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Auto Refill On\"]")
    public MobileElement Verify_AutoRefillOn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label=\"Auto Refill Off\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Auto Refill Off\"]")
    public MobileElement verify_autoRefillOff;

    @AndroidFindBy(xpath = "(//*[contains(@text,'Request access for')])[1]")
    public MobileElement requestCTA;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Review\"]")
    public MobileElement review_CTA;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Allow_Access\"]")
    public MobileElement allowAccessCTA;

    @AndroidFindBy(xpath = "//*[@text=\"Go To Dashboard\"]")
    public MobileElement goToDashboardCTA;

    @AndroidFindBy(xpath = "//*[@text=\"Prescriptions\"]")
    public MobileElement prescriptionSection;

    @AndroidFindBy(xpath = "//*[contains(@text,\"Notifications\")]")
    public MobileElement notificationScreen;

    @AndroidFindBy(xpath = "//*[@text=\"Access Requested\"]")
    public MobileElement accessRequested;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Decline_Access\"]")
    public MobileElement declineAccessCTA;

    @AndroidFindBy(xpath = "//*[@text=\"Manage Profiles\"]")
    public MobileElement manageProfile;

    @AndroidFindBy(xpath = "//*[@text=\"I have access to\"]")
    public MobileElement accessText;

    @AndroidFindBy(xpath = "//*[contains(@text,'Remove access for')]")
    public MobileElement removeCTA;

    @AndroidFindBy(xpath = "//*[@text=\"People with access to my profile\"]")
    public MobileElement majorMangeProfilePage;

    @AndroidFindBy(xpath = "//*[@text=\"Carmen Hummel is requesting access to manage your pharmacy\"]")
    public MobileElement reviewNotificationCard;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@text=\"Sincerely Health Notification\"]")
    public MobileElement healthNotificationSetOn;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@text=\"Pharmacy Orders Notification\"]")
    public MobileElement pharmacyOrdersNotificationSetOn;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@text=\"Pharmacy Medications Notification\"]")
    public MobileElement pharmacyMedicationNotificationSetOn;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@text=\"Deals & Discounts Notification\"]")
    public MobileElement DealsNotificationSetOn;

    @AndroidFindBy(xpath = "//*[@text=\"Carmen Hummel has requested digital access to your pharmacy account.\"]")
    public MobileElement consentText;

    @AndroidFindBy(xpath = "//*[text()='Access Granted']")
    public MobileElement accessGrantMessage;

    @AndroidFindBy(xpath = "//*[text()='2 Profiles. Switch Profile']")
    public MobileElement verifyProfileIcon;

    @AndroidFindBy(xpath = "//*[contains(@text,\"Profile of\")]")
    public MobileElement profile_MySettings;

    @AndroidFindBy(xpath = "//*[contains(@text,'Pay $')]")
    public MobileElement payBtn;

    @AndroidFindBy(xpath = "//*[@text=\"Notifications 1\"]")
    public MobileElement intialCount;

    @AndroidFindBy(xpath = "//*[@text=\"Notifications 2\"]")
    public MobileElement finalCount;
}
