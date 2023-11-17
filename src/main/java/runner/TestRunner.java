package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\2023\\solomon\\workspace\\CucumberBDD_FW\\src\\main\\java\\features"
		,glue={"stepDefinitions"}
		,plugin= {"pretty","json:target/myReports/report.json","junit:target/myReports/report.xml"}
		
		
		)



public class TestRunner {

}
