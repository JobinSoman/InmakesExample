package org.good1;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FaceBook extends BaseClass
{
	Date dt=new Date();
	@BeforeClass
	public static void LaunchTheBrowser()
	{
		LaunchBrowser();
		Maximize();
	}
	@Before
	public void StartDate()
	{
		System.out.println("Test start date is :"+dt);
	}
	@Test
	public void LaunchTheApplicationTC1()
	{
		OpenApplication("https://www.facebook.com/");
		Assert.assertTrue(false);
		ElementByXpath("//button[@name='login']").click();
	}
	@Test
	public void VerifyURLTC2()
	{
		OpenApplication("https://www.facebook.com/");
		String url=GetURL();
		Assert.assertTrue("Check the URL", url.contains("Facebook"));
		ElementByXpath("//button[@name='login']").click();
	}
	@Test
	public void VerifyTitleTC3()
	{
		OpenApplication("https://www.facebook.com/");
		String title=GetTitle();
		Assert.assertEquals("Check the title", "FacebookLogin", title);
		ElementByXpath("//button[@name='login']").click();
	}
	@Test
	public void LoginWithoutDataTC4()
	{
		OpenApplication("https://www.facebook.com/");
		String title=GetTitle();
		Assert.assertEquals("Check the title", "Facebook – log in or sign up", title);
		ElementByXpath("//button[@name='login']").click();
	}
	@After
	public void EndDate()
	{
		System.out.println("Test end date is: "+dt);
	}
	@AfterClass
	public static void CloseTheBrowser()
	{
		CloseBrowser();
	}
}
