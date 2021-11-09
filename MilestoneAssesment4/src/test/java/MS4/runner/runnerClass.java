package MS4.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/MS4/feature", glue = "MS4.stepDefination")
public class runnerClass {

}
