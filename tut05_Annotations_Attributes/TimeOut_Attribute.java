package tut05_Annotations_Attributes;

import org.testng.annotations.Test;

public class TimeOut_Attribute 
{

	@Test(description = "This is test case 1")
	public void testCase1()
	{
		System.out.println("Mobile Login TestCase");
	}
	
	@Test(timeOut = 200)
	public void testCase2() throws InterruptedException
	{
		Thread.sleep(400);
		System.out.println("Web Login TestCase");
	}
	
	@Test(description = "This is case 3")
	public void testCase3()
	{
		System.out.println("API Login TestCase");
	}

}
