package cucumber.testRunner;

import org.testng.annotations.DataProvider;
//import org.junit.runner.RunWith;
import org.testng.annotations.Test;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {
					"src/test/resources/Features/calcLoan.feature",
					"src/test/resources/Features/homeLoanDetails.feature", 
					"src/test/resources/Features/pageUi.feature"
					},
		dryRun = false,
		glue = {"cucumber"},
		monochrome=true,
		
		plugin= {"pretty","html:cucumberreport/index.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		  tags = "@sanity or @regression"
		  )
public class TestRunner extends AbstractTestNGCucumberTests {
	
	}






