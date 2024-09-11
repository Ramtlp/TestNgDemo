package tut05_Annotations_Attributes;

import org.testng.annotations.Test;

public class EnableTestAttribute
{

	@Test(enabled = false)
	public void skippedTest() {
	    System.out.println("This will be skipped");
	}
	
	@Test
	public void exectueMethod()
	{
		System.out.println("This is executable method");
	}
}
