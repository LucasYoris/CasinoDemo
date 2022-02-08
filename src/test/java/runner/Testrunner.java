package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        //where read cucumber features
        features = "src/test/java/features",
        //where read test cases
        glue = ("Tests"),
        // export cucumber report
        plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html"},
        snippets = CAMELCASE
)
public class Testrunner {

}
