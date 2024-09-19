package org.good;

import org.openqa.selenium.WebElement;

public class Challenge8 extends BaseClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		LaunchBrowser();
		Maximize();
		OpenApplication("https://www.apple.com");
		ImplicitWait(10l);
		WebElement srcicon = ElementByID("globalnav-menubutton-link-search");
		Click(srcicon);
		WebElement srcbar = ElementByXpath("//input[@placeholder='Search apple.com']");
		Write(srcbar, "iphone7");
		WebElement srhicon = ElementByXpath("//button[@aria-label='Submit search']");
		Click(srhicon);
		WebElement first = ElementByXpath("(//img[@class='rf-serp-explore-image'])[1]");
		Click(first);
		WebElement buy = ElementByXpath("//a[@class='ac-ln-button']");
		Click(buy);
		WebElement color = ElementByXpath("(//img[@class='colornav-swatch'])[1]");
		Click(color);
		WebElement strg = ElementByXpath("(//div[@class='rc-dimension-selector-row form-selector'])[1]");
		Click(strg);
		WebElement trade = ElementByXpath("(//div[@class='rc-dimension-multiple column large-6 small-6 form-selector'])[2]");
		Click(trade);
		WebElement pay=ElementByXpath("(//input[@class='form-selector-input'])[6]");
		Click(pay);
		WebElement price = ElementByXpath("//span[@data-autom='purchaseGroupOptionfullprice_price']");
		String cost = GetText(price);
		System.out.println(cost);
		QuitBrowser();
	}
}
