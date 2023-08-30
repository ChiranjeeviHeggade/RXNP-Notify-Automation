package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

public class ACI_Grocery_PageElements {
    @iOSXCUITFindBy(xpath = "//*[@label='Don’t Allow']")
    public MobileElement DontAllow_button;

    @iOSXCUITFindBy(xpath = "//*[@label='Allow']")
    public MobileElement Allow_button;

    @iOSXCUITFindBy(xpath = "//*[@label='Continue']")
    public MobileElement continueButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(xpath = "//android.widget.Switch")
    public MobileElement SwitchButton;

    @iOSXCUITFindBy(xpath = "//*[@label='Email']") //*[@label='OTP textfield'][1]
    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement email_address;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][1]")
    @AndroidFindBy(xpath = "//android.widget.EditText[1]")
    public MobileElement pharmacy_EnterOtp_textbox1;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][2]")
    @AndroidFindBy(xpath = "//android.widget.EditText[2]")
    public MobileElement pharmacy_EnterOtp_textbox2;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][3]")
    @AndroidFindBy(xpath = "//android.widget.EditText[3]")
    public MobileElement pharmacy_EnterOtp_textbox3;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][4]")
    @AndroidFindBy(xpath = "//android.widget.EditText[4]")
    public MobileElement pharmacy_EnterOtp_textbox4;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][5]")
    @AndroidFindBy(xpath = "//android.widget.EditText[5]")
    public MobileElement pharmacy_EnterOtp_textbox5;

    @iOSXCUITFindBy(xpath = "//*[@label='OTP textfield'][6]")
    @AndroidFindBy(xpath = "//android.widget.EditText[6]")
    public MobileElement pharmacy_EnterOtp_textbox6;

    @iOSXCUITFindBy(xpath = "//*[@label='Zip Code']")
    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement store_ZIP_code;

    @iOSXCUITFindBy(xpath = "//*[@label='Submit']")
    @AndroidFindBy(id = "btn_next")
    @CacheLookup
    public MobileElement enterButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Start shopping\"]")
    @AndroidFindBy(id = "start_shopping")
    public MobileElement startShoppingButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Start shopping\"]")
    @AndroidFindBy(xpath = "//*[@text='Start shopping']")
    public MobileElement start_Shopping;

    @iOSXCUITFindBy(xpath = "//*[@label='Continue']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    public MobileElement continueHomeButton;

    @iOSXCUITFindBy(xpath = "//*[@label='Validate OTP']")
    public MobileElement nextButton;

    @iOSXCUITFindBy(xpath = "//*[@label='Dismiss']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='While using the app']")
    public MobileElement LocationServicesDisabled;

    @iOSXCUITFindBy(xpath = "//*[@name='btnNext-Pick up tool tip']")
    public MobileElement nextPickUpToolTip;

    @iOSXCUITFindBy(xpath = "//*[@name='btnNext-Deals tool tip']")
    public MobileElement NextDealsToolTip;

    @iOSXCUITFindBy(xpath = "//*[@name='btnNext-Wallet tool tip']")
    public MobileElement NextWalletToolTip;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
    public MobileElement learnMore_done_button;

    @iOSXCUITFindBy(xpath = "//*[@label='Cancel']")
    public MobileElement CancelLocationPopup;

    @iOSXCUITFindBy(xpath = "//*[@name='Allow notifications']")
    public MobileElement allowNotifications;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'btn_next')]")
    public MobileElement search_pharmacy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Create a new account']")
    public MobileElement aci_create_new_account_link;

    @AndroidFindBy(xpath = "//*[@text=\"more\"]")
    public MobileElement aci_more_options;

    @AndroidFindBy(xpath = "//*[@text=\"LOG OUT\"]")
    public MobileElement logout_button;
    //
}
