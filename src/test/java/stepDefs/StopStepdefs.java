package stepDefs;

import io.cucumber.java.en.And;

public class StopStepdefs {
     @And("stop")
      public void stopAMinutes() throws Exception{
         Thread.sleep(5000);
     }

}
