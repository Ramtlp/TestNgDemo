package tut09_Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(tut09_Listeners.ListenerClass.class)
public class ListenersDemo 
{

	@Test
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement userNameField=driver.findElement(By.name("username"));
		userNameField.sendKeys("Admin");
		
		WebElement passwordField=driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");
		
		WebElement submitButton=driver.findElement(By.xpath("//button[text()=' Login ']"));
		submitButton.click();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
		}
	
	@Test
	public void testSkipped() throws SkipException
	{
		System.out.println("skipped test case");
		throw new SkipException("skip exception thrown");
	}
	
	
	@Test
	public void testFail()
	{
		System.out.println("Failed Test Case");
		Assert.assertTrue(false);
	}
}
