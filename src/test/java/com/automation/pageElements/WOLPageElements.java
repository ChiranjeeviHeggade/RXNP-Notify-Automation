package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WOLPageElements {
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'All Notifications')]")
    public MobileElement all_Notifications_element;

    @AndroidFindBy(xpath = "//*[@resource-id='Log_Metrics']")
    public MobileElement Log_Metrics_element;

    @AndroidFindBy(xpath = "//*[@resource-id='Height']")
    public MobileElement Height_value;

    @AndroidFindBy(xpath = "//*[@resource-id='Waist_circumference']")
    public MobileElement Waist_circumference;

    @AndroidFindBy(xpath = "//*[@resource-id='MetricsHistory']")
    public MobileElement MetricsHistory;

    @AndroidFindBy(xpath = "//*[@resource-id='PhysicalHealthHistory']")
    public MobileElement PhysicalHealthHistory;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'1000')]")
    public MobileElement Health_Score_element;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='running']")
    public MobileElement running_log_workout_element;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Log_Workout']")
    public MobileElement log_workout_element;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Date_&_Time')]")
    public MobileElement DateAndTime_Element;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Next']")
    public MobileElement next_button_element;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Duration')]")
    public MobileElement Duration_Element;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Duration')]")
    public MobileElement duration_element;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Avg_Heart_Rate')]")
    public MobileElement Avg_Heart_Rate_Element;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'Avg Heart Rate')]")
    public MobileElement Avg_Heart_Rate_Input_Element;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Distance')]")
    public MobileElement Distance_Element;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'Miles_')]")
    public MobileElement Distance_input_Element;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Save_and_Continue')]")
    public MobileElement Save_and_Continue_Button_Element;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Activity_Back')]")
    public MobileElement Activity_Back_button_element;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='View All Discover More']")
    public MobileElement View_all_Discover_More;

    @AndroidFindBy(xpath = "//*[@text='6 Reasons to Get Moving']")
    public MobileElement articleLinkElement;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Good\"]")
    @AndroidFindBy(xpath = "//*[@text='Wheel Of Life']")
    public MobileElement MessageFromWol;

    @iOSXCUITFindBy(xpath = "//*[@value=\"My Health Score\"]")
    @AndroidFindBy(xpath = "//*[@text='My Health Score']")
    public MobileElement MyHealthScorePageDisplayed;

    @iOSXCUITFindBy(xpath = "//*[@label=\"My Health Score history\"]")
    @AndroidFindBy(xpath = "//*[@text='My Health Score history']")
    public MobileElement MyHealthScoreHistoryLink;

    @iOSXCUITFindBy(xpath = "//*[@label=\"navigation\"]")
    @AndroidFindBy(xpath = "//*[@text='Health score history graph for Week 1']")
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
    @AndroidFindBy(xpath = "//*[@resource-id='Preferences_Smoker_1670450443063_63']")
    public MobileElement SmokerOption;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Smoking Habits, web dialog\"]/XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "//*[@resource-id='Preferences_Smoker_1670450443063_63']")
    public MobileElement SaveInPopUp;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[7]")
    @AndroidFindBy(xpath = "//*[@text='Smoker']")
    public MobileElement SmokerIsDisplayed;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to home page\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Healthy_Habits_Back']")
    public MobileElement BackButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[9]")
    @AndroidFindBy(xpath = "//*[@resource-id='Learn_More']")
    public MobileElement learn_more_link;














}
