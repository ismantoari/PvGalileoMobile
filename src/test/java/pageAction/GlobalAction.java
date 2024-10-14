package pageAction;

import helper.Action;
import pageObject.GlobalPage;

public class GlobalAction {



    public void clickButton(String buttonName){

        Action.click(GlobalPage.button(buttonName));
    }

    public void clickDropdownValue(String explainationText){
        Action.click(GlobalPage.dropdownValue(explainationText));
    }

    public void assertOpenPage(String pageName){
        Action.getContentDesc(GlobalPage.pageName(pageName));
    }


}
