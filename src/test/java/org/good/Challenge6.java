package org.good;

import org.openqa.selenium.WebElement;

public class Challenge6 extends BaseClass
{
	public static void main(String[] args) 
	{
		LaunchBrowser();
		Maximize();
		OpenApplication("https://www.ajio.com/");
		WebElement brand=ElementByXpath("//a[text()='Brand Directory']");
		JsScroll(brand, true);
		Click(brand);
		QuitBrowser();
	}
}
