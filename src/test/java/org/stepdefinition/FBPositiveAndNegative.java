package org.stepdefinition;

import org.POJO.FBLoginPOJO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBPositiveAndNegative extends BaseClass
{
	FBLoginPOJO fb;
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window()
	{
		LaunchBrowser();
		Maximize();
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() 
	{
		OpenApplication("https://www.facebook.com/");
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) 
	{
		fb=new FBLoginPOJO();
		Write(fb.getEmail(),em);
	}

	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String ps) 
	{
		Write(fb.getPassword(),ps);
	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() 
	{
		Click(fb.getLogin());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() 
	{
		QuitBrowser();
	}

}
