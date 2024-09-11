package tut07_dataPorviderDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingDataFromDifferentClass
{

	@Test(dataProvider = "searchDataSet",dataProviderClass = DataProviderMethod.class)
	public void testCaseGoogleSearch(String country,String monument) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(country+" "+monument);

		////div[@class='FPdoLc lJ9FBc']//input[@name='btnK']

		WebElement submitButton= driver.findElement(By.name("btnK"));
		submitButton.submit();


		Thread.sleep(2000);
		driver.quit();
	}
}
