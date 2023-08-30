package com.automation.steps;

import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.mobile.util.GlobalVar;
import com.automation.pages.Pharmacy_EmailAPIMethods;
import com.automation.pages.Pharmacy_PushAPIMethods;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;


public class PushAPISteps {
    AppiumDriver driver = AppiumDriverManager.getDriver();

    Pharmacy_PushAPIMethods pharmacyPushMethods = new Pharmacy_PushAPIMethods(driver);

//        @When("user posts API request to generate email")
//        public void userPostsAPIRequestToGenerateEmail() throws InterruptedException {
//            pharmacyEmailMethods.sendAndVerifyAPIRequestForMarketingEmailGeneration();
//        }
//
//    @When("user posts API request to generate Delivery request email")
//    public void userPostsAPIRequestToGenerateDeliveryRequestEmail() throws InterruptedException, IOException {
//        Delivery_Req_EmailAPIMethods.sendAndVerifyAPIRequestForDeliveryReqEmailGeneration();
//    }
//    @When("user posts API request to generate Pickup Reminder email")
//    public void userPostsAPIRequestToGeneratePickupReminderEmail() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
//        //marketingEmailMethods.sendAndVerifyAPIRequestForMarketingEmailGeneration();
//        Pickup_Rem_EmailAPIMethods.sendAndVerifyAPIRequestForPickupRemEmailGeneration();
//    }
//
//    @When("user posts API request to generate Pickup Reminder email for {int}th day")
//    public void userPostsAPIRequestToGeneratePickupReminderEmailForThDay(int arg0) throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        Pickup_Rem_EmailAPIMethods.sendAndVerifyAPIRequestForPickupRemEmail13day();
//    }
//
//    @When("user posts API request to generate Order Ready for Pickup Reminder email")
//    public void userPostsAPIRequestToGenerateOrderReadyForPickupReminderEmail() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        Pickup_Rem_EmailAPIMethods.sendAndVerifyAPIRequestForOrderReadyForPickupRemEmailGeneration();
//    }
//
//    @When("user posts API request to generate Partial Order fill email")
//    public void userPostsAPIRequestToGeneratePartialOrderFillEmail() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        Pickup_Rem_EmailAPIMethods.sendAndVerifyAPIRequestForPartialOrderfillForEmailGeneration();
//    }
//
//    @When("user posts API request to generate order cancel email")
//    public void userPostsAPIRequestToGenerateOrderCancelEmail() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        Pickup_Rem_EmailAPIMethods.sendAndVerifyAPIRequestForOrderCancelEmailGeneration();
//    }
//
//    @Then("user validates welcome email subject line")
//    public void userValidatesWelcomeEmailSubjectLine() throws InterruptedException {
////            String ExpectedSubject = EXPECTED_MAILSUBJECT.val();
////            System.out.println(ExpectedSubject);
//
//        pharmacyEmailMethods.validateEmailSubject();
//    }
//    @Then("user validates welcome email sender text")
//    public void userValidatesWelcomeEmailSenderText()
//    {
//              ArrayList<String> bodyTextArr = null;
//            if(Banner.val().equalsIgnoreCase("UNITED"))
//            {
//                 bodyTextArr = new ArrayList<>();
//                bodyTextArr.add(Banner.val() + " " + EXPECTED_SENDER1.val());
//                bodyTextArr.add(EXPECTED_SENDER2.val() + banner.val());
//            }
//
//            else {
//                 bodyTextArr = new ArrayList<>();
////        for (int i = 1; i <= 2; i++) {
////            bodyTextArr.add(TestDataProvider.TestData.val("EXPECTED_SENDER"+ i + ""));
////        }
//                bodyTextArr.add(Banner.val() + " " + EXPECTED_SENDER1.val());
//                bodyTextArr.add(EXPECTED_SENDER2.val() + banner.val());
//            }
//
//
//        pharmacyEmailMethods.validateEmailSender(bodyTextArr);
//    }
//
//    @Then("user validates welcome email body for user creation")
//    public void userValidatesWelcomeEmailBodyForUserCreation() {
//        ArrayList<String> bodyTextArr = new ArrayList<>();
//        for (int i = 1; i <= 5; i++) {
//            bodyTextArr.add(TestDataProvider.TestData.val("EXPECTED_MAILBODY"+ i + ""));
//            //bodyTextArr.add(GlobalVar.data.get("EXPECTED_MAILBODY" + i + ""));
//        }
//        //String bodyheader= TestDataProvider.TestData.MAILBODY_HEADER.val();
//
//        pharmacyEmailMethods.validateEmailBody(bodyTextArr);
//    }
//
//
//
//    @When("user posts API request to generate Health email")
//    public void userPostsAPIRequestToGenerateHealthEmail() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForHealthEmailGeneration();
//    }
//
//    @When("user posts API request to generate Take the next best step  email")
//    public void userPostsAPIRequestToGenerateTakeTheNextBestStepEmail() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForTakeNextBestStepEmailGeneration();
//    }
//
////    @Then("user validates Take the next best step email subject line")
////    public void userValidatesTakeTheNextBestStepEmailSubjectLine() throws InterruptedException {
////        pharmacyEmailMethods.validateEmailSubject();
////
////    }
//
//    @When("user posts API request to generate Personal Health score email")
//    public void userPostsAPIRequestToGeneratePersonalHealthScoreEmail() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForPersonalHealthScoreEmailGeneration();
//    }
//
//    @Then("user validates welcome email body for health score")
//    public void userValidatesWelcomeEmailBodyForHealthScore() {
//        ArrayList<String> bodyTextArr = new ArrayList<>();
//        for (int i = 1; i <= 5; i++) {
//            bodyTextArr.add(TestDataProvider.TestData.val("EXPECTED_MAILBODY"+ i + ""));
//            //bodyTextArr.add(GlobalVar.data.get("EXPECTED_MAILBODY" + i + ""));
//        }
//        //String bodyheader= TestDataProvider.TestData.MAILBODY_HEADER.val();
//
//        pharmacyEmailMethods.validateEmailBody(bodyTextArr);
//
//    }
//
//    @When("user posts API request to generate Connect device email")
//    public void userPostsAPIRequestToGenerateConnectDeviceEmail() throws InterruptedException {
//
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForConnectDeviceEmailGeneration();
//    }
//
//    @Then("user validates welcome email body for connect device")
//    public void userValidatesWelcomeEmailBodyForConnectDevice() {
//        ArrayList<String> bodyTextArr = new ArrayList<>();
//        for (int i = 1; i <= 5; i++) {
//            bodyTextArr.add(TestDataProvider.TestData.val("EXPECTED_MAILBODY"+ i + ""));
//            //bodyTextArr.add(GlobalVar.data.get("EXPECTED_MAILBODY" + i + ""));
//        }
//        //String bodyheader= TestDataProvider.TestData.MAILBODY_HEADER.val();
//
//        pharmacyEmailMethods.validateEmailBody(bodyTextArr);
//
//    }
//
//    @When("user posts API request to generate Link Pharmacy email")
//    public void userPostsAPIRequestToGenerateLinkPharmacyEmail() throws InterruptedException {
//
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForLinkPharmacyEmailGeneration();
//    }
//
//    @Then("user validates welcome email body for link pharmacy")
//    public void userValidatesWelcomeEmailBodyForLinkPharmacy() {
//        ArrayList<String> bodyTextArr = new ArrayList<>();
//        for (int i = 1; i <= 5; i++) {
//            bodyTextArr.add(TestDataProvider.TestData.val("EXPECTED_MAILBODY"+ i + ""));
//            //bodyTextArr.add(GlobalVar.data.get("EXPECTED_MAILBODY" + i + ""));
//        }
//        //String bodyheader= TestDataProvider.TestData.MAILBODY_HEADER.val();
//
//        pharmacyEmailMethods.validateEmailBody(bodyTextArr);
//
//    }
//
//    @When("user posts API request to generate First goal email")
//    public void userPostsAPIRequestToGenerateFirstGoalEmail() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForFirstGoalEmailGeneration();
//
//    }
//
//    @Then("user validates welcome email body for first goal")
//    public void userValidatesWelcomeEmailBodyForFirstGoal() {
//        ArrayList<String> bodyTextArr = new ArrayList<>();
//        for (int i = 1; i <= 5; i++) {
//            bodyTextArr.add(TestDataProvider.TestData.val("EXPECTED_MAILBODY"+ i + ""));
//            //bodyTextArr.add(GlobalVar.data.get("EXPECTED_MAILBODY" + i + ""));
//        }
//        //String bodyheader= TestDataProvider.TestData.MAILBODY_HEADER.val();
//
//        pharmacyEmailMethods.validateEmailBody(bodyTextArr);
//
//    }
//
//    @When("user posts API request to generate Achieve Goals email")
//    public void userPostsAPIRequestToGenerateAchieveGoalsEmail() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForAchieveGoalsEmailGeneration();
//
//    }
//
//    @Then("user validates email body for achieve goals")
//    public void userValidatesEmailBodyForAchieveGoals() {
//        ArrayList<String> bodyTextArr = new ArrayList<>();
//        for (int i = 1; i <= 5; i++) {
//            bodyTextArr.add(TestDataProvider.TestData.val("EXPECTED_MAILBODY"+ i + ""));
//            //bodyTextArr.add(GlobalVar.data.get("EXPECTED_MAILBODY" + i + ""));
//        }
//        //String bodyheader= TestDataProvider.TestData.MAILBODY_HEADER.val();
//
//        pharmacyEmailMethods.validateEmailBody(bodyTextArr);
//
//    }
//
//    @When("user posts API request to generate First Rewards email")
//    public void userPostsAPIRequestToGenerateFirstRewardsEmail() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForFirstRewardsEmailGeneration();
//
//    }
//
//    @Then("user validates email body for redeem reward")
//    public void userValidatesEmailBodyForRedeemReward() {
//        ArrayList<String> bodyTextArr = new ArrayList<>();
//        for (int i = 1; i <= 5; i++) {
//            bodyTextArr.add(TestDataProvider.TestData.val("EXPECTED_MAILBODY"+ i + ""));
//            //bodyTextArr.add(GlobalVar.data.get("EXPECTED_MAILBODY" + i + ""));
//        }
//        //String bodyheader= TestDataProvider.TestData.MAILBODY_HEADER.val();
//
//        pharmacyEmailMethods.validateEmailBody(bodyTextArr);
//
//    }
//    @Then("user validates update pickup email sender text")
//    public void userValidatesUpdatePickupEmailSenderText() {
//        ArrayList<String> bodyTextArr = new ArrayList<>();
//        for (int i = 1; i <= 2; i++) {
//            bodyTextArr.add(TestDataProvider.TestData.val("EXPECTED_SENDER"+ i + ""));
//            //bodyTextArr.add(GlobalVar.data.get("EXPECTED_MAILBODY" + i + ""));
//        }
//        pharmacyEmailMethods.validateEmailSender(bodyTextArr);
//
//    }
////    @Then("click on each link and verify")
////    public void clickOnEachLinkAndVerify() {
////        pharmacyEmailMethods.clickOnEachLinkAndVerify();
////
////    }
//
//    @When("user posts API request to generate Daily Event email")
//    public void userPostsAPIRequestToGenerateDailyEventEmail() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForDailyEventEmailGeneration();
//
//    }
//
//    @When("user posts API request to generate Summary Email")
//    public void userPostsAPIRequestToGenerateSummaryEmail() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForSummaryEmailGeneration();
//    }
//
//    @When("user posts API request to generate Non Engagement Email")
//    public void userPostsAPIRequestToGenerateNonEngagementEmail() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForNonEngagementEmailGeneration();
//    }
//
//    @When("user posts API request to generate Dug order email")
//    public void userPostsAPIRequestToGenerateDugOrderEmail() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForDugOrderEmailGeneration();
//    }
//
//    @When("user posts API request to generate Dug order Cancel email")
//    public void userPostsAPIRequestToGenerateDugOrderCancelEmail() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForDugOrdercancelEmailGeneration();
//    }
//
//    @When("user posts API request to Delivery failure email")
//    public void userPostsAPIRequestToDeliveryFailureEmail() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForDeliveryFailureEmailGeneration();
//    }
//
//    @When("user posts API request to generate Update Pickup Email")
//    public void userPostsAPIRequestToGenerateUpdatePickupEmail() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForUpdatePickupEmailGeneration();
//    }
//
//    @When("user posts API request to generate Pickup Acknowledgement")
//    public void userPostsAPIRequestToGeneratePickupAcknowledgement() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        //Pickup_Acknowledgement
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForPickupAcknowledgementEmailGeneration();
//    }
//
//
//    @When("user posts API request to generate Bearer Token")
//    public void userPostsAPIRequestToGenerateBearerToken() throws IOException, ParserConfigurationException, InterruptedException, SAXException, URISyntaxException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForTokenGeneration();
//    }
//
//    @When("user posts API request to generate Return to Stock Warning Email")
//    public void userPostsAPIRequestToGenerateReturnToStockWarningEmail() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForReturnToStockWarningEmailGeneration();
//    }

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

