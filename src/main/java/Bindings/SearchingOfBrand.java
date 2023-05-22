package Bindings;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchingOfBrand {
	@Given("^Hello from brandsearch$")
    public void hello_from_brandsearch() throws Throwable {
       System.out.println("hii");
    }

    @When("^I hovered over the Brands Tab$")
    public void i_hovered_over_the_brands_tab() throws Throwable {
    	 System.out.println("hovered over the Brands");
    }

    @When("^I Searched for Brand Name$")
    public void i_searched_for_brand_name() throws Throwable {
    	 System.out.println("Searched for Brand");
    }

    @When("^I Searched for Invalid Brand Name$")
    public void i_searched_for_invalid_brand_name() throws Throwable {
    	 System.out.println("Searched for Invalid Brand ");
    }

    @Then("^i verified that brandmane got searched sucessfully$")
    public void i_verified_that_brandmane_got_searched_sucessfully() throws Throwable {
    	 System.out.println("verified that brandmane got searched sucessfully");
    }


}
