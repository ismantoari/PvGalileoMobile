package stepDefs;

import io.cucumber.java.en.Then;
import pageAction.GlobalAction;
import pageAction.HomeAction;

public class HomeStepdefs {
        GlobalAction globalAction = new GlobalAction();
        HomeAction homeAction = new HomeAction();

        @Then("assert there is {string}")
        public void assertThereIs(String iconName){
                globalAction.assertThereIs(iconName);

        }

        @Then("assert there is search box ")
        public void assertThereIsSearchFeature() {
                homeAction.assertThereIsSearchFeature();
        }
}
