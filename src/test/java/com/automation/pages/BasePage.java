//package com.automation.pages;
//
//import com.automation.mobile.appium.AppiumDevice;
//import com.automation.mobile.appium.AppiumDeviceManager;
//import com.automation.mobile.entities.CommandArgument;
//import com.automation.mobile.helpers.AppRelaunchHelper;
//import com.automation.mobile.manager.ConfigFileManager;
//import com.automation.mobile.util.CommonActions;
//import com.automation.mobile.util.GlobalVar;
//import com.automation.mobile.util.TapAction;
//import com.automation.mobile.util.WaitAction;
//import com.google.common.collect.ImmutableMap;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.touch.TapOptions;
//import io.appium.java_client.touch.WaitOptions;
//import io.appium.java_client.touch.offset.ElementOption;
//import io.appium.java_client.touch.offset.PointOption;
//import org.apache.commons.lang.RandomStringUtils;
//import org.openqa.selenium.*;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import javax.naming.Context;
//import java.io.IOException;
//import java.time.Duration;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.*;
//import java.util.function.Function;
//
//import static io.appium.java_client.touch.WaitOptions.waitOptions;
//import static io.appium.java_client.touch.offset.PointOption.point;
//import static java.time.Duration.ofMillis;
//
//public class BasePage {
//    private final int APP_BACKGROUND_TIME = 5;
//    private final int WAIT_FOR_ELEMENT_TIMEOUT = 10;
//
//    public AppiumDriver driver;
//    public WebDriverWait waitVar;
//    public String platformName;
//    private final AppRelaunchHelper appRelaunchHelper;
//    public Map<String, String> data;
//
//    public BasePage(AppiumDriver driver) {
//        this.driver = driver;
//        this.data = new GlobalVar().data;
//        this.waitVar = new WebDriverWait(driver, 10);
//        this.platformName = driver.getPlatformName().toLowerCase();
//        appRelaunchHelper = new AppRelaunchHelper(driver);
//    }
//
//    public Map<String, String> getBannerPropertiesMap() throws IOException {
//        String banner = getCurrentBanner();
//        String env = getCurrentEnv();
//        Map<String, String> bannerProperties = ConfigFileManager.getBannerPropertyMap(banner, env);
//        return bannerProperties;
//    }
//
//    public void ResetAppOnce() {
//
//        driver.closeApp();
//        driver.resetApp();
//        try {
//
//            driver.runAppInBackground(Duration.ofSeconds(20));
//        } catch (Exception e) {
//        }
//    }
//
//    public void RestartAppOnce() {
//        driver.closeApp();
//
//        try {
//            driver.runAppInBackground(Duration.ofSeconds(20));
//        } catch (Exception e) {
//        }
//    }
//
//    public void multipleScrollDown(int noOfScoroll) {
//        for (int i=0;i<noOfScoroll;i++){
//            int pressX = driver.manage().window().getSize().width / 2;
//            int bottomY = driver.manage().window().getSize().height * 2 / 5;
//            int topY = driver.manage().window().getSize().height / 4;
//            scroll(pressX, bottomY, pressX, topY);
//        }
//    }
//
//    public void navigateBack() {
//        driver.navigate().back();
//    }
//
//    public boolean textDisplayed(String text) {
//        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
//            waitVar.until(ExpectedConditions.presenceOfElementLocated(MobileBy.name(text)));
//            return true;
//        } else if (driver.getPlatformName().equalsIgnoreCase("android")) {
//            String textNew = text.substring(0, 1).toUpperCase() + text.substring(1);
//            String selector = "new UiSelector().textContains(" + "\"" + textNew + "\"" + ")";
//            waitVar.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(selector)));
//            return true;
//        }
//        return false;
//    }
//
//    public boolean containTextDisplayed(String text) {
//        new WaitAction(driver).waitForLoadingComplete();
//        WebElement element;
//        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
//            String iosText = " label CONTAINS " + "'" + text + "'";
//            element = waitVar.until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString(iosText)));
//
//            if (element.isDisplayed()) return true;
//            else return false;
//
//
//        } else {
//            String selector = "new UiSelector().textContains(" + "\"" + text + "\"" + ")";
//            element = waitVar.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(selector)));
//            if (element.isDisplayed()) return true;
//            else return false;
//        }
//    }
//
//    public void enterMobileNumber(MobileElement element, String keyValue) {
//        element.click();
//        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
//
//            try {
//                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
//                    Thread.sleep(1000);
//                } else {
//                    Thread.sleep(1500);
//                }
//                TouchAction action = new TouchAction(driver);
//                action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
//                element.sendKeys(Keys.DELETE);
//                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
//                    Thread.sleep(500);
//                } else {
//                    Thread.sleep(1000);
//                }
//                element.sendKeys(keyValue + "\n");
//            } catch (InterruptedException e) {
//                // do nothing
//            }
//        } else {
//            element.clear();
//            element.sendKeys(keyValue);
//
//        }
//    }
//
//    public void waitForTextPresentInElement(MobileElement element, String text) {
//        waitVar.until(ExpectedConditions.textToBePresentInElement(element, text));
//    }
//
//    public void waitForElementToBeClickable(MobileElement element, int secondsToWait) {
//        try {
//            new FluentWait<>(driver).withTimeout(Duration.ofSeconds(secondsToWait)).pollingEvery(Duration.ofMillis(250)).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(element));
//        } catch (TimeoutException te) {
//            // Do nothing
//        }
//    }
//
//    public void waitForLoaderToDisappear() {
//        try {
//            if (driver.getPlatformName().equalsIgnoreCase("android")) {
//                waitForElementToDisappear((MobileElement) driver.findElement(By.className("android.widget.ProgressBar")), 60);
//            } else {
//                waitForElementToDisappear((MobileElement) driver.findElement(By.id("In progress")), 60);
//            }
//        } catch (NoSuchElementException e) {
//            return;
//        }
//    }
//
//    public void waitForElementToDisappear(MobileElement ele, int waitTime) {
//        for (int i = 0; i < waitTime; i++) {
//            try {
//                WebDriverWait wait = new WebDriverWait(driver, 1);
//                wait.until(ExpectedConditions.visibilityOf(ele));
//
//            } catch (TimeoutException | StaleElementReferenceException | NoSuchElementException e) {
//                return;
//            }
//        }
//    }
//
//
//    public void clickContainsTextOnScreen(String arg0) {
//        if (driver.getPlatformName().equalsIgnoreCase("android")) {
//            String text = "new UiSelector().text(\"" + arg0 + "\")";
//            scrollDownForElement(driver.findElement(MobileBy.AndroidUIAutomator(text)));
//            new CommonActions(driver).new ClickAction().clickElement(driver.findElement(MobileBy.AndroidUIAutomator(text)));
//        } else {
//            scrollDownForElement(driver.findElementByName(arg0));
//            new CommonActions(driver).new ClickAction().clickElement(driver.findElementByName(arg0));
//        }
//    }
//
//    public void clickTextOnScreen(String arg0) {
//        if (driver.getPlatformName().equalsIgnoreCase("android")) {
//            String text = "new UiSelector().text(\"" + arg0 + "\")";
//            scrollDownForElement(driver.findElement(MobileBy.AndroidUIAutomator(text)));
//            new CommonActions(driver).new ClickAction().clickElement(driver.findElement(MobileBy.AndroidUIAutomator(text)));
//        } else {
//            scrollDownForElement(driver.findElementByName(arg0));
//            new CommonActions(driver).new ClickAction().clickElement(driver.findElementByName(arg0));
//        }
//    }
//
//    public void enterKey(MobileElement element, String keyValue) {
//        element.click();
//        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
//
//            try {
//                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
//                    Thread.sleep(1000);
//                } else {
//                    Thread.sleep(1500);
//                }
//                TouchAction action = new TouchAction(driver);
//                action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
//                element.sendKeys(Keys.DELETE);
//                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
//                    Thread.sleep(500);
//                } else {
//                    Thread.sleep(1000);
//                }
//                element.sendKeys(keyValue + "\n");
//            } catch (InterruptedException e) {
//                // do nothing
//            }
//        } else {
//            element.clear();
//            element.sendKeys(keyValue);
//
//            try {
//
//                try {
//
//                    if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("local")) {
//                        Thread.sleep(1000);
//                        Actions action = new Actions(driver);
//                        action.sendKeys(Keys.ENTER).perform();
//
//                    } else {
//                        Map<String, Object> EnterKeyEvent = new HashMap<>();
//                        EnterKeyEvent.put("key", "66");
//                        driver.executeScript("mobile:key:event", EnterKeyEvent);
//
//                    }
//                } catch (InterruptedException e) {
//
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//
//    // Method to tap on search or enter(next) on keyboard for android
//    public void tapSearchEnterAndroid() {
//        int height = driver.findElement(By.xpath("//*[contains(@resource-id,'action_bar_root')]")).getSize().getHeight();
//        int width = driver.findElement(By.xpath("//*[contains(@resource-id,'action_bar_root')]")).getSize().getWidth();
//
//        int searchX = driver.findElement(By.xpath("//*[contains(@resource-id,'action_bar_root')]")).getLocation().getX() + width - 10;
//        int searchY = driver.findElement(By.xpath("//*[contains(@resource-id,'action_bar_root')]")).getLocation().getY() + height - 15;
//
//        TouchAction touchAction = new TouchAction(driver);
//        touchAction.tap(PointOption.point(searchX, searchY)).perform();
//    }
//
//    public String getTextFromTextField(MobileElement element) {
//        String val = "";
//        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
//            TouchAction action = new TouchAction(driver);
//            action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
//            driver.findElement(By.name("Copy")).click();
//            val = ((IOSDriver) driver).getClipboardText();
//            //val= ((HasClipboard) driver).getClipboardText();
//
//
//        }
//        return val;
//    }
//
//    public void searchProductByOS(MobileElement element, MobileElement element2, String keyValue) {
//
//        switch (driver.getPlatformName().toUpperCase()) {
//            case "ANDROID":
//                enterTextNoPressEnter(element, keyValue);
//                new TapAction(driver).tapSearchEnterAndroid();
//                // I use Element2 for "x" in search bar element
//                if (isElementDisplayed(element2, 2)) {
//                    enterTextNoPressEnter(element, keyValue);
//                    // This is for different keyboard
//                    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
//                }
//                break;
//            case "IOS":
//                enterKey(element, keyValue);
//                break;
//        }
//    }
//
//    public void enterTextNoPressEnter(MobileElement element, String keyValue) {
//        element.click();
//        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
//            try {
//                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
//                    Thread.sleep(1000);
//                } else {
//                    Thread.sleep(1500);
//                }
//                TouchAction action = new TouchAction(driver);
//                action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
//                element.sendKeys(Keys.DELETE);
//                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
//                    Thread.sleep(1000);
//                } else {
//                    Thread.sleep(1500);
//                }
//                element.sendKeys(keyValue);
//            } catch (InterruptedException e) {
//                // do nothing
//            }
//        } else {
//            scrollDown();
//            element.sendKeys(keyValue);
//        }
//    }
//
//
//    public void scrollDown() {
//        if (driver.getPlatformName().equalsIgnoreCase("android")) {
//            int pressX = driver.manage().window().getSize().width / 3;
//            int bottomY = (driver.manage().window().getSize().height * 2) / 3;
//            int topY = driver.manage().window().getSize().height / 4;
//            scroll(1, bottomY, 1, topY);
//        } else {
//            int pressX = driver.manage().window().getSize().width / 3;
//            int bottomY = (driver.manage().window().getSize().height * 3) / 4;
//            int topY = driver.manage().window().getSize().height / 2;
//            scroll(1, bottomY, 1, topY);
//        }
//    }
//
//    public void scrollUp() {
//        Dimension size = driver.manage().window().getSize();
//        int starty = size.height / 3;
//        int endy = (size.height * 5) / 6;
//        int startx = size.width / 2;
//
//        // Swipe from Bottom to Top
//        TouchAction touchAction = new TouchAction(driver);
//        touchAction.longPress(PointOption.point(10, starty)).moveTo(PointOption.point(10, endy)).release().perform();
//    }
//
//    public void scrollDownForDeliverySlot() {
//        if (driver.getPlatformName().equalsIgnoreCase("android")) {
//            int pressX = driver.manage().window().getSize().width / 3;
//            int bottomY = (int) (driver.manage().window().getSize().height / 1.5);
//            int topY = (int) (driver.manage().window().getSize().height / 1.7);
//            scroll(pressX, bottomY, pressX, topY);
//        } else {
//            int pressX = driver.manage().window().getSize().width / 2;
//            int bottomY = driver.manage().window().getSize().height * 2 / 5;
//            int topY = driver.manage().window().getSize().height / 8;
//            scroll(pressX, bottomY, pressX, topY);
//        }
//    }
//
//    public void scrollDown(int count) {
//        for (int i = 0; i < count; i++) {
//            int pressX = driver.manage().window().getSize().width / 2;
//            int bottomY = driver.manage().window().getSize().height * 2 / 5;
//            int topY = driver.manage().window().getSize().height / 8;
//            scroll(1, bottomY, 1, topY);
//        }
//    }
//
//    public void popUpScrollDown(int count) {
//        for (int i = 0; i < count; i++) {
//            int pressX = driver.manage().window().getSize().width / 2;
//            int bottomY = driver.manage().window().getSize().height * 2 / 5;
//            int topY = driver.manage().window().getSize().height / 8;
//            scroll(10, bottomY, 10, topY);
//        }
//    }
//
//    public void swipeLeft() {
////        int fromX = driver.manage().window().getSize().width * 2 / 4;
////        int toX = driver.manage().window().getSize().width / 10;
////        int fromY = driver.manage().window().getSize().height / 2;
////        scroll(fromX, fromY, toX, fromY);
//        int rightX = driver.manage().window().getSize().width / 2;
//        int pressY = driver.manage().window().getSize().height / 3;
//        int LeftX = driver.manage().window().getSize().height / 9;
//        System.out.println(rightX + " : " + pressY + " : " + LeftX + " : " + pressY);
//        scroll(rightX, pressY, LeftX, pressY);
//    }
//
//    public void swipeRightAHK2Fit() {
//        int rightX = 150;
//        int LeftX = 100;
//        scroll(rightX, 600, LeftX, 600);
//    }
//
//    public void swipeRightMonthlyTile() {
//        int rightX = 120;
//        int LeftX = 100;
//        scroll(rightX, 600, LeftX, 600);
//    }
//
//    public void swipeLeftFit2AHK() {
//        int rightX = 100;
//        int LeftX = 150;
//        scroll(rightX, 600, LeftX, 600);
//    }
//
//    public void scrollTop() {
//        int pressX = driver.manage().window().getSize().width / 2;
//        int bottomY = driver.manage().window().getSize().height * 4 / 5;
//        int topY = driver.manage().window().getSize().height / 8;
//        scroll(pressX, topY, pressX, bottomY);
//    }
//
//    public void swipeLeftOnElement(MobileElement element) {
//        scroll(element.getCenter().getX(), element.getCenter().getY(), 0, element.getCenter().getY());
//    }
//
//    public void swipeLeftOnHeroCarousel(MobileElement element) {
//        scroll(element.getCenter().getX() + 500, element.getCenter().getY(), 0, element.getCenter().getY());
//    }
//
//    public void swipeRightOnHeroCarousel(MobileElement element) {
//        scroll(element.getCenter().getX() - 200, element.getCenter().getY(), element.getCenter().getX() + 600, element.getCenter().getY());
//    }
//
//
//    public boolean scrollDownForElement(WebElement element) {
//        for (int i = 0; i < 20; i++) {
//            try {
//                if (element.isDisplayed()) {
//                    return true;
//                }
//            } catch (Exception e) {
//            }
//            scrollDown();
//        }
//        return false;
//    }
//
//
//    public boolean scrollDownForElement(By by, int scrollCount) {
//        for (int i = 0; i < scrollCount; i++) {
//            try {
//                WebElement ele = driver.findElement(by);
//                if (ele.isDisplayed()) {
//                    return true;
//                }
//            } catch (Exception e) {
//            }
//            scrollDown();
//        }
//        return false;
//    }
//
//    public boolean scrollDownForElement(WebElement element, int numberOfScrolls) {
//        for (int i = 0; i < numberOfScrolls; i++) {
//            try {
//                if (element.isDisplayed()) {
//                    return true;
//                }
//            } catch (Exception e) {
//            }
//            scrollDown();
//        }
//        return false;
//    }
//
//
//    public boolean scrollUpForElement(WebElement element, int numberOfScrolls) {
//        for (int i = 0; i < numberOfScrolls; i++) {
//            try {
//                if (element.isDisplayed()) {
//                    return true;
//                }
//            } catch (Exception e) {
//            }
//            scrollUp();
//        }
//        return false;
//    }
//
//    public boolean scrollDownForElement(String xpath) {
//        for (int i = 0; i < 20; i++) {
//            try {
//                WebElement ele = driver.findElement(By.xpath(xpath));
//                if (ele.isDisplayed()) {
//                    return true;
//                }
//            } catch (Exception e) {
//            }
//            scrollDown();
//        }
//        return false;
//    }
//
//    public boolean swipeLeftForElement(String xpath) {
//        for (int i = 0; i < 10; i++) {
//            try {
//                WebElement ele = driver.findElement(By.xpath(xpath));
//                if (ele.isDisplayed()) {
//                    return true;
//                }
//            } catch (Exception e) {
//            }
//            swipeLeft();
//        }
//        return false;
//    }
//
//    public boolean scrollDownForElement(String xpath, int scrollCount) {
//        for (int i = 0; i < scrollCount; i++) {
//            try {
//                WebElement ele = driver.findElement(By.xpath(xpath));
//                if (ele.isDisplayed()) {
//                    return true;
//                }
//            } catch (Exception e) {
//            }
//            scrollDown();
//        }
//        return false;
//    }
//
//    public boolean scrollUpForElement(By by, int scrollCount) {
//        for (int i = 0; i < scrollCount; i++) {
//            try {
//                WebElement ele = driver.findElement(by);
//                if (ele.isDisplayed()) {
//                    return true;
//                }
//            } catch (Exception e) {
//            }
//            scrollUp();
//        }
//        return false;
//    }
//
//    public boolean scrollUpForElement(WebElement element) {
//        for (int i = 0; i < 20; i++) {
//            try {
//                if (element.isDisplayed()) {
//                    return true;
//                }
//            } catch (Exception e) {
//            }
//            scrollUp();
//        }
//        return false;
//    }
//
//
//    public MobileElement findElementByName(String name) {
//        AppiumDevice device = AppiumDeviceManager.getDevice();
//        if (device.getPlatform().equalsIgnoreCase("ios")) {
//            return (MobileElement) driver.findElementByName(name);
//        } else {
//            ArrayList<MobileElement> elementList = (ArrayList<MobileElement>) driver.findElementsByClassName("android.widget.TextView");
//            for (MobileElement element : elementList) {
//                if (element.getText().replaceAll("\\s+", "").equalsIgnoreCase(name.replaceAll("\\s+", ""))) {
//                    return element;
//                }
//            }
//        }
//        return null;
//    }
//
//    public MobileElement findElementByLabel(String label) {
//        String xpath = "";
//        AppiumDevice device = AppiumDeviceManager.getDevice();
//        if (device.getPlatform().equalsIgnoreCase("ios")) {
//
//            new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(driver.findElement(MobileBy.iOSNsPredicateString(String.format("label BEGINSWITH '%s' and visible==1", label)))));
//            try {
//                return (MobileElement) driver.findElement(MobileBy.iOSNsPredicateString(String.format("label BEGINSWITH '%s' and visible==1", label)));
//            } catch (Exception e) {
//                return (MobileElement) driver.findElement(MobileBy.iOSNsPredicateString(String.format("label=='%s'", label)));
//
//            }
//        } else {
//            // label==text here
//            ArrayList<MobileElement> elementList = (ArrayList<MobileElement>) driver.findElementsByClassName("android.widget.TextView");
//            for (MobileElement element : elementList) {
//                if (element.getText().equalsIgnoreCase(label.trim())) {
//                    return element;
//                }
//            }
//        }
//
//
//        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
//            scrollDownForElement(driver.findElement(MobileBy.iOSNsPredicateString(String.format("label BEGINSWITH '%s'", label))));
//            return (MobileElement) driver.findElement(MobileBy.iOSNsPredicateString(String.format("label BEGINSWITH '%s'", label)));
//        } else {
//            xpath = String.format("//*[@text='%s']", label);
//            scrollDownForElement(driver.findElement(MobileBy.xpath(xpath)));
//            return (MobileElement) driver.findElement(MobileBy.xpath(xpath));
//        }
//    }
//
//    public void scroll(int fromX, int fromY, int toX, int toY) {
//        TouchAction touchAction = new TouchAction(driver);
//        touchAction.longPress(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
//    }
//
//    public void scrollDownBySmallAmount() {
//        int pressX = driver.manage().window().getSize().width / 2;
//        int bottomY = driver.manage().window().getSize().height * 2 / 5;
//        int topY = driver.manage().window().getSize().height / 4;
//        scroll(pressX, bottomY, pressX, topY);
//    }
//
//
//    public void enterFromKeyboard(MobileElement element, String keyValue) {
//        element.click();
//        driver.getKeyboard().pressKey(keyValue);
//        driver.getKeyboard().pressKey(Keys.ENTER);
//    }
//
//    public void doubleClick(MobileElement element) {
//        Actions action = new Actions(driver);
//        action.doubleClick(element);
//        action.perform();
//
//
//    }
//
//
//    public void deleteCurrentTextInEditText(MobileElement element) {
//        new CommonActions(driver).new ClickAction().clickElement(element);
//        String temp = "";
//        int stringLength = element.getText().length();
//        for (int i = 0; i < stringLength; i++) {
//            temp = temp + "\b";
//        }
//        element.sendKeys(temp);
//    }
//
//    /* public void tapIOSCoordinate() {
//         IOSTouchAction touch = new IOSTouchAction (driver);
//         touch.tap (TapOptions.tapOptions ()
//                 .withElement (ElementOption.element (e)))
//                 .perform ();
//     }*/
//
//
//    public void tapCoordinate(int x, int y) {
//        TouchAction touch = new TouchAction(driver);
//        touch.tap(new PointOption().withCoordinates(x, y)).perform();
//    }
//
//    public void tapElementCoordinate(MobileElement element) {
//        TouchAction touch = new TouchAction(driver);
//        Point point = element.getCenter();
//        touch.tap(new PointOption().withCoordinates(point)).perform();
//    }
//
//    public void tapSearchAndroidKeyboard() {
//        Map<String, Object> params = new HashMap<>();
//        params.put("keySequence", "KEYBOARD_SEARCH");
//        driver.executeScript("mobile:presskey", params);
////        Dimension dimension = driver.manage().window().getSize();
////        int height = (int) (dimension.getHeight() * .95);
////        int width = (int) (dimension.getWidth() * .92);
////        tapCoordinate(width, height);
//    }
//
//
//    public void tapNextAndroidFromKeyboard() {
//
//
//        Map<String, Object> params = new HashMap<>();
//        params.put("keySequence", "KEYBOARD_NEXT");
//        driver.executeScript("mobile:presskey", params);
//        Map<String, Object> params1 = new HashMap<>();
//        params1.put("keySequence", "KEYBOARD_SEARCH");
//        driver.executeScript("mobile:presskey", params1);
//
//    }
//
//
//    public void tapNextAndroidKeyboard() {
//        Map<String, Object> params = new HashMap<>();
//        params.put("keySequence", "KEYBOARD_GO");
//        driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "next"));
//    }
//
//
////    public void tapEnterAndroidKeyboard() {
////        driver.getKeyboard();
////        Dimension dimension = driver.manage().window().getSize();
////        int height = (int) (dimension.getHeight() * .996);
////        int width = (int) (dimension.getWidth() * .90);
////        tapCoordinate(width, height);
////    }
//
//    public void tapElement(MobileElement element) {
//        TouchAction touch = new TouchAction(driver);
//        touch.tap(new TapOptions().withElement(ElementOption.element(element))).perform();
//
//    }
//
//    public void waitForLoadingComplete() {
//        waitVar.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("//AndroidLoading | //iOSLoading"))));
//    }
//
//    public void waitForEditscreenLoadingComplete() {
//        waitVar.until(ExpectedConditions.invisibilityOfElementLocated((By.id("progress_indicator"))));
//    }
//
//    public void androidKeyboardClickDone() {
//        try {
//            driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Done"));
//        } catch (Exception e) {
//            Map<String, Object> params = new HashMap<>();
//            params.put("keySequence", "KEYBOARD_DONE");
//            driver.executeScript("mobile:presskey", params);
//        }
//    }
//
//
//    public String getCurrentBanner() {
//        return driver.getCapabilities().getCapability("banner").toString();
//    }
//
//
//    public String getmfaexistingAccountUser() {
//        return driver.getCapabilities().getCapability("USERNAME_MFA").toString();
//    }
//
//
//    public String getCurrentEnv() {
//        return driver.getCapabilities().getCapability("env").toString();
//    }
//
//    public String getPlatformName() {
//        return driver.getPlatformName();
//    }
//
//    public void closeAndRelaunch() throws InterruptedException {
//        appRelaunchHelper.closeAndRelaunchApp();
//
//    }
//
//    public void relaunch() throws InterruptedException {
//
//        driver.launchApp();
//    }
//
//    public void closeApp() {
//        driver.closeApp();
//    }
//
//
//    public void hideKeyBoard() {
//        if (driver.getPlatformName().equalsIgnoreCase("android")) {
//            driver.hideKeyboard();
//        } else if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
//            driver.findElement(By.xpath("//*[@label='Done']")).click();
//        }
////        else {
////            driver.getKeyboard().sendKeys(Keys.RETURN);
////        }
//    }
//
////    public void showKeyBoard() {
////        driver.getKeyboard();
////    }
//
//    public void androidNavigateBack() {
//        if (driver.getPlatformName().equalsIgnoreCase("android")) {
//            navigateBack();
//        }
//    }
//
//
//    public void clickButtonText(String button) {
//        MobileElement element;
//        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
//            element = (MobileElement) driver.findElementByName(button);
//        } else {
//            //String selector = "new UiSelector().textContains(" + "\"" + button + "\"" + ")";
//            //element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(selector));
//            element = (MobileElement) driver.findElementsByXPath("//*[contains(@label," + "'" + button + "'" + ")]");
//            //*[contains(@label,'Last Order Tab')]
//        }
//        element.click();
//    }
//
//
//    public boolean isElementDisplayed(MobileElement ele) {
//        boolean found = false;
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, WAIT_FOR_ELEMENT_TIMEOUT);
//            MobileElement element = (MobileElement) wait.until(ExpectedConditions.visibilityOf(ele));
//            if (element.isDisplayed()) {
//                found = true;
//            }
//        } catch (Exception e) {
//            found = false;
//        }
//        return found;
//    }
//
//    public boolean isElementDisplayed(MobileElement ele, int waitTime) {
//        boolean found = false;
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, waitTime);
//            MobileElement element = (MobileElement) wait.until(ExpectedConditions.visibilityOf(ele));
//            if (element.isDisplayed()) {
//                found = true;
//            }
//        } catch (Exception e) {
//            found = false;
//        }
//        return found;
//    }
//
//
//    public void moveAppToBackground() {
//        driver.runAppInBackground(Duration.ofSeconds(APP_BACKGROUND_TIME));
//        if (driver.getPlatformName().equalsIgnoreCase("android")) {
//            if (driver.getOrientation().toString().equalsIgnoreCase("landscape")) {
//                driver.rotate(ScreenOrientation.PORTRAIT);
//            }
//        }
//    }
//
//    public void setDeviceOrientationToPortrait() {
//        if (driver.getOrientation().toString().equalsIgnoreCase("landscape")) {
//            driver.rotate(ScreenOrientation.PORTRAIT);
//        }
//    }
//
//    public void enterValue(MobileElement element, String keyValue) {
//        element.click();
//        element.sendKeys(keyValue);
//    }
//
//
//    public String getText(MobileElement targetElement) {
//        new WaitAction(driver).waitForDisplayed(targetElement, 10);
//        return targetElement.getText();
//    }
//
//
//    public void refreshScreen() {
//        int deviceWidth = driver.manage().window().getSize().getWidth();
//        int deviceHeight = driver.manage().window().getSize().getHeight();
//        int midX = (deviceWidth / 2);
//        int midY = (deviceHeight / 2);
//        int bottomEdge = (deviceHeight * 95) / 100;
//        new TouchAction(driver).press(point(midX, midY)).waitAction(waitOptions(ofMillis(2000))).moveTo(point(midX, bottomEdge)).release().perform();
//    }
//
//    public boolean isMFAEnabled() {
//        return System.getProperty(CommandArgument.MFA_ENABLED, "true").equalsIgnoreCase("true");
//    }
//
//    public String generateMFAUserForMailinator() {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
//        LocalDateTime ldt = LocalDateTime.now();
//
//        return String.format("test.%s@mailinator.com", dtf.format(ldt));
//
//    }
//
//    public boolean scrollDownForElementWithSmallScroll(WebElement element, int numberOfScrolls) {
//        for (int i = 0; i < numberOfScrolls; i++) {
//            try {
//                if (element.isDisplayed()) {
//                    return true;
//                }
//            } catch (Exception e) {
//            }
//            scrollDownBySmallAmount();
//        }
//        return false;
//    }
//
//    public String generateMFAUserForGuerrillaMail() {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
//        LocalDateTime ldt = LocalDateTime.now();
//        return String.format("test.%s@guerrillamail.com", dtf.format(ldt));
//    }
//
//    public String generateMFAUserForMail7() {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
//        LocalDateTime ldt = LocalDateTime.now();
//        return String.format("test.%s@mail7.io", dtf.format(ldt));
//    }
//
//    public void waitForDisplayed(MobileElement element) {
//        waitVar.until(ExpectedConditions.visibilityOf(element));
//    }
//
//    public void waitForDisplayed(MobileElement element, int waitTime) {
//        //Added Index out of bound to handle List Views which are dynamic
//        new FluentWait<>(driver).withTimeout(Duration.ofSeconds(waitTime)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class).ignoring(IndexOutOfBoundsException.class).until(ExpectedConditions.visibilityOf(element));
//    }
//
//    public void waitForClickableAndClick(MobileElement element) {
//        waitVar.until(ExpectedConditions.elementToBeClickable(element)).click();
//    }
//
//
//    public Boolean isElementVisible(List<MobileElement> elements) {
//        if (elements.size() != 0) {
//            return true;
//        }
//        return false;
//    }
//
//
//    public boolean isElementPresent(By by) {
//        boolean found = false;
//        try {
//            driver.findElement(by);
//            found = true;
//        } catch (Exception e) {
//            found = false;
//        }
//        return found;
//
//    }
//
//    public void scrollHorizontalCarousal() {
//        int fromX = driver.manage().window().getSize().width * 2 / 4;
//        int toX = driver.manage().window().getSize().width / 10;
//        int fromY = driver.manage().window().getSize().height / 2;
//        //   scroll(fromX, fromY, toX, fromY);
//        scroll(256, 2314, 0, fromY);
//        scroll(fromX, 2314, toX, fromY);
//        scroll(fromX, 2314, toX, fromY);
//
//    }
//
//
//    public void pleaseWaitForTheLoadingToComplete() {
//        try {
//            new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class).until((Function<WebDriver, WebElement>) driver -> driver.findElement(By.xpath("//*[contains(@text,'Please')]")));
//        } catch (TimeoutException e) {
//            //Element is not visible
//        }
//    }
//
//    public void pressEnterAndroid() {
//        if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("local")) {
//            Actions action1 = new Actions(driver);
//            action1.sendKeys(Keys.ENTER).perform();
//        } else {
//            Map<String, Object> EnterKeyEvent = new HashMap<>();
//            EnterKeyEvent.put("key", "66");
//            driver.executeScript("mobile:key:event", EnterKeyEvent);
//        }
//    }
//
//    public void waitForElementToAppear(MobileElement ele, int waitTime) {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, waitTime);
//            wait.until(ExpectedConditions.visibilityOf(ele));
//        } catch (TimeoutException | StaleElementReferenceException | NoSuchElementException e) {
//        }
//
//    }
//
//    public void swipeVertical(
//            double startPercentage, double finalPercentage, double anchorPercentage, int duration)
//            throws Exception {
//        org.openqa.selenium.Dimension size = driver.manage().window().getSize();
//        int anchor = (int) (size.width * anchorPercentage);
//        int startPoint = (int) (size.height * startPercentage);
//        int endPoint = (int) (size.height * finalPercentage);
//        getTouchAction().press(PointOption.point(anchor, startPoint))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
//                .moveTo(PointOption.point(anchor, endPoint)).release().perform();
//    }
//
//    public TouchAction getTouchAction() {
//        return new TouchAction(driver);
//    }
//
//    public String getAttribute(MobileElement ele, String attribute) {
//        return ele.getAttribute(attribute);
//    }
//
//
//    public void enterKey(WebElement element, String keyValue) {
//        element.click();
//        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
//
//            try {
//                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
//                    Thread.sleep(1000);
//                } else {
//                    Thread.sleep(1500);
//                }
//                TouchAction action = new TouchAction(driver);
//                action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
//                element.sendKeys(Keys.DELETE);
//                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
//                    Thread.sleep(500);
//                } else {
//                    Thread.sleep(1000);
//                }
//                element.sendKeys(keyValue + "\n");
//            } catch (InterruptedException e) {
//                // do nothing
//            }
//        } else {
//            element.clear();
//            element.sendKeys(keyValue);
//
//            try {
//
//                try {
//
//                    if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("local")) {
//                        Thread.sleep(1000);
//                        Actions action = new Actions(driver);
//                        action.sendKeys(Keys.ENTER).perform();
//
//                    } else {
//                        Map<String, Object> EnterKeyEvent = new HashMap<>();
//                        EnterKeyEvent.put("key", "66");
//                        driver.executeScript("mobile:key:event", EnterKeyEvent);
//
//                    }
//                } catch (InterruptedException e) {
//
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public Boolean isElementVisible(List<WebElement> element, long waitTime) {
//        WebDriverWait wait = new WebDriverWait(driver, waitTime);
//        wait.until(ExpectedConditions.visibilityOfAllElements(element));
//        if (element.size() > 0) {
//            return true;
//        }
//        return false;
//    }
//
//    public void scrollToTop(int count) {
//        for (int i = 0; i < count; i++) {
//            int pressX = driver.manage().window().getSize().width / 2;
//            int bottomY = driver.manage().window().getSize().height * 4 / 5;
//            int topY = driver.manage().window().getSize().height / 8;
//            scroll(pressX, topY, pressX, bottomY);
//        }
//    }
//
//    public void clickElementByText(String text) {
//        List<MobileElement> els;
//        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
//            els = driver.findElements(By.xpath("//XCUIElementTypeButton"));
//            MobileElement ele = els.stream().filter(el -> el.isDisplayed() && el.getAttribute("value").contentEquals(text)).findFirst().orElseThrow(() -> new NoSuchElementException(" Element not found with exact text: " + text));
//
//        } else els = driver.findElements(By.xpath("//android.widget.TextView"));
//        MobileElement ele = els.stream().filter(el -> el.isDisplayed() && el.getAttribute("text").equalsIgnoreCase(text)).findFirst().orElseThrow(() -> new NoSuchElementException(" Element not found with exact text: " + text));
//        ele.click();
//    }
//
//    public void switchToWebContext() {
//        Set contextNames = driver.getContextHandles();
//        System.out.println("Context Names: " + contextNames);
//        if (driver.getContext().contains("NATIVE")) {
//            if (contextNames.contains("WEBVIEW_1")) {
//                driver.context("WEBVIEW_1");
//            } else if(contextNames.contains("WEBVIEW_chrome")) {
//                driver.context("WEBVIEW_chrome");
//            } else {
//                driver.context("WEBVIEW_safari");
//            }
//            System.out.println("switched to web view.....");
//        } else if (driver.getContext().contains("WEBVIEW")) {
//            System.out.println("Already in web view.....");
//        }
//
//    }
//
//
//    public void clearCookies() throws InterruptedException {
//        //Clear the cache for the ChromeDriver instance.
//        driver.get("chrome://settings/clearBrowserData");
//        Thread.sleep(10000);
//        driver.findElement(By.xpath("//*[@id='clearBrowsingDataConfirm']")).click();
//        driver.navigate().back();
//    }
//
//
//    public void switchToNativeContext() throws InterruptedException {
//
//        Set contextNames = driver.getContextHandles();
//        System.out.println("Context Names: " + contextNames);
//        if (driver.getContext().contains("NATIVE")) {
//            System.out.println("Already in Native view.....");
//        } else if (driver.getContext().contains("WEBVIEW")) {
//
//            driver.context("NATIVE_APP");
//            Thread.sleep(8000);
//            System.out.println("switched to Native view.....");
//        }
//
//        driver.activateApp("sysnify.com.dfwrelationshop");
//        Thread.sleep(8000);
//    }
//
//    public String getE1() {
//        System.out.println(e1);
//        return e1;
//    }
//
//    public void setE1(String e1) {
//        this.e1 = e1;
//    }
//
//    //   String random_email="";
//    public String e1 = "";
//    public String generateRandomEmail(int length) {
//        String allowedChars = "1234567890";
//        String email = "";
//        String temp = RandomStringUtils.random(length, allowedChars);
//        GlobalVar.Random_User = "automation" + temp.substring(0, temp.length() - 4);
//        email =  GlobalVar.Random_User +"@mail7.io";
//        GlobalVar.random_email = email;
//        System.out.println(email);
//        return email;
//    }
//
//    public static String generateRandomPhoneNumber(int length) {
//
//        String allowedChars = "1234567890";
//        String Phone = "";
//        String temp = RandomStringUtils.random(length, allowedChars);
//        Phone = temp.substring(0, temp.length() - 4);
//        System.out.println(Phone);
//        return Phone;
//    }
//
//    public void typeFromKeyboard(MobileElement element, String keyValue) {
//        element.click();
//        driver.getKeyboard().pressKey(keyValue);
//
//    }
//
//    public void waitAndScrollForElementToAppear(MobileElement ele, int waitTime) {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, waitTime);
//            wait.until(ExpectedConditions.visibilityOf(ele));
//            scrollDown();
//        } catch (TimeoutException | StaleElementReferenceException | NoSuchElementException e) {
//        }
//    }
//    public void clickElement(WebElement ele) {
//        int count = 0;
//        while (count < 3) {
//            try {
//                WebDriverWait wait = new WebDriverWait(driver, WAIT_FOR_ELEMENT_TIMEOUT);
//                MobileElement element = (MobileElement) wait.until(ExpectedConditions.visibilityOf(ele));
//                if (element.isDisplayed()) {
//                    element.click();
//                    break;
//                }
//            } catch (StaleElementReferenceException e) {
//                //StaleElementReferenceException caught, trying again..
//            }
//            count++;
//        }
//    }
//    public void clearElement(WebElement element) {
//        try {
//            element.clear();
//        } catch (Exception e) {
//            // e.printStackTrace();
//        }
//
//    }
//    public String returnUserFromEmail(String email) {
//        return email.split("@")[0];
//    }
//
//}
//==================================================above is old code=================================

package com.automation.pages;

import com.automation.mobile.appium.AppiumDevice;
import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.mobile.entities.CommandArgument;
import com.automation.mobile.helpers.AppRelaunchHelper;
import com.automation.mobile.manager.ConfigFileManager;
import com.automation.mobile.util.CommonActions;
import com.automation.mobile.util.GlobalVar;
import com.automation.mobile.util.TapAction;
import com.automation.mobile.util.WaitAction;
//import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.*;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class BasePage {
    private final int APP_BACKGROUND_TIME = 5;
    private final int WAIT_FOR_ELEMENT_TIMEOUT = 10;
    public AppiumDriver driver;
    public WebDriverWait waitVar;
    public String platformName;

    private final int LESS_WAIT = 1000; //1sec
    private final int MEDIUM_WAIT = 5000; //5sec

    private final int HIGH_WAIT = 12000; //12sec
    private final AppRelaunchHelper appRelaunchHelper;
    public Map<String, String> data;
    public Logger logger = LogManager.getLogger(getClass());

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        this.data = GlobalVar.data;
        this.waitVar = new WebDriverWait(driver, 10);
        this.platformName = getPlatformName().toLowerCase();
        appRelaunchHelper = new AppRelaunchHelper(driver);
    }

    public Map<String, String> getBannerPropertiesMap() throws IOException {
        String banner = getCurrentBanner();
        String env = getCurrentEnv();
        return ConfigFileManager.getBannerPropertyMap(banner, env);
    }


    public void navigateBack() {
        try {
            driver.navigate().back();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public boolean textDisplayed(String text) {
        if (getPlatformName().equalsIgnoreCase("ios")) {
            waitVar.until(ExpectedConditions.presenceOfElementLocated(MobileBy.name(text)));
            return true;
        } else if (getPlatformName().equalsIgnoreCase("android")) {
            String textNew = text.substring(0, 1).toUpperCase() + text.substring(1);
            String selector = "new UiSelector().textContains(" + "\"" + textNew + "\"" + ")";
            waitVar.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(selector)));
            return true;
        }
        return false;
    }

    public boolean containTextDisplayed(String text) {
        new WaitAction(driver).waitForLoadingComplete();
        WebElement element;
        if (getPlatformName().equalsIgnoreCase("ios")) {
            String iosText = " label CONTAINS " + "'" + text + "'";
            element = waitVar.until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString(iosText)));

            return element.isDisplayed();


        } else {
            String selector = "new UiSelector().textContains(" + "\"" + text + "\"" + ")";
            element = waitVar.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(selector)));
            return element.isDisplayed();
        }
    }

    public void enterMobileNumber(MobileElement element, String keyValue) {
        element.click();
        if (getPlatformName().equalsIgnoreCase("ios")) {

            try {
                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
                    Thread.sleep(1000);
                } else {
                    Thread.sleep(1500);
                }
                TouchAction action = new TouchAction(driver);
                action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
                element.sendKeys(Keys.DELETE);
                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
                    Thread.sleep(500);
                } else {
                    Thread.sleep(1000);
                }
                element.sendKeys(keyValue + "\n");
            } catch (InterruptedException e) {
                // do nothing
            }
        } else {
            element.clear();
            element.sendKeys(keyValue);

        }
    }

    public void waitForTextPresentInElement(MobileElement element, String text) {
        waitVar.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void waitForElementToBeClickable(MobileElement element, int secondsToWait) {
        try {
            new FluentWait<>(driver).withTimeout(Duration.ofSeconds(secondsToWait)).pollingEvery(Duration.ofMillis(250)).until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void waitForLoaderToDisappear() {
        try {
            if (getPlatformName().equalsIgnoreCase("android")) {
                waitForElementToDisappear((MobileElement) driver.findElement(By.className("android.widget.ProgressBar")), 60);
            } else {
                waitForElementToDisappear((MobileElement) driver.findElement(By.id("In progress")), 60);
            }
        } catch (NoSuchElementException e) {
            return;
        }
    }

    public void waitForElementToDisappear(MobileElement ele, int waitTime) {
        for (int i = 0; i < waitTime; i++) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, 1);
                wait.until(ExpectedConditions.visibilityOf(ele));

            } catch (TimeoutException | StaleElementReferenceException | NoSuchElementException e) {
                return;
            }
        }
    }


    public void clickContainsTextOnScreen(String arg0) {
        if (getPlatformName().equalsIgnoreCase("android")) {
            String text = "new UiSelector().text(\"" + arg0 + "\")";
            scrollDownForElement(driver.findElement(MobileBy.AndroidUIAutomator(text)));
            new CommonActions(driver).new ClickAction().clickElement(driver.findElement(MobileBy.AndroidUIAutomator(text)));
        } else {
            scrollDownForElement(driver.findElementByName(arg0));
            new CommonActions(driver).new ClickAction().clickElement(driver.findElementByName(arg0));
        }
    }

    public void clickTextOnScreen(String arg0) {
        if (getPlatformName().equalsIgnoreCase("android")) {
            String text = "new UiSelector().text(\"" + arg0 + "\")";
            scrollDownForElement(driver.findElement(MobileBy.AndroidUIAutomator(text)));
            new CommonActions(driver).new ClickAction().clickElement(driver.findElement(MobileBy.AndroidUIAutomator(text)));
        } else {
            scrollDownForElement(driver.findElementByName(arg0));
            new CommonActions(driver).new ClickAction().clickElement(driver.findElementByName(arg0));
        }
    }