    @Then("User opens the Notification bar from the Mobile")
    public void userOpensTheNotificationBarFromTheMobile() throws InterruptedException {
        pharmacyPushMethods.openMobileNotificationBar();
    }

//    @And("User Validates the Push Notification")
//    public void userValidatesThePushNotification() throws InterruptedException {
//        pharmacyPushMethods.ValidateThePushNotification();
//    }

    @Then("User closes the Notification bar from the Mobile")
    public void userClosesTheNotificationBarFromTheMobile() throws InterruptedException {
        pharmacyPushMethods.closeMobileNotificationBar();
    }

//    @When("user posts API request to generate Dosage Reminder email")
//    public void userPostsAPIRequestToGenerateDosageReminderEmail() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForDosageReminderEmailGeneration();
//    }
//
//    @When("user posts API request to generate Expiry Reminder push")
//    public void userPostsAPIRequestToGenerateExpiryReminderPush() throws InterruptedException {
//        pharmacyEmailMethods.sendAndVerifyAPIRequestForExpiryReminderEmailGeneration();
//    }

//    @And("User Validates title of the Push")
//    public void userValidatesTitleOfThePush() throws InterruptedException {
//        pharmacyPushMethods.validatePushTitle();
//
//    }

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

    @Then("User Validates the body of the push")
    public void userValidatesTheBodyOfThePush() {
        pharmacyPushMethods.validatebodyofPush();
    }
//
    @Then("User Validates the Title of the Push Notification")
    public void userValidatesTheTitleOfThePushNotification() throws InterruptedException {
        pharmacyPushMethods.validatePushTitle();
    }
}





