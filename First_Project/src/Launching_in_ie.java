import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launching_in_ie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for ie sometime error come while launching due to zoom level is different then 100%
		System.setProperty("webdriver.ie.driver","C:\\Software\\Browser_Driver\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		//chrome driver object for chrome browser
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());

	}

}
