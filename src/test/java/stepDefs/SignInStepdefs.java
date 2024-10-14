package stepDefs;

import io.cucumber.java.en.And;
import pageAction.SignInAction;


public class SignInStepdefs {

    SignInAction signInAction = new SignInAction();


    @And("user input phone number or email {string}")
    public void userInputPhoneNumberOrEmail(String inputValue) {
        signInAction.inputPhoneNumberOrEmail(inputValue);
    }

    @And("user click register")
    public void userClickRegister() {
        signInAction.clickRegister();
    }
}
