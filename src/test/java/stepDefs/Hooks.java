package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.Objects;

import static helper.BaseTest.driver;
import static helper.BaseTest.startDriver;


public class Hooks {
    String tagsRunning = null;

    @Before
    public void beforeTest(Scenario scenario) throws Exception{

        String[] tags = scenario.getSourceTagNames().toArray(new String[0]);
        tagsRunning = tags[0];
        if (Objects.equals(tagsRunning, "@mobile")) {
            startDriver();
        }
    }

    @After
    public void afterTest(Scenario scenario) throws InterruptedException {
        if (Objects.equals(tagsRunning, "@mobile")) {
            //quitDriver();
            driver.quit();
        }
    }
}