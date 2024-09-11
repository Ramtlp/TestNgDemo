package tut10_BatchTesting;

import org.testng.annotations.Test;

public class HomeScreenTest
{

	@Test
	public void launchApplication()
	{
		System.out.println("Application Launched passed");
	}
	
	@Test
	public void verifyTitle()
	{
		System.out.println("Verify title passed");
	}
	
	@Test
	public void verifyLogo()
	{
		System.out.println("Verify logo passed");
	}
}
