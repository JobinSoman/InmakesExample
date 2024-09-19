package org.newchl;

import org.POJO.MynthraPOJO;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MynthraLogin extends BaseClass
{
	Actions act;
	MynthraPOJO mp;
	@Given("Launch the mynthra application")
	public void launchTheMynthraApplication() 
	{
	    OpenApplication("https://www.myntra.com/");
	}
	@When("Hover over the profile icon")
	public void hoverOverTheProfileIcon() 
	{
		
	    act=new Actions(driver);
	    mp=new MynthraPOJO();
	    act.moveToElement(mp.getProfile()).perform();
	}
	@When("Click on the sign button")
	public void clickOnTheSignButton() 
	{
		Click(mp.getLogin());
	}
		
	@When("Enter the invalid phone number")
	public void enterTheInvalidPhoneNumber() 
	{
	   Write(mp.getPhno(),"7894561235");
	}
	@When("Click on the continue button")
	public void clickOnTheContinueButton() 
	{
	    Click(mp.getCntnue());
	}
	@When("Click on login using password")
	public void clickOnLoginUsingPassword() throws InterruptedException 
	{
		Thread.sleep(35000);
		Click(mp.getPass());
	}
	@When("Enter the password")
	public void enterThePassword() 
	{
		Write(mp.getPassword(),"adada7455");

	}
	@Then("Click on the login button")
	public void clickOnTheLoginButton() 
	{
	    Click(mp.getLoginbtn());
	}
}
