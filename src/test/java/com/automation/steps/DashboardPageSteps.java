package com.automation.steps;


import com.automation.EmailAPIUtils.ReadMail7UtilForMarketingEmail;
import com.automation.mobile.util.GlobalVar;
import io.cucumber.java.en.When;
//import com.automation.steps.BaseBrowser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import tech.grasshopper.pdf.section.dashboard.Dashboard;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

//import static com.digital.ui.pages.GroceryLogin.driver;


public class DashboardPageSteps {
    //public static WebDriver driver;
    //public static RemoteWebDriver driver;
    public static WebDriver driver;
    public Dashboard dashboard;
    // public GuestUserValidationPage guestUserValidationPage;
    //public TransferRxPage transferRxPage;

    public DashboardPageSteps(BaseBrowser baseBrowser) {
        //driver = (RemoteWebDriver) baseBrowser.webDriver;
        driver = baseBrowser.webDriver;

    }

    private static void navigateToUrl(String URL1) {
        System.out.println("Navigate to: " + URL1);

        driver.navigate().to(URL1);
        String title = driver.getTitle();
        System.out.println("*****************" + title + "***");
    }

    private static void LaunchBrowserWithApplication() {
        navigateToUrl("https://anonymsms.com/number/16464274169/");
    }

    @When("user launches the website for SMS SERVER")
    public void userLaunchesTheWebsiteForSMSSERVER() {
        DashboardPageSteps dp = new DashboardPageSteps(new BaseBrowser());
        System.out.println("Hiiiii i m here with Bhagya");
        LaunchBrowserWithApplication();
        //driver.navigate().to("https://anonymsms.com/number/16464274169/");
    }
//    @Given("User is logged in and navigated to pharmacy landing page")
//    public void userIsLoggedInAndNavigatedToPharmacyLandingPage() throws Exception {
//        if (TestDataProvider.TestData.URL1.val().equalsIgnoreCase("https://www-qa2.unitedsupermarkets.com/"))
//        {
    //           LaunchBrowserWithApplication();
//            dashboard.GroceryLogin();
//            dashboard.Click_on_Login();
//            dashboard.callLoginEmailApiAndReturnOTP();
//            dashboard.enterLoginOtp();
//            dashboard.EnterCredentials();
//            dashboard.ClickSignIn();
//            dashboard.Continue();
//            dashboard.Click_on_Login();
//            dashboard.First_pin();
//            dashboard.Second_pin();
//            dashboard.Third_pin();
//            dashboard.Fourth_pin();
//        } else {
//            LaunchBrowserWithApplication();
//            dashboard.select_Login();
//            //dashboard.VerifyBannerLogo();
//            dashboard.EnterCredentials();
//            dashboard.ClickSignIn();
//            dashboard.Continue();
//            dashboard.Click_on_Login();
//            dashboard.First_pin();
//            dashboard.Second_pin();
//            dashboard.Third_pin();
//            dashboard.Fourth_pin();
//        }
//    }
//    @Given("User is logged in for Vaccine Record and navigated to pharmacy landing page")
//    public void userIsLoggedInForVaccineAndNavigatedToPharmacyLandingPage() throws Exception {
//        LaunchBrowserWithApplication();
//        dashboard.select_Login();
//        dashboard.VerifyBannerLogo();
//        dashboard.EnterCredentialsForVaccination();
//        dashboard.ClickSignIn();
//        dashboard.Continue();
//        dashboard.Click_on_Login();
//        dashboard.First_pin();
//        dashboard.Second_pin();
//        dashboard.Third_pin();
//        dashboard.Fourth_pin();
//    }
//    @Given("User is logged in with new User and navigated to pharmacy landing page")
//    public void userIsLoggedInWithNewUserAndNavigatedToPharmacyLandingPage() throws Exception {
//        LaunchBrowserWithApplication();
//        dashboard.select_Login();
//        dashboard.EnterNewUserCredentials();
//        dashboard.ClickSignIn();
//        dashboard.Continue();
//        dashboard.Click_on_Login();
//        dashboard.First_pin();
//        dashboard.Second_pin();
//        dashboard.Third_pin();
//        dashboard.Fourth_pin();
//    }
//    @Then("user is on pharmacy Landing page")
//    public void userIsOnPharmacyLandingPage() throws InterruptedException {
//        dashboard.VerifyDashboard();
//    }
//    @Then("user is on pharmacy Landing page and wait for Session TimeOut Pop Up")
//    public void userIsOnPharmacyLandingPageAndSessionTimeOutPopUp() throws InterruptedException {
//        dashboard.VerifySessionExpirationPopUp();
//        dashboard.First_pin();
//        dashboard.Second_pin();
//        dashboard.Third_pin();
//        dashboard.Fourth_pin();
//        dashboard.VerifyDashboard();
//    }
//    @And("user login to Pharmacy with auth user using test bed")
//    public void userLoginToPharmacyWithAuthUserUsingTestBed() throws Exception {
//        LaunchBrowserWithApplication();
//        dashboard.select_Login();
//        dashboard.VerifyBannerLogo();
//        dashboard.enterEmailFromTestBed();
//        dashboard.ClickSignIn();
//        dashboard.Continue();
//        dashboard.Click_on_Login();
//        dashboard.First_pin();
//        dashboard.Second_pin();
//        dashboard.Third_pin();
//        dashboard.Fourth_pin();
//    }
//    @Then("Verify dashboard component for minor profile")
//    public void verifyDashboardComponentForMinorProfile() throws InterruptedException {
//        dashboard.VerifyDependentsDashboard();
//
//    }
//    @And("user click on Auth Pet Care")
//    public void userClickOnAuthPetCare() throws InterruptedException {
//        guestUserValidationPage.ClickOnAuthPetCareAndVerify();
//    }
//    @And("User click on Auth My Vaccine Record")
//    public void userClickOnAuthMyVaccineRecord() throws InterruptedException {
//        guestUserValidationPage.ClickOnAuthMyVaccineAndVerify();
//    }
//    @Given("Verify login flow by validating the different links")
//    public void verifyLoginFlowByValidatingTheDifferentLinks() throws Exception {
//        LaunchBrowserWithApplication();
//        dashboard.select_Login();
//        dashboard.VerifyBannerLogo();
//        dashboard.VerifyLinksPresentOnPage();
//        dashboard.EnterCredentials();
//        dashboard.ClickSignIn();
//        dashboard.SomeoneElsePage();
//        dashboard.Continue();
//        dashboard.Click_on_Login();
//        dashboard.VerifyPinPage();
//        dashboard.First_pin();
//        dashboard.Second_pin();
//        dashboard.Third_pin();
//        dashboard.Fourth_pin();
//    }
//    @Then("User is on pharmacy Landing page and verify components of Caregiver dashboard")
//    public void userIsOnPharmacyLandingPageAndVerifyComponentsCaregiverDashboardPage() throws InterruptedException {
//        dashboard.VerifyCaregiversDashboard();
//    }
//    @Then("verify that Add profile Notification card should not be present on dashboard")
//    public void AddProfileNotificationCardShouldNotBePresentOnDashboard() throws InterruptedException {
//        dashboard.VerifyAddProfileNotificationCard();
//    }
//    @Given("Semi auth User is logged in and navigated to pharmacy landing page")
//    public void semiAuthUserIsLoggedInAndNavigatedToPharmacyLandingPage() throws Exception {
//        LaunchBrowserWithApplication();
//        dashboard.select_Login();
//        dashboard.VerifyBannerLogo();
//        dashboard.EnterCredentialsForSemiAuth();
//        dashboard.ClickSignIn();
//        dashboard.Continue();
//        dashboard.Click_on_Login();
//        dashboard.First_pin();
//        dashboard.Second_pin();
//        dashboard.Third_pin();
//        dashboard.Fourth_pin();
//    }
//    @Given("validate the All components presents on SemAuth Dashboard page")
//    public void validateTheAllComponentsPresentsOnSemAuthDashboardPage() throws InterruptedException {
//        dashboard.VerifySemiAuthDashboard();
//    }
//    @When("Navigate to pharmacy dashboard page")
//    public void launchThePharmacyDashboardPage() {
//        driver.navigate().to("https://www-qa2.randalls.com/health/pharmacy/dashboard");
//    }


