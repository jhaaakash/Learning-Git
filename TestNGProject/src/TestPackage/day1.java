package TestPackage;

import org.testng.annotations.Test;

public class day1 {
	@Test
	public void Demo() {
		System.out.println("Hello World");
	}
	
	@Test
	public void Demo1()
	{
		System.out.println("Bye");
	}
	@Test(groups={"smoke"})
	public void smoketest1()
	{
		System.out.println("smoketest1");
	}
}
