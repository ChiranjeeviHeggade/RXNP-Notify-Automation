package com.automation.pages;


import com.automation.EmailAPIUtils.*;
import com.automation.mobile.models.HttpResponse;
import com.automation.mobile.util.GlobalVar;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;


public class Pharmacy_EmailAPIMethods  {
    String Token;

    public Pharmacy_EmailAPIMethods(AppiumDriver driver) {
        super();
    }
//    public void  sendAndVerifyAPIRequestForMarketingEmailGeneration() throws InterruptedException {
//
//       HttpResponse response = new GetResponseUtilForMarketingEmail().getAPIResponse();
//        System.out.println("-----------"+response+"-------------");
//        int statusCode = new GetResponseUtilForMarketingEmail().getStatusCode(response);
//        new GetResponseUtilForMarketingEmail().verifyResponseStatus(statusCode);
//    }

    /*
   @methodName-getUser()
   @usage-The method is used to retrieve the user from Data file/generated using run-time
   */
//133344182 !!!!!prevoius profile id
//    public String getUser() {
//
//        if (GlobalVar.data.get("USER").equalsIgnoreCase("RANDOM"))
//        {
//
//            return GlobalVar.Random_User;
//        } else {
//            return GlobalVar.data.get("USER");
//        }
//
//    }

    /*
    @methodName-validateEmailSubject()
    @usage-The method is used to validate subject line of marketing email
    */
//    String username=TestDataProvider.TestData.USERNAME.val();
//    String expectedmailsubject=TestDataProvider.TestData.EXPECTED_MAILSUBJECT.val();
    public void validateEmailSubject() throws InterruptedException {

        boolean flag = false;
        //pool for 360 secs(if mail not received)
        String username = GlobalVar.data.get("USER");
        for (int i = 1; i <= 36; i++) {
            String subject = new ReadMail7UtilForMarketingEmail(username).getMailSubjectLine();
            System.out.println("mail subject line from mail7 is))))))" + subject + ")))))))");
            String expectedmailsubject = GlobalVar.data.get("EXPECTED_SUBJECT");
            if (subject.contains(expectedmailsubject)) {
                flag = true;
                System.out.println("found mail and subject");
                break;
            } else {
                waitFor();
            }
            if (flag) {
                Assert.assertTrue(true, "Subject line matched");
            } else {
                Assert.fail("Subject line not matched");
            }

        }
    }


