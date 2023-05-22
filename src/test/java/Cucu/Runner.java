package Cucu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/VI20466289/eclipse-workspace/IRCTC/src/main/java/Cucu/Login.feature"
		,glue={"Cucu"}
		)
public class Runner {
	

}
