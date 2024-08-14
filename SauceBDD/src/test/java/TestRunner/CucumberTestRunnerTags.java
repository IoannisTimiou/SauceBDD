package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@Smoke and not @Performance", 
features= {"src/test/resources/FeaturesWithTags"},
glue= {"StepDefinitions"},
plugin= {"pretty", "html:target/htmlreport2.html"})

public class CucumberTestRunnerTags extends AbstractTestNGCucumberTests {

}
