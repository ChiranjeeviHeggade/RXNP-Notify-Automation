package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.FindBy;

public class HealthPageElements {

    @AndroidFindBy(xpath = "(//*[@text='Welcome'])[2]")
    public MobileElement WelcomeToHealthPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Profile menu\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Profile menu']")
    public MobileElement healthDashboardPage;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='mobileNumber']")
    public MobileElement Health_mobile_number_element;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Edit or view Date & Time No value entered, required\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Date_&_Time*']")
    public MobileElement dateTimeLogWorkout;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Next\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Next']")
    public MobileElement NextDateTime;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Edit or view Duration No value entered, required\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Duration*']")
    public MobileElement durationLogWorkout;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Edit or view Average Heart Rate (BPM) No value entered, \"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Avg_Heart_Rate_(BPM)']")
    public MobileElement avgHeartRateLogWorkout;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Activity\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Activity_0']")
    public MobileElement activityWOL;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Go to dashboard\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Go to dashboard']")
    public MobileElement gotoDashboard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Running\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='running']")
    public MobileElement runningButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Log Workout\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Log_Workout']")
    public MobileElement logWorkout;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Save\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Save']")
    public MobileElement avgHeartRateSave;


    @iOSXCUITFindBy(xpath = "//*[@label=\"Save and Continue\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Save_and_Continue']")
    public MobileElement SaveAndContinueBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Activity History\"]")
    @AndroidFindBy(xpath = "//android.view.View[@resource-id='Activity_History']")
    public MobileElement activityHistory;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Running\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Running']")
    public MobileElement runningHeaderActivityHistory;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'1')]")
    public MobileElement enteredDistance;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'7')]")
    public MobileElement enteredDuration;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'80')]")
    public MobileElement enteredHeartRate;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to Activity\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Activity_History_Back']")
    public MobileElement activityHistoryBackBtn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to home page\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Activity_Back']")
    public MobileElement activityBackBtn;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'New Runner (7 Days)')]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'New Runner')]")
    public MobileElement newRunnerCompletedGoal;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Edit or view Distance No value entered, required\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Distance*']")
    public MobileElement distanceLogWorkout;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Miles number-input\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='Miles_0']")
    public MobileElement distanceInput;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Average heart rate (BPM) number-input\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='Avg Heart Rate (BPM)_0']")
    public MobileElement avgHeartRateInput;

    @AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
    public MobileElement Continue_button;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'do this later')]")
    public MobileElement Ill_Do_This_Later_button;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Would you like to turn on notifications')]")
    public MobileElement turn_on_notifications_page;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your account was created']")
    public MobileElement Your_account_was_created;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Accept_And_Close\"]")
    public MobileElement health_Accept_And_close_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Send me an email']")
    public MobileElement health_sendMeAnEmail_button;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][1]")
    public MobileElement health_EnterOtp_textbox1;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][2]")
    public MobileElement health_EnterOtp_textbox2;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][3]")
    public MobileElement health_EnterOtp_textbox3;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][4]")
    public MobileElement health_EnterOtp_textbox4;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][5]")
    public MobileElement health_EnterOtp_textbox5;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][6]")
    public MobileElement health_EnterOtp_textbox6;

    @AndroidFindBy(xpath="//android.widget.Button[@resource-id='Info']")
    public MobileElement health_dashobaord_info;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Add Goal\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add Goal']")
    public MobileElement health_dashobaord_AddGoal_button;


//    @iOSXCUITFindBy(xpath = "//*[@label="Eating habits, 16 goals"]")

