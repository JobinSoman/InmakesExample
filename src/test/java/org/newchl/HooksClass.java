package org.newchl;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class HooksClass extends BaseClass
{
	@Before("@Feature7 or Smoke1")
	public void preCondition() 
	{
		LaunchBrowser();
		Maximize();
	}
	@After("@Feature7 or Smoke1")
	public void postCondition() 
	{
		QuitBrowser();
	}
}
