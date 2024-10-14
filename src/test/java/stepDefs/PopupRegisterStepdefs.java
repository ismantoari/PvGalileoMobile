package stepDefs;

import io.cucumber.java.en.Then;
import pageAction.RegisterPopupAction;

public class PopupRegisterStepdefs {

    RegisterPopupAction registerPopupAction = new RegisterPopupAction();
        @Then("appear popup register {string}")
        public void appearPopupRegister(String popupText){
            registerPopupAction.popupRegister(popupText);

    }
}
