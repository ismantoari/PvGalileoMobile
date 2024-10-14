package helper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static helper.Endpoint.*;

public class BaseTest {

    public static AndroidDriver driver;

    //@Before
    public static AndroidDriver startDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName(deviceName);
       // options.setApp(apkLocation);
        options.setAppPackage(appPackage);
        options.setAppActivity(appActivity);
        options.autoGrantPermissions();
        options.noReset();
        driver = new AndroidDriver(new URL(urlServer), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public static AndroidDriver startDriver2() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", deviceName);
        //cap.setCapability("udid", "536e636d");
        cap.setCapability("platformVersion", androidVersion);
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", appPackage);
        cap.setCapability("appActivity", appActivity);
        // command for no reinstall every test run
        cap.setCapability("noReset", "true");
        cap.setCapability("fullReset", "false");
        //cap.setCapability("autoGrantPermissions","true");

        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, cap);
        //driver = new AndroidDriver(new URL(urlServer), cap);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    //wait.until(d -> revealed.isDisplayed());

    // === ex ===

//    public static AndroidDriver driver;
//    public AppiumDriverLocalService service;
//
//    @Before
//    public void ConfigureAppium() throws MalformedURLException{
//        service = new AppiumServiceBuilder().withAppiumJS(new File("/Users/User/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4723).build();
//        //service.start();
//
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("");
//        options.setApp("/Users/User/IdeaProjects/mobileTestAri/src/test/resources/ApiDemos-debug.apk");
//
//
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }

//    public static void startServer(){
//        //start server
//        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("/Users/User/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4723).build();
////        service.start();
//    }

//    public void longPressAction(WebElement ele){
//          ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
//                  ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
//                          "duration",2000));
//    }

//    public void scrollAndFind(){
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
//    }



   // @After
    public void quitDriver(){
        //stop driver
        driver.quit();
        //stop server
        //service.stop();

    }
}
