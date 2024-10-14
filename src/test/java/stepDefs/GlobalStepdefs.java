package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageAction.GlobalAction;

public class GlobalStepdefs {

    GlobalAction globalAction = new GlobalAction();

        @And ("user click button {string}")
              public void userClickButton(String buttonName){
                globalAction.clickButton(buttonName);

        }

    @And("user click checkbox {string}")
    public void userClickCheckbox(String explainationText) {
            globalAction.clickDropdownValue(explainationText);
    }

    @Then("assert open page {string}")
    public void assertOpenPage(String pageName) {
        globalAction.assertOpenPage(pageName);
    }
}

