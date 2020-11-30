package WebUIController;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSelectiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.id("gosuggest_inputSrc")).clear();
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("mum");
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("gosuggest_inputDest")).clear();
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("indore");
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ENTER);
		
	
		
		
	}

}
