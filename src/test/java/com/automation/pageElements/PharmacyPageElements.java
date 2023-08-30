package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PharmacyPageElements {
    @AndroidFindBy(xpath = "//*[@resource-id=\"heading0\"]")
    public MobileElement pharmacy_home;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Transfer Prescriptions\"]")
    public MobileElement transfer_prescriptions_link;

//    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(10)" + ".scrollIntoView(new UiSelector().textContains(\"Transfer Prescriptions\")).scrollForward()")
//    public MobileElement transfer_prescriptions_link;

    @AndroidFindBy(xpath = "//android.view.View[@text='Transfer From']")
    public MobileElement transfer_from;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='findPharmacySearchInput']")
    public MobileElement transfer_from_input;

    @AndroidFindBy(xpath = "//android.widget.ListView")
    public MobileElement transfer_from_ListView;

    @AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='Select'])[1]")
    public MobileElement select_pharmacy_button_transfer_from;

    @AndroidFindBy(xpath = "//*[@text='Which prescriptions would you like to transfer?']")
    public MobileElement whichRxtoTransfer_text;

    @AndroidFindBy(xpath = "//*[@text='All eligible']")
    public MobileElement all_eligible_button;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(25)" + ".scrollIntoView(new UiSelector().textContains(\"Continue\")).scrollForward()")
    public MobileElement mobileNumber_continue_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
    public MobileElement continue_button;

    @AndroidFindBy(xpath = "//*[@text='Transfer To']")
    public MobileElement transfer_to;

    @AndroidFindBy(xpath = "//*[@text='Transfer prescriptions']")
    public MobileElement transfer_Rx_text;

    @AndroidFindBy(xpath = "(//*[@resource-id='Change'])[1]")
    public MobileElement transfer_from_change_cta;

    @AndroidFindBy(xpath = "(//*[@resource-id='Change'])[2]")
    public MobileElement transfer_to_change_cta;

    @AndroidFindBy(xpath = "//*[@resource-id='Confirm_Transfer']")
    public MobileElement confirm_transfer_cta;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'ontinue_')]")
    public MobileElement continue_as_guest_link;

    @AndroidFindBy(xpath = "//*[@text='Transfer Request Sent']")
    public MobileElement transfer_req_sent_message;

    @AndroidFindBy(xpath = "//*[@resource-id='personalDetailsFormFirstName']")
    public MobileElement guest_firstName;
    @AndroidFindBy(xpath = "//*[@resource-id='personalDetailsFormLastName']")
    public MobileElement guest_lastName;

    @AndroidFindBy(xpath = "//*[@resource-id='input-date-month']")
    public MobileElement guest_dob_month;

    @AndroidFindBy(xpath = "//*[@resource-id='input-date-day']")
    public MobileElement guest_dob_date;

    @AndroidFindBy(xpath = "//*[@resource-id='input-date-year']")
    public MobileElement guest_dob_year;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='mobileNumber']")
    public MobileElement guest_phone;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Continue_As_Guest\"]")
    public MobileElement continue_As_guest_link;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Profile menu\"]")
    @AndroidFindBy(xpath = "//*[@text='Profile menu']")
    public MobileElement pharmacy_profile_menu;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Account Settings, navigation\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@resource-id='Personal_Details']")
    public MobileElement pharmacy_personalDetails_link;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Legal_and_Preferred_Name']")
    public MobileElement personalDetails_legalAndPreferredName_link;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Personal_details_dialog_Close_icon']")
    public MobileElement personalDetails_dialog_close_icon;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Date_of_Birth']")
    public MobileElement personalDetails_dob_icon;

    @AndroidFindBy(xpath = "//*[@resource-id='Identity_Verification']")
    public MobileElement pharmacy_IdentityVerification_link;

    @AndroidFindBy(xpath = "//*[@text='Verified']")
    public MobileElement verified_status_text;

    @AndroidFindBy(xpath = "//*[@text='Need additional help?']")
    public MobileElement need_additional_help_text;

    @AndroidFindBy(xpath = "//*[@resource-id='Contact_customer_service']")
    public MobileElement contact_customer_service_link;

    @AndroidFindBy(xpath = "//*[@resource-id='Left_arrow_icon']")
    public MobileElement back_arrow;

    @AndroidFindBy(xpath = "//*[@resource-id='Accept_And_Close']")
    public MobileElement pharmacy_accept_and_close_button;

    //---Sachin's locators
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Find your pharmacy']")
    public MobileElement verifyLogin;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id ='Refill_Prescriptions']")
    public MobileElement refillPrescription;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id ='personalDetailsFormFirstName']")
    public MobileElement firstName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id ='personalDetailsFormLastName']")
    public MobileElement lastName;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id ='Continue']")
    public MobileElement continueBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@text,'I want to receive')]")
    public MobileElement tapCheckBox;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='rxNumber']")
    public MobileElement prescriptionNO;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='storeNumber']")
    public MobileElement storeNO;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Add']")
    public MobileElement addButton;

    @AndroidFindBy(xpath = "//*[@text='Refill order']")
    public MobileElement verifyRefillOrderPage;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm Refill']")
    public MobileElement confirmRefillBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Refill_Request_Sent_Close']")
    public MobileElement confirmPopupCloseButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Refill request sent!']")
    public MobileElement refillRequestSent;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Refill In Progress']")
    public MobileElement refillRequestInProgress;

    @AndroidFindBy(xpath = "//*[@text='Close']")
    public MobileElement closeButton;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Continue_as_guest\"]")
    public MobileElement continue_as_guest_pharmacy_semi_auth_link;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='See all notifications']")
    public MobileElement seeAllBtn;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Manage Prescriptions\"]")
    public MobileElement managePrescription;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'Verify']")
    public MobileElement idProofingBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'All_Prescriptions')]")
    public MobileElement waitForAllPrescriptionIcon;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Refill')]")
    public MobileElement refillCTA;

    @AndroidFindBy(xpath = "//*[contains(@resource-id='Pharmacy_Prescription_detailsBtn')]")
    public MobileElement orderBtn;

    @AndroidFindBy(xpath = "//*[@text = 'Your order details']")
    public MobileElement verifyOderPage;

    @AndroidFindBy(xpath = "//*[contains(@text,'+1')]")
    public MobileElement pharmacyPhone;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Confirm Order')]")
    public MobileElement confirmOrderBtn;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(10)" + ".scrollIntoView(new UiSelector().textContains(\"+1\")).scrollForward()")
    public MobileElement scrollToSelectButton;

    //---Sachin's locators for Dosage Reminder Elements

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Prescription_detailsBtn')]")
    public MobileElement prescriptionSelection;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Edit prescription reminder']")
    public MobileElement editIcon;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add Time']")
    public MobileElement addTimeBtn;

    @AndroidFindBy(xpath = "//*[@text='FRIDAY']")
    public MobileElement daySelect;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next hours']")
    public MobileElement nextHourBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Save']")
    public MobileElement saveButton;

    //---Sachin's locators for Auth Payment Elements

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Pay_Now')]")
    public MobileElement payNowCTA;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Delivery']")
    public MobileElement deliveryBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add new card']")
    public MobileElement paymentMethod;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id = 'cardNumber']")
    public MobileElement cardNumber;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id = 'ddlExpirationMonth']")
    public MobileElement expirationMonth;

    @AndroidFindBy(xpath = "//android.widget.ListView/android.widget.CheckedTextView")
    public List<MobileElement> listOfMonths;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id = 'ddlExpirationYear']")
    public MobileElement expirationYear;

    @AndroidFindBy(xpath = "//android.widget.ListView/android.widget.CheckedTextView")
    public List<MobileElement> listOfYears;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='CVV']")
    public MobileElement cvvNumber;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='txtBillingEditName']")
    public MobileElement cardName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='txtBillingEditAddress1']")
    public MobileElement address;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='txtBillingEditCity']")
    public MobileElement cityName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='txtBillingEditZip']")
    public MobileElement zipCode;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='submit']")
    public MobileElement saveCardBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id='Pay')]")
    public MobileElement payButton;

    //archive page elements
    @AndroidFindBy(xpath = "//android.widget.Image[contains(@text,'_Pharmacy')]")
    public MobileElement pharmacyImageCTA;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Find your pharmacy']")
    public MobileElement verifyPharmacyDashboard;

