
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mmt {
	
	public static void main(String[] args) throws InterruptedException {
		
		mmt obj=new mmt();
		obj.tc08();
		
	}
	
	
	public void tc08() throws InterruptedException
	{
		WebDriver driver= LaunchBrowser("chrome", "https://www.makemytrip.com/");
		
		WebElement popUp = driver.findElement(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative.lhUser"));

		int popSize = driver.findElements(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative.lhUser")).size();
		
		
		if(popSize > 0){

		popUp.click();

		}
		
		driver.findElement(By.id("fromCity")).click();

		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));

		source.sendKeys("MUM");

		Thread.sleep(2000);

		source.sendKeys(Keys.ARROW_DOWN);

		source.sendKeys(Keys.ENTER);

		// Enter text Bangalore to destination search

		WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));

		destination.sendKeys("Bengaluru");

		Thread.sleep(2000);

		destination.sendKeys(Keys.ARROW_DOWN);

		destination.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		
		
		
		
	}
	
	public  WebDriver LaunchBrowser (String browser, String url)
	{
		WebDriver driver =null;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		 option.addArguments("--disable-notifications");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		}
		return driver;
		
	}

	
	
}
