package WebUIController;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetAutosuggestiondropdown {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException

	{

		System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");

	    driver=new ChromeDriver();    

	    driver.get("http://www.spicejet.com/");

	    driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    System.out.println(driver.getTitle());

	    // OriginStation

	    WebElement Origin= driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
	    
	                                                

	    Origin.click();  

	    java.util.List<WebElement> origin = driver.findElements(By.id("glsctl00_mainContent_ddl_originStation1_CTNR"));

	    System.out.println(origin.size());

	        driver.findElement(By.cssSelector("a[value='DEL']")).click();

	        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));

	        // Destination

	        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();     

	        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();   

	        System.out.println( driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));
}
}
