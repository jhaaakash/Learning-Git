import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		//driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("jhaaakash");
		driver.findElement(By.cssSelector("input#id")).sendKeys("jhaaakash");
		driver.findElement(By.cssSelector("input#password")).sendKeys("jhaaakash");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
	}

}
