package org.POJO;


import org.newchl.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPOJO extends BaseClass
{	
	public FBLoginPOJO() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(linkText="Log in")
	private WebElement login;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
}
