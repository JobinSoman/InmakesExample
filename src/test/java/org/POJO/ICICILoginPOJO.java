package org.POJO;

import org.newchl.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ICICILoginPOJO extends BaseClass
{
	public ICICILoginPOJO() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@title='Login using User ID and password']")
	private WebElement userid;
	
	@FindBy(xpath="//input[@title='User Id']")
	private WebElement id;
	
	public WebElement getUserid() {
		return userid;
	}

	public WebElement getId() {
		return id;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath="(//input[@title='Password'])[1]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@title='Log In'])[1]")
	private WebElement login;
	
}
