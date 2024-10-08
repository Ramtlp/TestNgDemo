package tut04_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 
{

	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void beforClass()
	{
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod //it will execute before every @Test annotations
	public void beforMethod()
	{
		System.out.println("@BeforeMthod");
	}
	
	@Test
	public void test1()
	{
		System.out.println("@Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("@Test2");
	}
	
	@AfterMethod
	public  void afterMethod()
	{
		System.out.println("@AfterMethod");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("@AfterClass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("@AfterSuite");
	}
}
