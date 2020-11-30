import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		//driver.findElement(By.xpath("//input[@name='img']")).click();
		
		WebElement btn =driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div[1]/form[1]/input[10]"));
		
		Actions act= new Actions(driver);
		act.click(btn).build().perform();
		String path="E:\\Videos Automation\\Links One by one to complete.txt";
		StringSelection sel= new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		Robot robo= new Robot();
		Thread.sleep(4000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div[1]/button[1]")).click();
		driver.switchTo().alert().dismiss();
		

		
		}
}
