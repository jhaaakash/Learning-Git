package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

public class Sprint1 extends Base{
	
	@Test(description="Login test case",priority = 3,dependsOnMethods ="tc03")
	public void tc01()
	{
		System.out.println("Inside tc1");// this test is skipped as tc03 get failed
	}
	@Test(description="Selecting Product",priority = 2)
	public void tc02()
	{	logger = extent.createTest("tc02");
		System.out.println("Inside tc2");
		logger.log(Status.INFO, "Login page apper");
		
		logger.log(Status.INFO, "Login to facebook");
		logger.log(Status.INFO, "Login Successfully");
		logger.log(Status.INFO, "Search for friend");
		logger.log(Status.INFO, "Open chat box for friend");
		logger.log(Status.INFO, "Send Message");
		
	}
	@Test(description="checkout to cart",priority = 1)
	public void tc03()
	{
		SoftAssert obj=new SoftAssert();
		
		//Assert.fail();//Hard assert here as soon as asser occur, then the methid fails and next linw wouldn't be executed
		// in case of hard assertion the inside tc3 will not present in the output
		// But in case of soft assert, all the method will execute and in the last it will be marked as fail.
		obj.fail();
		System.out.println("Inside tc3");
		
		obj.assertAll();
		
	}
	
	@Test(description="go to url",priority = -2)
	public void tc04()
	{
		logger = extent.createTest("tc04");
		
		logger.log(Status.INFO, "Login page apper");
		
		
		System.out.println("Inside tc4");
		
		logger.log(Status.INFO, "searching for product");
		
		logger.log(Status.INFO, "Selecting the desired item");
		
		logger.log(Status.INFO, "go for payment");
		
		//String abc="OnPage";
		//Assert.assertEquals("OnPage", "OnPage");
		SoftAssert obj=new SoftAssert();
		
		obj.fail("TC Failed");
		Assert.fail();
		System.out.println("Inside tc04");
		logger.log(Status.INFO, "item purchased successfully");
		obj.assertAll();
		
	}


	
	
}


