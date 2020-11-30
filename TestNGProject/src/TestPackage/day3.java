package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	
	@AfterClass
	public void afclass()
	{
		System.out.println("After execution of every method in class");
	}
	@AfterSuite
	public void AFSuite()
	{
		System.out.println("I am the number one from last");
	}
	@Test
	public void webloginCarLoan()
	{
		System.out.println("webloginCarLoan");
	}
	
	@Test
	public void MobileloginCarLoan()
	{
		System.out.println("MobileloginCarLoan");
	}
	@Test
	public void MobileSigninCarLoan()
	{
		System.out.println("MobileloginCarLoan");
	}
	@Test
	public void MobileentryCarLoan()
	{
		System.out.println("MobileloginCarLoan");
	}
	
	@BeforeMethod
	public void BeforeMthod()
	{
		System.out.println("I will get call every time before methods");
	}
	@Test
	public void APIloginCarLoan()
	{
		System.out.println("APIloginCarLoan");
	}
	@BeforeClass
	public void bfclass()
	{
		System.out.println("I will run before any method of the class");
	}
	
	@Test(groups={"smoke"})
	public void smoketest3()
	{
		System.out.println("smoketest3");
	}
}
