package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target/failedrerun.txt",			// to tell cucumber where is the feature file
	 glue = {"stepDefs"},			// to tell cucumber where is the step definition code
		tags = "",										// to tell which tagged feature file to execute
		plugin = {"pretty",								// to show console output as pretty with proper formatting
				"html:targetRerun/html/CucumberBDD4.0_Re-Report.html", 	// to generate html report inside target folder
				"json:targetRerun/json/file.json",			// to generate json report inside target folder
		},
		publish = true,									// to publish cucumber online report
		monochrome = true,								// to print output on console with proper alignment and systematic way
		dryRun = false									// to tell whether to test run (true) or actual run (false)
		)


public class TestRunnerRerun {

}
