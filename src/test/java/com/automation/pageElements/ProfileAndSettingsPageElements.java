package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProfileAndSettingsPageElements {

    @iOSXCUITFindBy(xpath = "//*[@label=\"Profile menu\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Profile menu']")
    public MobileElement profileMenuBtn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Health Profile, navigation\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Health Data']")
    public MobileElement HealthDataMenu;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Edit or view Height')]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Edit or view Height')]")
    public MobileElement EditHeightData;

    @iOSXCUITFindBy(xpath = "//*[@label=\"feet(ft) number-input\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'feet')]")
    public MobileElement HeightInFeet;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Inches(in) number-input\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'Inches')]")
    public MobileElement HeightInInches;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Save\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Save']")
    public MobileElement SaveButton;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Edit or view Weight')]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Edit or view Weight')]")
    public MobileElement EditWeightData;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Pounds (lbs) number-input\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'Pounds')]")
    public MobileElement WeightInPounds;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Done\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
    public MobileElement DoneButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Sign Out of Health\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Sign_Out_of_Health\"]")
    public MobileElement SignOutOfHealthButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Sign Out\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Sign_Out\"]")
    public MobileElement SignOutOfHealthButtonACI;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue to Grocery\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Continue_to_Grocery\"]")
    public MobileElement ContinueToGroceryButton;

    @iOSXCUITFindBy(xpath = "//*[@value=\"No Connected devices\"]")
    @AndroidFindBy(xpath = "//*[@text=\"no connected device\"]")
    public MobileElement noConnectedDeviceMessage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Fair\"]")
    @AndroidFindBy(xpath = "//*[@text='Fair']")
    public MobileElement MessageFromWolF;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Low\"]")
    @AndroidFindBy(xpath = "//*[@text='Low']")
    public MobileElement MessageFromWolL;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Good\"]")
    @AndroidFindBy(xpath = "//*[@text='Good']")
    public MobileElement MessageFromWolG;

    @iOSXCUITFindBy(xpath = "//*[@value=\"My Health Score\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My Health Score']")
    public MobileElement MyHealthScorePageDisplayed;

    @iOSXCUITFindBy(xpath = "//*[@label=\"My Health Score history\"]")
    @AndroidFindBy(xpath = "//*[@text='My Health Score history']")
    public MobileElement MyHealthScoreHistoryLink;

    @iOSXCUITFindBy(xpath = "//*[@value=\"My Health Score History\"]")
    @AndroidFindBy(xpath = "//*[@text='My Health Score History']")
    public MobileElement MyHealthScoreHistoryDisplayed;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Close My Health Score\"]")
    @AndroidFindBy(xpath = "//*[@text='Close My Health Score']")
    public MobileElement CloseButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Healthy Habits\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Healthy_Habits_0']")
    public MobileElement HealthyHabits;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Edit Smoking Habits\"]")
    @AndroidFindBy(xpath = "//*[@text='Edit Smoking Habits']")
    public MobileElement EditIcon;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Smoking Habits, web dialog\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='Smoker']")
    public MobileElement SmokerOption;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Smoking Habits, web dialog\"]/XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "//*[@resource-id='Save']")
    public MobileElement SaveInPopUp;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[7]")
    @AndroidFindBy(xpath = "//android.view.View[2]/android.widget.TextView")
    public MobileElement SmokerIsDisplayed;
    ////*[@text="Smoker"]

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to home page\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Healthy_Habits_Back']")
    public MobileElement BackButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'health score is')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'out of 1000')]")
    public MobileElement learn_more_link;



}
