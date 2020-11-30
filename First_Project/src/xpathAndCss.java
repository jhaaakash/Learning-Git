import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAndCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("jhaaakash");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("jhaaakash");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
		 
		
	}

}
