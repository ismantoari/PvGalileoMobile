package pageAction;

import helper.Action;
import pageObject.RegisterPage;

public class RegisterAction {
    public void inputRegistrationFullName(String inputValue){
        Action.inputText(RegisterPage.inputFullName, inputValue);
    }

    public void inputDateOfBirth(String inputValue){
        Action.click(RegisterPage.buttonDateOfBirth);
        Action.click(RegisterPage.buttonPencilDateOfBirth);
        Action.inputText(RegisterPage.inputTextBoxEnterDate, inputValue);

    }

    public void inputEmail(String inputValue){
        Action.click(RegisterPage.inputTextBoxEmail);
        Action.inputText(RegisterPage.inputTextBoxEmail,inputValue);
    }

    public void inputPhoneNumber(String inputValue){
        Action.click(RegisterPage.inputTextBoxPhoneNumber);
        Action.inputText(RegisterPage.inputTextBoxPhoneNumber,inputValue);
    }

    public void selectGender(String inputValue){
        Action.click(RegisterPage.dropdownGender);
        Action.click(RegisterPage.selectDropdownGenderValue(inputValue));
    }


}
