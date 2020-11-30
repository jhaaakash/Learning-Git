package WebUIController;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@text='Delhi (DEL)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Bhopal (BHO)'][contains(text(),'Bhopal (BHO)')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@data-handler='selectDay']")).click();
		Thread.sleep(2000);
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) // checking 2nd calancder is active
																					// or not
		{
			System.out.println("It is enabled");
			Assert.assertTrue(true);

		} else {
			System.out.println(" Thsi is not round trip: it is disabled");
			// Assert.assertTrue(false);
		}
//selecting the senior citzen checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		int i = 1;
		while (i < 5) {

			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.DOWN);
			i++;
		}

		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		int j = 1;
		while (j < 3) {

			driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).sendKeys(Keys.DOWN);
			j++;
		}

		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

}
