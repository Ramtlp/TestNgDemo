package tut11_AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo 
{

	@Test
	public void testMethod() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Verifying title..................");
		String expectedTitle="Automation Testing Practice1";
		String actualTitle=driver.getTitle();
		
		// The test will stop here if the title doesn't match
		Assert.assertEquals(expectedTitle, actualTitle,"Title verification failed"); 
		
		System.out.println("verifying presence of wikipedia-icon");
		WebElement wikipediaIcon=driver.findElement(By.className("wikipedia-icon"));
		
		Assert.assertTrue(wikipediaIcon.isDisplayed());
		
		System.out.println("verifying search icon button");
		
		WebElement searchIcon = driver.findElement(By.className("wikipedia-search-button"));
		
		Assert.assertTrue(searchIcon.isDisplayed());
		
		Thread.sleep(2000);
		driver.close();
	}
	
}
