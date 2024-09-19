package org.newchl;

import java.util.List;
import java.util.Map;

import org.POJO.SignInPOJO;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBRegistration extends BaseClass
{
	SignInPOJO si;
	Select sl;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() 
	{
	   LaunchBrowser();
	   Maximize();
	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() 
	{
	    OpenApplication("https://www.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() 
	{
	   si=new SignInPOJO();
	   Click(si.getNewAccount());
	}

	@When("To pass first name in first name text box")
	public void to_pass_first_name_in_first_name_text_box(DataTable d) throws InterruptedException 
	{
		Thread.sleep(10000);
		Map<String, String> m=d.asMap(String.class, String.class);
		Write(si.getFirstName(),m.get("firstname3"));
	}

	@When("To pass second name in second name text box")
	public void to_pass_second_name_in_second_name_text_box(DataTable dt) 
	{
		List<String> li = dt.asList();
		Write(si.getSecondName(),li.get(2));
	}

	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box(DataTable dt) 
	{
		List<Map<String, String>> mp = dt.asMaps();
		Write(si.getMobileNo(),mp.get(1).get("email"));
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box(DataTable dt) 
	{
		List<List<String>> li=dt.asLists();
		Write(si.getPassword(),li.get(1).get(0));
	}
	@When("To select date from date field of DOB")
	public void to_select_date_from_date_field_of_dob() 
	{
		sl=new Select(si.getDob());
		sl.selectByValue("12");
	   
	}

	@When("To select month from month field of DOB")
	public void to_select_month_from_month_field_of_dob() 
	{
		sl=new Select(si.getDom());
		sl.selectByVisibleText("Jun");
	}

	@When("To select year from year field of DOB")
	public void to_select_year_from_year_field_of_dob() 
	{
		sl=new Select(si.getDoy());
		sl.selectByValue("1996");
	}

	@When("To click the radio button of gender field")
	public void to_click_the_radio_button_of_gender_field() 
	{
	    Click(si.getGender());
	}

	@When("To click the signup button")
	public void to_click_the_signup_button() 
	{
		 Click(si.getSubmit());
	}


	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() 
	{
	   QuitBrowser();
	}
}
