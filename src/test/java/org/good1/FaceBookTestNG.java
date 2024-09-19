package org.good1;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FaceBookTestNG extends BaseClass
{
	Date dt=new Date();
	SoftAssert s=new SoftAssert();
	@BeforeClass
	private void LaunchTheBrowser()
	{
		LaunchBrowser();
		Maximize();
	}
	@BeforeMethod
	private void StartDate()
	{
		System.out.println("Test start date is :"+dt);
	}
	@Test
	private void LaunchTheApplicationTC1()
	{
		OpenApplication("https://www.facebook.com/");
		ElementByXpath("//button[@name='login']").click();
	}
	@Test(priority=12)
	private void VerifyURLTC2()
	{
		OpenApplication("https://www.facebook.com/");
		String url=GetURL();
		Assert.assertTrue(url.contains("Facebook"), "Check the URL");
		ElementByXpath("//button[@name='login']").click();
	}
	@Test(priority=-2)
	private void VerifyTitleTC3()
	{
		OpenApplication("https://www.facebook.com/");
		String title=GetTitle();
		Assert.assertEquals("Facebook – log in or sign up", title, "Check the title");
		ElementByXpath("//button[@name='login']").click();
	}
	@Test(priority=-8)
	private void LoginWithoutDataTC4()
	{
		OpenApplication("https://www.facebook.com/");
		String title=GetTitle();
		s.assertTrue(title.contains("facebook"), "Check the title");
		ElementByXpath("//button[@name='login']").click();
	}
	@AfterMethod
	private void EndDate()
	{
		System.out.println("Test end date is: "+dt);
	}
	@AfterClass
	private void CloseTheBrowser()
	{
		CloseBrowser();
	}
}
