package com.automation.steps;

import com.automation.mobile.appium.AppiumDevice;
import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.mobile.appium.DesiredCapabilityBuilder;
import com.automation.mobile.entities.CommandArgument;
import com.automation.mobile.entities.MobileConfType;
import com.automation.mobile.manager.DataFileManager;
import com.automation.mobile.util.GlobalVar;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import static com.automation.mobile.appium.AppiumDriverManager.getDriver;

public class Hooks {
    AppiumDevice appiumDevice = AppiumDeviceManager.getDevice();

    @Before
    public void before(Scenario scenario) throws IOException {

        System.out.println("**************hooks*********************" + Thread.currentThread().getId());
        System.out.println(appiumDevice);

        if (appiumDevice == null) {
            synchronized (GlobalVar.DEVICE_LIST) {
                for (String mobile : GlobalVar.DEVICE_LIST.keySet()) {
                    Map<String, String> tempMap = GlobalVar.DEVICE_LIST.get(mobile);
                    if (tempMap.get("STATE").equalsIgnoreCase("available")) {
                        tempMap.put("STATE", "BUSY");
                        System.out.println(GlobalVar.DEVICE_LIST);
                        //create appium device
                        appiumDevice = new AppiumDevice(tempMap);
                        AppiumDeviceManager.setDevice(appiumDevice);

                        if(!System.getProperty(CommandArgument.TEST_TYPE).contains("APIRunner")) {
                            //create desired capability
                            DesiredCapabilityBuilder.buildDesiredCapability(appiumDevice);
                            System.out.println(appiumDevice);
                            System.out.println(Thread.currentThread().getId());
                            //create appium server

                            AppiumDriver appiumDriver = new AppiumDriverManager().
                                    initializeDriver(new URL(appiumDevice.getConfigureData(MobileConfType.APPIUM_SERVER)),
                                            DesiredCapabilityBuilder.getDesiredCapability());
                            AppiumDriverManager.setDriver(appiumDriver);

                        }
                        System.out.println(Thread.currentThread().getId());
                        break;




                    }
                }
            }
        }


        String strScenario = scenario.getUri().toString();
        String[] path = (strScenario.split("/"));
        String strFeature = path[path.length - 1];
        int end = strFeature.indexOf(".");
        String featureName = strFeature.substring(0, end);
        System.out.println("featureName =" + featureName);

        try {
            DataFileManager dataFileManager = new DataFileManager(featureName, appiumDevice);
            dataFileManager.read();
            GlobalVar.data = dataFileManager.getTestCaseData();
        } catch (Exception e) {
            System.out.println("No data file found!");
        }
//        synchronized (appiumDevice) {
//            Reporter.assignAuthor(AppiumDeviceManager.getDevice().getConfigureData(MobileConfType.DEVICE_NAME)
//                    + "( " + AppiumDeviceManager.getDevice().getConfigureData(ConfigType.BANNER) + " )");
//            Reporter.assignAuthor(AppiumDeviceManager.getDevice().getConfigureData(MobileConfType.PLATFORM_NAME).toLowerCase());
//            Reporter.assignAuthor(AppiumDeviceManager.getDevice().getConfigureData(ConfigType.BANNER));
//        }
        if(!System.getProperty(CommandArgument.TEST_TYPE).contains("APIRunner")) {
            getDriver().
                    launchApp();
        }

    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        if(!System.getProperty(CommandArgument.TEST_TYPE).contains("APIRunner")) {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
            getDriver().closeApp();
        }
    }
}