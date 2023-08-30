package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

public class HW_ACI_RegistrationElements {


    @AndroidFindBy(xpath = "//*[@text='Create a new account']")
    public MobileElement CreateNewAccountLink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(xpath = "//android.widget.Switch")
    public MobileElement SwitchButton;


    @iOSXCUITFindBy(xpath = "//*[@label='Email']") //*[@label='OTP textfield'][1]
    @AndroidFindBy(xpath ="//android.widget.EditText")
    public MobileElement email_address;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][1]")
    @AndroidFindBy(xpath="//android.widget.EditText[1]")
    public MobileElement health_EnterOtp_textbox1;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][2]")
    @AndroidFindBy(xpath="//android.widget.EditText[2]")
    public MobileElement health_EnterOtp_textbox2;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][3]")
    @AndroidFindBy(xpath="//android.widget.EditText[3]")
    public MobileElement health_EnterOtp_textbox3;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][4]")
    @AndroidFindBy(xpath="//android.widget.EditText[4]")
    public MobileElement health_EnterOtp_textbox4;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][5]")
    @AndroidFindBy(xpath="//android.widget.EditText[5]")
    public MobileElement health_EnterOtp_textbox5;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][6]")
    @AndroidFindBy(xpath="//android.widget.EditText[6]")
    public MobileElement health_EnterOtp_textbox6;

    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Zip Code\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Zip Code\"]")
    @AndroidFindBy(xpath ="//android.widget.EditText")
    public MobileElement store_ZIP_code;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Submit\"]")
    @AndroidFindBy(id = "btn_next")
    public MobileElement enterButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Start shopping\"]")
    @AndroidFindBy(id = "start_shopping")
    public MobileElement startShoppingButton;

    @iOSXCUITFindBy(xpath = "//*[@label='Pharmacy']")
    @AndroidFindBy(xpath="//*[@text='Pharmacy']")
    public MobileElement pharmacyCTA;


    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue\"]")
    @AndroidFindBy(xpath="//android.widget.Button[@text='CONTINUE']")
    public MobileElement continueHomeButton;


    @AndroidFindBy(xpath = "//*[@text='Welcome']")
    public MobileElement WelcomeToHealthPage;

    @iOSXCUITFindBy(xpath = "//*[@label='Accept And Close']")
    @AndroidFindBy(xpath="//android.widget.Button[@text='Accept And Close']")
    public MobileElement Accept_And_close_button;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
    @AndroidFindBy(xpath="//android.widget.Button[@text='Continue as a new user']")
    public MobileElement Continue_as_a_new_user_button;

    @iOSXCUITFindBy(xpath ="//*[@label=\"Validate OTP\"]")
    @AndroidFindBy(xpath="//android.widget.Button[@text='Send Code']")
    public MobileElement OTPnextArrow;

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@label='Send Code']")
    @AndroidFindBy(xpath="//android.widget.Button[@text='Send Code']")
    public MobileElement SendCode;

    @iOSXCUITFindBy(xpath = "//*[contains(@value,'get acquainted')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'get acquainted')]")
    public MobileElement get_acquainted_text;


    @AndroidFindBy(xpath="//*[@content-desc='Submit']")
    @iOSXCUITFindBy(xpath = "//*[@label='Validate OTP']")
    public MobileElement nextButton;


    @iOSXCUITFindBy(xpath = "//*[@name='Allow notifications']")
    public MobileElement allowNotifications;

    @iOSXCUITFindBy(xpath = "//*[@label='Don’t Allow']")
    public MobileElement DontAllowLocation;

    @iOSXCUITFindBy(xpath = "//*[@label='Allow']")
    public MobileElement allowNotificationPopup;

    @iOSXCUITFindBy(xpath = "//*[@label='Dismiss']")
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")
    public MobileElement LocationServicesDisabled;

    @iOSXCUITFindBy(xpath = "//*[@name='btnNext-Pick up tool tip']")
    public MobileElement nextPickUpToolTip;

    @iOSXCUITFindBy(xpath = "//*[@name='btnNext-Deals tool tip']")
    public MobileElement NextDealsToolTip;

    @iOSXCUITFindBy(xpath = "//*[@name='btnNext-Wallet tool tip']")
    public MobileElement NextWalletToolTip;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
    public MobileElement learnMore_done_button;

    @iOSXCUITFindBy(xpath = "//*[@name='Sign Up']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sign Up']")
    public MobileElement signUp_button;


    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue\"]")
    @AndroidFindBy(xpath = "(//*[@text='Continue'])")
    public MobileElement ContinueButton;

    @iOSXCUITFindBy(xpath = "//*[@value='Create a PIN']")
    @AndroidFindBy(xpath = "(//*[@text='Create a PIN'])")
    public MobileElement CreatePin;

    @AndroidFindBy(xpath = "(//*[@text='Confirm your PIN'])")
    @iOSXCUITFindBy(xpath = "//*[@value='Confirm your PIN']")
    public MobileElement ConfirmPin;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 1 of 4\"]")
    @AndroidFindBy(xpath = "(//*[@resource-id='firstPinElement'])")
    public MobileElement EnterPin_textbox1;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 2 of 4\"]")
    @AndroidFindBy(xpath = "(//*[@resource-id='firstPinElement'])")
    public MobileElement EnterPin_textbox2;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 3 of 4\"]")
    @AndroidFindBy(xpath = "(//*[@resource-id='firstPinElement'])")
    public MobileElement EnterPin_textbox3;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 4 of 4\"]")
    @AndroidFindBy(xpath = "(//*[@resource-id='firstPinElement'])")
    public MobileElement EnterPin_textbox4;

    @iOSXCUITFindBy(xpath = "//*[@label='Cancel']")
    public MobileElement CancelLocationPopup;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[8]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(xpath = "(//*[@resource-id='mobileNumber'])")
    public MobileElement mobile_number_element;


    @AndroidFindBy(xpath = "//*[@text='Start shopping']")
    //@AndroidFindBy(xpath = "//*[@resource-id='com.safeway.client.android.tomthumb.debug:id/start_shopping']")
    public MobileElement continue_shopping;

    @iOSXCUITFindBy(xpath ="//*[@label=\"Health\"]")
    @AndroidFindBy(xpath = "(//*[@resource-id='Health'])")
    public MobileElement health_footer;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'View Health')]")
    @AndroidFindBy(xpath = "//*[@text='Health']")
    public MobileElement health_cta;

    @AndroidFindBy(xpath = "//*[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']")
    public MobileElement loc_accept_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 1 of 4\"]")
    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText[1]")
    public MobileElement login_pin;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue\"]")
    public MobileElement continueButton;

    @iOSXCUITFindBy(xpath = "//*[@label='Don’t Allow']")
    public MobileElement DontAllow_button;

    @iOSXCUITFindBy(xpath = "//*[@label='More']")
    @AndroidFindBy(xpath = "//*[@text='More']")
    public MobileElement moreButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Start shopping\"]")
    @AndroidFindBy(xpath = "//*[@text='Start shopping']")
    public MobileElement start_Shopping;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'btn_next')]")
    public MobileElement search_pharmacy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Create a new account']")
    public MobileElement aci_create_new_account_link;
}