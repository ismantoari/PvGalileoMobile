package pageAction;

import helper.Action;
import pageObject.SignInPage;

public class SignInAction {

    public void clickRegister(){
        Action.click(SignInPage.registerButton);
    }
    public void inputPhoneNumberOrEmail(String inputValue){
        Action.inputText(SignInPage.inputPhoneNumberOrEmail,inputValue);
    }
}