//    @iOSXCUITFindBy(xpath = "//*[@label="main"]/XCUIElementTypeOther[8]")

    @iOSXCUITFindBy(xpath = "//*[@label=\"activity\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='activity']")
    public MobileElement add_activity_category;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Running')]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Running')]")
    public MobileElement add_steps_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Running, 6 goals\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Running')]")
    public MobileElement add_running_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Running, 5 goals\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Running')]")
    public MobileElement running_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on New Runner (7 Days)\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'More Info on New Runner')]")
    public MobileElement add_goal_NewRunner7days_link;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='Burn_Off_Food,_Step_by_Step_(7_Days)']//android.widget.Button[2]")
    public MobileElement add_goal_burnOffFood_link;


    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on New Runner (7 Days)\"]")
    @AndroidFindBy(xpath = "(//*[@resource-id='New_Runner_(7_Days)'])")
    //@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'More Info on 3,000 Steps a Day')][1]")
    public MobileElement add_1st_goal_step;

    @iOSXCUITFindBy(xpath = "//*[@label=\"New Runner (7 Days)\"]")
    @AndroidFindBy(xpath = "//android.view.View[4]")
    public MobileElement active_1st_step;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@resource-id,'Burn_Off_Food,_Step_by_Step')])[1]")
    public MobileElement active_burnOffFood_step;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@resource-id,'New_Runner')])[1]")
    public MobileElement active_newRunner_step;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Remove']")
    public MobileElement removeGoal_link;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Remove selected goals, web dialog\"]/XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "//*[@resource-id='Remove_Goal']")
    public MobileElement removeGoal_popup_button;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink")
    @AndroidFindBy(xpath = "//*[@text='Remove']")
    public MobileElement removeGoal_popup_button2;

    @iOSXCUITFindBy(xpath = "//*[@label=\"View & Manage\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='View & Manage']")
    public MobileElement health_dashboard_viewAndManage_link;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Add_icon']")
    public MobileElement add_icon;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Completed\"]")
    @AndroidFindBy(xpath = "(//*[@resource-id='Active_Completed_Toggle']//android.widget.RadioButton)[2]")
    public MobileElement complete_tab;

    @AndroidFindBy(xpath = "//*[@resource-id='My_Rewards']")
    public MobileElement my_Rewards;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Rewards\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Rewards']")
    public MobileElement rewards_tab;

