package tut06_parameterDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameterDemo 
{

	@Test
	@Parameters({"i","j"})
	public void add(int a,int b)
	{
		System.out.println("addition:"+(a+b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void substract(int a,int b)
	{
		System.out.println("subtraction:"+(a-b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void multiply(int a,int b)
	{
		System.out.println("multiplication:"+(a*b));
	}
}
