package WebUIController;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		 driver=new  ChromeDriver();
		 
		 driver.get("https://www.spicejet.com/");
		 driver.manage().window().maximize();
		 WebElement checkbox=driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		Assert.assertFalse(checkbox.isSelected());
		 
		 System.out.println(checkbox.isSelected());
		  checkbox.click();
		  Assert.assertTrue(checkbox.isSelected());
		 System.out.println(checkbox.isSelected());
		Assert.assertEquals(driver.findElements(By.cssSelector("[type='checkbox']")).size(), 6);
		 System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
		 
		 
		 //should return 6.
		
		
	}

}
