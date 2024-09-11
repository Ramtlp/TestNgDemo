package tut10_BatchTesting;

import org.testng.annotations.Test;

public class LoginTest 
{

	@Test
	public void loginByMobileNumber()
	{
		System.out.println("Login by mobile pass");
	}
	
	@Test
	public void loginByEmail()
	{
		System.out.println("Login by email pass");
	}
}
