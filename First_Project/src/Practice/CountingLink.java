package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class CountingLink {
	//1. Give me the count of links on the page.
			//2. Count of footer section
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//link count on complete page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//link count on the footer section of the page.
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		//this will give the count of link in footer sections
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		// //3- now again if we want to reduce the driver scope to only first column in footer section:
		WebElement footerColumn1Driver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerColumn1Driver.findElements(By.tagName("a")).size());
		//4- click on each link in the coloumn and check if the pages are opening-
		for(int i=1;i<footerColumn1Driver.findElements(By.tagName("a")).size();i++)
		{
			//oneway
			//footerColumn1Driver.findElements(By.tagName("a")).get(i).click();
			//driver.navigate().back();
			
			//second way
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerColumn1Driver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);	
		}// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}
	}
	}


