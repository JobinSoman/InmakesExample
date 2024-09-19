package org.newchl;

import java.util.List;
import java.util.Map;

import org.POJO.AMLoginPOJO;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmzSignin extends BaseClass
{
	AMLoginPOJO am;
	@Given("Navigate the user to login page")
	public void navigateTheUserToLoginPage() 
	{
		OpenApplication("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}
	@When("Pass the email or phone number in email or mobile number field")
	public void passTheEmailOrPhoneNumberInEmailOrMobileNumberField(DataTable dt) 
	{
		am = new AMLoginPOJO();
		List<Map<String, String>> mps = dt.asMaps();
		Write(am.getEmail(), mps.get(1).get("phonenumber")); 
	}
	@When("Click on continue button")
	public void clickOnContinueButton() 
	{
	   Click(am.getContinue());
	}
	@When("Pass the password {string} in password field")
	public void passThePasswordInPasswordField(String ps) 
	{
	    Write(am.getPassword(),ps);
	}
	@Then("Click on sigin button")
	public void clickOnSiginButton() 
	{
		Click(am.getSigin());
	}
}
