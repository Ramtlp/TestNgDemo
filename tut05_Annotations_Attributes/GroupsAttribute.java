package tut05_Annotations_Attributes;

import org.testng.annotations.Test;

public class GroupsAttribute
{

	@Test(groups = "software company")
	public void infoSys()
	{
		System.out.println("Infosys");
	}
	
	@Test(groups = "software company")
	public void wipro()
	{
		System.out.println("Wipro");
	}
	
	@Test(groups = "automobile")
	public void maruti()
	{
		System.out.println("Maruti");
	}
	
	@Test(groups = "automobile")
	public void tata()
	{
		System.out.println("Tata");
	}
}