//    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(10)" + ".scrollIntoView(new UiSelector().content-descContains(\"Rewards\")).scrollForward()")
//    public MobileElement rewards_tab;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Get Care\"]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Get Care\"]")
    public MobileElement Care_Services_tab;

    //*[@label="Telehealth by Providence"]
    @iOSXCUITFindBy(xpath = "//*[@label=\"Connect\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Connect']")
    public MobileElement health_dashobaord_Connect_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Fitbit\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Fitbit']")
    public MobileElement Fitbit_link;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Continue']")
    public MobileElement Fitbit_Continue_button;

    @iOSXCUITFindBy(xpath = "//*[@id=\"ember664\"]")
    @FindBy(id = "ember654")
    public MobileElement Fitbit_Email_link;

    @iOSXCUITFindBy(xpath = "//*[@id=\"ember655\"]")
    @FindBy(id = "ember655")
    public MobileElement Fitbit_Password_link;

    @iOSXCUITFindBy(xpath = "//*[@id=\"ember695\"]")
    @FindBy(xpath = "//*[@id=\"ember695\"]")
    public MobileElement Fitbit_SignIn_Button;

    @FindBy(id = "selectAllScope")
    public MobileElement Fitbit_SelectAll_Button;

    @FindBy(id = "allow-button")
    public MobileElement Fitbit_AllowAll_Button;

    @FindBy(xpath = "//*[text()='Connected']")
    public MobileElement Fitbit_connected_Page;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Profile menu\"]")
    @AndroidFindBy(xpath = "//*[@text='Profile menu']")
    public MobileElement profile_icon;

    @iOSXCUITFindBy(xpath = "//*[@label=\"App Settings, navigation\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@resource-id='Connected_Devices']")
    public MobileElement ProfileAndsettings_ConnectedDevices_Button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Disconnect Fitbit\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Disconnect']")
    public MobileElement Fitbit_Disconnect_Button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Device Disconnect, web dialog\"]/XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "//*[@resource-id='Disconnect_Device']")
    public MobileElement Fitbit_Disconnect_Device_Button;


    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[5]")
    @AndroidFindBy(xpath = "//*[@resource-id='Connect_Device']")
    public MobileElement Fitbit_Connect_Device_Button;

    @iOSXCUITFindBy(xpath = "//*[@value=\"You’ve connected FitBit\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Go_To_Dashboard']")
    public MobileElement Fitbit_Connected_dashboard_Button;

    @AndroidFindBy(xpath = "//*[@text='Back']")
    public MobileElement back_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='md close']")
    public MobileElement close_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='md close']")
    public MobileElement GroceryHomeNavigate;


    //@iOSXCUITFindBy(xpath = "//*[@label='Health']")
    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[5]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sign Up']")
    public MobileElement signUp_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
    public MobileElement continue_button;

    @AndroidFindBy(xpath = "//*[@resource-id='Continue']")
    public MobileElement health_continue_button;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSwitch)[1]")
    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@text,'I accept the Terms & Conditions.')]")
    public MobileElement health_Terms_and_conditions_checkbox;

    @iOSXCUITFindBy(xpath = "//*[@value=\"0\"]")
    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@text,'HIPAA Marketing Consent')]")
    public MobileElement health_hippa_marketing_consent_checkbox;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[7]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(xpath = "//*[@resource-id='first-name']")
    public MobileElement legal_First_name;

    @AndroidFindBy(xpath = "//*[@resource-id='email']")
    public MobileElement Health_sign_up_email;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[9]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(xpath = "//*[@resource-id='last-name']")
    public MobileElement legal_Last_name;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='icon-bell']")
    public MobileElement icon_bell;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
    public MobileElement Sign_up_continue_button;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'_Enroll')]")
    public MobileElement Lets_Enroll_button;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='a verification code will be sent to confirm email']/following-sibling::android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
    public MobileElement email_address;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Duration')]")
    public MobileElement duration_element;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Log_Workout']")
    public MobileElement log_workout_element;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'All Notifications')]")
    public MobileElement all_Notifications_element;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'1000')]")
    public MobileElement Health_Score_element;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='running']")
    public MobileElement running_log_workout_element;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Next']")
    public MobileElement next_button_element;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Pharmacy\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Pharmacy']")
    public MobileElement pharmacy_tab;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Health\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Health']")
    public MobileElement healthFooter;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[3][@label=\"Nutrition\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Nutrition']")
    public MobileElement nutrition_tab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter the code below to continue:']/following-sibling::android.view.View/android.widget.EditText")
    public static MobileElement email_OTP_verification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Password']/following-sibling::android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
    public MobileElement password;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Phone Number / Alt ID']/following-sibling::android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
    public MobileElement phoneNumber;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='First Name']/following-sibling::android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
    public MobileElement firstName;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'get acquainted')]")
    public MobileElement passKeyboard;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Last Name']/following-sibling::android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
    public MobileElement lastName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Address']/following-sibling::android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
    public MobileElement address;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='City']/following-sibling::android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
    public MobileElement city;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='State']/following-sibling::android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.Button")
    public MobileElement state;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='New Mexico']")
    public MobileElement state_option;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public MobileElement state_ok;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Zip Code']/following-sibling::android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
    public MobileElement zip;

    @iOSXCUITFindBy(xpath = "//*[@value=\"MM\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='input-date-month']")
    public MobileElement month;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Day\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='input-date-day']")
    public MobileElement day;

    @iOSXCUITFindBy(xpath = "//*[@value=\"YYYY\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='input-date-year']")
    public MobileElement year;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Date_&_Time')]")
    public MobileElement DateAndTime_Element;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Duration')]")
    public MobileElement Duration_Element;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Avg_Heart_Rate')]")
    public MobileElement Avg_Heart_Rate_Element;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Distance')]")
    public MobileElement Distance_Element;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Save_and_Continue')]")
    public MobileElement Save_and_Continue_Button_Element;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Activity_Back')]")
    public MobileElement Activity_Back_button_element;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'Avg Heart Rate')]")
    public MobileElement Avg_Heart_Rate_Input_Element;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'Miles_')]")
    public MobileElement Distance_input_Element;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Email Address']/following-sibling::android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
    public MobileElement emailAddress_textbox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Password']/following-sibling::android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText")
    public MobileElement password_textbox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Grocery Pickup']/following-sibling::android.view.View/android.widget.Image")
    public MobileElement Grocery_Pickup;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Log In']")
    public MobileElement login_button;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='logo store']")
    public MobileElement grocery_home;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[1][@label=\"View More\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='View_More']")
    public MobileElement nutrition_diets_view_more;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Icon for Vegan diet\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Vegan']")
    public MobileElement nutrition_vegan_diet;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Icon for Plant based diet\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Plant_based']")
    public MobileElement nutrition_plant_diet;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Icon for Organic diet\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Organic']")
    public MobileElement nutrition_organic_diet;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Icon for Free From diet\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Free_From']")
    public MobileElement nutrition_free_diet;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Icon for Vegetarian diet\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Vegetarian\" and @class=\"android.widget.TextView\"]")
    public MobileElement nutrition_vegetarian_diet;


    @iOSXCUITFindBy(xpath = "//*[@label=\"Icon for Diabetes Lifestyle diet\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Diabetes_Lifestyle\" and @class=\"android.widget.TextView\"]")
    public MobileElement Diabetes_Lifestyle_diet;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Icon for Carb Friendly diet\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Carb_Friendly\" and @class=\"android.widget.TextView\"]")
    public MobileElement Carb_Friendly_diet;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Icon for Heart Lifestyle diet\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Heart_Lifestyle\" and @class=\"android.widget.TextView\"]")
    public MobileElement Heart_Lifestyle_diet;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Icon for Ketogenic Diet diet\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Ketogenic_Diet\" and @class=\"android.widget.TextView\"]")
    public MobileElement Ketogenic_Diet;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Icon for Gluten Free diet\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Gluten_Free\" and @class=\"android.widget.TextView\"]")
    public MobileElement gluten_diet;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Go Back\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Go Back']")
    public MobileElement nutrition_back_to_diet;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='md close']")
    public MobileElement health_login_button;

    @AndroidFindBy(xpath = "//*[@resource-id='Send_Verification']")
    public MobileElement send_Verification_button;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][1]")
    public MobileElement mobile_otp_textbox1;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][2]")
    public MobileElement mobile_otp_textbox2;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][3]")
    public MobileElement mobile_otp_textbox3;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][4]")
    public MobileElement mobile_otp_textbox4;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][5]")
    public MobileElement mobile_otp_textbox5;

    @AndroidFindBy(xpath = "//*[@class=\"android.widget.EditText\"][6]")
    public MobileElement mobile_otp_textbox6;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Add Your First Goal\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Add_Your_First_Goal\"]")
    public MobileElement lets_do_it_button;

    @AndroidFindBy(xpath = "//*[@text='News & Offers']")
    public MobileElement NewsOffers;

    @AndroidFindBy(xpath = "//*[@text='Close']")
    public MobileElement closeButton;





