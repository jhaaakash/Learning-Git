package WebUIController;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {

	public static void main(String[] args) {
		// to block the notification popup, same option object is passed to
		// ChromeDriver()
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Adults")).click();
		int i = 1;
		while (i < 3) {
			driver.findElement(By.id("Adults")).sendKeys(Keys.DOWN);
			i++;
		}
		driver.findElement(By.id("Adults")).click();
		driver.findElement(By.id("Childrens")).click();
		int j = 1;
		while (j < 3) {
			driver.findElement(By.id("Childrens")).sendKeys(Keys.DOWN);
			j++;
		}
		driver.findElement(By.id("Childrens")).click();

		driver.findElement(By.xpath("//*[@id=\"DepartDate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"MoreOptionsLink\"]/strong")).click();
		driver.findElement(By.xpath("//*[@id=\"AirlineAutocomplete\"]")).sendKeys("INDIGO");
		driver.findElement(By.xpath("//*[@id=\"SearchBtn\"]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"homeErrorMessage\"]")).getText());
	}

}