//    @AndroidFindBy(xpath = "//*[@text='Manage Prescriptions']")
//    public MobileElement managePrescription;


    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Archive']")
    public MobileElement archivePrescription;


    @AndroidFindBy(xpath = "//*[contains(@resource-id,'Select')]")
    public MobileElement selectPrescription;


//    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(10)" + ".scrollIntoView(new UiSelector().textContains(\"Select\")).scrollForward()")
//    public MobileElement scrollToSelectButton;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Archive\"]")
    public MobileElement archiveButton;


    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Prescription_Archived_Close']")
    public MobileElement prescriptionArchived;


    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='All_Prescriptions']")
    public MobileElement AllPrescription1;


    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(20)" + ".scrollIntoView(new UiSelector().textContains(\"All Prescriptions\")).scrollBackward()")
    public MobileElement AllPrescription;

    @AndroidFindBy(xpath = "//*[@text='My Prescriptions']/following-sibling::android.view.View/android.widget.Button")
    public MobileElement PrescriptionCardDetails;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Ready For pickup']")
    public MobileElement ReadyForPickup;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Auto Refill on']")
    public MobileElement AutoRefillOn;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Archived']/following-sibling::android.view.View")
    public MobileElement ArchivedTab;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='All Archived']")
    public MobileElement AllArchivedOption;


    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Apply_Filter']")
    public MobileElement ApplyFilter;


    @AndroidFindBy(xpath = "//*[@text='Ready for Pick Up']//preceding-sibling::android.widget.TextView")
    public List<MobileElement> ReadyForPickUpPrescriptions;

    @AndroidFindBy(xpath = "//*[@text='Auto Refill On']//preceding-sibling::android.widget.TextView")
    public List<MobileElement> AutoRefillOnPrescription;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(15)" + ".scrollIntoView(new UiSelector().textContains(\"Restore\")).scrollForward()")
    public MobileElement searchRestoreFilter;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'Restore')]")
    public MobileElement RestoreFilter;


    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Prescription_Restored_Close']")
    public MobileElement PrescriptionRestored;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Back to prescription']")
    public MobileElement BackToPrescription;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='All Active']")
    public MobileElement AllActiveOption;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Ready for refill']")
    public MobileElement ReadyForRefillOption;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Refill requested']")
    public MobileElement RefillRequestedOption;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='No Refills']")
    public MobileElement NoRefillsOption;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Expired']")
    public MobileElement ExpiredOption;

    @AndroidFindBy(xpath = "//*[@resource-id='Locate_Pharmacy']")
    public MobileElement LocatePharmacyCTA;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Use my current location']")
    public MobileElement MyCurrentLocationLink;

    @AndroidFindBy(xpath = "(//*[contains(@resource-id,'Pharmacy_Prescription_detailsBtn')])[1]")
    public MobileElement SelectPrescriptionCard;

    @AndroidFindBy(xpath = "//*[@text=\"Last Filled At\"]")
    public MobileElement LastFilledDetails;

    @AndroidFindBy(xpath = "//*[@text='Additional Information']")
    public WebElement additionalInformationOfDrug;


    @AndroidFindBy(xpath = "//*[@text='Prescribed by']/following-sibling::android.view.View[1]")
    public MobileElement Prescribedby;


    @AndroidFindBy(xpath = "//*[@text='Prescription Number']/following-sibling::android.view.View[1]")
    public MobileElement PrescriptionNumber;


    @AndroidFindBy(xpath = "//*[@text='Quantity']/following-sibling::android.view.View[1]")
    public MobileElement Quantity;


    @AndroidFindBy(xpath = "//*[@text='Expiration date']/following-sibling::android.view.View[1]")
    public MobileElement ExpirationDate;


}
