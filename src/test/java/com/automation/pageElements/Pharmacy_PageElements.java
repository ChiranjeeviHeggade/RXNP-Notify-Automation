package com.automation.pageElements;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Pharmacy_PageElements {

    @AndroidFindBy(xpath = "(//*[@text='Welcome'])[2]")
    public MobileElement WelcomePage;

    @AndroidFindBy(xpath = "//*[contains(@text,'Welcome')][1]")
    public MobileElement WelcomeBackPage;

    //---------sign up Locators----------

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Sign Up\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sign Up']")
    public MobileElement signUp_button;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'_Enroll')]")
    public MobileElement Lets_Enroll_button;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@text,'I accept the Terms & Conditions')]")
    public MobileElement pharmacy_Terms_and_conditions_checkbox;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@text,'HIPAA Marketing Consent')]")
    public MobileElement pharmacy_hippa_marketing_consent_checkbox;

    @AndroidFindBy(xpath = "//*[@resource-id='Continue']")
    public MobileElement pharmacy_continue_button;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label=\"Legal first name\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='first-name']")
    public MobileElement legal_First_name;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
    public MobileElement first_name_textBox;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
    public MobileElement last_name_textBox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label=\"Legal last name\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='last-name']")
    public MobileElement legal_Last_name;


    @AndroidFindBy(xpath = "//*[@resource-id='input-date-month']")
    public MobileElement month;

    @AndroidFindBy(xpath = "//*[@resource-id='input-date-day']")
    public MobileElement day;

    @AndroidFindBy(xpath = "//*[@resource-id='input-date-year']")
    public MobileElement year;

    @AndroidFindBy(xpath = "//*[@resource-id='email']")
    public MobileElement pharmacy_sign_up_email;

    @iOSXCUITFindBy(xpath = "//*[@label=\"otp character 1 of 6\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[1]")
    public MobileElement enterOtp_textbox1;

    @iOSXCUITFindBy(xpath = "//*[@label=\"otp character 2 of 6\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[2]")
    public MobileElement enterOtp_textbox2;

    @iOSXCUITFindBy(xpath = "//*[@label=\"otp character 3 of 6\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[3]")
    public MobileElement enterOtp_textbox3;

    @iOSXCUITFindBy(xpath = "//*[@label=\"otp character 4 of 6\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[4]")
    public MobileElement enterOtp_textbox4;

    @iOSXCUITFindBy(xpath = "//*[@label=\"otp character 5 of 6\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[5]")
    public MobileElement enterOtp_textbox5;

    @iOSXCUITFindBy(xpath = "//*[@label=\"otp character 6 of 6\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[6]")
    public MobileElement enterOtp_textbox6;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='mobileNumber']")
    public MobileElement pharmacy_mobile_number_element;

    @AndroidFindBy(xpath = "//android.widget.EditText[1]")
    public MobileElement mobile_otp_textbox1;

    @AndroidFindBy(xpath = "//android.widget.EditText[2]")
    public MobileElement mobile_otp_textbox2;

    @AndroidFindBy(xpath = "//android.widget.EditText[3]")
    public MobileElement mobile_otp_textbox3;

    @AndroidFindBy(xpath = "//android.widget.EditText[4]")
    public MobileElement mobile_otp_textbox4;

    @AndroidFindBy(xpath = "//android.widget.EditText[5]")
    public MobileElement mobile_otp_textbox5;

    @AndroidFindBy(xpath = "//android.widget.EditText[6]")
    public MobileElement mobile_otp_textbox6;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Enable Notifications']")
    public MobileElement enableNotifications_button;

    //---------Login Locators----------
    @AndroidFindBy(xpath = "//*[@resource-id='Accept_And_Close']")
    public MobileElement pharmacy_accept_and_close_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Send me an email']")
    public MobileElement pharmacy_sendMeAnEmail_button;

    //---------Dashboard Locators----------
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Switch Profile')]")
    @AndroidFindBy(xpath = "//*[@resource-id='Grocery']//../android.view.View/android.widget.Button")
    // //*[contains(@text,'Switch Profile')]
    public MobileElement pharmacy_profile_menu;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to Grocery\"]")
    @AndroidFindBy(xpath = "//*[@text='Back to Grocery']")
    public MobileElement pharmacy_Back_To_Grocery_Btn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Help\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Help\"]")
    public MobileElement pharmacy_profile_menu_guestUser;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
    public MobileElement Continue_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"close \"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"_Close_icon\"]")
    public MobileElement closeButton;

    @iOSXCUITFindBy(xpath = "//*[@label='Back to Grocery']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Back to Grocery']")
    public MobileElement verifyLogin;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Transfer Prescriptions\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Transfer Prescriptions\"]")
    public MobileElement transfer_prescriptions_link;

    @iOSXCUITFindBy(xpath = "//*[@value='Refill Prescriptions']")
    @AndroidFindBy(xpath = "//android.view.View[@resource-id ='Refill_Prescriptions']")
    public MobileElement refillPrescription;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Manage Prescriptions\"]")
    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"Manage_Prescriptions\"]")
    public MobileElement managePrescription;

    @iOSXCUITFindBy(xpath = "//*[@label='Continue As Guest']")
    @AndroidFindBy(xpath = "//*[@text=\"Continue As Guest\"]")
    public MobileElement continue_As_guest_link;

    //---------Transfer Rx Locators----------
    @iOSXCUITFindBy(xpath = "//*[@value='Transfer From']")
    @AndroidFindBy(xpath = "//android.view.View[@text='Transfer From']")
    public MobileElement transfer_from;

    @iOSXCUITFindBy(xpath = "//*[@value='Search by ZIP code or city, state code']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='findPharmacySearchInput']")
    public MobileElement transfer_from_input;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@label,'Select')])[1]")
    @AndroidFindBy(xpath = "//android.widget.ListView")
    public MobileElement transfer_from_ListView;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@label,'Select')])[1]")
    @AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='Select'])[1]")
    public MobileElement select_pharmacy_button_transfer_from;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Which prescriptions would you like to transfer?\"]")
    @AndroidFindBy(xpath = "//*[@text='Which prescriptions would you like to transfer?']")
    public MobileElement whichRxtoTransfer_text;

    @iOSXCUITFindBy(xpath = "//*[@label='All eligible']")
    @AndroidFindBy(xpath = "//*[@text='All eligible']")
    public MobileElement all_eligible_button;

    @iOSXCUITFindBy(xpath = "//*[@label='Continue']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
    public MobileElement continue_button;

    @iOSXCUITFindBy(xpath = "//*[@label='Done']")
    public static MobileElement keyboardDoneButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Transfer To']")
    @AndroidFindBy(xpath = "//*[@text='Transfer To']")
    public MobileElement transfer_to;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Transfer prescriptions\"]")
    @AndroidFindBy(xpath = "//*[@text='Transfer prescriptions']")
    public MobileElement transfer_Rx_text;

    @iOSXCUITFindBy(xpath = "//*[@label='main']/XCUIElementTypeOther[13]")
    @AndroidFindBy(xpath = "(//*[@resource-id='Change'])[1]")
    public MobileElement transfer_from_change_cta;

    @iOSXCUITFindBy(xpath = "//*[@label='main']/XCUIElementTypeOther[16]")
    @AndroidFindBy(xpath = "(//*[@resource-id='Change'])[2]")
    public MobileElement transfer_to_change_cta;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Confirm Transfer']")
    @AndroidFindBy(xpath = "//*[@resource-id='Confirm_Transfer']")
    public MobileElement confirm_transfer_cta;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue As Guest\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Continue_As_Guest\"]")
    public MobileElement continue_as_guest_link;


    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue As Guest\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Continue_As_Guest\"]")
    public MobileElement refill_continue_as_guest;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@label='Transfer Request Sent !'])[1]")
    @AndroidFindBy(xpath = "//*[@text='Transfer Request Sent !']")
    public MobileElement transfer_req_sent_message;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
    @AndroidFindBy(xpath = "//*[@resource-id='personalDetailsFormFirstName']")
    public MobileElement guest_firstName;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
    @AndroidFindBy(xpath = "//*[@resource-id='personalDetailsFormLastName']")
    public MobileElement guest_lastName;

    @iOSXCUITFindBy(xpath = "//*[@value=\"MM\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='input-date-month']")
    public MobileElement guest_dob_month;

    @iOSXCUITFindBy(xpath = "//*[@value=\"DD\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='input-date-day']")
    public MobileElement guest_dob_date;

    @iOSXCUITFindBy(xpath = "//*[@value=\"YYYY\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='input-date-year']")
    public MobileElement guest_dob_year;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='mobileNumber']")
    public MobileElement guest_phone;

    //---------Refill Rx Locators----------
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='storeNumber']")
    public MobileElement storeNO;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='rxNumber']")
    public MobileElement prescriptionNO;

    @iOSXCUITFindBy(xpath = "//*[@label='Add']")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Add']")
    public MobileElement addButton;

    @iOSXCUITFindBy(xpath = "//*[@label='Continue']")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id ='Continue']")
    public MobileElement continueBtn;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@label,'Refill')])[1]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Refill')]")
    public MobileElement refillCTA;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Your order details\"]")
    @AndroidFindBy(xpath = "//*[@text = 'Your order details']")
    public MobileElement verifyOderPage;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink)[2]")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(10)" + ".scrollIntoView(new UiSelector().textContains(\"+1\")).scrollForward()")
    public MobileElement scrollToSelectButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(25)" + ".scrollIntoView(new UiSelector().textContains(\"Continue\")).scrollForward()")
    public MobileElement mobileNumber_continue_button;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Refill order\"]")
    @AndroidFindBy(xpath = "//*[@text='Refill order']")
    public MobileElement verifyRefillOrderPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Confirm Order\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Confirm Order')]")
    public MobileElement confirmOrderBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Confirm Refill\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm Refill']")
    public MobileElement confirmRefillBtn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Refill Request Sent close notification\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Refill_Request_Sent_Close']")
    public MobileElement confirmPopupCloseButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Refill Request Sent\"]")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'close notification')]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Refill request sent!']")
    public MobileElement refillRequestSent;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Refill In Progress\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Refill In Progress']")
    public MobileElement refillRequestInProgress;

