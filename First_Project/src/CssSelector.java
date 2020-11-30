import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("jhaaakash");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
	}

}
