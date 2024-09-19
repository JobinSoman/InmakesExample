package org.good1;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class HooksClass extends BaseClass
{
	@Before("@FeatureChallenge")
	public void launchTheChromeBrowser() 
	{
		LaunchBrowser();
		Maximize();
	}
	
	@After("@FeatureChallenge")
	public void closeTheChromeBrowser() 
	{
		QuitBrowser();
	}
}
