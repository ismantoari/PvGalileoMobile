package stepDefs;

import io.cucumber.java.en.And;
import pageAction.PermissionAction;

public class NotificationSettingStepdefs {

    PermissionAction permissionAction = new PermissionAction();

        @And("user reject allow notification")
    public void rejectNotificationPermit(){
            permissionAction.rejectNotificationPermit();
        }

    @And("user accept permission of notification")
    public void userAcceptPermissionOfNotification() {
            permissionAction.allowNotification();
    }
}
