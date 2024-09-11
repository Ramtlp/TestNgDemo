package tut08_parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestDemo2
{

	//id=user-name
	//id="password"
	
	//id="login-button"
	
WebDriver driver;
	
	@Test
	public void verifyTitle() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		WebElement userNameField = driver.findElement(By.id("user-name"));
		
		userNameField.sendKeys("standard_user");
		
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
	
}
