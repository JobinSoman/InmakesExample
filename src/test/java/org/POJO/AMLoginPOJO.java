package org.POJO;

import org.newchl.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMLoginPOJO extends BaseClass
{
	public AMLoginPOJO() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ap_email")
	private WebElement email;

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement sigin;
	
	@FindBy(id="continue")
	private WebElement contnu;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigin() {
		return sigin;
	}
	
	public WebElement getContinue() {
		return contnu;
	}
}
