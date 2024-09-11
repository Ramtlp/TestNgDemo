package tut05_Annotations_Attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods_Attribute 
{

	@Test(dependsOnMethods = {"testCase2","testCase3"}) 
	public void testCase1()
	{
		System.out.println("Mobile Login TestCase");
	}

	@Test
	public void testCase2()
	{
		Assert.assertTrue(false);
	}

	@Test
	
	public void testCase3()
	{
		System.out.println("API Login TestCase");
	}

	
}
