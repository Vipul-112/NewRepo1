package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/VI20466289/eclipse-workspace/IRCTC/src/main/java/Features/PetStorePBl.feature"
		,glue={"BDD"},
		tags="@Pet"
		)
public class Runner2 {

}
