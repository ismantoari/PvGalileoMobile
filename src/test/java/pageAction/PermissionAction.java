package pageAction;

import helper.Action;
import org.openqa.selenium.By;
import pageObject.PermissionPage;

import static helper.BaseTest.driver;
import static pageObject.PermissionPage.rejectNotificationPermit;

public class PermissionAction {
    public void rejectNotificationPermit(){

        Action.click(rejectNotificationPermit);
    }
    public void allowNotification(){
        driver.findElement(By.xpath(".//android.widget.Button[@text='Allow']")).click();
        Action.click(PermissionPage.allowNotificationPermit);
    }


}