//---------Profile and Settings  Locators----------

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"My Settings\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='my_settings_switch_profile_modal']")
    public MobileElement pharmacy_mySettings_link;

    //

    @AndroidFindBy(xpath = "//*[@text=\"3 Profiles. Switch Profile\"]")
    public MobileElement pharmacy_profileicon;

    @AndroidFindBy(xpath = "//*[@class='android.widget.RadioButton']")
    public MobileElement all_profileicons;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Personal Details\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Personal_Details']")
    public MobileElement pharmacy_personalDetails_link;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Legal and Preferred Name')]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Legal_and_Preferred_Name']")
    public MobileElement personalDetails_legalAndPreferredName_link;

    @iOSXCUITFindBy(xpath = "//*[@label=\"close Personal details dialog\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Personal_details_dialog_Close_icon']")
    public MobileElement personalDetails_dialog_close_icon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Date of Birth')]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Date_of_Birth']")
    public MobileElement personalDetails_dob_icon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Identity Verification\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Identity_Verification']")
    public MobileElement pharmacy_IdentityVerification_link;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label=\"Verified\"]")
    @AndroidFindBy(xpath = "//*[@text='Verified']")
    public MobileElement verified_status_text;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label=\"Need additional help?\"]")
    @AndroidFindBy(xpath = "//*[@text='Need additional help?']")
    public MobileElement need_additional_help_text;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Contact customer service\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Contact_customer_service']")
    public MobileElement contact_customer_service_link;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Back to profile and setting\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Left_arrow_icon']")
    public MobileElement back_arrow;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id ='personalDetailsFormFirstName']")
    public MobileElement firstName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id ='personalDetailsFormLastName']")
    public MobileElement lastName;

    //---------Account Link with Rx and Store  Locators----------

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Legal and Preferred Name')]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id ='Legal_and_Preferred_Name']")
    public MobileElement legal_preferred_name;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"firstname\"]")
    public MobileElement legal_first_name;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"lastname\"]")
    public MobileElement legal_last_name;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Save\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'Save']")
    public MobileElement save_button;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"back\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'Left_arrow_icon']")
    public MobileElement back_button;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Date of Birth')]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'Date_of_Birth']")
    public MobileElement date_of_birth_option;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
    @AndroidFindBy(xpath = "//*[@resource-id = 'input-date-month']")
    public MobileElement month_input;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
    @AndroidFindBy(xpath = "//*[@resource-id = 'input-date-day']")
    public MobileElement day_input;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[3]")
    @AndroidFindBy(xpath = "//*[@resource-id = 'input-date-year']")
    public MobileElement year_input;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Back to profile and setting\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Back to profile and setting\"]")
    public MobileElement back_profile_setting;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Identity Verification\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text ='Identity Verification']")
    public MobileElement identityVerificationIcon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Verify My Profile\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id ='Verify_My_Profile']")
    public MobileElement verifyMyProfileCTA;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Let’s Do it\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Let’s Do it\"]")
    public MobileElement lets_do_it_btn;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
    @AndroidFindBy(xpath = "//*[@resource-id='storeNumber']")
    public MobileElement store_number;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
    @AndroidFindBy(xpath = "//*[@resource-id='rxNumber']")
    public MobileElement prescription_number;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Continue\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Continue']")
    public MobileElement accountLink_Continue_button;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label=\"Coupon Earned\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pharmacy account now linked']")
    public MobileElement verifyAccLinKNotification;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Coupons_SplashScreen_ContinueBtn']")
    public MobileElement imageContinue_btn;

    @AndroidFindBy(xpath = "//*[@text='Continue']")
    public MobileElement aci_imageContinue_btn;

    //---------Dosage Reminder  Locators----------

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@label,'drug details')])[1]")
    @AndroidFindBy(xpath = "(//android.widget.Button[contains(@resource-id,'Prescription_detailsBtn')])[1]")
    public MobileElement prescriptionSelection;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Edit prescription reminder\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Edit prescription reminder']")
    public MobileElement editIcon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@label=\"FRIDAY\"]")
    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@text,'FRIDAY')]")
    public MobileElement daySelect;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Add Time\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add Time']")
    public MobileElement addTimeBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Next hours\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next hours']")
    public MobileElement nextHourBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Save\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Save']")
    public MobileElement saveButton;

    //---------Auth Payment  Locators----------

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Pay Now')]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Pay_Now')]")
    public MobileElement payNowCTA;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"All Active\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'All_Prescriptions')]")
    public MobileElement waitForAllPrescriptionIcon;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Delivery\"]")
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

    @AndroidFindBy(xpath = "//*[@resource-id='close-button']")
    public MobileElement PayNow_close_button;

    @AndroidFindBy(xpath = "//*[@text='Pre-payment for delivery will be coming soon']")
    public MobileElement PayNow_prepayment_comingSoon_text;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Order Checkout\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Order Checkout\"]")
    public MobileElement orderCheckoutPgae;

    //---------Archive Rx  Locators----------

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Archive\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Archive']")
    public MobileElement archivePrescription;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@label,'Select')])[1]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'Select')]")
    public MobileElement selectPrescription;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Prescription Archived close notification\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Prescription_Archived_Close']")
    public MobileElement prescriptionArchived;

    //     @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(20)" + ".scrollIntoView(new UiSelector().textContains(\"All Active\")).scrollBackward()")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"All Active\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"All_Active\"]")
    public MobileElement AllPrescription;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Archived\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Archived']/following-sibling::android.view.View")
    public MobileElement ArchivedTab;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='All Archived']")
    public MobileElement AllArchivedOption;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Apply Filter\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Apply_Filter']")
    public MobileElement ApplyFilter;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@label,'Restore')])[1]")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(15)" + ".scrollIntoView(new UiSelector().textContains(\"Restore\")).scrollForward()")
    public MobileElement searchRestoreFilter;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@label,'Restore')])[1]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'Restore')]")
    public MobileElement RestoreFilter;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Prescription Restored\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Prescription_Restored_Close']")
    public MobileElement PrescriptionRestored;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Back to prescription\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Back to prescription']")
    public MobileElement BackToPrescription;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Archive')]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Archive\"]")
    public MobileElement archiveButton;


    @iOSXCUITFindBy(xpath = "//*[@value=\"Prescription Archived\"]")
    @AndroidFindBy(xpath = "//android.widget.text[@text='Prescription Archived']")
    public MobileElement prescriptionArchivedText;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Prescription Restored close notification\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Prescription_Restored_Close']")
    public MobileElement PrescriptionRestoredclose;

    //---------Manage Rx  Locators----------

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@value=\"My Prescriptions\"]/parent::XCUIElementTypeOther//following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeButton")
    @AndroidFindBy(xpath = "(//*[@text='My Prescriptions']/following-sibling::android.view.View/android.widget.Button)[1]")
    public MobileElement PrescriptionCardDetails;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Ready For pickup\"] ")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Ready For pickup']")
    public MobileElement ReadyForPickup;

    @iOSXCUITFindBy(xpath = "(//*[@label='Ready for Pick Up'])[1]")
    @AndroidFindBy(xpath = "//*[@text='Ready for Pick Up']//preceding-sibling::android.widget.TextView")
    public List<MobileElement> ReadyForPickUpPrescriptions;

    @iOSXCUITFindBy(xpath = "(//*[@label='Auto Refill On'])[1]")
    @AndroidFindBy(xpath = "//*[@text='Auto Refill On']//preceding-sibling::android.widget.TextView")
    public List<MobileElement> AutoRefillOnPrescription;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Auto Refill on\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Auto Refill on']")
    public MobileElement AutoRefillOn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"All Active\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='All Rxs']")
    public MobileElement AllActiveOption;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Ready for refill\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Ready for refill']")
    public MobileElement ReadyForRefillOption;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Refill requested\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Refill requested']")
    public MobileElement RefillRequestedOption;

    @iOSXCUITFindBy(xpath = "//*[@label=\"No Refills\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='No Refills']")
    public MobileElement NoRefillsOption;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Expired\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Expired']")
    public MobileElement ExpiredOption;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Find your pharmacy\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Find your pharmacy']")
    public MobileElement verifyPharmacyDashboard;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Locate Pharmacy\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Locate_Pharmacy']")
    public MobileElement LocatePharmacyCTA;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Use my current location\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Use my current location']")
    public MobileElement MyCurrentLocationLink;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@label,'drug details')])[1]")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id,'Pharmacy_Prescription_detailsBtn')])[1]")
    public MobileElement SelectPrescriptionCard;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Last Filled At\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Last sold at:\"]")
    public MobileElement LastFilledDetails;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Prescribed by\"]")
    @AndroidFindBy(xpath = "//*[@text='Prescribed by']")
    //*[@text='Prescribed by']/following-sibling::android.view.View[1]")
    public MobileElement Prescribedby;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Prescription Number\"]")
    @AndroidFindBy(xpath = "//*[@text='Prescription Number']/following-sibling::android.view.View[1]")
    public MobileElement PrescriptionNumber;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Quantity\"]")
    @AndroidFindBy(xpath = "//*[@text='Quantity']")
    //*[@text='Quantity']/following-sibling::android.view.View[1]
    public MobileElement Quantity;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Expiration date\"]")
    @AndroidFindBy(xpath = "//*[@text='Expiration date']")
    //*[@text='Expiration date']/following-sibling::android.view.View[1]
    public MobileElement ExpirationDate;

    @iOSXCUITFindBy(xpath = "//*[@label=\"My Prescriptions\"]")
    @AndroidFindBy(xpath = "//*[@text='My Prescriptions']")
    public MobileElement my_Prescriptions_header;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to prescriptions\"]")
    @AndroidFindBy(xpath = "//*[@text='Back to prescriptions']")
    public MobileElement individualPrescription;

    @AndroidFindBy(xpath = "//*[@text='Additional Information']")
    public WebElement additionalInformationOfDrug;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Refills remaining\"]")
    @AndroidFindBy(xpath = "//*[@text='Refills remaining']")
    public MobileElement remainingRefills;

    //---------Locate Pharmacy  Locators----------
    @iOSXCUITFindBy(xpath = "(//*[@label='Locate Pharmacy'])[2]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Locate Pharmacy']")
    public MobileElement locatePharmacy;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@value=\"My Pharmacy\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeButton")
    @AndroidFindBy(xpath = "//*[@text='My Pharmacy']//../android.view.View[2]/android.widget.Button")
    public MobileElement findYourPharmacy;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Search by Zip code or city, state code\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='findPharmacySearchInput']")
    public MobileElement ZipCodeTextBox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"search\"]")
    @AndroidFindBy(xpath = "//*[@text='search']")
    public MobileElement searchIcon;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@label,'show details for')])[1]")
    @AndroidFindBy(xpath = "(//android.widget.Button[contains(@resource-id,'Pharmacy_Info')])[1]")
    public MobileElement infoIcon;

    @iOSXCUITFindBy(xpath = "(//*[@label=\"close \"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='_Close_icon']/following-sibling::android.widget.TextView")
    public MobileElement pharmacyInfo;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Address')]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Pharmacy_PharmacyDetails_ModalAddressBtn\"]")
    public MobileElement pharmacyLocation;

    @iOSXCUITFindBy(xpath = "(//*[contains(@label,'Phone number')])[1]")
    @AndroidFindBy(xpath = "(//android.view.View[@resource-id='Pharmacy_PharmacyDetails_ModalAddressBtn']/android.widget.TextView)[7]")
    public MobileElement zipCodeName;

    //------------Vaccine Scheduler Locators-----------------------

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(25)" + ".scrollIntoView(new UiSelector().textContains(\"Schedule A Vaccine\")).scrollForward()")
    public MobileElement vaccineSchedule_scoller;

    @iOSXCUITFindBy(xpath = "//*[contains(@value,'Schedule A Vaccine')]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Schedule A Vaccine, opens in a new tab\"]")
    public MobileElement vaccineSchedule;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Schedule Now\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Schedule Now\"]")
    public MobileElement scheduleNow;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Pet Care\"]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Pet Care\"]")
    public MobileElement petCare;

    @iOSXCUITFindBy(xpath = "//*[@value=\"My Vaccine Records\"]")
    @AndroidFindBy(xpath = "//*[contains(@content-desc,'My Vaccine Records')]")
    public MobileElement my_vaccine_option;

    //----------Verify FAQs Locators--------------------------
    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to pharmacy dashboard\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Account Settings']")
    public MobileElement profileSettingsMenu;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Help & Support Center\"]")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(25)" + ".scrollIntoView(new UiSelector().textContains(\"Help & Support Center\")).scrollForward()")
    public MobileElement helpAndSupportCenter;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Privacy Center\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Privacy Center']")
    public MobileElement PrivacyCenterButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Privacy Center\"]")
    @AndroidFindBy(xpath = "//*[@text='Privacy Center']")
    public MobileElement PrivacyCenterPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to profile and setting\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Back to profile and setting']")
    public MobileElement backToProfileSettings;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Your Support Team\"]")
    @AndroidFindBy(xpath = "//*[@text='Your Support Team']")
    public MobileElement ContactUsPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Accept HIPAA Marketing Notice\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Accept HIPAA Marketing Notice']")
    public MobileElement AcceptHippaMarketingButton;

    @iOSXCUITFindBy(xpath = "//*[@value=\"About Us\"]")
    @AndroidFindBy(xpath = "//*[@text='About Us']")
    public MobileElement AboutUsPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"FAQs\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='FAQs']")
    public WebElement helpAndSupportCenterFAQs;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Frequently Asked Questions\"]")
    @AndroidFindBy(xpath = "//*[@text='Frequently Asked Questions']")
    public MobileElement faqsPageElement;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"About Us\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='About Us']")
    public WebElement AboutUsButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Contact Us\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Contact Us']")
    public WebElement ContactUsButton;

    //----------Set Preferred Pharmacy Locators--------------------------
    @iOSXCUITFindBy(xpath = "//*[@label=\"Change my pharmacy\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Change my pharmacy']")
    public MobileElement changeMyPharmacy;

    //----------update mobile And email Locators--------------------------x
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Email ')]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Email']")
    public MobileElement email_button;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"email\"]")
