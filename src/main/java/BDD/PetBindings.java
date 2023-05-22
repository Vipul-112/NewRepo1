package BDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PetBind.PetBM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PetBindings  {
	
	
	
	
	
	@Given("^I open Sign in page$")
    public void i_open_sign_in_page() throws Throwable {
		 PetBM.start();}
		 
		 
		 
    @When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_username_and_password(String string, String string2) {

    	PetBM.UsernameAndPAssword(string, string2);
	            
    }
    
    @And("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
    	PetBM.loginbutton();
    }



    

}
	


