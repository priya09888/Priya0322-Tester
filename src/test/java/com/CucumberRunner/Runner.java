package com.CucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "FeaturesFilesFolder",
		glue = "com.StepDefination",
		plugin = "html:./CucumberReport/report.html",
		dryRun = false
		)


public class Runner extends AbstractTestNGCucumberTests {

}
