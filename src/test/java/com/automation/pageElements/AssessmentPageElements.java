package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AssessmentPageElements {


//    @iOSXCUITFindBy(xpath = "//AppiumAUT/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeWebView[1]/XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Get $5 Off Groceries.\n" +
            "Earn Rewards & Begin Health Survey\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Begin Health Survey')]")
    public MobileElement assessment_start_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Let’s go!\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Let’s go!']")
    public MobileElement lets_go_button;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Feet (ft) number-input\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'Feet')]")
    public MobileElement height_in_foot;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Inches (in) number-input\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'Inches')]")
    public MobileElement height_in_inches;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Save and Continue\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Save and Continue']")
    public MobileElement SaveContinue_button;

//    @iOSXCUITFindBy(xpath = "//*[@label=\"Save and Continue\"]")
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label='&W: Onboarding Questionnaire']/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]")
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label='H&W: Onboarding Questionnaire']/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]")

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Pounds (lbs) number-input\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'Pounds ')]")
    public MobileElement Weight_text;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Female\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Male']")
    public MobileElement Select_gender;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
    public MobileElement Continue_btn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\" number-input\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='input_0']")
    public MobileElement hours_textBox;

    @iOSXCUITFindBy(xpath = "//*[@label=\"No Preference\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'No Preference')]")
    public MobileElement diet_option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Always\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'Always')]")
    public MobileElement fruitServing_Option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Often\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'Often')]")
    public MobileElement vegetableServing_Option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Sometimes\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'Sometimes')]")
    public MobileElement nutsServing_Option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Always\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'Always')]")
    public MobileElement sugaryDrink_Option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Always\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'Always')]")
    public MobileElement wholeGrain_Option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Never\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'Never')]")
    public MobileElement snacks_Option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Rarely\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'Rarely')]")
    public MobileElement meals_Option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Yes\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Yes']")
    public MobileElement smoke_Option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "//*[@resource-id='input_0']")
    public MobileElement Smoking_years;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Cigars\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Cigars']")
    public MobileElement Smoking_product;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\" number-input\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='input_0']")
    public MobileElement dailySmokeCount;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Yes, show me my Health Score!\"]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Yes, show me my Health Score!']")
    public MobileElement yesBtnHealthScore;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Show Me\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Show Me']")
    public MobileElement showMeBtn;

}
