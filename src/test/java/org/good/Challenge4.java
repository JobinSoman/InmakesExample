package org.good;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class Challenge4 extends BaseClass
{
	public static void main(String[] args) 
	{
		LaunchBrowser();
		Maximize();
		OpenApplication("https://demo.automationtesting.in/Alerts.html");
		WebElement alertwithtextbox=ElementByXpath("(//a[@data-toggle='tab'])[3]");
		Click(alertwithtextbox);
		WebElement demopromptbox=ElementByXpath("//button[@class='btn btn-info']");
		Click(demopromptbox);
		Alert ale=SwitchAlert();
		String text=AlertGetText(ale);
		System.out.println(text);
		AlertAccept(ale);
		QuitBrowser();
	}
}
