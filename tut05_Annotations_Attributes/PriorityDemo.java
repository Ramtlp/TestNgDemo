package tut05_Annotations_Attributes;

import org.testng.annotations.Test;

public class PriorityDemo
{
	@Test(priority = 1) 
	public void testCase1()
	{
		System.out.println("Mobile Login TestCase");
	}

	@Test(priority = 2)
	public void testCase2() throws InterruptedException
	{
		Thread.sleep(400);
		System.out.println("Web Login TestCase");
	}

	@Test(priority = 3)
	//	@Test() if there is no priority means it has 0 priority and excute first 
	public void testCase3()
	{
		System.out.println("API Login TestCase");
	}

	//

}
