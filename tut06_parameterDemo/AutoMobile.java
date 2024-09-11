package tut06_parameterDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutoMobile 
{
	@Test
	@Parameters({"autoMobile"})
	public void testCase1(String name)
	{
		System.out.println(name);
	}
	
	
}
