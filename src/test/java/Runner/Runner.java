package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/VI20466289/eclipse-workspace/IRCTC/src/main/java/Features/SearchingBrand Name.feature"
		,glue={"Bindings"},
		tags="@Brands",
		dryRun = true,
		monochrome = true
		
		)
public class Runner extends AbstractTestNGCucumberTests {
	

}