//            "//android.widget.EditText[contains(@text,'@mail7.io')]")
    public MobileElement clearExistingEmailID;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
    public MobileElement newEmailID;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Phone']")
    public MobileElement phoneNumberButton;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement newPhoneNumber;

    //---------Delete Account Locators--------------------
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Privacy Center\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Privacy_Center']")
    public MobileElement privacyCenter;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Privacy Center\"]")
    @AndroidFindBy(xpath = "//*[@text='Privacy Center']")
    public MobileElement privacyCenterPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Delete\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Delete_Profile_privacy_center_page__button']")
    public MobileElement deleteProfileLink;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@label=\"Delete your profile\"])[1]")
    @AndroidFindBy(xpath = "//*[@text='Delete your profile']")
    public MobileElement deleteYourProfilePopUp;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Keep My Profile\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Delete_your_profile_Keep_my_profile__button']")
    public MobileElement keepMyProfileLink;

    //---------------Refill Reminder Locators--------------
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@label,'drug details')])[1]")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id,'Pharmacy_Prescription_detailsBtn')])[1]")
    public MobileElement DrugPrescriptionForAddReminder;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Add new reminder\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add new reminder']")
    public MobileElement AddNewReminder;

    @AndroidFindBy(xpath = "//*[contains(@text,'Set refill reminder')]")
    public MobileElement NumberOfDays;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"SAVE\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
    public WebElement SaveButton;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Set refill reminder\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Set refill reminder']")
    public MobileElement SetRefillReminderPage;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next day']")
    public MobileElement Days;

    @AndroidFindBy(xpath = "//*[@text='Back to prescriptions']")
    public MobileElement verifyPrescriptionDetailsPage;

    @AndroidFindBy(xpath = "//*[@text='Edit prescription reminder']")
    public WebElement EditPrescriptionReminder;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to prescriptions\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Back to prescriptions']")
    public MobileElement backToPrescription;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Refill reminders\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Refill reminders']")
    public MobileElement RefillRemindersButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Expiry reminders']")
    public MobileElement expiryRemindersButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Next day\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next day']")
    public MobileElement NextDay;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Refill reminder\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Refill reminder']")
    public MobileElement refillReminderPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Expiry reminder']")
    public MobileElement expiryReminderPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Manage notification Settings\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Manage notification Settings']")
    public MobileElement manageNotificationSettingsButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Manage notifications Settings\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Manage notifications Settings']")
    public MobileElement manageNotificationsSettingsButton;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Notifications\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Notifications']")
    public MobileElement NotificationPageTitle;

    @iOSXCUITFindBy(xpath = "(//*[@value=\"Health\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeSwitch)[1]")
    @AndroidFindBy(xpath = "//android.widget.ToggleButton[contains(@resource-id,'id-Sincerely_Health')]")
    public MobileElement pushNotificationToggleButton;

    @AndroidFindBy(xpath = "//*[@text='Sincerely Health<sup>TM</sup> Notification not checked']")
    public MobileElement HealthNotificationToggleButtonOff;

    @AndroidFindBy(xpath = "//*[@text='Sincerely Health<sup>TM</sup> Notification checked']")
    public MobileElement HealthNotificationToggleButtonOn;

    @AndroidFindBy(xpath = "//*[@text='Pharmacy Orders Notification not checked']")
    public MobileElement PharmacyOrdersToggleButtonOff;

    @AndroidFindBy(xpath = "//*[@text='Pharmacy Medications Notification not checked']")
    public MobileElement pharmacyMedicationsToggleButtonOff;

    @AndroidFindBy(xpath = "//*[@text='Deals & Discounts Notification not checked']")
    public MobileElement DealsAndDiscountsToggleButtonOff;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@resource-id='id-Pharmacy_Medications']")
    public MobileElement PharmacyMedicationsToggleButton;

    @AndroidFindBy(xpath = "//*[@text=\"Deals & Discounts\"]")
    public MobileElement dealsAndDiscounts;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Save Changes\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Save_Changes']")
    public MobileElement saveChangesButton;

    @AndroidFindBy(xpath = "//android.view.View[@text='Text and Email Notifications']")
    public MobileElement TextandEmailNotificationsPopUpPage;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Accept']")
    public MobileElement acceptButton;

    //-----------Verify Filters Locators-------------------

    @AndroidFindBy(xpath = "//*[@text='Refill Requested']//preceding-sibling::android.widget.TextView")
    public List<MobileElement> RefillRequestedPrescriptions;

    @AndroidFindBy(xpath = "//*[@text='Expired']//preceding-sibling::android.widget.TextView")
    public List<MobileElement> ExpiredPrescriptions;

    @iOSXCUITFindBy(xpath = "//*[@label=\"No Results Found\"]")
    @AndroidFindBy(xpath = "//*[@text='No Results Found']")
    public MobileElement NoResultsFoundText;

    @iOSXCUITFindBy(xpath = "(//*[contains(@label,'drug details')])[1]")
    @AndroidFindBy(xpath = "//*[@resource-id='Archive']//../following-sibling::android.view.View")
    public List<MobileElement> ActivePrescriptions;

    @iOSXCUITFindBy(xpath = "(//*[@label=\"Ready for Refill\"]//../preceding-sibling::XCUIElementTypeOther[1])[1]")
    @AndroidFindBy(xpath = "//*[@text='Ready for Refill']//preceding-sibling::android.widget.TextView")
    public List<MobileElement> ReadyForRefillPrescriptions;

    @iOSXCUITFindBy(xpath = "(//*[@label=\"Auto Refill On\"]//../preceding-sibling::XCUIElementTypeOther[1])[1]")
    @AndroidFindBy(xpath = "//*[@text='Auto Refill On']//preceding-sibling::android.widget.TextView")
    public List<MobileElement> AutoRefillOnPrescriptions;

    @iOSXCUITFindBy(xpath = "(//*[contains(@label,'No Refill']//../preceding-sibling::XCUIElementTypeOther[1])[1]")
    @AndroidFindBy(xpath = "//*[@text='Auto Refill On']//preceding-sibling::android.widget.TextView")
    public List<MobileElement> NoRefillsPrescriptions;

    //-----------Verify Notifications Locators-------------------
    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to Grocery\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Grocery']")
    public MobileElement groceryBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Notifications\"]")
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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Back to pharmacy dashboard\"]")
    @AndroidFindBy(xpath = "//*[@text='Back to pharmacy dashboard']")
    public MobileElement back_dashboard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Refill In Progress close notification\"]")
    public MobileElement closeNotificationPopUp;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Accept And Close']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Accept And Close']")
    public MobileElement Accept_And_close_button;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Continue\"]")
    @AndroidFindBy(xpath = "//*[@text='Continue']")
    public MobileElement Continue_button_element;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Send Code\"]")
    @AndroidFindBy(xpath = "//*[@text='Send Code']")
    public MobileElement sendCodeButton;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][1]")
    @AndroidFindBy(xpath = "//android.widget.EditText[1]")
    public MobileElement EnterOtp_textbox1;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][2]")
    @AndroidFindBy(xpath = "//android.widget.EditText[2]")
    public MobileElement EnterOtp_textbox2;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][3]")
    @AndroidFindBy(xpath = "//android.widget.EditText[3]")
    public MobileElement EnterOtp_textbox3;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][4]")
    @AndroidFindBy(xpath = "//android.widget.EditText[4]")
    public MobileElement EnterOtp_textbox4;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][5]")
    @AndroidFindBy(xpath = "//android.widget.EditText[5]")
    public MobileElement EnterOtp_textbox5;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][6]")
    @AndroidFindBy(xpath = "//android.widget.EditText[6]")
    public MobileElement EnterOtp_textbox6;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Let’s get acquainted\"]")
    @AndroidFindBy(xpath = "//Android.widget.text[@text=\"Let’s get acquainted\"]")
    public MobileElement letsGetAcqaintedPage;

    //    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSwitch)[1]")
    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@text,'I accept the Terms & Conditions')]")
    public MobileElement health_Terms_and_conditions_checkbox;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSwitch)[2]")
    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@text,'HIPAA Marketing Consent')]")
    public MobileElement health_hippa_marketing_consent_checkbox;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mobileNumber\"]")
    public MobileElement mobile_number_element;

    @iOSXCUITFindBy(xpath = "//*[@value='Create a PIN']")
    @AndroidFindBy(xpath = "//*[@text=\"Create a PIN\"]")
    public MobileElement CreatePin;

    @iOSXCUITFindBy(xpath = "//*[@value='Confirm your PIN']")
    @AndroidFindBy(xpath = "//*[@text='Confirm your PIN']")
    public MobileElement ConfirmPin;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 1 of 4\"]")
    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public MobileElement EnterPin_textbox1;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 2 of 4\"]")
    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public MobileElement EnterPin_textbox2;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 3 of 4\"]")
    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    public MobileElement EnterPin_textbox3;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 4 of 4\"]")
    @AndroidFindBy(xpath = "(//android.widget.EditText)[4]")
    public MobileElement EnterPin_textbox4;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Would you like to turn on notifications?\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Would you like to turn on notifications?\"]")
    public MobileElement enableNotificationsPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Enable Notifications\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Enable_Notifications\"]")
    public MobileElement enableNotifications;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Your account was created\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your account was created']")
    public MobileElement AccountCreatedPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Maybe Later\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Maybe Later\"]")
    public MobileElement WOLCheckoutPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Order')]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Order\"]")
    public MobileElement orderBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Switch Profiles\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Switch Profiles\"]")
    public MobileElement switchProfilesPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Search by Zip Code or City and State\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeTextField")
    public MobileElement zipCodeLocationSearch;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Please enter your 4 digit pin. We'll use this to verify your account.\"]")
    public MobileElement confirmPinPage;

    @AndroidFindBy(xpath = "//*[@resource-id='Back_icon']")
    public MobileElement back_notifications_link;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Help & Support Center\"]")
    public MobileElement guestProfileSettingsMenu;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@label=\"Terms & Conditions.\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Terms & Conditions.\"]")
    public MobileElement TermsAndConditions;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@label=\"HIPAA Marketing Consent.\"]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"HIPAA Marketing Consent.\"]")
    public MobileElement hipaaMarketingConsent;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@label=\"Privacy Policy\"]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Privacy Policy\"]")
    public MobileElement privacyPolicy;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Terms of Use\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms of Use']")
    public MobileElement TermsOfUsePage;


    @iOSXCUITFindBy(xpath = "//*[@value=\"HIPAA MARKETING AUTHORIZATION\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='HIPAA MARKETING AUTHORIZATION']")
    public MobileElement HipaaMarketingAuthorizationPage;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Privacy Policy\"]")
    public MobileElement privacyPolicyPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@label=\"Notice of Privacy Practices\"]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Notice of Privacy Practices\"]")
    public MobileElement NoticeOfPrivacyPractices;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Privacy policy\"]")
    public MobileElement NoticeOfPrivacyPracticesPage;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Please confirm your contact details\"]")
    public MobileElement contactDetailsPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'@')]")
    public MobileElement validEmail;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Find my pharmacy\"]")
    @AndroidFindBy(xpath = "//android.view.View[@text='Find my pharmacy']")
    public MobileElement findMyPharmacy;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Use my current location\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Use my current location']")
    public MobileElement myCurrentLocationLink;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@value,'Pharmacy')])[1]")
    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Pharmacy')])[1]")
    public MobileElement pharmacyName;

    @iOSXCUITFindBy(xpath = "(//*[contains(@label,'Address')])[1]")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id,'Address')])[1]")
    public MobileElement pharmacyAddress;

    @iOSXCUITFindBy(xpath = "(//*[contains(@label,'Phone number')])[1]")
    @AndroidFindBy(xpath = "(//*[contains(@content-desc,'Phone number')])[1]")
    public MobileElement pharmacyPhoneNumber;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Closed\"]")
    @AndroidFindBy(xpath = "//*[@text='Closed']")
    public MobileElement closedPharmacy;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Now Open\"]")
    @AndroidFindBy(xpath = "//*[@text='Now Open']")
    public MobileElement openPharmacy;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Profile Verification\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Profile Verification\"]")
    public MobileElement profileVerificationPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Not Verified\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Not Verified\"]")
    public MobileElement profileStatus;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Payment Methods\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Payment Methods\"]")
    public MobileElement paymentMethodCTA;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Notifications']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Notifications\"]")
    public MobileElement notificationsPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Sign Out\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Sign_Out\"]")
    public MobileElement signOutbutton;

    @iOSXCUITFindBy(xpath = "//*[@label='Continue to Grocery']")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Continue_to_Grocery\"]")
    public MobileElement continueToGrocery;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Link Your Record\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Link Your Record']")
    public MobileElement linkYourRecordCTA;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Would you like to add your pharmacy information?\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Would you like to add your pharmacy information?\"]")
    public MobileElement addPharmacyInfo;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Maybe later\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Maybe later\"]")
    public MobileElement maybeLaterCTA;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'+ Add Profile')]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"+_Add_Profile\"]")
    public MobileElement addProfileFromNotification;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Link_to_Pharmacy\"]")
    public MobileElement link_To_PharmacyBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"Enter_Details_Manually\"]")
    public MobileElement enter_Details_Manually;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Enter Your Pharmacy Details']")
    public MobileElement enter_PharmacyDetailsModal;

    @AndroidFindBy(xpath = "//*[@resource-id=\"transferPharmacyModalPharmacyInput\"]")
    public MobileElement enter_PharmacyName;

    @AndroidFindBy(xpath = "//*[@resource-id=\"transferPharmacyModalPhoneInput\"]")
    public MobileElement enter_PharmacyPhoneNumber;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"Submit\"]")
    public MobileElement submit_Button;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,\"Phone Number\")]")
    public MobileElement pharmacy_Ph;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Help\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Help\"]")
    public MobileElement pharmacy_HelpIcon;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Help & Support Center\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Help & Support Center']")
    public MobileElement pharmacy_HelpSupportCenter;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"FAQs\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='FAQs']")
    public MobileElement pharmacy_FQAs;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Frequently Asked Questions\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Frequently Asked Questions\"]")
    public MobileElement pharmacy_FAQsPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to profile and setting\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Back to profile and setting\"]")
    public MobileElement pharmacy_BackToHelpSupportCenterPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"About Us\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='About Us']")
    public MobileElement pharmacy_AboutUs;

    @iOSXCUITFindBy(xpath = "//*[@value=\"About Us\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"About Us\"]")
    public MobileElement pharmacy_AboutUsPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Contact Us\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Contact Us\"]")
    public MobileElement pharmacy_ContactUs;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Your Support Team\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Your Support Team\"]")
    public MobileElement pharmacy_ContactUsPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Go back to previous page\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Go back to previous page\"]")
    public MobileElement pharmacy_BackToDashboard;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Log In\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Log_In\"]")
    public MobileElement pharmacy_GuestLogin;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Sign Up\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Sign_Up\"]")
    public MobileElement pharmacy_GuestSignUp;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Health\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Health\"]")
    public MobileElement GlobalFooter_Health;

    @iOSXCUITFindBy(xpath = "//*[@label=\"My Health Score\"]")
    @AndroidFindBy(xpath = "//*[@text=\"My Health Score\"]")
    public MobileElement HealthPageValidate;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Nutrition\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Nutrition\"]")
    public MobileElement GlobalFooter_Nutrition;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Explore Diets\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Explore Diets\"]")
    public MobileElement NutritionPageValidate;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Rewards\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Rewards\"]")
    public MobileElement GlobalFooter_Rewards;

    @iOSXCUITFindBy(xpath = "//*[@label=\"All Health Rewards \"]")
    @AndroidFindBy(xpath = "//*[@text=\"All Health Rewards \"]")
    public MobileElement RewardsPageValidate;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Get Care\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Get Care\"]")
    public MobileElement GlobalFooter_GetCare;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Care Services\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Care Services\"]")
    public MobileElement GetCarePageValidate;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Pharmacy\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Pharmacy\"]")
    public MobileElement GlobalFooter_pharmacy;

    @iOSXCUITFindBy(xpath = "//*[@label=\"close \"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"_Close_icon\"]")
    public MobileElement GuestPopUpCloseBtn;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Schedule A Covid Test\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Schedule A Covid Test\"]")
    public MobileElement Schedule_Covid_Test;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Let us fill your Pet prescriptions and get up to $75 Off groceries\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Let us fill your Pet prescriptions and get up to $75 Off groceries\"]")
    public MobileElement petCarePage;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Switch Profile')]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Switch Profile')]")
    public MobileElement verify_PS_Icon;

    @iOSXCUITFindBy(xpath = "//*[@value=\"My Pharmacy\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"My Pharmacy\"]")
    public MobileElement my_Pharmacy_Title;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"Verify\"]")
    public MobileElement verify_CTA;

    @AndroidFindBy(xpath = "//*[@text=\"Would you like to add your pharmacy information?\"]")
    public MobileElement verify_Acc_LinkingPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Maybe later\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Maybe later\"]")
    public MobileElement maybe_later;

    @AndroidFindBy(xpath = "//*[@resource-id=\"+_Add_Profile\"]")
    public MobileElement Add_Profile_CTA;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Link Your Record\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Link Your Record']")
    public MobileElement link_your_record;

    @iOSXCUITFindBy(xpath = "//*[@label=\"close Want to link your phramacy record?\"]")
    @AndroidFindBy(xpath = "//*[@text='close Want to link your phramacy record?']")
    public MobileElement close_popUp;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Add Their Profile\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Add_Their_Profile\"]")
    public MobileElement add_Their_Profile;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Locate Pharmacy\"]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Locate Pharmacy\"]")
    public MobileElement Locate_pharmacy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Covid-19 Vaccine Record']")
    public MobileElement my_vaccine_recordPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add Or Change Details\"]")
    public MobileElement verify_addOrChangeCTA;

    @AndroidFindBy(xpath = "//*[@resource-id=\"_Close_icon\"]")
    public MobileElement closeMyVaccinePopUp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Continue As Guest\"]")
    public MobileElement verify_ContinueAsGuestLink;

    @iOSXCUITFindBy(xpath = "//*[@value=\"What is your name?\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"What is your name?\"]")
    public MobileElement legal_NamePage;

