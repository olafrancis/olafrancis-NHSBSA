package runnerAll;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/features/Checkertool.feature",
		glue = "stepDefinitions",
		monochrome = true,
		plugin = {"pretty", "json:target/cucumber.json"}//html:test-output"}
		)

public class TestRunner {

}
