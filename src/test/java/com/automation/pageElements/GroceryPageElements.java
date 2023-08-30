package com.automation.pageElements;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import java.util.List;

public class GroceryPageElements {

    @AndroidFindBy(xpath = "//*[@text=\"back\"]")
    public MobileElement back_button;


//    @iOSXCUITFindBy(xpath = "//android.widget.Button[@text='OK']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public MobileElement OK_button;

    @AndroidFindBy(xpath = "//*[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']")
    public MobileElement loc_accept_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sign Up']")
    public MobileElement signUp_button;

    @AndroidFindBy(xpath = "//*[@text=\"Email Address: \"]//..//android.widget.EditText")
    public MobileElement email_address;

    @AndroidFindBy(xpath = "//*[@text=\"Password\"]//..//android.widget.EditText")
    public MobileElement password;

    @AndroidFindBy(xpath = "//*[contains(@text,\"Phone Number\")]//..//android.widget.EditText")
    public MobileElement phoneNumber;

    @AndroidFindBy(xpath = "//*[@text='First Name']//..//android.widget.EditText")
    public MobileElement firstName;

    @AndroidFindBy(xpath = "//*[@text='Last Name']//..//android.widget.EditText")
    public MobileElement lastName;


    @AndroidFindBy(xpath = "//*[@text='Address']//..//android.widget.EditText")
    public MobileElement address;


    @AndroidFindBy(xpath = "//*[@text='City']//..//android.widget.EditText")
    public MobileElement city;

    @AndroidFindBy(xpath = "//*[@text=\"State\"]//..//android.widget.Button")
    public MobileElement state;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='New Mexico']")
    public MobileElement state_option;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public MobileElement state_ok;

    @AndroidFindBy(xpath = "//*[@text=\"Zip Code\"]//..//android.widget.EditText")
    public MobileElement zip;

    @AndroidFindBy(xpath = "//*[@text=\"Email Address\"]//..//android.widget.EditText")
    public MobileElement emailAddress_textbox;

    @AndroidFindBy(xpath = "//*[@text=\"Password\"]//..//android.widget.EditText")
    public MobileElement password_textbox;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Log In\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Log In']")
    public MobileElement login_button;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='logo store']")
    public MobileElement grocery_home;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Health\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Health Image\"]/android.widget.Image")
    public MobileElement health_icon;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='tab-button-more']/android.view.View")
    public MobileElement more_button_element;

    @AndroidFindBy(xpath = "//*[@text='About Our App']")
    public MobileElement about_Our_App_element;

    @AndroidFindBy(xpath = "//*[@text='Switch env health app']")
    public MobileElement switch_to_env_element;

    @AndroidFindBy(xpath = "(//android.widget.RadioButton)[2]")
    public MobileElement QA2_env_element;

    @AndroidFindBy(xpath = "//*[@text='Grocery Pickup']")
    public MobileElement Grocery_Pickup;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter the code below to continue:']/following-sibling::android.view.View/android.widget.EditText")
    public MobileElement email_OTP_verification;

    @AndroidFindBy(xpath = "//*[@text='Order Groceries']")
    public MobileElement order_grocery;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[4]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Pharmacy Image\"]")
    public MobileElement pharmacy_icon;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Continue as a Guest')]")
    public MobileElement continueAsGuest_button;

    @AndroidFindBy(xpath = "(//android.widget.CheckBox)[1]")
    public MobileElement filter_checkbox;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY']")
    public MobileElement apply_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Grocery Pickup']")
    public MobileElement first_groceryPickup_button;

    @AndroidFindBy(xpath = "//android.view.View[@text='Log']")
    public MobileElement log_button;

//    @AndroidFindBy(xpath = "(//*[@class='android.view.View' and contains(@text, 'groceryUUID')])[1]")
//    public MobileElement logTextForUUIDandDeviceID;
//    @AndroidFindBy(xpath = "//*[@text=\"back\"]")
//    public MobileElement back_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Contact Us\"]")
    public MobileElement ContactUs;

//    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
//    public MobileElement OK_button;

