package org.stepdefinition;

import org.POJO.FBLoginPOJO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbLogin extends BaseClass
{
	FBLoginPOJO fb;
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() 
	{
		LaunchBrowser();
		Maximize();
	}

	@When("To launch the url of the facebook")
	public void to_launch_the_url_of_the_facebook() 
	{
		OpenApplication("https://www.facebook.com/");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() 
	{
		fb=new FBLoginPOJO();
		Write(fb.getEmail(),"john@gmail.com");
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() 
	{
		Write(fb.getPassword()," ");
	}

	@When("To click the login button")
	public void to_click_the_login_button() 
	{
		Click(fb.getLogin());
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() 
	{
		System.out.println("To check your credential");
	}

	@Then("To close the browser")
	public void to_close_the_browser() 
	{
		QuitBrowser();
	}

}
