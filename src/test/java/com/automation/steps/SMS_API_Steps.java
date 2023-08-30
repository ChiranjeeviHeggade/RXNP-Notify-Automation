package com.automation.steps;


import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.mobile.util.GlobalVar;
import com.automation.pages.Pharmacy_EmailAPIMethods;
import com.automation.pages.Pharmacy_PushAPIMethods;
import com.automation.pages.Pharmacy_SMSPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.ArrayList;
import com.automation.steps.BaseBrowser;
import org.openqa.selenium.WebDriver;

public class SMS_API_Steps {
     static RemoteWebDriver driver;
    Pharmacy_EmailAPIMethods pharmacyEmailMethods;
    //Pharmacy_PushAPIMethods pharmacyPushMethods = new Pharmacy_PushAPIMethods(driver);
    Pharmacy_SMSPage smspage;
    public SMS_API_Steps(BaseBrowser baseBrowser) {
        this.driver = (RemoteWebDriver) baseBrowser.webDriver;
        smspage=new Pharmacy_SMSPage(this.driver);
    }
    public void launchsmswebsite()
    {
        String URL = GlobalVar.data.get("SMSWEBSITE");
        driver.navigate().to(URL);
        //driver.get(URL);
    }
    private static void  navigateToUrl(String URL){
        System.out.println("Navigate to: " + URL);
        driver.get(URL);
       // driver.navigate().to(URL);
        String title=driver.getTitle();
        System.out.println("*****************"+title+"***");
    }


//    @When("User POSTS API request to generate Dosage Reminder Email")
//    public void userPOSTSAPIRequestToGenerateDosageReminderEmail() throws InterruptedException {
//            pharmacyEmailMethods.sendAndVerifyAPIRequestForDosageReminderEmailGeneration();
//    }
//
//        @Then("user verify the links present in Email body")
//    public  void userVerifyTheLinksPresentInEmailBody() throws MalformedURLException, InterruptedException {
//        //marketingEmailMethods.ValidateTheLinks();
//        DashboardPageSteps.ValidateTheLinks();
//    }
//
//    @When("User posts API request to generate Expiry Reminder Email")
//    public void userPostsAPIRequestToGenerateExpiryReminderEmail() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForExpiryReminderEmailGeneration();
//    }
//    @Then("User validates Email Sender text")
//    public void userValidatesEmailSenderText() {
//        pharmacyEmailMethods.validateEmailSender();
//    }
//
//    @Then("User validates Email Subject line")
//    public void userValidatesEmailSubjectLine() throws InterruptedException {
//        pharmacyEmailMethods.validateEmailSubject();
//    }
//
//    @Then("User validates Email Body text")
//    public void userValidatesEmailBodyText() {
//        ArrayList<String> bodyTextArr = new ArrayList<>();
//        for (int i = 1; i <= 7; i++)
//        {
//            bodyTextArr.add(GlobalVar.data.get("EXPECTED_MAILBODY" + i + ""));
//        }
//        pharmacyEmailMethods.validateEmailBody(bodyTextArr);
//    }
//
//    @When("User posts API request to generate Expiry Reminder Email for {int} days")
//    public void userPostsAPIRequestToGenerateExpiryReminderEmailForDays(int arg0) throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForExpiryReminder7daysEmailGeneration();
//    }
//
//
//    @When("User posts API request to generate Refill Reminder Email for two days")
//    public void userPostsAPIRequestToGenerateRefillReminderEmailForTwoDays() throws InterruptedException, IOException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForRefillReminder2daysEmailGeneration();
//    }
//
//    @When("User posts API request to generate Refill Reminder Email for seven days")
//    public void userPostsAPIRequestToGenerateRefillReminderEmailForSevenDays() throws InterruptedException, IOException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForRefillReminder7daysEmailGeneration();
//    }
//
//    @When("User POSTS API request to generate Transfer request Email")
//    public void userPOSTSAPIRequestToGenerateTransferRequestEmail() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForTransferRequestEmailGeneration();
//    }
//
//    @When("User POSTS API request to generate Refill request Email")
//    public void userPOSTSAPIRequestToGenerateRefillRequestEmail() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForRefillRequestEmailGeneration();
//    }
//
//    @When("User POSTS API request to generate Delivery request Email")
//    public void userPOSTSAPIRequestToGenerateDeliveryRequestEmail() throws IOException, InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForDeliveryRequestEmailGeneration();
//    }
//
//    @When("User POSTS API request to generate Order Ready For Pickup Email")
//    public void userPOSTSAPIRequestToGenerateOrderReadyForPickupEmail() throws IOException, InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForOrderReadyForPickupEmailGeneration();
//    }
//
//    @When("User POSTS API request to generate Pickup Reminder Email")
//    public void userPOSTSAPIRequestToGeneratePickupReminderEmail() throws IOException, InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForPickupReminderEmailGeneration();
//    }
//
//    @When("User POSTS API request to generate Order Cancel Email")
//    public void userPOSTSAPIRequestToGenerateOrderCancelEmail() throws IOException, InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForOrderCancelEmailGeneration();
//    }
//
//    @When("User POSTS API request to generate Return To Stock Warning Email")
//    public void userPOSTSAPIRequestToGenerateReturnToStockWarningEmail() throws IOException, InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForReturnToStockEmailGeneration();
//    }
//
//    @Then("User opens the Notification bar from the Mobile")
//    public void userOpensTheNotificationBarFromTheMobile() throws InterruptedException {
//        pharmacyPushMethods.openMobileNotificationBar();
//    }
//
//    @And("User Validates the Push Notification")
//    public void userValidatesThePushNotification() throws InterruptedException {
//        pharmacyPushMethods.ValidateThePushNotification();
//    }
//
//    @Then("User closes the Notification bar from the Mobile")
//    public void userClosesTheNotificationBarFromTheMobile() throws InterruptedException {
//        pharmacyPushMethods.closeMobileNotificationBar();
//    }
//
//    @When("user posts API request to generate Dosage Reminder email")
//    public void userPostsAPIRequestToGenerateDosageReminderEmail() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForDosageReminderEmailGeneration();
//    }
//
//    @When("user posts API request to generate Expiry Reminder push")
//    public void userPostsAPIRequestToGenerateExpiryReminderPush() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForExpiryReminderEmailGeneration();
//    }
//
//    @And("User Validates title of the Push")
//    public void userValidatesTitleOfThePush() {
//        ArrayList<String> titleTextArr = new ArrayList<>();
//        for (int i = 1; i <= 3; i++)
//        {
//            titleTextArr.add(GlobalVar.data.get("EXPECTED_PUSHTITLE" + i + ""));
//        }
//        //pharmacyEmailMethods.validatePushTitle(bodyTextArr);
//        pharmacyPushMethods.validatePushTitle(titleTextArr);
//
//    }
//
//    @Then("User Validates the body of the Push Notification")
//    public void userValidatesTheBodyOfThePushNotification() {
//        ArrayList<String> bodyTextArr = new ArrayList<>();
//        for (int i = 1; i <= 3; i++)
//        {
//            bodyTextArr.add(GlobalVar.data.get("EXPECTED_PUSHBODY" + i + ""));
//        }
//        //pharmacyEmailMethods.validatePushTitle(bodyTextArr);
//        pharmacyPushMethods.validatePushBody(bodyTextArr);
//    }
//    @When("user posts API request to generate Refill Reminder Push Notification")
//    public void userPostsAPIRequestToGenerateRefillReminderPushNotification() throws IOException, InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForRefillReminder2daysEmailGeneration();
//    }
//
//    @When("user posts API request to generate Order Ready For Pickup Push Notification")
//    public void userPostsAPIRequestToGenerateOrderReadyForPickupPushNotification() throws IOException, InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForOrderReadyForPickupEmailGeneration();
//    }
//
//    @When("user posts API request to generate Pickup Reminder Push Notification")
//    public void userPostsAPIRequestToGeneratePickupReminderPushNotification() throws IOException, InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForPickupReminderEmailGeneration();
//    }
//
//    @When("user posts API request to generate Partial Fill Order Push Notification")
//    public void userPostsAPIRequestToGeneratePartialFillOrderPushNotification() throws IOException, InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForPartialFillorderEmailGeneration();
//    }
//
//    @When("user posts API request to generate Return to Stock Warning Push Notification")
//    public void userPostsAPIRequestToGenerateReturnToStockWarningPushNotification() throws IOException, InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForReturnToStockEmailGeneration();
//    }
//
//    @When("User POSTS API request to generate Partial Fill Order Email")
//    public void userPOSTSAPIRequestToGeneratePartialFillOrderEmail() throws IOException, InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForPartialFillorderEmailGeneration();
//    }

