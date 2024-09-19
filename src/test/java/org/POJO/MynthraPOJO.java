package org.POJO;

import org.newchl.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MynthraPOJO extends BaseClass 
{
	public MynthraPOJO() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Profile']")
	private WebElement profile;
	
	@FindBy(xpath="//a[text()='login / Signup']")
	private WebElement login;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement phno;
	
	@FindBy(xpath="//div[@class='submitBottomOption']")
	private WebElement cntnue;
	
	@FindBy(xpath="//span[text()=' Password ']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='LOGIN']")
	private WebElement loginbtn;

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getCntnue() {
		return cntnue;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
