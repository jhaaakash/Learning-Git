import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingToSibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		// traversing from one sibling to another sibling
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]/following-sibling::li[1]")).click(); 
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]/following-sibling::li[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]/following-sibling::li[3]")).click();
		driver.navigate().back();
		// traversing to parent from child
		driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]/parent::ul")).click();
	}

}