//    Rx-info icon is changed to Rx hyperlink
    @iOSXCUITFindBy(xpath = "//*[@label=\"info\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Where do I find this?\"]")
    public MobileElement rx_InfoIcon;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Here’s how to locate the information\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Here’s how to locate the information\"]")
    public MobileElement rxInfoPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Got it\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"Got_it\"]")
    public MobileElement got_ItCTA;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Patient\"]/ancestor::XCUIElementTypeOther[1]/following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Patient\"]/following-sibling::android.view.View[1]")
    public MobileElement patient_Details;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Prescriptions\"]/ancestor::XCUIElementTypeOther[1]/following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Prescriptions\"]/following-sibling::android.view.View[1]")
    public MobileElement prescriptions_Details;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Pick Up From\"]/ancestor::XCUIElementTypeOther[1]/following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Pick Up From\"]/following-sibling::android.view.View[1]")
    public MobileElement pickUp_Details;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeLink[1]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Change\"]/parent::android.view.View/preceding-sibling::android.view.View")
    public MobileElement pharmacy_PhoneNumber;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Change')]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"Change\"]")
    public MobileElement change_CTAFromConfirmOrderPage;

    @iOSXCUITFindBy(xpath = "(//*[contains(@label,'show details for')])[1]")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id,\"_Pharmacy_Info\")])[1]")
    public MobileElement yourPharmacy_infoIcon;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Closed\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Closed\"]")
    public MobileElement pharmacyStatus;

    @iOSXCUITFindBy(xpath = "//*[@label=\"close \"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"_Close_icon\"]")
    public MobileElement pharmacyStatusPopUpClose;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to previous step\"]")
