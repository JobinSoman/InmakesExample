package org.good;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;

public class Challenge5 extends BaseClass 
{
	public static void main(String[] args) throws IOException 
	{
		LaunchBrowser();
		Maximize();
		OpenApplication("https://www.amazon.in/");
		WebElement search=ElementByID("twotabsearchtextbox");
		Write(search,"Dell laptop"); 
		WebElement btn=ElementByID("nav-search-submit-button");
		Click(btn);
		WebElement first=ElementByXpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]");
		Click(first);
		String prid=ParentId();
		Set<String> clid = ChildIds();
		SwitchChildWindow(clid,prid);
		TakeScreenshot("firstproduct");
		QuitBrowser();
	}
}