    private void waitFor() {
        try {
            //wait for 40 secs
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
    @methodName-validateEmailBody()
    @usage-The method is used to validate marketing email body text
    */
    public void validateEmailBody(ArrayList<String> bodyTextArr) {
        System.out.println("........" + bodyTextArr + "........");
        String username = GlobalVar.data.get("USER");
        String body = new ReadMail7UtilForMarketingEmail(username).getMailBody();

        boolean flag = false;
        String actual_text = body.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");

        for (String expected_text : bodyTextArr) {
            expected_text = expected_text.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");

            if (actual_text.contains(expected_text)) {
                flag = true;
            }
        }
        System.out.println("*****************" + body + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //validate subject
        if (flag) {
            Assert.assertTrue(true, "body matched");
        } else {
            Assert.fail("body not matched with actual text:" + body);
        }
    }

    /*
    @methodName-validateEmailPreHeader()
    @usage-The method is used to validate marketing email Pre-header
     */
//    public void validateEmailPreHeader(String expected_text) throws InterruptedException {
//
//        String data_text = expected_text.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
//        boolean flag = false;
//
//        //pool for 60 secs(if mail not received)
//        for (int i = 1; i <= 6; i++) {
//            String body = new ReadMail7UtilForMarketingEmail(username).getMailPreHeader();
//            String text = body.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
//            if (text.contains(data_text)) {
//                flag = true;
//                break;
//            } else {
//                waitFor();
//            }
//        }
//
//        //validate subject
//        if (flag) {
//            Assert.assertTrue(true, "pre-header matched");
//        } else {
//            Assert.fail("pre-header not matched");
//        }
//
//    }\

    public String getUser() {

        if (GlobalVar.data.get("USER").equalsIgnoreCase("RANDOM")) {
            return GlobalVar.Random_User;
        } else {
            return GlobalVar.data.get("USER");
        }

    }

    /*
     @methodName-validateEmailSender()
     @usage-The method is used to validate marketing email sender name
     */
    public void validateEmailSender() {

        boolean flag = false;
        //pool for 60 secs(if mail not received)
        for (int i = 1; i <= 6; i++) {
            String text = new ReadMail7UtilForMarketingEmail(getUser()).getSender();
            text= text.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
            System.out.println("This is a sender from mail7.io----->>" + text + "------<");
            String Expected_Sender= GlobalVar.data.get("EXPECTED_SENDER");
            Expected_Sender= Expected_Sender.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
            if (text.contains(Expected_Sender)) {
                flag = true;
                break;
            } else {
                waitFor();
            }
        }

        //validate subject
        if (flag) {
            Assert.assertTrue(true, "sender matched");
        } else {
            Assert.fail("sender not matched");
        }
    }

//        boolean flag = false;
//        String username = GlobalVar.data.get("USER");
//        String Expected_sender=GlobalVar.data.get("EXPECTED_SENDER");
//        String text = new ReadMail7UtilForMarketingEmail(username).getSender();
//        System.out.println("this is a sender we got from mail7------->"+text);
//        //String actual_text = text.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
//        //pool for 60 secs(if mail not received)
//        System.out.println("this is a actual sender from property file  ------>"+bodyTextArr );
//            for (String expected_text : bodyTextArr)
//            {
//                expected_text = expected_text.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
//
//                if (text.contains(expected_text))
//                {
//                    flag = true;
//                }
//
//                else
//                {
//                waitFor();
//                }
//            }
//
//        //validate subject
//        if (flag) {
//            Assert.assertTrue(true, "sender matched");
//        } else {
//            Assert.fail("sender not matched");
//        }
//    }

//    public void sendAndVerifyAPIRequestForHealthEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForHealthEmail().getAPIResponse();
//        int statusCode = new GetResponseUtilForHealthEmail().getStatusCode(response);
//        new GetResponseUtilForHealthEmail().verifyResponseStatus(statusCode);
//
//    }
//
//    public void sendAndVerifyAPIRequestForTakeNextBestStepEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForHealthEmail().getAPIResponse();
//        int statusCode = new GetResponseUtilForHealthEmail().getStatusCode(response);
//        new GetResponseUtilForHealthEmail().verifyResponseStatus(statusCode);
//
//    }
//
//    public void sendAndVerifyAPIRequestForPersonalHealthScoreEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForHealthEmail().getAPIResponse();
//        int statusCode = new GetResponseUtilForHealthEmail().getStatusCode(response);
//        new GetResponseUtilForHealthEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForConnectDeviceEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForHealthEmail().getAPIResponse();
//        int statusCode = new GetResponseUtilForHealthEmail().getStatusCode(response);
//        new GetResponseUtilForHealthEmail().verifyResponseStatus(statusCode);
//
//    }
//
//    public void sendAndVerifyAPIRequestForLinkPharmacyEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForHealthEmail().getAPIResponse();
//        int statusCode = new GetResponseUtilForHealthEmail().getStatusCode(response);
//        new GetResponseUtilForHealthEmail().verifyResponseStatus(statusCode);
//
//
//    }
//
//    public void sendAndVerifyAPIRequestForFirstGoalEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForHealthEmail().getAPIResponse();
//        int statusCode = new GetResponseUtilForHealthEmail().getStatusCode(response);
//        new GetResponseUtilForHealthEmail().verifyResponseStatus(statusCode);
//
//    }
//
//    public void sendAndVerifyAPIRequestForAchieveGoalsEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForHealthEmail().getAPIResponse();
//        int statusCode = new GetResponseUtilForHealthEmail().getStatusCode(response);
//        new GetResponseUtilForHealthEmail().verifyResponseStatus(statusCode);
//
//    }
//
//    public void sendAndVerifyAPIRequestForFirstRewardsEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForHealthEmail().getAPIResponse();
//        int statusCode = new GetResponseUtilForHealthEmail().getStatusCode(response);
//        new GetResponseUtilForHealthEmail().verifyResponseStatus(statusCode);
//    }
//
//
//    public void sendAndVerifyAPIRequestForDailyEventEmailGeneration() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
//        HttpResponse response = new GetResponseUtilForHealthEWD().getAPIResponse();
//        int statusCode = new GetResponseUtilForHealthEmail().getStatusCode(response);
//        new GetResponseUtilForHealthEmail().verifyResponseStatus(statusCode);
//
//    }
//
//    public void sendAndVerifyAPIRequestForSummaryEmailGeneration() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        HttpResponse response = new GetResponseUtilForHealthEWD().getAPIResponse();
//        int statusCode = new GetResponseUtilForHealthEmail().getStatusCode(response);
//        new GetResponseUtilForHealthEmail().verifyResponseStatus(statusCode);
//
//    }
//
//    public void sendAndVerifyAPIRequestForNonEngagementEmailGeneration() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        HttpResponse response = new GetResponseUtilForHealthEWD().getAPIResponse();
//        int statusCode = new GetResponseUtilForHealthEmail().getStatusCode(response);
//        new GetResponseUtilForHealthEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForDugOrderEmailGeneration() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        HttpResponse response = new GetResponseUtilForDUG().getAPIResponse(Token);
//        int statusCode = new GetResponseUtilForDUG().getStatusCode(response);
//        new GetResponseUtilForDUG().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForDugOrdercancelEmailGeneration() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        HttpResponse response = new GetResponseUtilForDUG().getAPIResponse(Token);
//        int statusCode = new GetResponseUtilForDUG().getStatusCode(response);
//        new GetResponseUtilForDUG().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForDeliveryFailureEmailGeneration() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        HttpResponse response = new GetResponseUtilForDUG().getAPIResponse(Token);
//        int statusCode = new GetResponseUtilForDUG().getStatusCode(response);
//        new GetResponseUtilForDUG().verifyResponseStatus(statusCode);
//
//    }
//
//    public void sendAndVerifyAPIRequestForUpdatePickupEmailGeneration() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        HttpResponse response = new GetResponseUtilForDUG().getAPIResponse(Token);
//        int statusCode = new GetResponseUtilForDUG().getStatusCode(response);
//        new GetResponseUtilForDUG().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForPickupAcknowledgementEmailGeneration() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        HttpResponse response = new GetResponseUtilForDUG().getAPIResponse(Token);
//        int statusCode = new GetResponseUtilForDUG().getStatusCode(response);
//        new GetResponseUtilForDUG().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForTokenGeneration() throws IOException, ParserConfigurationException, InterruptedException, SAXException, URISyntaxException {
//        HttpResponse response = new GetResponseUtilForAPI().getAPIResponse();
//        Token =response.getJsonResponse().getString("access_token");
//        System.out.println("|||||||||||||||"+Token+"???????????????????????");
//        System.out.println("????????????????????????????"+response.getJsonResponse()+"???????????????????????");
//
//    }
//
//    public void sendAndVerifyAPIRequestForReturnToStockWarningEmailGeneration() throws IOException, ParserConfigurationException, InterruptedException, SAXException {
//        HttpResponse response = new GetResponseUtilForReturnToStockWarningEmail().getAPIResponse();
//        System.out.println("-----------"+response+"-------------");
//        int statusCode = new GetResponseUtilForReturnToStockWarningEmail().getStatusCode(response);
//        new GetResponseUtilForReturnToStockWarningEmail().verifyResponseStatus(statusCode);
//
//    }


    public void sendAndVerifyAPIRequestForDosageReminderEmailGeneration() throws InterruptedException {
        HttpResponse response = new GetResponseUtilForDosageReminderEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForDosageReminderEmail().getStatusCode(response);
        new GetResponseUtilForDosageReminderEmail().verifyResponseStatus(statusCode);
    }

    public void sendAndVerifyAPIRequestForExpiryReminderEmailGeneration() throws InterruptedException {
        HttpResponse response = new GetResponseUtilForExpiryReminderEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForExpiryReminderEmail().getStatusCode(response);
        new GetResponseUtilForExpiryReminderEmail().verifyResponseStatus(statusCode);
    }

    public void sendAndVerifyAPIRequestForExpiryReminder7daysEmailGeneration() throws InterruptedException {
        HttpResponse response = new GetResponseUtilForExpiryReminder7daysEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForExpiryReminder7daysEmail().getStatusCode(response);
        new GetResponseUtilForExpiryReminder7daysEmail().verifyResponseStatus(statusCode);
    }

    public void sendAndVerifyAPIRequestForRefillReminder2daysEmailGeneration() throws InterruptedException, IOException {
        HttpResponse response = new GetResponseUtilForRefillReminder2daysEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForRefillReminder2daysEmail().getStatusCode(response);
        new GetResponseUtilForRefillReminder2daysEmail().verifyResponseStatus(statusCode);
    }

    public void sendAndVerifyAPIRequestForRefillReminder7daysEmailGeneration() throws InterruptedException, IOException {
        HttpResponse response = new GetResponseUtilForRefillReminder7daysEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForRefillReminder7daysEmail().getStatusCode(response);
        new GetResponseUtilForRefillReminder7daysEmail().verifyResponseStatus(statusCode);

    }

    public void sendAndVerifyAPIRequestForTransferRequestEmailGeneration() throws InterruptedException {
        HttpResponse response = new GetResponseUtilForTransferRequestEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForTransferRequestEmail().getStatusCode(response);
        new GetResponseUtilForTransferRequestEmail().verifyResponseStatus(statusCode);
    }

    public void sendAndVerifyAPIRequestForRefillRequestEmailGeneration() throws InterruptedException {
        HttpResponse response = new GetResponseUtilForRefillRequestEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForRefillRequestEmail().getStatusCode(response);
        new GetResponseUtilForRefillRequestEmail().verifyResponseStatus(statusCode);
    }

//    public void sendAndVerifyAPIRequestForDeliveryRequestEmailGeneration() throws IOException, InterruptedException {
//        HttpResponse response = new GetResponseUtilForDeliveryRequestEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForDeliveryRequestEmail().getStatusCode(response);
//        new GetResponseUtilForDeliveryRequestEmail().verifyResponseStatus(statusCode);
//    }

    public void sendAndVerifyAPIRequestForOrderReadyForPickupEmailGeneration() throws IOException, InterruptedException {
        HttpResponse response = new GetResponseUtilForOrderReadyForPickupEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForOrderReadyForPickupEmail().getStatusCode(response);
        new GetResponseUtilForOrderReadyForPickupEmail().verifyResponseStatus(statusCode);
    }

    public void sendAndVerifyAPIRequestForPickupReminderEmailGeneration() throws IOException, InterruptedException {
        HttpResponse response = new GetResponseUtilForPickupReminderEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForPickupReminderEmail().getStatusCode(response);
        new GetResponseUtilForPickupReminderEmail().verifyResponseStatus(statusCode);
    }

    public void sendAndVerifyAPIRequestForOrderCancelEmailGeneration() throws IOException, InterruptedException {
        HttpResponse response = new GetResponseUtilForOrderCancelEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForOrderCancelEmail().getStatusCode(response);
        new GetResponseUtilForOrderCancelEmail().verifyResponseStatus(statusCode);
    }

    public void sendAndVerifyAPIRequestForReturnToStockEmailGeneration() throws IOException, InterruptedException {
        HttpResponse response = new GetResponseUtilForReturnToStockWarningEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForReturnToStockWarningEmail().getStatusCode(response);
        new GetResponseUtilForReturnToStockWarningEmail().verifyResponseStatus(statusCode);
    }

    public void sendAndVerifyAPIRequestForPartialFillorderEmailGeneration() throws IOException, InterruptedException {
        HttpResponse response = new GetResponseUtilForPartialFillEmail().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForPartialFillEmail().getStatusCode(response);
        new GetResponseUtilForPartialFillEmail().verifyResponseStatus(statusCode);

    }

    public void sendAndVerifyAPIRequestForBatchJob() throws InterruptedException {
        HttpResponse response = new GetResponseUtilForBatchJob().getAPIResponse();
        System.out.println("-----------" + response + "-------------");
        int statusCode = new GetResponseUtilForBatchJob().getStatusCode(response);
        new GetResponseUtilForBatchJob().verifyResponseStatus(statusCode);
    }
}