    //new code for Email link validation
    public static void ValidateTheLinks() throws InterruptedException, FileNotFoundException, UnsupportedEncodingException {
        //WebDriver driver2 = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        //RemoteWebDriver driver2 = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\basagouda.patil\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        //RemoteWebDriver driver2 = new ChromeDriver(options);
        WebDriver driver2 = new ChromeDriver(options);
        String username = GlobalVar.data.get("USER");
        String body = new ReadMail7UtilForMarketingEmail(username).getMailBody();

        Document html = Jsoup.parse(body);


        Elements allElements = html.getElementsByAttribute("href");
        System.out.println(allElements.size());
        for (int i = 1; i <= 7; i++)
        {
            //String e = allElements.get(i).getAllElements().eachAttr("href").toString();
            String e=allElements.get(i).attr("href").toString();
            System.out.println(e);
            //System.out.println(allElements.get(i).getAllElements().eachAttr("href").size()+"///////////");
            driver2.get(e);
            Thread.sleep(5000);
            String Actual_Title = driver2.getTitle();
            Actual_Title = Actual_Title.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "").replaceAll("[\\s\\u00A0]+$","");
            System.out.println("This is Actual Title"+Actual_Title);
            int value = i;
            switch (value)
            {
                case 1:
                    String EXPECTED_TITLE1 = GlobalVar.data.get("EXPECTED_TITLE1");
                    EXPECTED_TITLE1 = EXPECTED_TITLE1.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                    System.out.println("This is a Expected Title"+EXPECTED_TITLE1);
                    if (Actual_Title.contains(EXPECTED_TITLE1))
                    {
                        System.out.println("Actual Title matched with Expected");
                    }
                    else {
                        System.out.println("Actual Title doesnt matched with Expected");
                    }
                    break;
                case 2:
                    String EXPECTED_TITLE2 = GlobalVar.data.get("EXPECTED_TITLE2");
                    EXPECTED_TITLE2 = EXPECTED_TITLE2.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                    System.out.println("This is a Expected Title"+EXPECTED_TITLE2);
                    if (Actual_Title.contains(EXPECTED_TITLE2)) {
                        System.out.println("Actual Title matched with Expected");
                    } else {
                        System.out.println("Actual Title doesnt matched with Expected");
                    }
                    break;
                case 3:
                    String EXPECTED_TITLE3 = GlobalVar.data.get("EXPECTED_TITLE3");
                    EXPECTED_TITLE3 = EXPECTED_TITLE3.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                    System.out.println("This is a Expected Title"+EXPECTED_TITLE3);
                    if (Actual_Title.contains(EXPECTED_TITLE3)) {
                        System.out.println("Actual Title matched with Expected");
                    } else {
                        System.out.println("Actual Title doesnt matched with Expected");
                    }
                    break;
                case 4:
                    String EXPECTED_TITLE4 = GlobalVar.data.get("EXPECTED_TITLE4");
                    EXPECTED_TITLE4 = EXPECTED_TITLE4.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                    System.out.println("This is a Expected Title"+EXPECTED_TITLE4);
                    if (Actual_Title.contains(EXPECTED_TITLE4)) {
                        System.out.println("Actual Title matched with Expected");
                    } else {
                        System.out.println("Actual Title doesnt matched with Expected");
                    }
                    break;
                case 5:
                    String EXPECTED_TITLE5 = GlobalVar.data.get("EXPECTED_TITLE5");
                    EXPECTED_TITLE5 = EXPECTED_TITLE5.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                    System.out.println("This is a Expected Title"+EXPECTED_TITLE5);
                    if (Actual_Title.contains(EXPECTED_TITLE5)) {
                        System.out.println("Actual Title matched with Expected");
                    } else {
                        System.out.println("Actual Title doesnt matched with Expected");
                    }
                    break;
                case 6:
                    String EXPECTED_TITLE6 = GlobalVar.data.get("EXPECTED_TITLE6");
                    EXPECTED_TITLE6 = EXPECTED_TITLE6.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                    System.out.println("This is a Expected Title"+EXPECTED_TITLE6);
                    if (Actual_Title.contains(EXPECTED_TITLE6)) {
                        System.out.println("Actual Title matched with Expected");
                    } else {
                        System.out.println("Actual Title doesnt matched with Expected");
                    }
                    break;
                case 7:
                    String EXPECTED_TITLE7 = GlobalVar.data.get("EXPECTED_TITLE7");
                    EXPECTED_TITLE7 = EXPECTED_TITLE7.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
                    System.out.println("This is a Expected Title"+EXPECTED_TITLE7);
                    if (Actual_Title.contains(EXPECTED_TITLE7)) {
                        System.out.println("Actual Title matched with Expected");
                    } else {
                        System.out.println("Actual Title doesnt matched with Expected");
                    }
                    break;
//                case 8:
//                    String EXPECTED_TITLE8 = GlobalVar.data.get("EXPECTED_TITLE8");
//                    EXPECTED_TITLE8 = EXPECTED_TITLE8.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "");
//                    System.out.println("This is a Expected Title"+EXPECTED_TITLE8);
//                    if (Actual_Title.contains(EXPECTED_TITLE8)) {
//                        System.out.println("Actual Title matched with Expected");
//                    } else {
//                        System.out.println("Actual Title doesnt matched with Expected");
//                    }
//                    break;

            }
        }
        System.out.println("Completed with Link Validations");
        driver2.close();
    }
}
//        for(Element eachElement:allElements)
//        {
//            System.out.println(eachElement);
//            //String links= String.valueOf(eachElement.getElementsByTag("href"));
//            //String links= String.valueOf(eachElement.getElementsByAttribute("href"));
//            List<String> links= eachElement.getAllElements().eachAttr("href");
//            //String links= String.valueOf(eachElement.selectFirst("//a"));
//           System.out.println("hey this is here..............");
//           System.out.println(links);
//           for(String link:links) {
//               driver2.get(link);
//               System.out.println("below is the title of the page");
//               System.out.println(driver2.getTitle());
//           }
//        }


            //String BAP=list3.html();
            // System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%"+list+"%%%%%%%%%%%%%");
            //Element list3 = html.selectFirst("//table[@class='mail-social-links']/tbody/tr/td/a");
