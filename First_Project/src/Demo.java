import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	//invokde exe file first
	System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
	//chrome driver object for chrome browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	driver.get("http://google.com/");
	driver.navigate().back();
	driver.close();
	driver.quit();
	}

}
