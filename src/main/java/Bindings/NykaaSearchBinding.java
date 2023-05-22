package Bindings;

import org.junit.runner.RunWith;

import Pages.Nykaahomepage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

public class NykaaSearchBinding {
	
	

	public String SearchData="Lipstick";
	

	    @Given("^I Launch thr application$")
	    public void i_launch_thr_application() throws Throwable {
	        
	    }

	    @When("^I Clicked on Search area$")
	    public void i_clicked_on_search_area() throws Throwable {
	    	Nykaahomepage.ClickAndEnterTextInSearchArea(SearchData);
	    }

	    @Then("^I verified that search result$")
	    public void i_verified_that_search_result() throws Throwable {
	        
	    }

	    @And("^I entered product name$")
	    public void i_entered_product_name() throws Throwable {
	        
	    }

	    @And("^I selected data from suggestion$")
	    public void i_selected_data_from_suggestion() throws Throwable {
	        
	    }

	

}