//            Elements list = html.body().select("//table[@class='mail-social-links']/tbody/tr/td/a");
//            Elements list2 = html.body().select("(//table[@class='mail-footer']/tbody/tr)[3]/td/table/tbody/tr/td/a");


//            System.out.println("$$$$$$$$" + list + "$$$$$$");
//            //System.out.println(list.size());
//            //Element links = null;

            //List<String> links = null;
            // List<String> titles = null;
            //List<String> titles = null;
//            for (int i = 0; i < list.size(); i++) {
//                List<String> links = list.get(i).getAllElements().eachAttr("href");
//
//                for (String link : links) {
//                    System.out.println("|||" + link + "|||");
//                driver.switchTo().window(WindowType.TAB);
//                driver.switchTo().window(newTab);
                    //((JavascriptExecutor) driver2).executeScript("window.open('https://google.com')");
                    // driver2.switchTo().newWindow(WindowType.TAB);
                    // driver2.switchTo().window();
                    //driver2.switchTo().window()
//                Thread.sleep(5000);
//                    driver2.navigate().to(link);
//                    Thread.sleep(5000);
////
//                    String title = driver2.getTitle();
//                    System.out.println(":::::::::::::::::::" + title + "::::::::::::::::::::::");
                    //String ActualTitle = TestDataProvider.TestData.val("EXPECTED_TITLE" + i + "");
