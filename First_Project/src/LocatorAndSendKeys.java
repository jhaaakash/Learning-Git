import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAndSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.findElement(By.id("email")).sendKeys("aakashkumarjha295@gmail.com");
	//driver.findElement(By.name("pass")).sendKeys(".........");
	//driver.findElement(By.linkText("Forgotten account?")).click();
	//driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	
	//# using css selector
	driver.findElement(By.cssSelector("#email")).sendKeys("jhaakash");
	driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("jhaaakash");
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	
	
	}

}
