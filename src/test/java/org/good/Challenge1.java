package org.good;

import org.openqa.selenium.WebElement;

public class Challenge1 extends BaseClass
{
	public static void main(String[] args) 
	{
		LaunchBrowser();
		Maximize();
		OpenApplication("https://inmakeslh.in/");
		WebElement pgm=ElementByXpath("//h3[@class='mt-20 xc-hero-title-3 title-custom3 typing-demo']");
		String text=GetText(pgm);
		System.out.println(text);
		QuitBrowser();
	}
}
