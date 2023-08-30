package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class DeleteUserProfile_PageElements {


//**************Validate "Delete" Button from "Delete Profile" section for Semi Auth/Auth user***************
    @iOSXCUITFindBy(xpath = "//*[@value=\"Privacy Center\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Privacy Center\"]")
    public MobileElement privacyCenterScreen;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Delete Profile\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Delete Profile\"]")
    public MobileElement deleteProfileSection;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Delete\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Delete\"]")
    public MobileElement deleteButton;
}
