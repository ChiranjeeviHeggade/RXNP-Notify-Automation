package com.automation.pages;

import com.automation.mobile.util.GlobalVar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import java.util.ArrayList;
public class Pharmacy_SMSPage  {
    private static WebDriver driver;
    public Pharmacy_SMSPage(WebDriver driver) {
        //this.driver = (RemoteWebDriver) baseBrowser.webDriver;
        //smsPage=new SMSPage(this.driver);
        Pharmacy_SMSPage.driver= driver;
    }

    public void launchsmswebsite() {

        String URL = GlobalVar.data.get("SMSWEBSITE");
        navigateToUrl(URL);
        //driver.get(URL);
    }
    private static void  navigateToUrl(String URL){
        System.out.println("Navigate to: " + URL);

        driver.navigate().to(URL);
        String title=driver.getTitle();
        System.out.println("*****************"+title+"***");
    }

    public void refreshallMessages() {
        WebElement refreshallmessages = driver.findElement(By.xpath("//a[normalize-space()='Update latest sms']"));
        //scrollDownForElement(refreshallmessages);
        driver.findElement(By.xpath("//a[normalize-space()='Update latest sms']")).click();
    }

    public String ValidatetheSMS(ArrayList<String> bodyTextArr) throws InterruptedException {
        boolean flag = false;
        String Result = null;
        for (int i = 1; i <= 5; i++)
        {
            WebElement allsms = driver.findElement(By.xpath("(//td[@class='table-panel__message'])" + "[" + i + "]"));
            String body = allsms.getText();
            String actual_text = body.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
            for (String expected_text : bodyTextArr) {
                expected_text = expected_text.trim().replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                if (actual_text.contains(expected_text))
                {
                    Result="Pass";
                    flag = true;
                    break;
                } else
                {
                    Thread.sleep(1000);
                }
            }

        }
      if(flag)
      {
          Assert.assertTrue(true,"Validated SMS Pass");
      }
        return Result;
    }
}