//                assert ActualTitle != null;
//                if (ActualTitle.contains(title)) {
//                    System.out.println("Title matched");
//                } else {
//                    System.out.println("Title didn't matched");
//                }
                    //softAssert.assertEquals(TestDataProvider.TestData.val("EXPECTED_TITLE"+ i + ""),title,"Title matched");
                    //softAssert.assertAll();



//        for (int j = 0; j < list2.size(); j++) {
//            List<String> links2 = list2.get(j).getAllElements().eachAttr("href");
//
//            for (String link2 : links2) {
//
//                System.out.println("|||" + link2 + "|||");
//                driver2.switchTo().newWindow(WindowType.TAB);
//                Thread.sleep(5000);
//                driver2.navigate().to(link2);
//                Thread.sleep(5000);
//
//                String title2 = driver2.getTitle();
//                System.out.println(":::::::::::::::::::" + title2 + "::::::::::::::::::::::");
//                String ActualTitle2 = TestDataProvider.TestData.val("EXPECTED_TITLE_APPS" + j + "");
//                if (title2.equalsIgnoreCase(ActualTitle2)) {
//                    System.out.println("Title matched for Apps");
//                } else {
//                    System.out.println("Title didn't matched for Apps");
//                }
                //softAssert.assertEquals(TestDataProvider.TestData.val("EXPECTED_TITLE"+ i + ""),title,"Title matched");
                //softAssert.assertAll();


