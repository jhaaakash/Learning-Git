import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitLearning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("JS Foundation"))).build().perform();
		driver.findElement(By.linkText("Members")).click();
		
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement e= driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[1]/div[2]/div[1]/div/div[2]/div/h3"));
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(e ,"Node.js Certifications"));
		
		String txt = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[1]/div[2]/div[1]/div/div[2]/div/h3")).getText();
		
		if(txt.equals("Node.js Certifications"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
			
	}
		
	}

}
