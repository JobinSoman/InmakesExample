package org.good1;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTestNG extends BaseClass 
{
	Date dt=new Date();
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
		OpenApplication("https://www.amazon.in/");
	}
	@AfterMethod
	private void EndDate()
	{
		System.out.println("Test end date is: "+dt);
	}
	@AfterClass
	private static void CloseTheBrowser()
	{
		CloseBrowser();
	}
}
