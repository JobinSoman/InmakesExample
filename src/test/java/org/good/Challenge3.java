package org.good;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;

public class Challenge3 extends BaseClass
{
	public static void main(String[] args) throws AWTException 
	{
		LaunchBrowser();
		Maximize();
		OpenApplication("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement email=ElementByXpath("//input[@type='email']");
		Write(email,"john@gmail.com");
		SelectAllTextRobot();
		CopyRobot();
		WebElement cntnu=ElementByXpath("//input[@type='submit']");
		Click(cntnu);
		WebElement password=ElementByXpath("//input[@type='password']");
		Click(password);
		PasteRobot();
		QuitBrowser();
	}
}
