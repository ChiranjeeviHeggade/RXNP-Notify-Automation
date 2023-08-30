package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HWPharmacyAccountLinkPageElements {

    @iOSXCUITFindBy(xpath = "//*[@label=\"Account Settings, navigation\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Personal Details']")
    public MobileElement personal_details;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Legal and Preferred Name Automation Test\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id ='Legal_and_Preferred_Name']")
    public MobileElement legal_preferred_name;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"firstname\"]")
    public MobileElement legal_first_name;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[7]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"lastname\"]")
    public MobileElement legal_last_name;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Save\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'Save']")
    public MobileElement save_button;

    @AndroidFindBy(xpath = "//*[@resource-id = 'Profile_Updated_Close']")
    public MobileElement profile_update_close_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'Left_arrow_icon']")
    public MobileElement back_button;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Date of Birth')]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'Date_of_Birth']")
    public MobileElement date_of_birth_option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id = 'input-date-month']")
    public MobileElement month_input;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[7]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id = 'input-date-day']")
    public MobileElement day_input;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[9]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id = 'input-date-year']")
    public MobileElement year_input;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to profile and setting\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Back to profile and setting']")
    public MobileElement back_profile_setting;

    @iOSXCUITFindBy(xpath = "//*[@label=\"back\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Go back to previous page']")
    public MobileElement go_back_previous_page;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Verify. Verify your identity to complete setting up your pharmacy account\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Verify_your_identity_to_complete_setting_up_your_pharmacy_accountVerify']")
    public MobileElement verify_btn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Let’s Do it\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Let’s_Do_it']")
    public MobileElement lets_do_it_btn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Store number required\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='storeNumber']")
    public MobileElement store_number;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Prescription number required\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='rxNumber']")
    public MobileElement prescription_number;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Pharmacy account now linked\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pharmacy account now linked']")
    public MobileElement verifyAccLinKNotification;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Coupons_SplashScreen_ContinueBtn']")
    public MobileElement imageContinue_btn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"View All , My Coupons\"]")
    @AndroidFindBy(xpath = "//*[@text='View All , My Coupons']")
    public MobileElement myCoupon_viewAll_btn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text ='Identity Verification']")
    public MobileElement identityVerificationIcon;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id ='Verify_My_Profile']")
    public MobileElement verifyMyProfileCTA;

    @iOSXCUITFindBy(xpath = "//*[@label=\"back\"]")
    @AndroidFindBy(xpath = "//*[@text='back']")
    public MobileElement personalInfoBack;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to pharmacy dashboard\"]")
    @AndroidFindBy(xpath = "//*[@text='Back to pharmacy dashboard']")
    public MobileElement profileBack;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink")
    @AndroidFindBy(xpath = "//*[@text='Take me there']")
    public MobileElement takeMeThere;

}
