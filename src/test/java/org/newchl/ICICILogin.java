package org.newchl;

import org.POJO.ICICILoginPOJO;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class ICICILogin extends BaseClass
{
	ICICILoginPOJO ic;
	@Given("Launch the page of ICICI bank login page")
	public void launchThePageOfICICIBankLoginPage() 
	{
	   OpenApplication("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_gl=1*30xkeg*_ga*MTgzMDcxOTY5Ni4xNjIwMDM5NDU0*_ga_SKB78GHTFV*MTYyODIzNDM4NC43Ny4xLjE2MjgyMzQ1MDQuMjc.&_ga=2.92094746.1084279428.1697432242-1973315115.1690798212&_gac=1.213008672.1697523963.EAIaIQobChMI-7jpvrn8gQMVt6lmAh1nywMHEAAYASAAEgKBxfD_BwE?ITM=nli_personalb_personal_login_btn");
	}
	@And("Click the field of login using userid")
	public void clickTheFieldOfLoginUsingUserid() 
	{
	    ic=new ICICILoginPOJO();
	    Click(ic.getUserid());
	}
	@And("Pass the userid {string} of the user")
	public void passTheUseridOfTheUser(String uid) 
	{
	    Write(ic.getId(),uid);
	}
	@And("Pass the password {string} of the user")
	public void passThePasswordOfTheUser(String ps) 
	{
		Write(ic.getPassword(),ps);
	}
	
	@Then("Hit the login button")
	public void hitTheLoginButton() 
	{
	    Click(ic.getLogin());
	}
}
