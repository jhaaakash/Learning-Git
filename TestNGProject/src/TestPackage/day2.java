package TestPackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {

	@Parameters({"URL"})
	@Test
	public void Ploan(String urlname)
	{
		System.out.println("Piasa");
		System.out.println(urlname);
		
	}
	
	@BeforeTest
	public void Beforemethod()
	{
		System.out.println("I am the first one to get run");
	}
	
	@BeforeSuite
	public void BFSuite()
	{
		System.out.println("I am the number one");
	}
	@Test(groups={"smoke"})
	public void smoketest2()
	{
		System.out.println("smoketest2");
	}
}
