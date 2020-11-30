package WebUIController;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("BENG");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
	 // interview java executor element:this way we are able to get the hidden element
	    JavascriptExecutor j=(JavascriptExecutor)driver;
		String script=" return document.getElementById(\"src\").value;";
		String text=(String) j.executeScript(script);
		System.out.println(text);
		int i=0;
	    while(!text.contains("Behar"))
	    {	i++;
	    	driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
	    	text=(String) j.executeScript(script);
	    	System.out.println(text);
	    	if(i>10)
	    	{
	    		System.out.println("option is not present");
	    		break;//TO STOP GOING IT INTO INFINITE LOOP
	    		//IF IT DOES NOT FOUND ELEMENT THEN IT WILL GO IN THE INFINITE LOOP
	    		
	    	}
	    	else
	    		
	    	{
	    		System.out.println("element found at index:"+i);
	    	}
	    }
	    Thread.sleep(2000);
	  //  driver.findElement(By.xpath("//input[@id='src']")).click();
	
	}

}
