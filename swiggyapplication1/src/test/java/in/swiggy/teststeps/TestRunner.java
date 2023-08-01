 package in.swiggy.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "Features",
		glue = "in.swiggy.teststeps"
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
