package org.good1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO extends BaseClass
{
	public POJO() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchtext;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchbtn;
	
	@FindBy(xpath="(//img[@class='s-image'])[7]")
	private WebElement anyproduct;
	
	@FindBy(xpath="//input[@value='Add to Cart']")
	private WebElement addtocart;
	
	@FindBy(id="attach-close_sideSheet-link")
	private WebElement closebtn;
	
	@FindBy(id="nav-cart-count")
	private WebElement cartcount;
	
	public WebElement getSearchtext() {
		return searchtext;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getAnyproduct() {
		return anyproduct;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getClosebtn() {
		return closebtn;
	}

	public WebElement getCartcount() {
		return cartcount;
	}
}
