package tut07_dataPorviderDemo;

import org.testng.annotations.DataProvider;

public class DataProviderMethod 
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
}