//    public void enterKey(MobileElement element, String keyValue) {
//        element.click();
//        if (getPlatformName().equalsIgnoreCase("ios")) {
//
//            try {
//                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
//                    Thread.sleep(1000);
//                } else {
//                    Thread.sleep(1500);
//                }
//                TouchAction action = new TouchAction(driver);
//                action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
//                element.sendKeys(Keys.DELETE);
//                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
//                    Thread.sleep(500);
//                } else {
//                    Thread.sleep(1000);
//                }
//                element.sendKeys(keyValue + "\n");
//            } catch (InterruptedException e) {
//                // do nothing
//            }
//        } else {
//            element.clear();
//            element.sendKeys(keyValue);
//
//            try {
//
//                try {
//
//                    if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("local")) {
//                        Thread.sleep(1000);
//                        Actions action = new Actions(driver);
//                        action.sendKeys(Keys.ENTER).perform();
//
//                    } else {
//                        Map<String, Object> EnterKeyEvent = new HashMap<>();
//                        EnterKeyEvent.put("key", "66");
//                        driver.executeScript("mobile:key:event", EnterKeyEvent);
//
//                    }
//                } catch (InterruptedException ignored) {
//
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }




    // Method to tap on search or enter(next) on keyboard for android
    public void tapSearchEnterAndroid() {
        int height = driver.findElement(By.xpath("//*[contains(@resource-id,'action_bar_root')]")).getSize().getHeight();
        int width = driver.findElement(By.xpath("//*[contains(@resource-id,'action_bar_root')]")).getSize().getWidth();

        int searchX = driver.findElement(By.xpath("//*[contains(@resource-id,'action_bar_root')]")).getLocation().getX() + width - 10;
        int searchY = driver.findElement(By.xpath("//*[contains(@resource-id,'action_bar_root')]")).getLocation().getY() + height - 15;

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(searchX, searchY)).perform();
    }

    public String getTextFromTextField(MobileElement element) {
        String val = "";
        if (getPlatformName().equalsIgnoreCase("ios")) {
            TouchAction action = new TouchAction(driver);
            action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
            driver.findElement(By.name("Copy")).click();
            val = ((IOSDriver) driver).getClipboardText();


        }
        return val;
    }

    public void searchProductByOS(MobileElement element, MobileElement element2, String keyValue) {

        switch (getPlatformName().toUpperCase()) {
            case "ANDROID":
                enterTextNoPressEnter(element, keyValue);
                new TapAction(driver).tapSearchEnterAndroid();
                // I use Element2 for "x" in search bar element
                if (isElementDisplayed(element2, 2)) {
                    enterTextNoPressEnter(element, keyValue);
                    // This is for different keyboard
                    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
                }
                break;
            case "IOS":
                enterKey(element, keyValue);
                break;
        }
    }

    public void enterTextNoPressEnter(MobileElement element, String keyValue) {
        element.click();
        if (getPlatformName().equalsIgnoreCase("ios")) {
            try {
                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
                    Thread.sleep(1000);
                } else {
                    Thread.sleep(1500);
                }
                TouchAction action = new TouchAction(driver);
                action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
                element.sendKeys(Keys.DELETE);
                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
                    Thread.sleep(1000);
                } else {
                    Thread.sleep(1500);
                }
                element.sendKeys(keyValue);
            } catch (InterruptedException e) {
                // do nothing
            }
        } else {
            scrollDown();
            element.sendKeys(keyValue);
        }
    }


    public void scrollDown() {
        if (getPlatformName().equalsIgnoreCase("android")) {
            int pressX = driver.manage().window().getSize().width / 3;
            int bottomY = (driver.manage().window().getSize().height * 2) / 3;
            int topY = driver.manage().window().getSize().height / 4;
            scroll(1, bottomY, 1, topY);
        } else {
            int pressX = driver.manage().window().getSize().width / 3;
            int bottomY = (driver.manage().window().getSize().height * 3) / 4;
            int topY = driver.manage().window().getSize().height / 2;
            scroll(1, bottomY, 1, topY);
        }
    }

    public void scrollUp() {
        Dimension size = driver.manage().window().getSize();
        int starty = size.height / 3;
        int endy = (size.height * 5) / 6;
        int startx = size.width / 2;

        // Swipe from Bottom to Top
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(PointOption.point(10, starty)).moveTo(PointOption.point(10, endy)).release().perform();
    }

    public void scrollDownForDeliverySlot() {
        if (getPlatformName().equalsIgnoreCase("android")) {
            int pressX = driver.manage().window().getSize().width / 3;
            int bottomY = (int) (driver.manage().window().getSize().height / 1.5);
            int topY = (int) (driver.manage().window().getSize().height / 1.7);
            scroll(pressX, bottomY, pressX, topY);
        } else {
            int pressX = driver.manage().window().getSize().width / 2;
            int bottomY = driver.manage().window().getSize().height * 2 / 5;
            int topY = driver.manage().window().getSize().height / 8;
            scroll(pressX, bottomY, pressX, topY);
        }
    }

    public void scrollDown(int count) {
        for (int i = 0; i < count; i++) {
            int pressX = driver.manage().window().getSize().width / 2;
            int bottomY = driver.manage().window().getSize().height * 2 / 5;
            int topY = driver.manage().window().getSize().height / 8;
            scroll(1, bottomY, 1, topY);
        }
    }

    public void popUpScrollDown(int count) {
        for (int i = 0; i < count; i++) {
            int pressX = driver.manage().window().getSize().width / 2;
            int bottomY = driver.manage().window().getSize().height * 2 / 5;
            int topY = driver.manage().window().getSize().height / 8;
            scroll(10, bottomY, 10, topY);
        }
    }

    public void swipeLeft() {
        int rightX = driver.manage().window().getSize().width / 2;
        int pressY = driver.manage().window().getSize().height / 3;
        int LeftX = driver.manage().window().getSize().height / 9;
        System.out.println(rightX + " : " + pressY + " : " + LeftX + " : " + pressY);
        scroll(rightX, pressY, LeftX, pressY);
    }

    public void swipeRightAHK2Fit() {
        int rightX = 150;
        int LeftX = 100;
        scroll(rightX, 600, LeftX, 600);
    }

    public void swipeLeftFit2AHK() {
        int rightX = 100;
        int LeftX = 150;
        scroll(rightX, 600, LeftX, 600);
    }

    public void scrollTop() {
        int pressX = driver.manage().window().getSize().width / 2;
        int bottomY = driver.manage().window().getSize().height * 4 / 5;
        int topY = driver.manage().window().getSize().height / 8;
        scroll(pressX, topY, pressX, bottomY);
    }

    public void swipeLeftOnElement(MobileElement element) {
        scroll(element.getCenter().getX(), element.getCenter().getY(), 0, element.getCenter().getY());
    }

    public void swipeLeftOnHeroCarousel(MobileElement element) {
        scroll(element.getCenter().getX() + 500, element.getCenter().getY(), 0, element.getCenter().getY());
    }

    public void swipeRightOnHeroCarousel(MobileElement element) {
        scroll(element.getCenter().getX() - 200, element.getCenter().getY(), element.getCenter().getX() + 600, element.getCenter().getY());
    }


    public boolean scrollDownForElement(WebElement element) {
        for (int i = 0; i < 20; i++) {
            try {
                if (element.isDisplayed()) {
                    return true;
                }
            } catch (Exception e) {
            }
            scrollDown();
        }
        return false;
    }


    public boolean scrollDownForElement(By by, int scrollCount) {
        for (int i = 0; i < scrollCount; i++) {
            try {
                WebElement ele = driver.findElement(by);
                if (ele.isDisplayed()) {
                    return true;
                }
            } catch (Exception e) {
            }
            scrollDown();
        }
        return false;
    }

    public boolean scrollDownForElement(WebElement element, int numberOfScrolls) {
        for (int i = 0; i < numberOfScrolls; i++) {
            try {
                if (element.isDisplayed()) {
                    return true;
                }
            } catch (Exception e) {
            }
            scrollDown();
        }
        return false;
    }


    public boolean scrollUpForElement(WebElement element, int numberOfScrolls) {
        for (int i = 0; i < numberOfScrolls; i++) {
            try {
                if (element.isDisplayed()) {
                    return true;
                }
            } catch (Exception e) {
            }
            scrollUp();
        }
        return false;
    }

    public boolean scrollDownForElement(String xpath) {
        for (int i = 0; i < 20; i++) {
            try {
                WebElement ele = driver.findElement(By.xpath(xpath));
                if (ele.isDisplayed()) {
                    return true;
                }
            } catch (Exception e) {
            }
            scrollDown();
        }
        return false;
    }

    public boolean swipeLeftForElement(String xpath) {
        for (int i = 0; i < 10; i++) {
            try {
                WebElement ele = driver.findElement(By.xpath(xpath));
                if (ele.isDisplayed()) {
                    return true;
                }
            } catch (Exception e) {
            }
            swipeLeft();
        }
        return false;
    }

    public boolean scrollDownForElement(String xpath, int scrollCount) {
        for (int i = 0; i < scrollCount; i++) {
            try {
                WebElement ele = driver.findElement(By.xpath(xpath));
                if (ele.isDisplayed()) {
                    return true;
                }
            } catch (Exception e) {
            }
            scrollDown();
        }
        return false;
    }

    public boolean scrollUpForElement(By by, int scrollCount) {
        for (int i = 0; i < scrollCount; i++) {
            try {
                WebElement ele = driver.findElement(by);
                if (ele.isDisplayed()) {
                    return true;
                }
            } catch (Exception e) {
            }
            scrollUp();
        }
        return false;
    }

    public boolean scrollUpForElement(WebElement element) {
        for (int i = 0; i < 20; i++) {
            try {
                if (element.isDisplayed()) {
                    return true;
                }
            } catch (Exception e) {
            }
            scrollUp();
        }
        return false;
    }


    public MobileElement findElementByName(String name) {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        if (device.getPlatform().equalsIgnoreCase("ios")) {
            return (MobileElement) driver.findElementByName(name);
        } else {
            ArrayList<MobileElement> elementList = (ArrayList<MobileElement>) driver.findElementsByClassName("android.widget.TextView");
            for (MobileElement element : elementList) {
                if (element.getText().replaceAll("\\s+", "").equalsIgnoreCase(name.replaceAll("\\s+", ""))) {
                    return element;
                }
            }
        }
        return null;
    }

    public MobileElement findElementByLabel(String label) {
        String xpath = "";
        AppiumDevice device = AppiumDeviceManager.getDevice();
        if (device.getPlatform().equalsIgnoreCase("ios")) {

            new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(driver.findElement(MobileBy.iOSNsPredicateString(String.format("label BEGINSWITH '%s' and visible==1", label)))));
            try {
                return (MobileElement) driver.findElement(MobileBy.iOSNsPredicateString(String.format("label BEGINSWITH '%s' and visible==1", label)));
            } catch (Exception e) {
                return (MobileElement) driver.findElement(MobileBy.iOSNsPredicateString(String.format("label=='%s'", label)));

            }
        } else {
            // label==text here
            ArrayList<MobileElement> elementList = (ArrayList<MobileElement>) driver.findElementsByClassName("android.widget.TextView");
            for (MobileElement element : elementList) {
                if (element.getText().equalsIgnoreCase(label.trim())) {
                    return element;
                }
            }
        }


        if (getPlatformName().equalsIgnoreCase("ios")) {
            scrollDownForElement(driver.findElement(MobileBy.iOSNsPredicateString(String.format("label BEGINSWITH '%s'", label))));
            return (MobileElement) driver.findElement(MobileBy.iOSNsPredicateString(String.format("label BEGINSWITH '%s'", label)));
        } else {
            xpath = String.format("//*[@text='%s']", label);
            scrollDownForElement(driver.findElement(MobileBy.xpath(xpath)));
            return (MobileElement) driver.findElement(MobileBy.xpath(xpath));
        }
    }

    public void scroll(int fromX, int fromY, int toX, int toY) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
    }

    public void scrollDownBySmallAmount() {
        int pressX = driver.manage().window().getSize().width / 2;
        int bottomY = driver.manage().window().getSize().height * 2 / 5;
        int topY = driver.manage().window().getSize().height / 4;
        scroll(pressX, bottomY, pressX, topY);
    }


    public void enterFromKeyboard(MobileElement element, String keyValue) {
        try {
            element.click();
            driver.getKeyboard().pressKey(keyValue);
            driver.getKeyboard().pressKey(Keys.ENTER);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void doubleClick(MobileElement element) {
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();


    }

    public void deleteCurrentTextInEditText(MobileElement element) {
        new CommonActions(driver).new ClickAction().clickElement(element);
        String temp = "";
        int stringLength = element.getText().length();
        for (int i = 0; i < stringLength; i++) {
            temp = temp + "\b";
        }
        element.sendKeys(temp);
    }


    public void tapCoordinate(int x, int y) {
        TouchAction touch = new TouchAction(driver);
        touch.tap(new PointOption().withCoordinates(x, y)).perform();
    }

    public void tapElementCoordinate(MobileElement element) {
        TouchAction touch = new TouchAction(driver);
        Point point = element.getCenter();
        touch.tap(new PointOption().withCoordinates(point)).perform();
    }

    public void tapSearchAndroidKeyboard() {
        Map<String, Object> params = new HashMap<>();
        params.put("keySequence", "KEYBOARD_SEARCH");
        driver.executeScript("mobile:presskey", params);
    }


    public void tapNextAndroidFromKeyboard() {

        Map<String, Object> params = new HashMap<>();
        params.put("keySequence", "KEYBOARD_NEXT");
        driver.executeScript("mobile:presskey", params);
        Map<String, Object> params1 = new HashMap<>();
        params1.put("keySequence", "KEYBOARD_SEARCH");
        driver.executeScript("mobile:presskey", params1);

    }


    public void tapNextAndroidKeyboard() {
        Map<String, Object> params = new HashMap<>();
        params.put("keySequence", "KEYBOARD_GO");
        driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "next"));
    }


