package pageAction;

import helper.Action;
import pageObject.HomePage;

public class HomeAction {

    public void assertThereIsSearchFeature(){
        Action.assertThereIs(HomePage.searchBox);
    }

}
