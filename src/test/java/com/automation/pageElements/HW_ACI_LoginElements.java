package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HW_ACI_LoginElements {

    @iOSXCUITFindBy(xpath = "//*[@label='Log In']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Log In']")
    public MobileElement LogInButton;

    @iOSXCUITFindBy(xpath = "//*[@label='Sign in to your account']")
//    @AndroidFindBy(xpath="//android.widget.Button[@text='Log In']")
    public MobileElement SignInToYourAccount;

    @iOSXCUITFindBy(xpath = "//*[@label='main']/XCUIElementTypeOther[5]/XCUIElementTypeTextField[1]")
    public MobileElement EnterPin_textbox1;

    @iOSXCUITFindBy(xpath = "//*[@label='main']/XCUIElementTypeOther[5]/XCUIElementTypeTextField[2]")
    public MobileElement EnterPin_textbox2;

    @iOSXCUITFindBy(xpath = "//*[@label='main']/XCUIElementTypeOther[5]/XCUIElementTypeTextField[3]")
    public MobileElement EnterPin_textbox3;

    @iOSXCUITFindBy(xpath = "//*[@label='main']/XCUIElementTypeOther[5]/XCUIElementTypeTextField[4]")
    public MobileElement EnterPin_textbox4;


}