package org.good;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Challenge7 extends BaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		LaunchBrowser();
		Maximize();
		OpenApplication("https://www.facebook.com/");
		ElementByXpath("//a[text()='Create new account']").click();
		Thread.sleep(5000);
		WebElement day=ElementByID("day");
		List<WebElement> options = DropdownOptions(day);
		for(int i=0;i<options.size();i++)
		{
			WebElement opt=options.get(i);	
			String textdate=opt.getText();
			int date=Integer.parseInt(textdate);
			if(date %2==0)
			{
				System.out.println(date);
			}
			
		}
		QuitBrowser();
			
	}
}
