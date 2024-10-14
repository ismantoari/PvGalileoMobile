package pageObject;

import org.openqa.selenium.By;

public class PermissionPage {
    //public static By allowNotificationPermit = By.id("com.android.permissioncontroller:id/permission_allow_button");
    public static By allowNotificationPermit = By.xpath(".//android.widget.Button[@text='Allow']");

    public static By rejectNotificationPermit = By.id("com.android.permissioncontroller:id/permission_deny_button");

}
