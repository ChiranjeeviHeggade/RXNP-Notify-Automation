package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.FindBy;
public class BiometricsElements {

    @iOSXCUITFindBy(xpath = "//*[@label=\"Health\"]")
    @AndroidFindBy(xpath = "//*[@text='Health']")
    public MobileElement health_cta;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"I'll do this later\"]")
    @AndroidFindBy(xpath = "//*[@text='I'll do this later']")
    public MobileElement laterBiometrics;

}
