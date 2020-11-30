package WebUIController;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamidropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	/*	first way
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
		driver.findElement(By.xpath("//option[@value='MAA']")).click();
		Thread.sleep(2000);
		//selecting ahmedabad in destination [2] because ahmedabad also present in source. So here we need to 
		//explicitly mention that select second occurance of ahmedabad.
		//driver.findElement(By.xpath("//option[@value='AMD'][2]")).click();
	
		*/
	// Second way
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']  //a[@text='Indore (IDR)']")).click();
	driver.get("http://spicejet.com"); //URL in the browser

	//  //a[@value='MAA']  - Xpath for chennai

	//  //a[@value='BLR']

	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	//driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();

	Thread.sleep(2000);

	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	
	
	
	}

}
//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']  