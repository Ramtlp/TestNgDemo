package tut06_parameterDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareCompany
{
	@Test
	@Parameters({"softwareCompany"})
	public void testCase2(String name)
	{
		System.out.println(name);
	}
}
