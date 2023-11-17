package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TS001_LoginStepDefinition {
	@Given("user is on home page")
	public void user_is_on_home_page() {
	   System.out.println("Launch Browser and connect Rediff");
	}
	@When("user clicks on Signin link")
	public void user_clicks_on_signin_link() {
	   System.out.println("Click on Signin Link");
	}
	@Then("next page opens check title")
	public void next_page_opens_check_title() {
	  System.out.println("Validate Title");
	}
	@When("user enter user name and password clicks on submit button")
	public void user_enter_user_name_and_password_clicks_on_submit_button() {
	 System.out.println("Click on Submit button");
	}
	@Then("check user and display Login successful message")
	public void check_user_and_display_login_successful_message() {
	   System.out.println("Display Login Successful");
	}
	@Then("Close Application")
	public void close_application() {
	    System.out.println("Logout...");
	}



}
