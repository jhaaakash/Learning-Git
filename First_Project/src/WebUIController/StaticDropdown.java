package WebUIController;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver=new  ChromeDriver();

driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
Select s =new Select(driver.findElement(By.id("dropdown-class-example")));
s.selectByValue("option2");
s.selectByIndex(3); //it will select option 3 as index start from 0,1,2,3,.....

//updated static drpdown in spicejet.com

//driver.get("https://www.spicejet.com/");
//driver.findElement(By.id("divpaxinfo"));



	}

}
