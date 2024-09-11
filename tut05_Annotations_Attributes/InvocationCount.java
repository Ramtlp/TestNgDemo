package tut05_Annotations_Attributes;

import org.testng.annotations.Test;

public class InvocationCount 
{

	@Test(invocationCount = 5)
	public void repeatTest() 
	{
		System.out.println("invocation count ");
	    // This test will run 5 times
	}
}
