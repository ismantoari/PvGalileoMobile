package helper;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.BaseTest.driver;

public class Action {


    public static Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    public static WebElement objectTarget;


    public static void click (By buttonObjectTarget){
        objectTarget = driver.findElement(buttonObjectTarget);
        wait.until(d -> objectTarget.isDisplayed());
        objectTarget.click();
    }



    public static void clickAppium (AppiumBy webElementTarget){
        objectTarget = driver.findElement(webElementTarget);
        wait.until(d -> objectTarget.isDisplayed());
        objectTarget.click();
    }

    public static void inputText (By inputTextObjectTarget, String inputValue){
        objectTarget = driver.findElement(inputTextObjectTarget);
        wait.until(d -> objectTarget.isDisplayed());
        objectTarget.click();
        objectTarget.clear();
        objectTarget.sendKeys(inputValue);
    }

    public static void clearText (By inputTextObjectTarget){
        objectTarget = driver.findElement(inputTextObjectTarget);
        wait.until(d -> objectTarget.isDisplayed());
        objectTarget.click();
        objectTarget.clear();
    }

    public static void inputTextAppium (AppiumBy textLocator, String inputValue){
        driver.findElement(textLocator).sendKeys(inputValue);
    }

    public static String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public static String getTextAppium(AppiumBy locator){
        return driver.findElement(locator).getText();
    }

    public static String getContentDesc(By objectElement ){
        return driver.findElement(objectElement).getAttribute("content-desc");
    }



    public static void longPress(WebElement ele){
        ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
                        "duration",2000));
    }

    public static void scrollAndFind(String text){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text('"+text+"'));"));
    }

    public static void scrollToEnd(){
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0
            ));
        }  while (canScrollMore);
    }


    //====  Assertion  ========

    public static void assertThereIs (By objectName){
       Assert.assertTrue(driver.findElement(objectName).isDisplayed());
    }

    //TEXT SAMA
    // WEB ELEMENT MUNCUL
    // SUATU LIST SUDAH HILANG


}
