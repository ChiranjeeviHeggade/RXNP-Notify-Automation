package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class RewardsPageElements {
    @iOSXCUITFindBy(xpath = "//*[@label=\"View Health Rewards !\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='View_All']")
    public MobileElement rewards_AllHealthRewards_ViewAll_button;

    @iOSXCUITFindBy(xpath = "//*[@value=\"0\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"checkbox\"]")
    public MobileElement rewards_redeem_checkbox;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Almond Milk')]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Almond Milk')]")
    public MobileElement rewards_redeem_couponCard1;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Almond Milk')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Almond Milk')]")
    public MobileElement rewards_GetCoupons_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Close_icon']")
    public MobileElement rewards_GetCoupons_closeIcon;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'coupon-image $1 OFF Produce 1000 points')]")
    public MobileElement rewards_GetCoupons_closeIcon2;

    @AndroidFindBy(xpath = "//*[@resource-id=\"__next\"]/android.view.View[1]/android.view.View[4]/android.view.View[1]")
    public MobileElement rewards_viewAll_MyCoupons_button;

    @iOSXCUITFindBy(xpath = "//*[@value=\"My Coupons\"]")
    @AndroidFindBy(xpath = "//*[@text=\"My Coupons\"]")
    public MobileElement rewards_clipped_MyCoupons;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Start Shopping & Saving\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Start Shopping & Saving']")
    public MobileElement startShoppingButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Clipped deals Tab, 3 of 6\"]")
    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@text='Clipped']")
    public MobileElement clippedButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"$10 Off Groceries\"]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Groceries')]")
    public MobileElement Verify_clipped_coupon_grocery;

    @iOSXCUITFindBy(xpath = "//*[@label=\"My Rewards Activity\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='My_Rewards_Activity']")
    public MobileElement my_rewards_activity_button;

    @iOSXCUITFindBy(xpath = "//*[@value=\"My Health Rewards Activity\"]")
    @AndroidFindBy(xpath = "//*[@text='My Health Rewards Activity']")
    public MobileElement my_health_rewards_activity_title;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Points Earn')]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Earn')]")
    public MobileElement earn_healthy_points_button;

    @iOSXCUITFindBy(xpath = "//*[@label=\"All deals Tab, 1 of 6\"]")
    @AndroidFindBy(xpath = "//*[@text='Your Deals']")
    public MobileElement dealsTab;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Clipped deals Tab, 3 of 6\"]")
    @AndroidFindBy(xpath = "//*[@text='CLIP']")
    public MobileElement clipCoupon;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Get $5 Off Groceries. Earn Rewards & Begin Health Survey\"]")
    @AndroidFindBy(xpath = "//*[@text='Get $5 Off Groceries. Earn Rewards & Begin Health Survey']")
    public MobileElement healthAssessRewards;

    @AndroidFindBy(xpath = "//*[@text='Earn More Points']")
    public MobileElement earnMore;

    @iOSXCUITFindBy(xpath = "//*[@label=\"coupon-image Free Signature SELECT Tea Lock icon 3,000 points\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'3,000')]")
    public MobileElement coupon_with_3000_points;

    @iOSXCUITFindBy(xpath = "//*[@label=\"You need 2,001 more points to get this reward\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'You need')]")
    public MobileElement error_message_is_displayed;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Free Signature SELECT Tea close\"]")
    @AndroidFindBy(xpath = "//*[@resource-id='Close_icon']")
    public MobileElement close_button;

    @AndroidFindBy(xpath = "//*[@resource-id='Start_Shopping_&_Saving']")
    public MobileElement startShoppingAndSavingButton;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'3,000 points')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'3,000')]")
    public MobileElement coupon_with_3000_pointsACI;

    @iOSXCUITFindBy(xpath = "//*[@name=\"btnNext-Welcome tool tip\"]")
    @AndroidFindBy(xpath = "//*[@text='Your Deals']")
    public MobileElement AciDeals1;

    @iOSXCUITFindBy(xpath = "//*[@name=\"btnNext-Browse tool tip\"]")
    @AndroidFindBy(xpath = "//*[@text='Your Deals']")
    public MobileElement AciDeals2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Continue\"]")
    @AndroidFindBy(xpath = "//*[@text='Your Deals']")
    public MobileElement AciDeals3;

    @iOSXCUITFindBy(xpath = "//*[@label=\"HOME\"]")
    @AndroidFindBy(xpath = "//*[@text='HOME']")
    public MobileElement backToAppHome;
}
