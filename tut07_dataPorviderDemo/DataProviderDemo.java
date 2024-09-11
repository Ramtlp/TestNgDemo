package tut07_dataPorviderDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo 
{

	/*
	   India	          Qutub Minar
	     Agra	          Taj Mahal
	   Hyderabad	      Charminar
	 */
	@DataProvider(name = "searchDataSet")
	public Object[][] searchData()
	{
		Object[][] search_keyword=new Object[3][2];
		search_keyword[0][0]="India";
		search_keyword[0][1]="Qutub Minar";

		search_keyword[1][0]="Agra";
		search_keyword[1][1]="Taj Mahal";

		search_keyword[2][0]="Hyderabad";
		search_keyword[2][1]="Charminar";
		return search_keyword;
	}

	@Test(dataProvider = "searchDataSet")
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
