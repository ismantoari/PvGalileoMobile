package pageObject;

import org.openqa.selenium.By;

public class GlobalPage {

    public static By button(String buttonName) {
        return By.xpath("//android.widget.Button[@content-desc='"+buttonName+"']");
    }

    public static By dropdownValue(String explainationText){
        return By.xpath("//android.view.View[@content-desc='"+explainationText+"']/preceding-sibling::android.widget.CheckBox");
    }

    public static By menu(String menuName) {
        return By.xpath("//*[@role='button']/descendant::*[text()='" + menuName + "']");
    }



    public static By checkbox (String marking){
        return By.xpath("//*[text()='"+marking+"']/preceding-sibling::span");
    }

    public static By radioButton (String groupName, String labelRadio){
        return By.xpath("(//*[text()='"+groupName+"']//parent::div/following-sibling::div/descendant::div[text()='"+labelRadio+"'])//parent::span/preceding-sibling::span");
    }

    public static By toggleSwitch (String marking){
        return By.xpath("//span[text()='"+marking+"']/preceding-sibling::span/child::*");
    }
    public static By pageName (String targetValue){
        return By.xpath("//android.view.View[@content-desc='"+targetValue+"']");
    }


}
