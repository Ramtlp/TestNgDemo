package tut08_parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestDemo1 {
	// We will execute methods parallel

	WebDriver driver;

	@Test
	public void verifyTitle() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");

		// title=Swag Labs

		Assert.assertEquals(driver.getTitle(), "Swag Labs");

	}

	@Test
	public void verifyLogo() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");

		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));

		Assert.assertTrue(logo.isDisplayed());

	}

}
