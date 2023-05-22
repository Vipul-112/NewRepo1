package Bindings;

import java.util.List;

import io.cucumber.java.en.Given;

public class ABC {
	@Given("^I Am \"([^\"]*)\"$")
    public void i_am_something(String nameofperson, String strArg1) throws Throwable {
        System.out.println();
    }

}
