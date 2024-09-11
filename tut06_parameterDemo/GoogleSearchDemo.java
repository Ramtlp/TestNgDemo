package tut06_parameterDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchDemo 
{
/*
Test data
----------
keyword - 1) Selenium
          2) Java

----------------Test steps----------------
Launch the browser and open www.google.com
Add the first keyword as input in the search box
Verify the input value on UI to be same as from test data
Repeat the above two steps for the other 2 keywords

*/
	@Test
	@Parameters({"keyword"})
	public void googleSearch(String searchDate) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(searchDate);
		
		Assert.assertEquals(searchDate, searchBox.getAttribute("value"));
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