//    public void tapEnterAndroidKeyboard() {
//        driver.getKeyboard();
//        Dimension dimension = driver.manage().window().getSize();
//        int height = (int) (dimension.getHeight() * .996);
//        int width = (int) (dimension.getWidth() * .90);
//        tapCoordinate(width, height);
//    }

    public void tapElement(MobileElement element) {
        try {
            new TouchAction(driver).tap(new TapOptions().withElement(ElementOption.element(element))).perform();
        } catch (Exception e) {
            //  throw new RuntimeException(e.getMessage());
        }


    }

    public void waitForLoadingComplete() {
        waitVar.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("//AndroidLoading | //iOSLoading"))));
    }

    public void waitForEditscreenLoadingComplete() {
        waitVar.until(ExpectedConditions.invisibilityOfElementLocated((By.id("progress_indicator"))));
    }

    public void androidKeyboardClickDone() {
        try {
            driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Done"));
        } catch (Exception e) {
            Map<String, Object> params = new HashMap<>();
            params.put("keySequence", "KEYBOARD_DONE");
            driver.executeScript("mobile:presskey", params);
        }
    }


    public String getCurrentBanner() {
        return driver.getCapabilities().getCapability("banner").toString();
    }

    public String getCurrentEnv() {
        return driver.getCapabilities().getCapability("env").toString();
    }

    public String getPlatformName() {
        return driver.getPlatformName();
    }

    public void closeAndRelaunch() throws InterruptedException {
        appRelaunchHelper.closeAndRelaunchApp();

    }

    public void closeApp() {
        driver.closeApp();
    }


    public void hideKeyBoard() {
        if (getPlatformName().equalsIgnoreCase("android")) {
            driver.hideKeyboard();
        } else if (getPlatformName().equalsIgnoreCase("iOS")) {
            driver.findElement(By.xpath("//*[@label='Done']")).click();
        }
//        else {
//            driver.getKeyboard().sendKeys(Keys.RETURN);
//        }
    }

