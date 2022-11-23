package com.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep {




	@When("User should enter {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	}



	@When("User should enter manatory fieds only {string},{string},{string},{string} and {string}")
	public void user_should_enter_manatory_fieds_only_and(String string, String string2, String string3, String string4, String string5) {
	}

	@Then("User should verfied the search page date with invalid date error message {string} and {string}")
	public void user_should_verfied_the_search_page_date_with_invalid_date_error_message_and(String string, String string2) {
	}


	@When("User should enter search button without enter any field")
	public void user_should_enter_search_button_without_enter_any_field() {
	}
	@Then("User should verfied the search page location with error message {string}")
	public void user_should_verfied_the_search_page_location_with_error_message(String string) {
	}











}
