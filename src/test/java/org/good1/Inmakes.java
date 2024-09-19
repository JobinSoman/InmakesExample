package org.good1;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Inmakes extends BaseClass
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
	public void LaunchTheApplication()
	{
		OpenApplication("https://www.inmakes.com/");
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
