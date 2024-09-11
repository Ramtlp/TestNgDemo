package tut03_Enable_Disable;

import org.testng.annotations.Test;

public class LoanDepartment
{

	@Test
	public void mobileLoginPersonalLoan()
	{
		System.out.println("Mobile Login Personal loan");
	}
	
	@Test
	public void webLoginPersonalLoan()
	{
		System.out.println("Web Login Personal loan");
	}
	
	@Test
	public void APILoginPersonalLoan()
	{
		System.out.println("API Login Personal loan");
	}
	
	@Test
	public void mobileLoginAutoMobileLoan()
	{
		System.out.println("Mobile Login AutoMobile  loan");
	}
	
	@Test    //by default true
	public void WebLoginAutoMobileLoan()
	{
		System.out.println("Web Login AutoMobile  loan");
	}
	
	@Test //by default true
	public void ApiLoginAutoMobileLoan()
	{
		System.out.println("API Login AutoMobile  loan");
	}
}