//    @AndroidFindBy(xpath = "//android.widget.Button[@text='Enable Notifications']")
//    public MobileElement enableNotifications_button;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(20).scrollIntoView(new UiSelector().textContains(\"View & Manage\")).scrollForward()")
    public MobileElement scrollForViewAndManage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Enable Notifications\"]")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(10)" + ".scrollIntoView(new UiSelector().textContains(\"Enable Notifications\")).scrollForward()")
    public MobileElement enableNotifications_button;

    @AndroidFindBy(xpath = "//*[@text=\"3,000 Steps a Day (7 Days)\"]")
    public MobileElement added_step_goal_element;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Add Goal\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Add_Goal']")
    public MobileElement add_another_goal;

    @iOSXCUITFindBy(xpath = "//*[@label=\"lifestyle\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='lifestyle']")
    public MobileElement lifestyle_select;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Stress-free mind, 7 goals\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='lifestyle']")
    public MobileElement stressfree_select;

    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on 5 Minute Meditation (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='5_Minute_Meditation_(7_Days)']")
    public MobileElement fivemin_meditation;

    @iOSXCUITFindBy(xpath = "//*[@label=\"nutrition\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='nutrition']")
    public MobileElement nutrition_select;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Eating habits, 16 goals\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='nutrition']")
    public MobileElement eating_habits;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Eating habits, 15 goals\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='nutrition']")
    public MobileElement eating_habits_goals;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Cooking at Home (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Cooking_at_Home_(7_Days)']")
    public MobileElement cooking_at_home;

    @iOSXCUITFindBy(xpath = "//*[@label=\"sleep\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='sleep']")
    public MobileElement sleep_select;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Sleep better, 3 goals\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='sleep']")
    public MobileElement sleep_better;

    @AndroidFindBy(xpath = "//*[@text='More Info on Less Stress, Better Sleep']")
    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[4]")
    public MobileElement stress_better_sleep;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to home page\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Back_icon']")
    public MobileElement goal_back_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to dashboard\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Back_icon']")
    public MobileElement goal_back_buttonAudio;

    //log and complete meditation goal
    @iOSXCUITFindBy(xpath = "//*[@label=\"Activity\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Activity_0']")
    public MobileElement wol_activity;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Log Workout\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Log_Workout']")
    public MobileElement log_workout;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Meditation\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='meditation']")
    public MobileElement meditation_activity;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Edit or view Date & Time No value entered, required\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Date_&_Time*']")
    public MobileElement date_and_time;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Previous Hour\"]")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(false)).setMaxSearchSwipes(20).scrollIntoView(new UiSelector().textContains(\"7\")).scrollBackward()")
    public MobileElement input_7am;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label=\"H&W: Activity details\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]")
    @AndroidFindBy(xpath = "//*[@resource-id='Next']")
    public MobileElement next;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Edit or view Duration No value entered, required\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Duration*']")
    public MobileElement duration;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Next Minutes\"]")
    @AndroidFindBy(xpath = "//*[@text='Minutes 05 min']")
    public MobileElement set_5min_meditation;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Edit or view Average Heart Rate (BPM) No value entered, \"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Avg_Heart_Rate_(BPM)']")
    public MobileElement heart_rate;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label=\"H&W: Activity details\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "//*[@resource-id='Avg Heart Rate (BPM)_0']")
    public MobileElement Set65bpm;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label=\"H&W: Activity details\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]")
    @AndroidFindBy(xpath = "//*[@resource-id='Save']")
    public MobileElement save;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[13]/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='View All , My Goals']")
    public MobileElement view_all;

    @iOSXCUITFindBy(xpath = "//*[@label=\"5 Minute Meditation (7 Days).  points. Nov 17,2022\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='5_Minute_Meditation_(7_Days)']")
    public MobileElement meditateComplete;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Get Coupon\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Get Coupon\"]")
    public MobileElement rewards_GetCoupons_button;

    @iOSXCUITFindBy(xpath = "//*[@value=\"All Notifications\"]")
    @AndroidFindBy(xpath = "//*[@text=\"All Notifications\"]")
    public MobileElement allNotificationLink;

    @iOSXCUITFindBy(xpath = "//*[@label=\"See All Notifications\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"See_All\"]")
    public MobileElement seeAllLink;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Verify your identity to complete setting up your pharmacy account\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Notifications\"]")
    public MobileElement notificationPageHeader;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Verify your identity to complete setting up your pharmacy account\"]")
    @AndroidFindBy(xpath ="//*[@resource-id=\"Your_prescription_for_MONTELUKAST__TAB_10MG_is_due_for_Refill_by_October_15,_2022Refill\"]")
    //@AndroidFindBy(xpath ="//*[@resource-id=\"__next\"]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.Button[1]")
    public MobileElement refillButton;

    @AndroidFindBy(xpath ="//*[@resource-id=\"Pay_Now\"]")
    public MobileElement pharmacyPayNowForRefillButton;

    @AndroidFindBy(xpath ="//*[@resource-id=\"Pay_Now\"]")
    public MobileElement verifyRefillPointsNotification;

    @AndroidFindBy(xpath ="//*[@resource-id=Health_NotificationsPage_BackBtn]")
    public MobileElement backToHealthDashboard;

    @AndroidFindBy(xpath ="//*[@resource-id=\"Pay_Now\"]")
    public MobileElement verifyRefillPointsRewards;


    @AndroidFindBy(xpath ="//*[@text=\"Go Back to Grocery\"]")
    public MobileElement goBackToGrocery;

    @iOSXCUITFindBy(xpath = "//*[@label=\"21 Days\"]")
    @AndroidFindBy(xpath = "//*[@text='21 Days']")
    public MobileElement sleep_21_days;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Sleep\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Sleep_0']")
    public MobileElement wolSleep;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Log Sleep\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Log_Sleep']")
    public MobileElement LogSleep;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Sleep History\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Sleep_History']")
    public MobileElement SleepHistory;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Sleep\"]")
    @AndroidFindBy(xpath = "//*[contains(@text, 'Duration')]")
    public MobileElement LogHistory;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Save And Continue\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Save_And_Continue']")
    public MobileElement saveAndContinue;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Privacy Center\"]")
    @AndroidFindBy(xpath ="//*[@text='Privacy Center']")
    public MobileElement privacyCenter;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Delete\"]")
    @AndroidFindBy(xpath ="//*[@text='Delete']")
    public MobileElement deleteAccount;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Yes, permanently delete\"]")
    @AndroidFindBy(xpath ="//*[@text='Yes, permanently delete']")
    public MobileElement deleteConfirm1;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Delete Profile\"]")
    @AndroidFindBy(xpath ="//*[@text='Delete Profile']")
    public MobileElement deleteConfirm2;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Decline HIPAA Marketing Notice\"]")
    @AndroidFindBy(xpath ="//*[@text='Decline HIPAA Marketing Notice']")
    public MobileElement hippaOptions;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Accept HIPAA Marketing Notice\"]")
    @AndroidFindBy(xpath ="//*[@text='Accept HIPAA Marketing Notice']")
    public MobileElement hippaAcceptsButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Accept HIPAA Marketing Notice\"]")
    @AndroidFindBy(xpath ="//*[contains(@text, 'Agreed')]")
    public MobileElement hippaAccepted;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Terms of Use\"]")
    @AndroidFindBy(xpath ="//*[contains(@text, 'Terms of Use')]")
    public MobileElement termsOfUse;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Privacy Policy\"]")
    @AndroidFindBy(xpath ="//*[contains(@text, 'Privacy Policy')]")
    public MobileElement privacyPolicy;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Notice Of Privacy Practices\"]")
    @AndroidFindBy(xpath ="//*[contains(@text, 'Privacy Practices')]")
    public MobileElement privacyPractices;

    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on Listen Your Way to Calm\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Listen_Your_Way_to_Calm']")
    public MobileElement musicGoal;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Check in. Lets get started with your new goal Listen your way to calm \"]")
    @AndroidFindBy(xpath ="//*[contains(@text, 'Check in')]")
    public MobileElement musicCheckIn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"White noise\"]")
    @AndroidFindBy(xpath ="//*[@text='White noise']")
    public MobileElement whiteNoise;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Music Track play\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Music_Track']")
    public MobileElement playMusic;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'done')]")
    @AndroidFindBy(xpath ="//*[contains(@text, 'done')]")
    public MobileElement imDoneMusic;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Listen Your Way to Calm Time Remaining: 3 Weeks Your progress: 1 out of 15 objectives completed this week\"]")
    @AndroidFindBy(xpath ="//*[contains(@text, '1 out of 15')]")
    public MobileElement verifyListening;
    @iOSXCUITFindBy(xpath = "//*[@label=\"nutrition\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"nutrition\"]")
    public MobileElement nutrition_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Food and beverage intake, 18 goals\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Food and beverage intake, 18 goals\"]")
    public MobileElement Food_and_beverage_intake_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on Super Salad (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Super_Salad_(7_Days)\" and @text=\"Goal card\"]/android.view.View[1]")
    public MobileElement super_salad_7_days_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Super Salad (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Super Salad (7 Days)\"]//*[@class=\"android.view.View\"]")
    public MobileElement verify_super_salad_7_days_goal;

    @iOSXCUITFindBy(xpath = "//*[@label=\"See All Notifications\"]")
    @AndroidFindBy(xpath = "//*[@text='See All Notifications']")
    public MobileElement see_all_link_button;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Welcome to the goal Super Salad!\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Welcome to the goal Super Salad!\"]")
    public MobileElement verify_super_salad_goal;

    @iOSXCUITFindBy(xpath = "//*[@value=\"In the last 7 days, how many days did you eat a salad?\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"In the last 7 days, how many days did you eat a salad?\"]")
    public MobileElement verify_super_salad_goal2;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Check in. In the last 7 days how many days did you eat a salad\"]")
    @AndroidFindBy(xpath ="//*[contains(@text, 'Check in')]")
    public MobileElement saladCheckIn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Check in. Welcome to the goal Super Salad\"]")
    @AndroidFindBy(xpath ="//*[contains(@text, 'Check in')]")
    public MobileElement saladCheckIn2;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"__next\"]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]")
    public MobileElement continue_button_in_the_notification;

    @iOSXCUITFindBy(xpath = "//*[@label=\"None\"]")
    @AndroidFindBy(xpath = "//*[@text=\"None\"]")
    public MobileElement select_none_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"__next\"]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]")
    public MobileElement click_on_save_and_continue_button_in_notification;


    @AndroidFindBy(xpath = "//*[@text=\"No.\"]")
    public MobileElement no_from_the_option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Other reasons.\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Other reasons.\"]")
    public MobileElement other_reasons_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on Burn Off Food, Step by Step (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@text=\"More Info on Burn Off Food, Step by Step (7 Days)\"]")
    public MobileElement burn_off_food_step_by_step_7_days_goal_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[8]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Add_Goal\"]")
    public MobileElement add_goal_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Burn Off Food, Step by Step (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Burn Off Food, Step by Step (7 Days)\"]")
    public MobileElement verify_burn_off_food_step_by_step;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to dashboard\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Back_icon\"]")
    public MobileElement back_icon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Walking\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='walking']")
    public MobileElement walkingButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label=\"H&W: Activity details\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"__next\"]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]")
    public MobileElement nextButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label=\"H&W: Activity details\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"__next\"]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]")
    public MobileElement saveButton;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Walking\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Walking\"]")
    public MobileElement logValuesHistory;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to Activity\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Activity_History_Back']")
    public MobileElement backButtonFromActivityHistory;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back to home page\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Activity_Back\"]")
    public MobileElement backButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[10]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"You_just_added_the_goal:_**Burn_Off_Food,_Step_by_Step**!Check in\"]")
    public MobileElement checkInCta;

    @iOSXCUITFindBy(xpath = "//*[@label=\"main\"]/XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"__next\"]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]")
    public MobileElement continueButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Go Back Button\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Health_NotificationsPage_BackBtn\"]")
    public MobileElement backButtonFromNotification;

    //    @AndroidFindBy(xpath ="//*[@resource-id=\"Activity_Back\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Burn Off Food, Step by Step (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Burn_Off_Food,_Step_by_Step_(7_Days)\"]")
    public MobileElement burnOffFoodStepByStepGoal;

    @AndroidFindBy(xpath = "//*[@resource-id=\"Log_In\"]")
    public MobileElement LogInButton;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Healthy Points')]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Healthy Points')]")
    public MobileElement healthyPointsLink;

    @iOSXCUITFindBy(xpath = "//*[@label=\"7 Days\"]")
    @AndroidFindBy(xpath = "//*[@text=\"7 Days\"]")
    public MobileElement toggle_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on Intermediate Runner (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Intermediate_Runner_(7_Days)\"]")
    public MobileElement IntermediateRunnerGoal;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Intermediate Runner (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Intermediate_Runner_(7_Days)\"]")
    public MobileElement AddedGoal;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Add Goal\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Add_Goal\"]")
    public MobileElement AddGoal;

    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on Advanced Runner (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"Advanced_Runner_(7_Days)\"]")
    public MobileElement AdvancedRunnerGoal;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Advanced Runner (21 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Advanced_Runner_(7_Days)']")
    public MobileElement advanced_runner_goal;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Cycling\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"cycling\"]")
    public MobileElement CyclingLink;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Cycling\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Cycling\"]")
    public MobileElement CyclingGoal;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Eating habits, 16 goals\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Eating habits, 16 goals\"]")
    public MobileElement EatingHabits;

    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on Focus on Oil (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Focus_on_Oil_(7_Days)']")
    public MobileElement FocusOnOil;

    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on Focus on Oil (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Focus_on_Oil_(7_Days)']")
    public MobileElement FocusOnOilGoalIsDisplayed;

    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on Focus on Oil (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Focus_on_Oil_(7_Days)']")
    public MobileElement focus_on_oil_7_days_goal_not_available;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Yoga\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='yoga']")
    public MobileElement YogaLink;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Yoga\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Yoga\"]")
    public MobileElement LogValuesIsDisplayed;

    @iOSXCUITFindBy(xpath = "//*[@value=\"You just added the goal: Burn Off Food, Step by Step!\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Burn_Off_Food,_Step_by_Step_(7_Days)']")
    public MobileElement BurnOffFoodGoalIsDisplayed;

    @AndroidFindBy(xpath = "//*[@resource-id='Intermediate_Runner_(7_Days)']")
    public MobileElement IntermediateRunnerGoalIsDisplayed;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Cycling, 6 goals\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='activity']")
    public MobileElement CyclingCategory;

    @iOSXCUITFindBy(xpath = "//*[@label=\"More Info on New Cyclist (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='New_Cyclist_(7_Days)']")
    public MobileElement NewCyclistGoal;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Add Goal\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Add_Goal']")
    public MobileElement AddGoalButton;

    @AndroidFindBy(xpath = "//*[@resource-id='View_All']")
    public MobileElement ViewAllLink;

    @iOSXCUITFindBy(xpath = "//*[@label=\"New Cyclist (7 Days)\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='New_Cyclist_(7_Days)']")
    public MobileElement NewCyclistGoalDisplayed;

    @AndroidFindBy(xpath = "//*[@resource-id='Burn_Off_Food,_Step_by_Step_(7_Days)']")
    public MobileElement burn_off_food_goal;

    @AndroidFindBy(xpath = "//*[@resource-id='Focus_on_Oil_(7_Days)']")
    public MobileElement focus_on_oil_goal;

    @AndroidFindBy(xpath = "//*[@resource-id='Intermediate_Runner_(7_Days)']")
    public MobileElement intermediate_runner_goal;

    @AndroidFindBy(xpath = "//*[@resource-id='New_Cyclist_(7_Days)']")
    public MobileElement new_cyclist_goal;

//    @AndroidFindBy(xpath = "//*[@resource-id='New_Cyclist_(7_Days)']")
//    public MobileElement GoogleFitLink;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Activity\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Activity\"]")
    public MobileElement ActivityFromGoal;

    @AndroidFindBy(xpath = "//*[@text=\"You've earned $5 OFF Your Next Purchase of $25 or more.\"]")
    public MobileElement RewardsCouponsMessage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Connect\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Connect']")
    public MobileElement ConnectTrackerButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Steps, 12 goals\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Steps')]")
    public MobileElement add_steps_button2;

    @iOSXCUITFindBy(xpath = "//*[@label=\"View All , Healthy Eating Articles\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='View All , Healthy Eating Articles']")
    public MobileElement View_all_Discover_More;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@label=\"Top 10 Anti-Inflammatory Foods for High Blood Pressure\"]")
    @AndroidFindBy(xpath = "//*[@text='Top 10 Anti-Inflammatory Foods for High Blood Pressure']")
    public MobileElement articleLinkElement;
}