//    public void showKeyBoard() {
//        driver.getKeyboard();
//    }

    public void androidNavigateBack() {
        if (getPlatformName().equalsIgnoreCase("android")) {
            navigateBack();
        }
    }


    public void clickButtonText(String button) {
        MobileElement element;
        if (getPlatformName().equalsIgnoreCase("ios")) {
            element = (MobileElement) driver.findElementByName(button);
        } else {
            //String selector = "new UiSelector().textContains(" + "\"" + button + "\"" + ")";
            //element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(selector));
            element = (MobileElement) driver.findElementsByXPath("//*[contains(@label," + "'" + button + "'" + ")]");
            //*[contains(@label,'Last Order Tab')]
        }
        element.click();
    }


    public boolean isElementDisplayed(MobileElement ele) {
        boolean found = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, WAIT_FOR_ELEMENT_TIMEOUT);
            MobileElement element = (MobileElement) wait.until(ExpectedConditions.visibilityOf(ele));
            if (element.isDisplayed()) {
                found = true;
            }
        } catch (Exception e) {
            found = false;
        }
        return found;
    }

    public boolean isElementDisplayed(MobileElement ele, int waitTime) {
        boolean found = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, waitTime);
            MobileElement element = (MobileElement) wait.until(ExpectedConditions.visibilityOf(ele));
            if (element.isDisplayed()) {
                found = true;
            }
        } catch (Exception e) {
            found = false;
        }
        return found;
    }


    public void moveAppToBackground() {
        driver.runAppInBackground(Duration.ofSeconds(APP_BACKGROUND_TIME));
        if (getPlatformName().equalsIgnoreCase("android")) {
            if (driver.getOrientation().toString().equalsIgnoreCase("landscape")) {
                driver.rotate(ScreenOrientation.PORTRAIT);
            }
        }
    }

    public void setDeviceOrientationToPortrait() {
        if (driver.getOrientation().toString().equalsIgnoreCase("landscape")) {
            driver.rotate(ScreenOrientation.PORTRAIT);
        }
    }

    public void enterValue(MobileElement element, String keyValue) {
        element.click();
        element.sendKeys(keyValue);
    }


    public String getText(MobileElement targetElement) {
        try {
            new WaitAction(driver).waitForDisplayed(targetElement, 10);
            return targetElement.getText();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }


    }


    public void refreshScreen() {
        int deviceWidth = driver.manage().window().getSize().getWidth();
        int deviceHeight = driver.manage().window().getSize().getHeight();
        int midX = (deviceWidth / 2);
        int midY = (deviceHeight / 2);
        int bottomEdge = (deviceHeight * 95) / 100;
        new TouchAction(driver).press(point(midX, midY)).waitAction(waitOptions(ofMillis(2000))).moveTo(point(midX, bottomEdge)).release().perform();
    }

    public boolean isMFAEnabled() {
        return System.getProperty(CommandArgument.MFA_ENABLED, "true").equalsIgnoreCase("true");
    }

    public String generateMFAUserForMailinator() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        LocalDateTime ldt = LocalDateTime.now();

        return String.format("test.%s@mailinator.com", dtf.format(ldt));

    }

    public boolean scrollDownForElementWithSmallScroll(WebElement element, int numberOfScrolls) {
        for (int i = 0; i < numberOfScrolls; i++) {
            try {
                if (element.isDisplayed()) {
                    return true;
                }
            } catch (Exception e) {
            }
            scrollDownBySmallAmount();
        }
        return false;
    }


    public String generateMFAUserForGuerrillaMail() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        LocalDateTime ldt = LocalDateTime.now();
        return String.format("test.%s@guerrillamail.com", dtf.format(ldt));
    }

    public String generateMFAUserForMail7() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        LocalDateTime ldt = LocalDateTime.now();
        return String.format("test.%s@mail7.io", dtf.format(ldt));
    }

    public void waitForDisplayed(MobileElement element) {
        waitVar.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForDisplayed(MobileElement element, int waitTime) {
        //Added Index out of bound to handle List Views which are dynamic
        new FluentWait<>(driver).withTimeout(Duration.ofSeconds(waitTime)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class).ignoring(IndexOutOfBoundsException.class).until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickableAndClick(MobileElement element) {
        try {
            waitVar.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


    public Boolean isElementVisible(List<MobileElement> elements) {
        if (elements.size() != 0) {
            return true;
        }
        return false;
    }


    public boolean isElementPresent(By by) {
        boolean found = false;
        try {
            driver.findElement(by);
            found = true;
        } catch (Exception e) {
            found = false;
        }
        return found;

    }

    public void scrollHorizontalCarousal() {
        int fromX = driver.manage().window().getSize().width * 2 / 4;
        int toX = driver.manage().window().getSize().width / 10;
        int fromY = driver.manage().window().getSize().height / 2;
        //   scroll(fromX, fromY, toX, fromY);
        scroll(256, 2314, 0, fromY);
        scroll(fromX, 2314, toX, fromY);
        scroll(fromX, 2314, toX, fromY);

    }

    public void scrollHorizontalUsingElement(MobileElement element){
        TouchAction action=new TouchAction((MobileDriver) driver);
        action.longPress(ElementOption.element(element)).moveTo(ElementOption.element(element,250,250)).release().perform();
    }

    public void pleaseWaitForTheLoadingToComplete() {
        try {
            new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class).until((Function<WebDriver, WebElement>) driver -> driver.findElement(By.xpath("//*[contains(@text,'Please')]")));
        } catch (TimeoutException e) {
            //Element is not visible
        }
    }

    public void pressEnterAndroid() {
        if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("local")) {
            Actions action1 = new Actions(driver);
            action1.sendKeys(Keys.ENTER).perform();
        } else {
            Map<String, Object> EnterKeyEvent = new HashMap<>();
            EnterKeyEvent.put("key", "66");
            driver.executeScript("mobile:key:event", EnterKeyEvent);
        }
    }

    public void waitForElementToAppear(MobileElement ele, int waitTime) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, waitTime);
            wait.until(ExpectedConditions.visibilityOf(ele));
        }
        catch (NoSuchElementException | ElementNotVisibleException | TimeoutException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public void swipeVertical(
            double startPercentage, double finalPercentage, double anchorPercentage, int duration)
            throws Exception {
        org.openqa.selenium.Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        getTouchAction().press(PointOption.point(anchor, startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                .moveTo(PointOption.point(anchor, endPoint)).release().perform();
    }

    public TouchAction getTouchAction() {
        return new TouchAction(driver);
    }

    public String getAttribute(MobileElement ele, String attribute) {
        return ele.getAttribute(attribute);
    }


    public void enterKey(WebElement element, String keyValue) {
        element.click();
        if (getPlatformName().equalsIgnoreCase("ios")) {

            try {
                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
                    Thread.sleep(1000);
                } else {
                    Thread.sleep(1500);
                }
                TouchAction action = new TouchAction(driver);
                action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
                element.sendKeys(Keys.DELETE);
                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
                    Thread.sleep(500);
                } else {
                    Thread.sleep(1000);
                }
                element.sendKeys(keyValue + "\n");
            } catch (InterruptedException e) {
                // do nothing
            }
        } else {
            element.clear();
            element.sendKeys(keyValue);

            try {

                try {

                    if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("local")) {
                        Thread.sleep(1000);
                        Actions action = new Actions(driver);
                        action.sendKeys(Keys.ENTER).perform();

                    } else {
                        Map<String, Object> EnterKeyEvent = new HashMap<>();
                        EnterKeyEvent.put("key", "66");
                        driver.executeScript("mobile:key:event", EnterKeyEvent);

                    }
                } catch (InterruptedException e) {

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Boolean isElementVisible(List<WebElement> element, long waitTime) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        if (element.size() > 0) {
            return true;
        }
        return false;
    }

    public void scrollToTop(int count) {
        for (int i = 0; i < count; i++) {
            int pressX = driver.manage().window().getSize().width / 2;
            int bottomY = driver.manage().window().getSize().height * 4 / 5;
            int topY = driver.manage().window().getSize().height / 8;
            scroll(pressX, topY, pressX, bottomY);
        }
    }

    public void clickElementByText(String text) {
        List<MobileElement> els;
        if (getPlatformName().equalsIgnoreCase("ios")) {
            els = driver.findElements(By.xpath("//XCUIElementTypeButton"));
            MobileElement ele = els.stream().filter(el -> el.isDisplayed() && el.getAttribute("value").contentEquals(text)).findFirst().orElseThrow(() -> new NoSuchElementException(" Element not found with exact text: " + text));

        } else els = driver.findElements(By.xpath("//android.widget.TextView"));
        MobileElement ele = els.stream().filter(el -> el.isDisplayed() && el.getAttribute("text").equalsIgnoreCase(text)).findFirst().orElseThrow(() -> new NoSuchElementException(" Element not found with exact text: " + text));
        ele.click();
    }

    public void switchToWebContext() {
        try {
            Set contextNames = driver.getContextHandles();
            logger.info("Context Names: " + contextNames);
            if (driver.getContext().contains("NATIVE")) {
                if (contextNames.contains("WEBVIEW_1")) {
                    driver.context("WEBVIEW_1");
                } else if (contextNames.contains("WEBVIEW_chrome")) {
                    driver.context("WEBVIEW_chrome");
                } else {
                    driver.context("WEBVIEW_safari");
                }
                logger.info("switched to web view.....");
            } else if (driver.getContext().contains("WEBVIEW")) {
                System.out.println("Already in web view.....");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


    public void switchToNativeContext() {
        try {
            Set contextNames = driver.getContextHandles();
            logger.info("Context Names: " + contextNames);
            if (driver.getContext().contains("NATIVE")) {
                System.out.println("Already in Native view.....");
            } else if (driver.getContext().contains("WEBVIEW")) {

                driver.context("NATIVE_APP");
                waitForAppSync("MEDIUM_WAIT");
                logger.info("switched to Native view.....");
            }

            reactivateAPP();
            waitForAppSync("MEDIUM_WAIT");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


//    public String generateRandomEmail(int length, String domain) {
//        String allowedChars = "1234567890";
//        String email = "";
//        String temp = RandomStringUtils.random(length, allowedChars);
//        GlobalVar.Random_User = "bvt" + temp.substring(0, temp.length() - 4);
//        if (domain.contains("mail7")) {
//            email = GlobalVar.Random_User + "@mail7.io";
//        } else if (domain.contains("mailsac")) {
//            email = GlobalVar.Random_User + "@mailsac.com";
//        }
//        GlobalVar.random_email = email;
//        logger.info("Generated Random email:" + email);
//        return email;
//    }

    public String generateRandomEmail(int length) {

        String allowedChars = "1234567890";
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        GlobalVar.Random_User = "automation" + temp.substring(0, temp.length() - 4);
        email = GlobalVar.Random_User + "@mail7.io";
        GlobalVar.random_email = email;
        System.out.println(email);
        return email;
    }

//    public String generateRandomPhoneNumber() {
//        Random r = new Random();
//        long numbers = r.nextInt(1_000_000_000)               // Last 9 digits
//                + (r.nextInt(90) + 10) * 1_000_000_000L;
//        logger.info("Generated Random mobile num:" + numbers);
//        return String.valueOf(numbers);
//    }

    public static String generateRandomPhoneNumber(int length) {

        String allowedChars = "1234567890";
        String Phone = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        Phone = temp.substring(0, temp.length() - 4);
        System.out.println(Phone);
        return Phone;
    }

    public void typeFromKeyboard(MobileElement element, String keyValue) {
        try {
            element.click();
            driver.getKeyboard().pressKey(keyValue);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


    public void clickElement(WebElement ele) {
        int count = 0;
        while (count < 3) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, WAIT_FOR_ELEMENT_TIMEOUT);
                MobileElement element = (MobileElement) wait.until(ExpectedConditions.visibilityOf(ele));
                if (element.isDisplayed()) {
                    element.click();
                    break;
                }
            } catch (StaleElementReferenceException e) {
                //StaleElementReferenceException caught, trying again..
            }
            count++;
        }
    }

    public void clearElement(WebElement element) {
        try {
            element.clear();
        } catch (Exception e) {
            // e.printStackTrace();
        }

    }

    public String returnUserFromEmail(String email) {
        return email.split("@")[0];
    }

    public void waitForAppSync(String waitType) {
        switch (waitType) {
            case "LESS_WAIT":
                try {
                    Thread.sleep(LESS_WAIT);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;

            case "MEDIUM_WAIT":
                try {
                    Thread.sleep(MEDIUM_WAIT);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "HIGH_WAIT":
                try {
                    Thread.sleep(HIGH_WAIT);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
        }

    }

    public void executeProcess(String cmd) {
        ProcessBuilder processBuilder = new ProcessBuilder();

        // Run a shell command
        processBuilder.command("bash", "-c", cmd);

        try {

            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + " ");
            }

            BufferedReader ereader = new BufferedReader(
                    new InputStreamReader(process.getErrorStream()));

            String eline;
            while ((eline = ereader.readLine()) != null) {
                output.append(eline + " ");
            }

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                logger.info("Success");
                logger.info(output);

            } else {
                logger.info("Failure");
                logger.info(output);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void resetAPP() {
        try {
            driver.resetApp();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void closeAndReactivateAPP() {
        driver.closeApp();
        driver.activateApp(getAppPackageOrBundleId());
        waitForAppSync("HIGH_WAIT");
    }

    public void reactivateAPP() {
        try {
            driver.activateApp(getAppPackageOrBundleId());
            waitForAppSync("HIGH_WAIT");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public String getAppPackageOrBundleId() {
        String appPackage = null;
        if (getPlatformName().equalsIgnoreCase("android")) {
            appPackage = driver.getCapabilities().getCapability(AndroidMobileCapabilityType.APP_PACKAGE).toString();
        } else if (getPlatformName().equalsIgnoreCase("iOS")) {
            appPackage = driver.getCapabilities().getCapability("bundleId").toString();
        }
        return appPackage;
    }

    public boolean isElementClickable(MobileElement ele, int i) {
        boolean found = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, WAIT_FOR_ELEMENT_TIMEOUT);
            MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(ele));
            String status = getAttribute(element, "clickable");
            if (status.equalsIgnoreCase("true")) {
                found = true;
            }
        } catch (Exception ignored) {
        }
        return found;
    }

    public boolean nativeScrollDownTillElementDisplayed(WebElement element) {
        for (int count = 1; count < WAIT_FOR_ELEMENT_TIMEOUT; count++) {
            try {
                if (element.isDisplayed()) {
                    return true;
                }
            } catch (Exception ignored) {
            }
            scrollDown(count);
        }
        return false;
    }

}