////        String Expected_linK = TestDataProvider.TestData.val("EXPECTED_LINK");
//        if (body.contains(Expected_linK)) {
//            System.out.println("Link Present in the body");
//        } else {
//            System.out.println("Link is not Present in the body");
//        }

        //driver2.quit();

//        for(int j=1;j<=titles.size();j++)
//        {
//            SoftAssert softAssert = new SoftAssert();
//            softAssert.assertEquals(TestDataProvider.TestData.val("EXPECTED_TITLE"+ j + ""),titles.get(j),"Title matched");
//            softAssert.assertAll();
//        }
        //System.out.println(titles);
        //Assert.assertEquals(TestDataProvider.TestData.val("EXPECTED_TITLES"),titles);

//         for(int j=1;j<=titles.size();j++)
//         {
//             System.out.println(titles.get(j));
//             Assert.assertEquals(TestDataProvider.TestData.val("EXPECTED_TITLE"+ j + ""),titles.get(j));
//         }


//        List<String> links2 = null;
//        for (int i = 0; i < list2.size(); i++)
//        {
//            links2 = list2.get(i).getAllElements().eachAttr("href");
//            for(String link2: links2)
//            {
//                System.out.println("|||"+link2+"|||");
//                Thread.sleep(5000);
//                driver2.navigate().to(link2);
//                Thread.sleep(5000);
//                String titles2=driver2.getTitle();
//                System.out.println(titles2);
//            }
//        }


        //assert links != null;
//        for(String link: links)
//        {
//              System.out.println("|||"+link+"|||");
//
//              driver.navigate().to(link);
//              driver.getTitle();
//              //String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//              //driver.findElement(By.linkText(link)).sendKeys(selectLinkOpeninNewTab);
//              //String titles=driver.getTitle();
//            //System.out.println("||||||||||"+titles+"|||||||||");
//             // System.out.println("ended successfully");
//        }
//        driver.switchTo().newWindow(WindowType.WINDOW);
//          driver.get("https://www.youtube.com/");
//        System.out.println("ended successfully");


        //Object[] list=html.body().getAllElements().toArray();

//        for(int i=1;i<= list.size();i++)
//        {
//            list.get(i).
//        }

        //ArrayList<String> list = new ArrayList<>(Arrays.asList(tag.split(" ")));
