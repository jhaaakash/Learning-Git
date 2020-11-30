package WebUIController;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/");
		//to identify the element by text is: //a[text()='Practice']
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		WebElement table=driver.findElement(By.id("product"));
		//table.findElements(By.xpath(""))
		
	int row1=table.findElements(By.xpath("//td[text()='Rahul Shetty']/following-sibling::td[1]")).size();
	int row2=table.findElements(By.xpath("//th[text()='Instructor']/following-sibling::th[1]")).size();
	int row=row1+row2;
	System.out.println("the number of rows are:"+row);
		//table.findElements(By.xpath("//td[text()='Rahul Shetty']/following-sibling::div")).size();
	// print the no of column catching the row with the abs xpath and then counting the element with tag td
	int column=table.findElements(By.xpath("/html[1]/body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[2]/td")).size();
	System.out.println("the number of columne in table is:" +column);
	//now printing the data of second row:
	
	//for(int i=0;i<column;i++)
	//{
	
		System.out.println(table.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[2]/td[1]")).getText());
		System.out.println(table.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[2]/td[2]")).getText());
		System.out.println(table.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[2]/td[3]")).getText());
	//}
	}

}
