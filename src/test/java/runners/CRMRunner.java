package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish=true,
		features="src//test//resources//LoginFeature//login.feature",
		glue= {"stepdefs"},
		dryRun=false , //if we make it as true, then it will check all step definition is defined or not
		monochrome=true, //if it is true, then this will remove junk characters from console
		plugin= {"pretty"}
		)
public class CRMRunner extends AbstractTestNGCucumberTests{

}
