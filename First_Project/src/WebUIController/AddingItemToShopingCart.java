package WebUIController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemToShopingCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//declaring an array with list of item we need to add in cart.
		//String[] name= {"cucumber","brocoli"};
		int j=0;
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String[] itemNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		
		
		Thread.sleep(5000);
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
