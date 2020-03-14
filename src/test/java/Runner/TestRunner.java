package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (
		features = "./src/main/java/Features/"
		, glue={"StepDefination"}
		, monochrome=true
		,format= {"pretty","html:test-output","json:json_output/login.json","junit:junit_output/login.xml"}, 
		dryRun= false
		
		) 

public class TestRunner {
}
