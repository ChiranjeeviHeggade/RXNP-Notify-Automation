package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.FindBy;
public class RewardsEngineElements {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'calories')]")
    public MobileElement zeroProgressMove;
    //[@name="0/10CAL"]

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Exercise: Ring 0 percent complete \"]")
    public MobileElement zeroProgressEx;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Stand: Ring 0 percent complete \"]")
    public MobileElement zeroProgressStand;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Learn More about Close the Rings. Earn points.\"]")
    public MobileElement learnMoreRwe;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Let's Do it\"]")
    public MobileElement letsDoItrwe;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Okay\"]")
    public MobileElement okay;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Turn On All\"]")
    public MobileElement acceptHKAPerm;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Allow\"]")
    public MobileElement allow;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Move:\"]")
    public MobileElement move;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Exercise:\"]")
    public MobileElement exercise;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Stand:\"]")
    public MobileElement stand;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Connect\"]")
    public MobileElement ahkHDB;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Learn more to Close the Rings. Earn the points button\"]")
    public MobileElement fitnessHDB;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"Apple Health\"]")
    public MobileElement appleHealth;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"continue\"]")
    public MobileElement continueButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Go To Dashboard\"]")
    public MobileElement goToDashboard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Activity:\"]")
    public MobileElement rweRingTile;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Go back\"]")
    public MobileElement rewardsActivityBack;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'1,000 points')]")
    public MobileElement rweCoupon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Your 7 day progress:\"]")
    public MobileElement rwe7Days;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'data not available')]")
    public MobileElement rweClosedDays;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Moving goal completed')]")
    public MobileElement rweWeekProgress;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Points earned this week:\"]")
    public MobileElement rwePointsEarnedWeek;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Connected Devices\"]")
    public MobileElement connectedDevices;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OptOut My Rings Card\"]")
    public MobileElement optOutFitness;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Opt-out\"]")
    public MobileElement optOutConfirm;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Close undefined\"]")
    public MobileElement closeAfterDiconnet;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back to profile and settings\"]")
    public MobileElement backToProfile;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back to pharmacy dashboard\"]")
    public MobileElement backToDashBoard;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"activity-card\"])[1]/XCUIElementTypeImage")
    public MobileElement rweActivityIcon;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'+')]")
    public MobileElement rwePoints;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,'points')]")
    public MobileElement movePoints;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sharing\"]")
    public MobileElement ahkSharing;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Apps\"]")
    public MobileElement ahkApps;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Haggen\"]")
    public MobileElement ahkBanner;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Vons\"]")
    public MobileElement ahkBannerVons;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Randalls\"]")
    public MobileElement ahkBannerRandalls;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Tom Thumb\"]")
    public MobileElement ahkBannerTT;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ACME\"]")
    public MobileElement ahkBannerAcme;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Carrs\"]")
    public MobileElement ahkBannerCarrs;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Star Market\"]")
    public MobileElement ahkBannerStar;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Shaws\"]")
    public MobileElement ahkBannerShaws;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Safeway\"]")
    public MobileElement ahkBannerSafeway;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Jewelosco\"]")
    public MobileElement ahkBannerJewels;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Albertsons\"]")
    public MobileElement ahkBannerAlbertsons;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pavilions\"]")
    public MobileElement ahkBannerPavilions;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Turn Off All\"]")
    public MobileElement ahkTurnOffAll;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Activity\"]")
    public MobileElement ahkActivity;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+ 25 points\"]")
    public MobileElement movePlus;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+ 25 points\"]")
    public MobileElement exPlus;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+ 25 points\"]")
    public MobileElement standPlus;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Move Ring Completed\"]")
    public MobileElement moveRingClose;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Stand Ring Completed\"]")
    public MobileElement standRingClose;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Exercise Ring Completed\"]")
    public MobileElement exRingClose;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'20')]")
    public MobileElement rweDateHistory;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"- 1,000 points\"]")
    public MobileElement redemmedPoints;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Coupon redeemed\"]")
    public MobileElement redemmedTitle;

    @iOSXCUITFindBy(xpath = "//*[contains(@name,'$1 Off')]")
    public MobileElement redeemedCoupon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Go Back to Grocery\"]")
    public MobileElement groceryHDB;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Settings\"]")
    public MobileElement groceryInfoTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sign Out\"]")
    public MobileElement signOut;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public MobileElement okayConfirmSignOut;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your monthly progress\"]")
    public MobileElement monthlyProgress;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Last week\"]")
    public MobileElement lastWeek;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1 month\"]")
    public MobileElement oneMonth;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"3 months\"]")
    public MobileElement threeMonths;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"days\"])[1]")
    public MobileElement monthlyDays;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'July')]")
    public MobileElement rweDate1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'February')]")
    public MobileElement rweDate2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"    Go to account   \"]")
    public MobileElement goToAccount;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"HOME\"]")
    public MobileElement aciHome;
}
