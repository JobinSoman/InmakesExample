package org.POJO;

import org.newchl.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPOJO extends BaseClass
{
	public SignInPOJO() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement newAccount;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement firstName;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement secondName;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement mobileNo;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement password;

	@FindBy(name="birthday_day")
	private WebElement dob;
	
	@FindBy(name="birthday_month")
	private WebElement dom;

	@FindBy(name="birthday_year")
	private WebElement doy;
	
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement gender;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement submit;
	
	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getDom() {
		return dom;
	}

	public WebElement getDoy() {
		return doy;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getNewAccount() {
		return newAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSecondName() {
		return secondName;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getPassword() {
		return password;
	}
	
	
}
