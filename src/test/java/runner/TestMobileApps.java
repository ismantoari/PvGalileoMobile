package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:reports/Primavista-MobileGalileo.html","json:reports/Primavista-MobileGalileo.json"},
        features ="src/test/resources",
        tags = "@mobile",
        glue = {"stepDefs"}

)

public class TestMobileApps {
}
