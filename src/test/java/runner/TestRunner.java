package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = { "stepDefination" }, tags = "@Smoke", plugin = {
		"html:target/cucumber-report/cucumber.html", "json:target/cucumber-report/cucumber.json",
		"junit:target/cucumber-report/cucumber.xml" })

public class TestRunner {

}
