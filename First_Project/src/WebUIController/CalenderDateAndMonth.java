package WebUIController;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDateAndMonth {

	public static void main(String[] args) {
		//we need to select 23 august
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.id("departureCalendar")).click();
		
		
		while(!driver.findElement(By.cssSelector(".DayPicker-Caption")).getText().contains("April 2022"))
		{
			driver.findElement(By.cssSelector("[class='DayPicker-NavBar'] [class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		
		List<WebElement> dates= driver.findElements(By.className("calDate"));
		int size=driver.findElements(By.className("calDate")).size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			String Selectiondate=driver.findElements(By.className("calDate")).get(i).getText();
			if(Selectiondate.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("calDate")).get(i).click();
				break;
			}
		}
	
	}

}
