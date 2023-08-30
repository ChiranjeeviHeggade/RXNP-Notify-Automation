package com.automation.pages;

import com.automation.pageElements.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PageManager extends BasePage {
    public GroceryPageElements homePageElements = new GroceryPageElements();

    public Pharmacy_PageElements pharmacyPageElements = new Pharmacy_PageElements();
    public   ACI_Pharmacy_PageElements aciPharmacyPageElements = new ACI_Pharmacy_PageElements();
    public United_Pharmacy_PageElements unitedPharmacyPageElements =new United_Pharmacy_PageElements();
    HealthPageElements healthPageElements = new HealthPageElements();
    public ACI_Grocery_PageElements aciGroceryPageElements = new ACI_Grocery_PageElements();
    RewardsPageElements rewardsPageElements = new RewardsPageElements();
    AssessmentPageElements assessmentPageElements = new AssessmentPageElements();
    CareServicesPageElements careServicesElement = new CareServicesPageElements();
    HWPharmacyAccountLinkPageElements hwPharmacyLinkElements = new HWPharmacyAccountLinkPageElements();
    ProfileAndSettingsPageElements profileSettingsElements = new ProfileAndSettingsPageElements();
   // PharmacyPageElements pharmacyPageElements = new PharmacyPageElements();

    PharmacyP1PageElements pharmacyP1PageElements = new PharmacyP1PageElements();

    HW_ACI_RegistrationElements registrationElements = new HW_ACI_RegistrationElements();
    HW_ACI_GuestUserElements guestUserElements = new HW_ACI_GuestUserElements();

    HW_ACI_LoginElements loginElements = new HW_ACI_LoginElements();

    BiometricsElements biometricsElements = new BiometricsElements();

    RewardsEngineElements rewardsEngineElements = new RewardsEngineElements();



    public PageManager(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), homePageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), healthPageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), rewardsPageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), assessmentPageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), careServicesElement);
        PageFactory.initElements(new AppiumFieldDecorator(driver), hwPharmacyLinkElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), profileSettingsElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pharmacyPageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), aciGroceryPageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), aciPharmacyPageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver),unitedPharmacyPageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pharmacyP1PageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), registrationElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), guestUserElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), loginElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), biometricsElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), rewardsEngineElements);

    }
}