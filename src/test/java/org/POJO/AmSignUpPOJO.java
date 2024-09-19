package org.POJO;

import org.newchl.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmSignUpPOJO extends BaseClass
{
	public AmSignUpPOJO() 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="ap_customer_name")
	private WebElement name;
	
	@FindBy(id="ap_phone_number")
	private WebElement phno;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(id="continue")
	private WebElement cntnu;

	public WebElement getName() {
		return name;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCntnu() {
		return cntnu;
	}
	
}
