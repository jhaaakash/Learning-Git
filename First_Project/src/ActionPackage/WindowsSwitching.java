package ActionPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSwitching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		System.out.println(driver.getTitle());
		Set<String> ids= driver.getWindowHandles();
			Iterator<String> it= ids.iterator();
			String Parentid=it.next();
			String Childid=it.next();
			driver.switchTo().window(Childid);
			System.out.println(driver.getTitle());
			
		
	}

}