//    @AndroidFindBy(xpath = "//*[@text='Back to my prescriptions']")
    @AndroidFindBy(xpath = "//*[@text='Back to previous step']")
    public MobileElement backToPreviousStep;

    @iOSXCUITFindBy(xpath = "//*[@label=\"skip\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"skip\"]")
    public MobileElement skipCTA_Transfer;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Deals\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Good morning']")
    public MobileElement verifyGroceryPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Use my current location\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Use_my_current_location\"]")
    public MobileElement use_My_LocationLink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[contains(@label,'Phone number')]")
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Phone number')]")
    public MobileElement pharmacyphonenumber;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Remove')]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Remove_')]")
    public MobileElement removeCTA;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Add All\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Add_All\"]")
    public MobileElement add_AllCTA;

    @iOSXCUITFindBy(xpath = "//*[@label=\"TAKE ONE TEASPOONFUL BY MOUTH ONE TIME DAILY\"]")
    @AndroidFindBy(xpath = "//*[@text=\"TAKE ONE TEASPOONFUL BY MOUTH ONE TIME DAILY\"]")
    public MobileElement dosage_Instruction;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to prescriptions details\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Back to prescriptions details']")
    public MobileElement DrugDetailPage_backBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,' reminder')]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'reminder')]")
    public MobileElement RxName;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Days\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Days\"]")
    public MobileElement DaysText;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Manage Notifications Settings\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Manage Notifications Settings']")
    public MobileElement manageNotificationSettingsCTA;

    @iOSXCUITFindBy(xpath = "//*[@label=\"PM\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='PM']")
    public MobileElement switching_Meridiem;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[contains(@label,'PM')]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'_checkbox')]")
    public MobileElement reminder_ToggleBtn;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'_btn')]")
    public MobileElement reminderBox;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Delete\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Delete\"]")
    public MobileElement delete_Button;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Delete_Reminder\"]")
    public MobileElement del_Reminder_Popup;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[2]")
    public MobileElement rxName_FromDrugDetailsPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Active\"]")
    public MobileElement rxStatus;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Next refill\"]")
    public MobileElement nextRefill;

    @AndroidFindBy(xpath = "//*[@text=\"Last filled\"]")
    public MobileElement lastRefill;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'TEST LAB STORE')]")
    public MobileElement pharmacy_Address;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Terms & Conditions.\"]")
    public MobileElement TermsAndConditionsLink;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Cancel\"]")
    public MobileElement cancel_CTA;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Go_To_Archive\"]")
    public MobileElement go_To_Archive_CTA;

    @AndroidFindBy(xpath = "//*[@text=\"Archived Prescriptions\"]")
    public MobileElement archived_RXPage;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Restore_')]")
    public MobileElement restore_CTA;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Renew\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Renew_')]")
    public MobileElement renew_CTA;

