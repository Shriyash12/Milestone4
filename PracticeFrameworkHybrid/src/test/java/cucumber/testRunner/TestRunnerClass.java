package cucumber.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/cucumber/feature", glue = "cucumber.stepDefination")
public class TestRunnerClass {

}
