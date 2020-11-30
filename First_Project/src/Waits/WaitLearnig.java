package Waits;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitLearnig {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//declaring an array with list of item we need to add in cart.
		//String[] name= {"cucumber","brocoli"};

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String[] itemNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		//List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		
		additem(driver,itemNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		WebDriverWait w= new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	}


 public static void additem( WebDriver driver, String[] itemNeeded) throws InterruptedException
 {
	 List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
	 for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			List itemNeededlist=Arrays.asList(itemNeeded);
			
			//humara jo item needed array hai uko arrya list mai convert kiya easy process kai liye
			
			if(itemNeededlist.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				Thread.sleep(5000);
				if(j==itemNeeded.length)
				{
					break;
				}
			}
			
		}
 }
}
