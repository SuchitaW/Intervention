package runner;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.junit.AfterClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pageobjects.TestListener;
import stepDefs.StepDefs_Hooks;


import utility.SendMail;




@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/test/resources/features/Login.feature"},				// to tell cucumber where is the feature file
		features ="classpath:features",
		glue = "stepDefs",		// to tell cucumber where is the step definition code
		tags = "  @exportExcel",										// to tell which tagged feature file to execute
		plugin = {"pretty",								// to show console output as pretty with proper formatting
				"html:target/html/CucumberBDD4.0_Report.html", 	// to generate html report inside target folder
				"json:target/json/file.json",			// to generate json report inside target folder
				"junit:target/cucumberXML.xml",
				"rerun:target/failedrerun.txt",			// to generate failed test scenarios data in failedrerun.txt file
	            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			    "timeline:test-output-thread/"
	           },
		publish = true,									// to publish cucumber online report
		monochrome = true,								// to print output on console with proper alignment and systematic way
		dryRun = false									// to tell whether to test run (true) or actual run (false)
		)

public class TestRunner {

			}

	
		 
		 
		 
		