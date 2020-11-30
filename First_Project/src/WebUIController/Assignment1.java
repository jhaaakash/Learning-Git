package WebUIController;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
	driver=new  ChromeDriver();
		 
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[1]")).click();
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	System.out.println(checkbox.isSelected());
	checkbox.click();
	Assert.assertTrue(checkbox.isSelected());
	System.out.println(checkbox.isSelected());
	
	System.out.println("Unchecking the check box start here");
	checkbox.click();
	Assert.assertFalse(checkbox.isSelected());
	System.out.println(checkbox.isSelected());
	
	driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
	
	}
// To check the no. of checboxes on the screen.
	
	
}
