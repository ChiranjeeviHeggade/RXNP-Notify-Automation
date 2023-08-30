package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PharmacyP1PageElements {

    //@MFE-1960 and @MFE-1961

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Email']")
    public MobileElement email_button;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'@mailsac.com')]")
    public MobileElement clearExistingEmailID;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
    public MobileElement newEmailID;

    @AndroidFindBy(xpath="//android.widget.EditText[1]")
    public MobileElement health_EnterOtp_textbox1;

    @AndroidFindBy(xpath="//android.widget.EditText[2]")
    public MobileElement health_EnterOtp_textbox2;

    @AndroidFindBy(xpath="//android.widget.EditText[3]")
    public MobileElement health_EnterOtp_textbox3;

    @AndroidFindBy(xpath="//android.widget.EditText[4]")
    public MobileElement health_EnterOtp_textbox4;

    @AndroidFindBy(xpath="//android.widget.EditText[5]")
    public MobileElement health_EnterOtp_textbox5;

    @AndroidFindBy(xpath="//android.widget.EditText[6]")
    public MobileElement health_EnterOtp_textbox6;

    @AndroidFindBy(xpath="//android.widget.Button[@resource-id='Phone']")
    public MobileElement phoneNumberButton;

    @AndroidFindBy(xpath="//android.widget.EditText")
    public MobileElement newPhoneNumber;

    // @MFE-2480 @MFE-2481

    @AndroidFindBy(xpath="//android.widget.Button[@resource-id='Grocery']")
    public MobileElement groceryBtn;

   // @AndroidFindBy(xpath="//android.view.View[@resource-id='Schedule_A_Vaccine']")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(25)" + ".scrollIntoView(new UiSelector().textContains(\"Schedule A Vaccine\")).scrollForward()")
    public MobileElement vaccineSchedule;
    @AndroidFindBy(xpath="//*[@content-desc='Schedule Now']")
    public MobileElement scheduleNow;

    @AndroidFindBy(xpath="//*[@content-desc='Pet Care']")
    public MobileElement petCare;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'My Vaccine Records')]")
    public MobileElement my_vaccine_option;


    // @MFE-1716

    @AndroidFindBy(xpath = "//*[@text='My Pharmacy']/following-sibling::android.view.View/android.view.View/android.widget.Button")
    public MobileElement findYourPharmacy;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='findPharmacySearchInput']")
    public MobileElement ZipCodeTextBox;

    @AndroidFindBy(xpath = "//*[@text='search']")
    public MobileElement searchIcon;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(25)" + ".scrollIntoView(new UiSelector().textContains(\"Change my pharmacy\")).scrollForward()")
    public MobileElement changeMyPharmacy;

    // @MFE-1734

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Locate Pharmacy']")
    public MobileElement locatePharmacy;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Pharmacy_Info')]")
    public MobileElement infoIcon;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='_Close_icon']/following-sibling::android.widget.TextView")
    public MobileElement pharmacyInfo;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='Pharmacy_PharmacyDetails_ModalAddressBtn']/android.widget.TextView")
    public MobileElement pharmacyLocation;

    @AndroidFindBy(xpath = "(//android.view.View[@resource-id='Pharmacy_PharmacyDetails_ModalAddressBtn']/android.widget.TextView)[3]")
    public MobileElement cityName;

    @AndroidFindBy(xpath = "(//android.view.View[@resource-id='Pharmacy_PharmacyDetails_ModalAddressBtn']/android.widget.TextView)[5]")
    public MobileElement stateName;

    @AndroidFindBy(xpath = "(//android.view.View[@resource-id='Pharmacy_PharmacyDetails_ModalAddressBtn']/android.widget.TextView)[7]")
    public MobileElement zipCodeName;

    @AndroidFindBy(xpath = "//*[@text='Now Closed']")
    public MobileElement closedPharmacy;

    @AndroidFindBy(xpath = "//*[@text='Now Open']")
    public MobileElement openPharmacy;

    //@MFE-2032

    @AndroidFindBy(xpath = "//*[contains(@text,'Pick Up')]/following-sibling::android.view.View")
    public MobileElement defaultDeliveryMethod;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Pre-payment')]")
    public MobileElement prePaymentText;

//    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Close')]")
//    public MobileElement closeButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(25)" + ".scrollIntoView(new UiSelector().textContains(\"Close\")).scrollForward()")
    public MobileElement closeButton;

    //@MFE-2169

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Notifications']")
    public MobileElement notificationCTA;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@resource-id='id-Health']")
    public MobileElement healthToggle;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@resource-id='id-Pharmacy_Orders']")
    public MobileElement pharmacyToggle;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@resource-id='id-Pharmacy_Medications']")
    public MobileElement medicationToggle;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@text='Deals & Discounts Notification not checked']")
    public MobileElement dealsToggle;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Save Changes']")
    public MobileElement saveChange;

}
