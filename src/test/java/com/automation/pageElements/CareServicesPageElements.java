package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.FindBy;

public class CareServicesPageElements {
    @iOSXCUITFindBy(xpath = "//*[@label=\"Telehealth by Providence\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Telehealth']")
    public MobileElement telehealth_option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Start Your Visit Now\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Start_Your_Visit_Now']")
    public MobileElement start_your_visit_btn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Safari\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Go back']")
    public MobileElement go_back_btn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Schedule a Vaccine\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Schedule_a_Vaccine']")
    public MobileElement schedule_a_vaccine_option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"My Vaccine Records\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='My_Vaccine_Records']")
    public MobileElement my_vaccine_option;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Go to dashboard\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Go Back to Grocery\"]")
    public MobileElement go_back_dashboard_btn;
}
