package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HW_ACI_GuestUserElements {

    @iOSXCUITFindBy(xpath = "//*[@label='Don’t Allow']")
    public MobileElement DontAllow_button;

    @iOSXCUITFindBy(xpath = "//*[@label='Allow']")
    public MobileElement Allow_button;

    @iOSXCUITFindBy(xpath = "//*[@label='Continue']")
    public MobileElement continueButton;
}