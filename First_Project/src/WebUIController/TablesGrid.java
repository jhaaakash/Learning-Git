package WebUIController;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22781/nz-vs-ind-1st-test-india-tour-of-new-zealand-2020");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println(rowcount);
		
		//example of parent to child traversal
		int count= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		System.out.println(count);
		int z=0;
		for(int i=0;i<count-2;i++)
		{
		String value =	table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger= Integer.parseInt(value);
		z=z+valueinteger;
		}
		//below is example of sibling to sibling traversal example
		//travelling to next sibing of extra text -- getting the extra 4
	String Extra=	table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int ExtraValue=Integer.parseInt(Extra);
		int totalscore=ExtraValue+z;
				
		
		String Total=table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int TotalValue=Integer.parseInt(Total);
		if(totalscore==TotalValue)
		{
			System.out.println("Total is correct");
		}
		else
		{
			System.out.println("please calculate again");
		}
	}

}
