package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestNG1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		TestNG1 obj=new TestNG1();
		obj.tc01();
		
	}
	
	
	public void tc01() throws InterruptedException
	{
		WebDriver driver= LaunchBrowser("chrome", "https://www.makemytrip.com/");
		
		Thread.sleep(25000);	
		
		
	}
	
	public  WebDriver LaunchBrowser (String browser, String url)
	{
		WebDriver driver =null;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		 option.addArguments("--disable-notifications");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		}
		return driver;
		
	}

	
	
}
