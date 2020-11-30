package TestPackage;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class Listners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result)
	{
		
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		//screenshot code
		//response if API is getting failed
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("File resch to listners");
	}
}

