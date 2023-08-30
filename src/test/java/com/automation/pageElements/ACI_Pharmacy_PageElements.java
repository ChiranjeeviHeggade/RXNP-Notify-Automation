package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ACI_Pharmacy_PageElements {
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Log In']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Log In']")
    public MobileElement LogInButton;

    @iOSXCUITFindBy(xpath = "//*[@label='Sign in to your account']")
    @AndroidFindBy(xpath="//*[@text='Sign in to your account']")
    public MobileElement SignInToYourAccount;

    @AndroidFindBy(xpath = "//*[contains(@text,'Please enter your 4 digit pin')]")
    public MobileElement enterPin;

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

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 1 of 4\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[1]")
    public MobileElement EnterPin_txtbox1;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 2 of 4\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[2]")
    public MobileElement EnterPin_txtbox2;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 3 of 4\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[3]")
    public MobileElement EnterPin_txtbox3;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Secure text field, 4 of 4\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[4]")
    public MobileElement EnterPin_txtbox4;



    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Close\"]")
    @AndroidFindBy(xpath="//*[@text='Close']")
    public MobileElement closeCookiesPopup;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Maybe Later\"]")
    @AndroidFindBy(xpath = "//*[@text='Maybe Later']")
    public MobileElement maybeLater;

    @AndroidFindBy(xpath = "//*[@text=\"Sincerely Health\"]")
    public MobileElement sincerelyLaterText;
    @AndroidFindBy(xpath = "//*[@text='Accept All']")
    public MobileElement acceptcookies;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Grocery\"]")
    public MobileElement backtogrocerypage;

    @AndroidFindBy(xpath = "(//*[@resource-id='com.safeway.client.android.safeway.debug:id/navigation_bar_item_icon_container'])[5]")
    public MobileElement memberCTA;

    @AndroidFindBy(xpath = "//*[@text=\"Account\"]")
    public MobileElement accountCTA;
    @AndroidFindBy(xpath = "//*[@text=\"Sign Out\"] ")
    public MobileElement signoutCTA;

    @AndroidFindBy(xpath = "//*[@resource-id=\"android:id/button1\"]")
    public MobileElement confirmtoLogout;
}
