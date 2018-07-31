package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// TestRunner : here we specify the options for cucumber and state that it's going to be running tests using testNG

@CucumberOptions(features = {"src/test/resources/features"}, plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"}, glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests {
}
