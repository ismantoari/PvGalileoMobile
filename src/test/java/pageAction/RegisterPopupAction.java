package pageAction;

import helper.Action;
import pageObject.RegisterPopupPage;

public class RegisterPopupAction {
    public void popupRegister(String popupText){
       String alertText = Action.getContentDesc(RegisterPopupPage.popupPhoneOrEmailAlreadyRegister);
//       String alertText2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Register\n" +
//               "Phone or Email already registered\"]")).getAttribute("content-desc");
        System.out.println("alert: " + alertText);
    }
}
