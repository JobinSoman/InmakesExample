package org.good1;

import java.util.Set;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonAddToCart extends BaseClass	
{
	POJO atc;
	@Given("Navigate to amazon home page")
	public void navigateToAmazonHomePage() 
	{
	   OpenApplication("https://www.amazon.in/");
	}
	@When("Search product by entering keyword {string} in the search bar")
	public void searchProductByEnteringKeywordInTheSearchBar(String kword) throws InterruptedException 
	{
		atc=new POJO(); 
		Write(atc.getSearchtext(),kword);
	}
	@When("Click on the search button")
	public void clickOnTheSearchButton() 
	{
	   Click(atc.getSearchbtn());
	}
	
	@When("Select any product from the list")
	public void selectAnyProductFromTheList() 
	{
		Click(atc.getAnyproduct());
	}
	
	@When("Switch the window to selected product")
	public void switchTheWindowToSelectedProduct() 
	{
		String pid=ParentId();
		Set<String> cid=ChildIds();
		SwitchChildWindow(cid,pid);
	}
	
	@When("Add the product to the cart")
	public void addTheProductToTheCart()
	{
		 Click(atc.getAddtocart());
	}
	
	@Then("Verify whether the added product is captured in my cart")
	public void verifyWhetherTheAddedProductIsCapturedInMyCart() 
	{
	   String count=GetText(atc.getCartcount());
	   System.out.println(count);
	   if(Integer.parseInt(count)==1) 
	   {
		   System.out.println("Test passed");
	   }
	}
}
