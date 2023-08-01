package In.swiggy.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features",
		glue="In.swiggy.teststeps"

		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