//        String link1=list.get(0);
//        String link="https://"+link1;
//        String link2=list.get(1);
//        System.out.println(link1);
//        System.out.println(link2);


        // LaunchBrowserWithApplication2(link);


        // URL url = new URL(link1);


        //driver.navigate().to(url);

        //DashboardPageSteps dash=new DashboardPageSteps(BaseBrowser baseBrowser);
        //LaunchBrowserWithApplication();
        //LaunchBrowserWithApplication();
        //Link_Validation val =new Link_Validation();


//    }
//}

//    @Given("User is logged in and navigated luma")
//    public void userIsLoggedInAndNavigatedLuma() throws InterruptedException {
//
//        driver.navigate().to("https://magento.softwaretestingboard.com/");
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//        driver.findElement(By.id("email")).sendKeys("Trainingrk@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("Ratesh@123");
//        driver.findElement(By.id("send2")).click();
//        Thread.sleep(2000);
//        WebElement Custname = driver.findElement(By.className("logged-in"));
//        String custname2 = Custname.getText();
//        String custname1 = "Welcome, Ratesh k!";
//        Assert.assertEquals(custname2, custname1);
//        Actions a = new Actions(driver);
//        a.moveToElement(driver.findElement(By.id("ui-id-5"))).build().perform();
//        a.moveToElement(driver.findElement(By.id("ui-id-17"))).build().perform();
//        driver.findElement(By.id("ui-id-22")).click();
//        JavascriptExecutor js= (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,1400)", "");
//        List<WebElement> prods = driver.findElements(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li/div/div/strong/a"));
//        System.out.println(prods.size());
//        String Product = "Tristan Endurance Tank";
//        for ( int i=0; i<prods.size();i++) {
//            String prods1= prods.get(i).getText();
//            if(Product.contains(prods1)) {
//                prods.get(i).click();
//                break;
//            }
//        }
//        Thread.sleep(2000);
//        driver.findElement(By.id("option-label-size-143-item-169")).click();
//        driver.findElement(By.id("option-label-color-93-item-58")).click();
//        driver.findElement(By.id("qty")).sendKeys("2");
//        driver.findElement(By.id("product-addtocart-button")).click();
//        System.out.println(driver.findElement(By.xpath("//div[@role='alert']/div/div")).getText());
//        driver.findElement(By.xpath("//a[.='shopping cart']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("block-discount-heading")).click();
//        driver.findElement(By.id("coupon_code")).sendKeys("Bhagya");
//        driver.findElement(By.xpath("//button[@class='action apply primary']/span")).click();
//        Thread.sleep(2000);
//        System.out.println(driver.findElement(By.xpath("//div[@role='alert']/div/div")).getText());
//
//        driver.findElement(By.id("block-shipping-heading")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.className("select")).click();
//        Thread.sleep(2000);
//        List<WebElement> countrieslist=driver.findElements(By.xpath("//select[@class='select']/option"));
//        Thread.sleep(2000);
//        //System.out.println(countrieslist);
//        for(int i=1;i<countrieslist.size();i++)
//        {
//            if(countrieslist.get(i).getText().equalsIgnoreCase("India"))                    //contains("India"))
//            {
//                driver.findElements(By.xpath("//select[@class='select']/option")).get(i).click();
//                break;
//            }
//        }
//
//        driver.findElement(By.xpath("(//div[@class='control']/select)[2]")).click();
//        Thread.sleep(3000);
//        List<WebElement> statelist=driver.findElements(By.xpath("//select[@id='NXMGBES']/option"));
//        Thread.sleep(2000);
//        for(int i=1;i<statelist.size();i++)
//        {
//            if(statelist.get(i).getText().equalsIgnoreCase("Karnataka"))
//            {
//                driver.findElements(By.xpath("//select[@id='NXMGBES']/option")).get(i).click();
//                break;
//            }
//        }
//        System.out.println("done with the execution");
//            }
//        }

