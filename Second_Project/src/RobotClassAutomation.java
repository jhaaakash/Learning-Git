import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RobotClassAutomation {
	
	public static void main(String[] args) throws InterruptedException {
		
		RobotClassAutomation obj=new RobotClassAutomation();
		obj.tc08();
		
	}
	
	
	public void tc08() throws InterruptedException
	{
		WebDriver driver= LaunchBrowser("chrome", "https://www.makemytrip.com/");
		
		Thread.sleep(25000);
		
		driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame")));
	
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#fromCity")).click();
		
		WebElement lst=driver.findElement(By.id("react-autowhatever-1"));
		
		List<WebElement> cities=lst.findElements(By.tagName("li"));
		
		for(WebElement val:cities)
		{
			if(val.getText().contains("Pune"))
			{
				val.click();
				break;
			}
		}
		
		//----------------------------------------------
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		WebElement lst1=driver.findElement(By.id("react-autowhatever-1"));
		
		
		List<WebElement> cities1=lst1.findElements(By.tagName("li"));
		
		for(WebElement val:cities1)
		{
			if(val.getText().contains("Goa"))
			{
				val.click();
				break;
			}
		}
		
		//-----------------------------calendar handling -------------------------------------//
		while(!driver.findElement(By.className("DayPicker-Caption")).getText().contains("April 2021"))
		{
			driver.findElement(By.cssSelector("body.desktop.in:nth-child(2) div.bgGradient div.minContainer div.widgetSection.appendBottom40.primaryTraveler div.fsw.widgetOpen div.fsw_inner:nth-child(1) div.fsw_inputBox.dates.inactiveWidget.activeWidget:nth-child(4) div.datePickerContainer:nth-child(2) div.flightCalOverlay div.dayPickerFlightWrap div.RangeExample.oneWay div.DayPicker div.DayPicker-wrapper div.DayPicker-NavBar > span.DayPicker-NavButton.DayPicker-NavButton--next:nth-child(2)")).click();
		}
		
		List<WebElement> dates= driver.findElements(By.className("dateInnerCell"));
		int size=driver.findElements(By.className("dateInnerCell")).size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			String Selectiondate=driver.findElements(By.className("dateInnerCell")).get(i).getText();
			if(Selectiondate.equalsIgnoreCase("26"))
			{
				driver.findElements(By.className("dateInnerCell")).get(i).click();
				break;
			}
		}
		//----Passenger---------------------
		
		
		
		
		
		
		
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
