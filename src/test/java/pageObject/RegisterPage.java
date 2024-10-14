package pageObject;

import org.openqa.selenium.By;

public class RegisterPage {
    public static By inputFullName = By.xpath("//android.widget.EditText[1]");
    public static By buttonDateOfBirth = By.xpath("//android.widget.ImageView");
    public static By buttonPencilDateOfBirth = By.xpath("(//android.widget.Button[1])[2]");
    public static By inputTextBoxEnterDate = By.xpath("//android.widget.EditText");
    public static By buttonOk = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");

    public static By inputTextBoxEmail = By.xpath("//android.view.View[@content-desc=\"Welcome\n" +
            "Let's Join Us.\"]/android.widget.EditText[2]");

    public static By inputTextBoxPhoneNumber = By.xpath("//android.view.View[@content-desc=\"Welcome\n" +
            "Let's Join Us.\"]/android.widget.EditText[3]");

    public static By dropdownGender = By.xpath("//android.widget.Button[1]");
    public static By selectDropdownGenderValue(String inputValue){
        return By.xpath("//android.view.View[@content-desc='"+inputValue+"']");
    }


}