    @When("User POSTS API request to generate Dosage Reminder SMS")
    public void userPOSTSAPIRequestToGenerateDosageReminderSMS() throws InterruptedException {
        pharmacyEmailMethods.sendAndVerifyAPIRequestForDosageReminderEmailGeneration();
    }
    @When("User launches website for SMS server")
    public void userLaunchesWebsiteForSMSServer() {
        launchsmswebsite();
        smspage.refreshallMessages();
    }
    @Then("User validate the SMS body For the Scenario")
    public void userValidateTheSMSBodyForTheScenario() throws InterruptedException
    {
        //String Result=smsPage.ReadAllSMS();

        smspage.refreshallMessages();
        ArrayList<String> bodyTextArr = new ArrayList<>();
        for (int i = 1; i <= 5; i++)
        {
            bodyTextArr.add(GlobalVar.data.get("EXPECTED_SMSBODY" + i + ""));
        }
       String Result=smspage.ValidatetheSMS(bodyTextArr);
        if(Result.equalsIgnoreCase("Pass"))
        {
            System.out.println("Validated");

        }
        else {
            userRefreshForLatestSMS();
            userValidateTheSMSBodyForTheScenario();
        }

    }

    @Then("User Refresh for latest SMS")
    public void userRefreshForLatestSMS()
    {
           driver.findElement(By.xpath("//a[normalize-space()='Update latest sms']")).click();
    }

}





