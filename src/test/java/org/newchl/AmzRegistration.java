package org.newchl;

import java.util.List;
import java.util.Map;

import org.POJO.AmSignUpPOJO;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmzRegistration extends BaseClass
{
	AmSignUpPOJO as;
	@Given("Navigate the user to registration page")
	public void navigateTheUserToRegistrationPage() 
	{
	    OpenApplication("https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex");
	}
	@When("Pass the first and last name of the user in your name field")
	public void passTheFirstAndLastNameOfTheUserInYourNameField(DataTable dt) 
	{
	    as=new AmSignUpPOJO();
	    List<List<String>> lis = dt.asLists();
	    Write(as.getName(),lis.get(0).get(0)+lis.get(0).get(1));
	}
	@When("Pass the phone number in mobile number field")
	public void passThePhoneNumberInMobileNumberField(DataTable dt) 
	{
		List<String> li = dt.asList();
	    Write(as.getPhno(),li.get(2));
	}
	@When("Pass the password in password field")
	public void passThePasswordInPasswordField(DataTable dt) 
	{
		Map<String, String> mp = dt.asMap();
	    Write(as.getPassword(),mp.get("pass3"));
	}
	@Then("Click on the verify mobile number button")
	public void clickOnTheVerifyMobileNumberButton() 
	{
	   Click(as.getCntnu());
	}

}
