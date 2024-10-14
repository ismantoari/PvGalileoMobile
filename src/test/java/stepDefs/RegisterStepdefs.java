package stepDefs;

import io.cucumber.java.en.And;
import pageAction.RegisterAction;


public class RegisterStepdefs {
    RegisterAction registerAction = new RegisterAction();

        @And("user input registration full name with value {string}")
        public void userInputRegistrationFullNameWithValue(String inputValue) {
            registerAction.inputRegistrationFullName(inputValue);
        }


    @And("user input date of birth {string}")
    public void userInputDateOfBirth(String inputValue) {
            registerAction.inputDateOfBirth(inputValue);
    }

    @And("user input email {string}")
    public void userInputEmail(String inputValue) {
            registerAction.inputEmail(inputValue);
    }

    @And("user input phone number {string}")
    public void userInputPhoneNumber(String inputValue) {
            registerAction.inputPhoneNumber(inputValue);
    }

    @And("user select gender {string}")
    public void userSelectGender(String inputValue) {
            registerAction.selectGender(inputValue);
    }



}
