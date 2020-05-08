package sf.automation.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import sf.automation.base.DriverInstance;

public class StepDefinition {
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    DriverInstance.startDriverInstance();
	    
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
		
			
	    
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
	    
		
	}

	@When("^user clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
	    
	}

	@Then("^user should be loggedin$")
	public void user_should_be_loggedin() throws Throwable {
	    
	}

	@When("^user clicks on Logout button$")
	public void user_clicks_on_Logout_button() throws Throwable {
	    
	}

	@Then("^user should be logged out$")
	public void user_should_be_logged_out() throws Throwable {
	    
	}

	@Given("^user is on reigstration page$")
	public void user_is_on_reigstration_page() throws Throwable {

	}

	@When("^user enters email address$")
	public void user_enters_email_address() throws Throwable {
	
	}

	@When("^user enters confirm password$")
	public void user_enters_confirm_password() throws Throwable {
	
	}

	@When("^user enters date of birth$")
	public void user_enters_date_of_birth() throws Throwable {
	
	}

	@When("^user enters phone number$")
	public void user_enters_phone_number() throws Throwable {
	    
	}

	@When("^user enters address$")
	public void user_enters_address() throws Throwable {
	    
	}

	@When("^user clicks on the home address type$")
	public void user_clicks_on_the_home_address_type() throws Throwable {
	    
	}

	@When("^user select gender$")
	public void user_select_gender() throws Throwable {
	    
	}

	@When("^user select country$")
	public void user_select_country() throws Throwable {
	    
	}

	@When("^user select state$")
	public void user_select_state() throws Throwable {
	    
	}

	@When("^user enters city$")
	public void user_enters_city() throws Throwable {
	    
	}

	@When("^user enters zip code$")
	public void user_enters_zip_code() throws Throwable {
	    
	}

	@When("^user click on agree checkbox$")
	public void user_click_on_agree_checkbox() throws Throwable {
	    
	}

	@When("^user click on signup button$")
	public void user_click_on_signup_button() throws Throwable {
	    
	}

	@Then("^auser account should be created$")
	public void auser_account_should_be_created() throws Throwable {
	    
	}

}