//    @AndroidFindBy(xpath = "//*[@text=\"0 Refills remaining\"]")
//    public MobileElement zero_RefillRemaining;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"See all notifications\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='See all notifications']")
    public MobileElement seeAllNotifications;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Profile')]")
    public MobileElement addProfileButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Link Your Record']")
    public MobileElement linkYourRecordButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeLink[1]")
    @AndroidFindBy(xpath = "(//*[contains(@text,'Select')])[1]/parent::android.view.View/preceding-sibling::android.view.View")
    public MobileElement PhoneNumber_link;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeLink[1]")
    @AndroidFindBy(xpath = "((//*[contains(@text,'Select')])[1]/parent::android.view.View/preceding-sibling::android.view.View)[1]")
    public MobileElement transferToPagePharmacyAddressLink;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeLink[2]")
    @AndroidFindBy(xpath = "((//*[contains(@text,'Select')])[1]/parent::android.view.View/preceding-sibling::android.view.View)[2]")
    public MobileElement transferToPagePharmacyPhoneNumberLink;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Patient\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Patient\"]/following-sibling::android.view.View[1]")
    public MobileElement patientName;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Prescriptions\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Prescriptions\"]/following-sibling::android.view.View[1]")
    public MobileElement prescriptionDetails;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Transferring From\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Transferring From\"]/following-sibling::android.view.View[1]")
    public MobileElement transferringFromDetails;


    @iOSXCUITFindBy(xpath = "//*[@value=\"Transferring To\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Transferring To\"]/following-sibling::android.view.View[1]")
    public MobileElement transferringToDetails;

    @iOSXCUITFindBy(xpath = "(//*[@label='Auto Refill Off'])[1]")
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Auto Refill Off'])[1]")
    public MobileElement autoRefillOff;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@value='Active'])[1]")
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Active'])[1]")
    public MobileElement activeRX;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@label,'Refills remaining')])[1]")
    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Refills remaining')])[1]")
    public MobileElement refillIsRemaining;

    @iOSXCUITFindBy(xpath = "//*[@label=\"back\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"icon-go-back\"]")
    public MobileElement Refill_Reminder_back_button;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'reminder')]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'reminder')]")
    public MobileElement reminderPrescription;

    @iOSXCUITFindBy(xpath = "//*[@label='Remove']")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Remove')]")
    public MobileElement removeButton;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Add_All\"]")
    public MobileElement addAllButton;

    @AndroidFindBy(xpath = "//*[@text=\"Your cost\"]")
    public MobileElement prescriptionCost;

    @AndroidFindBy(xpath = "//*[@text=\"Your Prescriptions\"]/following-sibling::android.view.View[1]/android.widget.TextView[1]")
    public MobileElement prescriptionName;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Pick Up']")
    public MobileElement pickUpOption;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Delivery']")
    public MobileElement deliverOption;

    @AndroidFindBy(xpath = "//*[@text=\"Address\"]/following-sibling::android.widget.TextView")
    public MobileElement deliverAddress;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Edit\"]")
    public MobileElement editAddress;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"streetName\"]")
    public MobileElement streetName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"city\"]")
    public MobileElement city;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"state\"] ")
    public MobileElement state;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text=\"Colorado\"]")
    public MobileElement selectState;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"zipcode\"]")
    public MobileElement zip;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Save_Address\"]")
    public MobileElement saveAddressButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Payment method\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Payment method\"]")
    public MobileElement paymentMethodOption;

    @iOSXCUITFindBy(xpath = "//*[@label=\"SubTotal\"]")
    @AndroidFindBy(xpath = "//*[@text=\"SubTotal\"]")
    public MobileElement subTotalOption;

    @AndroidFindBy(xpath = "//*[@text=\"SubTotal\"]/following-sibling::android.widget.TextView[1]")
    public MobileElement subTotalAmount;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Total\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Total\"]")
    public MobileElement totalOption;

    @AndroidFindBy(xpath = "//*[@text=\"Total\"]/following-sibling::android.widget.TextView[1]")
    public MobileElement totalAmount;

    @AndroidFindBy(xpath = "//*[@text=\"Delivery\" and @class=\"android.widget.TextView\"]/following-sibling::android.widget.TextView[1]")
    public MobileElement deliveryOption;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Payment Information Received\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Payment Information Received\"]")
    public MobileElement paymentReceivedMessage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Date ordered\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Date ordered\"]")
    public MobileElement orderedDateOption;

    @AndroidFindBy(xpath = "//*[@text=\"Date ordered\"]/following-sibling::android.widget.TextView/android.widget.TextView")
    public MobileElement orderedDate;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Delivering details\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Delivering details\"]")
    public MobileElement deliveryDetailsOption;

    @AndroidFindBy(xpath = "//*[@text=\"Delivering details\"]/following-sibling::android.widget.TextView/android.widget.TextView")
    public MobileElement deliveryDetails;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Prescriptions ordered\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Prescriptions ordered\"]")
    public MobileElement orderedPrescriptionsOption;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Payment method\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Payment method\"]")
    public MobileElement orderedPaymentMethodOption;

    @AndroidFindBy(xpath = "//*[@text=\"Prescriptions ordered\"]/following-sibling::android.view.View")
    public MobileElement orderedPrescriptions;

    @AndroidFindBy(xpath = "//*[@text=\"Payment method\"]/following-sibling::android.widget.TextView[1]  1 to 4 change")
    public MobileElement orderedPaymentMethod;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Text_me_a_code\"]")
    public MobileElement textMeCodeCTA;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Not_you?\"]")
    public MobileElement notYouCTA;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Create_new_grocery_account\"]")
    public MobileElement createYourGroceyAccount;

    @AndroidFindBy(xpath = "//*[@resource-id=\"You_need_to_create_a_new_grocery_account_Close_icon\"]")
    public MobileElement createNewGroceryAccountCloseIcon;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Login_to_my_grocery_account\"]")
    public MobileElement loginToMyGroceryAccountCTA;

    @AndroidFindBy(xpath = "//*[@resource-id=\"icon-go-back\"]")
    public MobileElement goBackIcon;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Set Expiration reminder\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Set Expiration reminder\"]")
    public MobileElement setExpirationReminderPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to Pharmacy\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Back to Pharmacy\"]")
    public MobileElement back_To_Pharmacy;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to my prescriptions\"]")
    @AndroidFindBy(xpath = "//*[@text='Back to my prescriptions']")
    public MobileElement back_To_My_RxPage;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Text_and_Email_Notifications_Modal\"]/android.view.View[1]")
    public MobileElement textAndEmailNotificationsText;

    @AndroidFindBy(xpath = "//*[@text=\"Accept\"]")
    public MobileElement AcceptButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(25)" + ".scrollIntoView(new UiSelector().textContains(\"Accept\")).scrollForward()")
    public MobileElement ScrollForAcceptButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Back to vaccine records']")
    public MobileElement back_To_Vaccine_Record;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Back to dashboard']")
    public MobileElement back_To_Dashboard;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Skip\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Skip\"]")
    public MobileElement skipCTA_Refill;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Sign up\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Sign_up\"]")
    public MobileElement GuestSignUp;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Log in\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Log_in\"]")
    public MobileElement GuestLogin;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Link_Record\"]")
    public MobileElement linkRecord;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Let us know what you think\"]")
    public MobileElement feedbackPopup;

    @iOSXCUITFindBy(xpath = "//*[@label=\"close\"]")
    public MobileElement closeIcon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label=\"Your order details\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Your order details\"]")
    public MobileElement verifyYourOrderPage;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Contact Details\"]//parent::XCUIElementTypeOther//following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Contact Details\"]/following-sibling::android.view.View[1]")
    public MobileElement contact_Details;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Prescription Details\"]//parent::XCUIElementTypeOther//following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Prescription Details\"]/following-sibling::android.view.View[1]")
    public MobileElement prescription_Details;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Pharmacy Details\"]//parent::XCUIElementTypeOther//following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Pharmacy Details\"]/following-sibling::android.view.View[1]")
    public MobileElement pharmacy_Details;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Session timed out\"]")
    public MobileElement TimeOutPopUpText;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Login\"]")
    public MobileElement TimeOutLoginButton;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Ready_For_Refill\"]")
    public MobileElement ReadyForRefillFilter;

    @AndroidFindBy(xpath = "//*[@resource-id=\"email\"]")
    public MobileElement enterNewEmail;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button']")
    public MobileElement clickbacktoPharmacy;


}

