package tut11_AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 
{


	@Test
	public void testMethod() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert softVerify=new SoftAssert();

		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Verifying title..................");
		String expectedTitle="Automation Testing Practice1";
		String actualTitle=driver.getTitle();

		// Although the expected and actual titles are not the same, 
		// the test will continue executing because we are using SoftAssert.	
		softVerify.assertEquals(expectedTitle, actualTitle,"Title verification failed");
		

		System.out.println("verifying presence of wikipedia-icon");
		WebElement wikipediaIcon=driver.findElement(By.className("wikipedia-icon"));

		softVerify.assertTrue(wikipediaIcon.isDisplayed());

		System.out.println("verifying search icon button");

		WebElement searchIcon = driver.findElement(By.className("wikipedia-search-button"));

		softVerify.assertTrue(searchIcon.isDisplayed());

		Thread.sleep(2000);
		driver.close();

		// Report all failures collected during the test.
		softVerify.assertAll();


	}

}
