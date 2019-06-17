package Runner;
import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\prerna\\eclipse-workspace\\TestBDDWithExample\\Feature\\resetfeature.feature",
				  glue={"StepDefinitions"},
				  plugin= {"pretty:html:target"},
				  monochrome=true
)	
public class ResetRunner {

	
}
