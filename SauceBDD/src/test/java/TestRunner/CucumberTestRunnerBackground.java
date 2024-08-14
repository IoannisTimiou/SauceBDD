package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/Background"},
glue= {"BackgroundStepDefinitions"},
plugin= {"pretty", "html:target/backgroundtestreport.html"})

public class CucumberTestRunnerBackground extends AbstractTestNGCucumberTests {

}
