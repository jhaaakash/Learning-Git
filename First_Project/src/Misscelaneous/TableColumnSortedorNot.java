package Misscelaneous;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableColumnSortedorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.findElement(By.xpath("//tr/th[2]")).click();
		driver.findElement(By.xpath("//tr/th[2]")).click();
		List<WebElement> fruits= driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> originalList=new ArrayList<String>();
		
		for(int i=0;i<fruits.size();i++)
		{
			//System.out.println(fruits.get(i).getText());
			originalList.add(fruits.get(i).getText());
		}
		System.out.println("**************Original List ********************");
		for(String s: originalList)
		{
			System.out.println(s);
		}
		
		ArrayList<String> copiedList=new ArrayList<String>();
		for(int i=0;i<originalList.size();i++)
		{
			
			copiedList.add(originalList.get(i));
		}
		
		Collections.sort(copiedList);
		//Collections.reverse(copiedList);
		System.out.println("**************Copied List ********************");
		for(String s: copiedList)
		{
			System.out.println(s);
		}
		
		Assert.assertTrue(originalList.equals(copiedList));
		
	}

}
