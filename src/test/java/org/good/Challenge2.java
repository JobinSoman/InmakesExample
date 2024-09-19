package org.good;

import org.openqa.selenium.WebElement;

public class Challenge2 extends BaseClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		LaunchBrowser();
		Maximize();
		OpenApplication("https://www.meesho.com/");
		WebElement profile=ElementByXpath("//span[text()='Profile']");
		MouseHover(profile);
		WebElement signup=ElementByXpath("(//button)[1]");
		Thread.sleep(5000);
		Click(signup);
		QuitBrowser();
	}
}
