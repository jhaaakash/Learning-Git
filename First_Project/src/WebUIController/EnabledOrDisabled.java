package WebUIController;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledOrDisabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new  ChromeDriver();
		 
		 driver.get("https://www.spicejet.com/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(10000);
		// driver.findElement(By.className("select-label")).click();
	/*	First Way
		 System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
	*/	 
		 
		 //second way
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 
		 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		 {
			 System.out.println("It is enabled");
			 Assert.assertTrue(true);
			 
		 }
		 else
		 {
			 System.out.println("it is disabled");
			 Assert.assertTrue(false);
		 }
	}

}