//    @AndroidFindBy(xpath = "//*[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']")
//    public MobileElement loc_accept_button;
//
//    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sign Up']")
//    public MobileElement signUp_button;
//
//    @iOSXCUITFindBy(xpath = "//*[@label='Email']")
//    @AndroidFindBy(xpath = "//*[@text=\"Email Address: \"]//..//android.widget.EditText")
//    public MobileElement email_address;
//
//    @AndroidFindBy(xpath = "//*[@text=\"Password\"]//..//android.widget.EditText")
//    public MobileElement password;
//
//    @AndroidFindBy(xpath = "//*[contains(@text,\"Phone Number\")]//..//android.widget.EditText")
//    public MobileElement phoneNumber;
//
//    @AndroidFindBy(xpath = "//*[@text='First Name']//..//android.widget.EditText")
//    public MobileElement firstName;
//
//    @AndroidFindBy(xpath = "//*[@text='Last Name']//..//android.widget.EditText")
//    public MobileElement lastName;
//
//    @AndroidFindBy(xpath = "//*[@text='Address']//..//android.widget.EditText")
//    public MobileElement address;
//
//    @AndroidFindBy(xpath = "//*[@text='City']//..//android.widget.EditText")
//    public MobileElement city;
//
//    @AndroidFindBy(xpath = "//*[@text=\"State\"]//..//android.widget.Button")
//    public MobileElement state;
//
//    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='New Mexico']")
//    public MobileElement state_option;
//
//    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
//    public MobileElement state_ok;
//
//    @AndroidFindBy(xpath = "//*[@text=\"Zip Code\"]//..//android.widget.EditText")
//    public MobileElement zip;
//
//    @AndroidFindBy(xpath = "//*[@text=\"Email Address\"]//..//android.widget.EditText")
//    public MobileElement emailAddress_textbox;
//
//    @AndroidFindBy(xpath = "//*[@text=\"Password\"]//..//android.widget.EditText")
//    public MobileElement password_textbox;
//
//    @AndroidFindBy(xpath = "//android.widget.Button[@text='Log In']")
//    public MobileElement login_button;
//
//    @AndroidFindBy(xpath = "//android.widget.Image[@text='logo store']")
//    public MobileElement grocery_home;
//
//    @AndroidFindBy(xpath = "//android.view.View[@resource-id='tab-button-more']/android.view.View")
//    public MobileElement more_button_element;
//
//    @AndroidFindBy(xpath = "//*[@text='About Our App']")
//    public MobileElement about_Our_App_element;
//
//    @AndroidFindBy(xpath = "//*[@text='Switch env health app']")
//    public MobileElement switch_to_env_element;
//
//    @AndroidFindBy(xpath = "(//android.widget.RadioButton)[2]")
//    public MobileElement QA2_env_element;

    @AndroidFindBy(xpath = "//*[@text='LOG OUT']")
    public MobileElement logout_button;

    @AndroidFindBy(xpath = "//*[contains(@text,'Log In')]")
    public MobileElement loginOrSignUp_button;

//    @AndroidFindBy(xpath = "//*[@text='Grocery Pickup']")
//    public MobileElement Grocery_Pickup;
//
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter the code below to continue:']/following-sibling::android.view.View/android.widget.EditText")
//    public MobileElement email_OTP_verification;
//
//    @AndroidFindBy(xpath = "//*[@text='Order Groceries']")
//    public MobileElement order_grocery;
//
//    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@label='Pharmacy'])[1]")
//    @AndroidFindBy(xpath = "//*[@content-desc=\"Pharmacy Image\"]")
////            "//android.view.View[contains(@content-desc,'_Pharmacy')]/android.widget.Image")
//    public MobileElement pharmacy_icon;
//
//    @iOSXCUITFindBy(xpath = "//*[@value=\"Continue as Guest\"]")
//    @AndroidFindBy(xpath = "//*[contains(@text, 'Continue as a Guest')]")
//    public MobileElement continueAsGuest_button;
//
//    @AndroidFindBy(xpath = "//*[contains(@text, 'Continue as Guest')]")
//    public MobileElement ACI_AND_continueAsGuest_button;
//
//    @AndroidFindBy(xpath = "(//android.widget.CheckBox)[1]")
//    public MobileElement filter_checkbox;
//
//    @AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY']")
//    public MobileElement apply_button;
//
//    @AndroidFindBy(xpath = "//android.widget.Button[@text='Grocery Pickup']")
//    public MobileElement first_groceryPickup_button;

    @iOSXCUITFindBy(xpath = "//*[@label='Dismiss']")
    public MobileElement LocationServicesDisabled;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Start shopping\"]")
    public MobileElement StartShoppingButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
    public MobileElement store_ZIP_code1;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Start shopping\"]")
    @AndroidFindBy(id = "start_shopping")
    public MobileElement startShoppingButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@label=\"Zip Code\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement store_ZIP_code;


    @iOSXCUITFindBy(xpath = "//*[@label='Submit']")
    @AndroidFindBy(id = "btn_next")
    @CacheLookup
    public MobileElement enterButton;


    @iOSXCUITFindBy(xpath = "//*[@label='Don’t Allow']")
    public MobileElement DontAllow_button;

    @iOSXCUITFindBy(xpath = "//*[@label='Allow']")
    public MobileElement Allow_button;

    @iOSXCUITFindBy(xpath = "//*[@label='Continue']")
    public MobileElement continueButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Cancel\"]")
    public MobileElement CancelLocationPopup;

    @iOSXCUITFindBy(xpath = "//*[@name='btnNext-Pick up tool tip']")
    public MobileElement nextPickUpToolTip;

    @iOSXCUITFindBy(xpath = "//*[@name='btnNext-Deals tool tip']")
    public MobileElement NextDealsToolTip;

    @iOSXCUITFindBy(xpath = "//*[@name='btnNext-Wallet tool tip']")
    public MobileElement NextWalletToolTip;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
    public MobileElement learnMore_done_button;

    @iOSXCUITFindBy(xpath = "//*[@label='Continue']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    public MobileElement continueHomeButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@label=\"Email. 2 of 2\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.Switch")
    public MobileElement SwitchButton;

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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Dismiss\"]")
    public MobileElement dismissButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"SHOP\"]")
    public MobileElement SHOPButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@label=\"Pharmacy\"]")
    public MobileElement PharmacyCell;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@label='Pharmacy'])[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Pharmacy\"]")
    public MobileElement pharmacy_icon_aci;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Search products or deals\"]")
    public MobileElement productsAndDeals;
}


