package com.automation.pages;


import com.automation.EmailAPIUtils.*;
import com.automation.mobile.util.GlobalVar;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class Pharmacy_PushAPIMethods extends PageManager {
    String Token;

    public Pharmacy_PushAPIMethods(AppiumDriver driver) {
        super(driver);
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
//    public void validateEmailSubject() throws InterruptedException {
//
//        boolean flag = false;
//        //pool for 360 secs(if mail not received)
//        String username = GlobalVar.data.get("USER");
//        for (int i = 1; i <= 36; i++) {
//            String subject = new ReadMail7UtilForMarketingEmail(username).getMailSubjectLine();
//            System.out.println("mail subject line from mail7 is))))))" + subject + ")))))))");
//            String expectedmailsubject = GlobalVar.data.get("EXPECTED_SUBJECT");
//            if (subject.contains(expectedmailsubject)) {
//                flag = true;
//                System.out.println("found mail and subject");
//                break;
//            } else {
//                waitFor();
//            }
//            if (flag) {
//                Assert.assertTrue(true, "Subject line matched");
//            } else {
//                Assert.fail("Subject line not matched");
//            }
//
//        }
//    }
//
//
//    private void waitFor() throws InterruptedException {
//
//        closeMobileNotificationBar();
//            Thread.sleep(60000);
//            System.out.println("moving for next round validation");
//          openMobileNotificationBar();
//
////        }
////        catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//    }
//
//    /*
//    @methodName-validateEmailBody()
//    @usage-The method is used to validate marketing email body text
//    */
//    public void validateEmailBody(ArrayList<String> bodyTextArr) {
//        System.out.println("........" + bodyTextArr + "........");
//        String username = GlobalVar.data.get("USER");
//        String body = new ReadMail7UtilForMarketingEmail(username).getMailBody();
//
//        boolean flag = false;
//        String actual_text = body.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
//
//        for (String expected_text : bodyTextArr) {
//            expected_text = expected_text.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
//
//            if (actual_text.contains(expected_text)) {
//                flag = true;
//            }
//        }
//        System.out.println("*****************" + body + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//        //validate subject
//        if (flag) {
//            Assert.assertTrue(true, "body matched");
//        } else {
//            Assert.fail("body not matched with actual text:" + body);
//        }
//    }
//
//
//
//    public String getUser() {
//
//        if (GlobalVar.data.get("USER").equalsIgnoreCase("RANDOM")) {
//            return GlobalVar.Random_User;
//        } else {
//            return GlobalVar.data.get("USER");
//        }
//
//    }
//
//    /*
//     @methodName-validateEmailSender()
//     @usage-The method is used to validate marketing email sender name
//     */
//    public void validateEmailSender() throws InterruptedException {
//
//        boolean flag = false;
//        //pool for 60 secs(if mail not received)
//        for (int i = 1; i <= 6; i++) {
//            String text = new ReadMail7UtilForMarketingEmail(getUser()).getSender();
//            System.out.println("This is a sender from mail7.io----->>" + text + "------<");
//            if (text.contains(GlobalVar.data.get("EXPECTED_SENDER"))) {
//                flag = true;
//                break;
//            } else {
//                waitFor();
//            }
//        }
//
//        //validate subject
//        if (flag) {
//            Assert.assertTrue(true, "sender matched");
//        } else {
//            Assert.fail("sender not matched");
//        }
//    }
//    public void sendAndVerifyAPIRequestForDosageReminderEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForDosageReminderEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForDosageReminderEmail().getStatusCode(response);
//        new GetResponseUtilForDosageReminderEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForExpiryReminderEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForExpiryReminderEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForExpiryReminderEmail().getStatusCode(response);
//        new GetResponseUtilForExpiryReminderEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForExpiryReminder7daysEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForExpiryReminder7daysEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForExpiryReminder7daysEmail().getStatusCode(response);
//        new GetResponseUtilForExpiryReminder7daysEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForRefillReminder2daysEmailGeneration() throws InterruptedException, IOException {
//        HttpResponse response = new GetResponseUtilForRefillReminder2daysEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForRefillReminder2daysEmail().getStatusCode(response);
//        new GetResponseUtilForRefillReminder2daysEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForRefillReminder7daysEmailGeneration() throws InterruptedException, IOException {
//        HttpResponse response = new GetResponseUtilForRefillReminder7daysEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForRefillReminder7daysEmail().getStatusCode(response);
//        new GetResponseUtilForRefillReminder7daysEmail().verifyResponseStatus(statusCode);
//
//    }
//
//    public void sendAndVerifyAPIRequestForTransferRequestEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForTransferRequestEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForTransferRequestEmail().getStatusCode(response);
//        new GetResponseUtilForTransferRequestEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForRefillRequestEmailGeneration() throws InterruptedException {
//        HttpResponse response = new GetResponseUtilForRefillRequestEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForRefillRequestEmail().getStatusCode(response);
//        new GetResponseUtilForRefillRequestEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForDeliveryRequestEmailGeneration() throws IOException, InterruptedException {
//        HttpResponse response = new GetResponseUtilForDeliveryRequestEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForDeliveryRequestEmail().getStatusCode(response);
//        new GetResponseUtilForDeliveryRequestEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForOrderReadyForPickupEmailGeneration() throws IOException, InterruptedException {
//        HttpResponse response = new GetResponseUtilForOrderReadyForPickupEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForOrderReadyForPickupEmail().getStatusCode(response);
//        new GetResponseUtilForOrderReadyForPickupEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForPickupReminderEmailGeneration() throws IOException, InterruptedException {
//        HttpResponse response = new GetResponseUtilForPickupReminderEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForPickupReminderEmail().getStatusCode(response);
//        new GetResponseUtilForPickupReminderEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForOrderCancelEmailGeneration() throws IOException, InterruptedException {
//        HttpResponse response = new GetResponseUtilForOrderCancelEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForOrderCancelEmail().getStatusCode(response);
//        new GetResponseUtilForOrderCancelEmail().verifyResponseStatus(statusCode);
//    }
//
//    public void sendAndVerifyAPIRequestForReturnToStockEmailGeneration() throws IOException, InterruptedException {
//        HttpResponse response = new GetResponseUtilForReturnToStockWarningEmail().getAPIResponse();
//        System.out.println("-----------" + response + "-------------");
//        int statusCode = new GetResponseUtilForReturnToStockWarningEmail().getStatusCode(response);
//        new GetResponseUtilForReturnToStockWarningEmail().verifyResponseStatus(statusCode);
//    }

    public void openMobileNotificationBar() throws InterruptedException {
        if (GlobalVar.data.get("Banner").equalsIgnoreCase("unitedsupermarkets")) {
            waitForElementToAppear(pharmacyPageElements.pharmacy_Back_To_Grocery_Btn, 40);
            tapElement(pharmacyPageElements.pharmacy_Back_To_Grocery_Btn);
            Dimension size = driver.manage().window().getSize();
            System.out.println("hey hi this is a screen size----->" + size);
            Thread.sleep(3000);
            scroll(0, 0, 1080, 2240);
            Thread.sleep(3000);
        } else {
            Dimension size = driver.manage().window().getSize();
            System.out.println("hey hi this is a screen size----->" + size);
            Thread.sleep(3000);
            scroll(0, 0, 1080, 2240);
            Thread.sleep(3000);
            System.out.println("Notification bar is scrolled to down");
        }
    }

    //    public void ValidateThePushNotification() throws InterruptedException {
//        boolean flag = false;
////pools for 360 seconds
//        for (int i = 1; i <= 10; i++) {
//
//            List<WebElement> all_notifications;
//            all_notifications = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
//            System.out.println("Hey Total number of Notifications are-->" + all_notifications.size());
//            String ExpectedPush = GlobalVar.data.get("ExpectedPushNotification");
//            for (WebElement each_notification : all_notifications)
//            {
//                System.out.println(each_notification.getText());
//                if (each_notification.getText().equalsIgnoreCase(ExpectedPush))
//                {
//                    flag = true;
//                    System.out.println("found push and validated successfully");
//                    break;
//
//                } else
//                {
//                    Thread.sleep(500);
//                }
//            }
//            waitFor();
//        }
//        if (flag)
//        {
//            Assert.assertTrue(true, "Push Notificaion Matched");
//        } else
//        {
//            Assert.fail("Push Notificaion not Matched");
//        }
//        }
//
    public void closeMobileNotificationBar() throws InterruptedException {
        System.out.println("hey i am going to close the Notification bar");
        Thread.sleep(10000);
        scroll(1080, 2240, 0, 0);
        Thread.sleep(10000);
        System.out.println("Closed Notification Bar");
    }
//
    public void validatePushTitle() throws InterruptedException {
        //List<WebElement> allnotifications = driver.findElements(By.xpath("//*[@resource-id='android:id/title']"));
        for (int i = 0; i < 6; i++)
        {
            List<WebElement> allnotifications = driver.findElements(By.xpath("//*[@resource-id='android:id/title']"));
            System.out.println(allnotifications.size());
            //String Result = null;
            if(allnotifications.size()>4)
            {
                for (WebElement single_notification : allnotifications)
                {
                    String firstNotification = single_notification.getText();
                    firstNotification = firstNotification.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                    System.out.println(firstNotification);
                    String expected_text = GlobalVar.data.get("EXPECTED_PUSHTITLE");
                    expected_text = expected_text.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                    if (firstNotification.contains(expected_text))
                    {
                        //Result ="Pass";
                        break;
                    } else
                    {
                        System.out.println("didnt found expected push yet");
                    }

                }
            }
            else
            {
                waitForNotification();
            }
//            if(Result.equalsIgnoreCase("Pass"))
//            {
//               break;
//            }
//            else {
//               System.out.println("Waiting for the Push Notification");
//            }
        }

    }

    //
//
    private void waitForNotification()
    {
        try {
            Thread.sleep(50000);
            System.out.println("Waited for some time and continued....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //
//    public void validatePushBody(ArrayList<String> bodyTextArr) {
//        System.out.println("........" + bodyTextArr + "........");
//        boolean flag = false;
//        for (int i = 0; i < 10; i++)
//        {
//            //String username = GlobalVar.data.get("USER");
//            //List<WebElement> allnotifications=driver.findElements(By.xpath("//*[@resource-id='android:id/title']"));
//            //here code need to be changed according to the xpath---
//            String firstNotification = driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[14]")).getText();
//            System.out.println(firstNotification);
//            //String body = new ReadMail7UtilForMarketingEmail(username).getMailBody();
//            String actual_text = firstNotification.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
//            System.out.println("this is a actual text for the push body--------->"+actual_text);
//            for (String expected_text : bodyTextArr)
//            {
//                expected_text = expected_text.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
//
//                if (actual_text.contains(expected_text))
//                {
//                    flag = true;
//                    break;
//                }
//                else
//                {
//                    waitForNotification();
//                }
//            }
//            //System.out.println("*****************" + body + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//
//        }
//        if (flag) {
//            Assert.assertTrue(true, "body matched");
//        } else {
//            Assert.fail("body not matched with actual text:");
//        }
//
//    }
//
    public void validatebodyofPush()
    {
        boolean flag = false;
        String Expected_pushBody = GlobalVar.data.get("EXPECTED_PUSHBODY");
        for (int i=0;i<6; i++)
        {
            List<WebElement> allNotificationsbody = driver.findElements(By.xpath("//*[@resource-id=\"android:id/text\"]"));
            String result = null;
            for (WebElement singleNotificationbody : allNotificationsbody)
            {
                Expected_pushBody = Expected_pushBody.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                System.out.println("This is a Expected notification from data file--" + Expected_pushBody + "-----");
                String Actual_Notification = singleNotificationbody.getText();
                Actual_Notification = Actual_Notification.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                System.out.println("This is a actual notification from screen--" + Actual_Notification + "-----");
                if (Actual_Notification.contains(Expected_pushBody))
                {
                    result = "Pass";
                    flag = true;
                    break;
                }
                else
                {
                    result ="Fail";
                    System.out.println("Waiting for the Notification");
                }

            }
            if (result != null && result.contains("Pass")) {
                break;
            }
        }
        if (flag)
        {
            Assert.assertTrue(true, "body matched");
        }
        else
        {
            Assert.fail("body not matched with actual text:");
        }
    }
}
//        //from udemy Rahulshetty academy...
////        WebElement element = driver.findElement(By.name("Element Name"));
////        HashMap<String, String> arguments = new HashMap<String, String>();
////        arguments.put("element", element.getId());
////        //(JavascriptExecutor)driver.executeScript("mobile: scrollTo", arguments);
////        driver.executeScript("mobile: scrollTo",arguments);
//
//    }
//}
//
//
