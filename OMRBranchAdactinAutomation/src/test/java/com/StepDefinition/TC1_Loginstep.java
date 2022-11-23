package com.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_Loginstep {

	@Given("User is on the hotel page")
	public void user_is_on_the_hotel_page() {
	}
	
	@When("User should enter login {string} and {string}")
	public void user_should_enter_login_and(String string, String string2) {
	}

	@When("User should enter login {string} and {string}  with ENTER KEY")
	public void user_should_enter_login_and_with_enter_key(String string, String string2) {
	}

	@Then("User should verfied the login page with invalid credential error message contains  {string}")
	public void user_should_verfied_the_login_page_with_invalid_credential_error_message_contains(String string) {

	}






}
