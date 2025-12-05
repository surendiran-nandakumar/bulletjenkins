package runner;

import static java.util.Objects.requireNonNull;

import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/Reports/cucumber-report.json",
                "html:target/cucumber/cucumber.html",
                "junit:target/surefire-reports/cucumber-results.xml"
        },
        glue = { "scenarios.stepDefinitions", "hooks" }, // full package names
        features = "src/test/java/scenarios/features",    // path to .feature files
        dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
