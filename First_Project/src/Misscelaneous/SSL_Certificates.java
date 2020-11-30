package Misscelaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Certificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//first way to handle certificates issue
		ch.acceptInsecureCerts();
		// second way
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions options = new ChromeOptions();// used to define the setting the of local browser
		options.merge(ch);//for merging the desired capabilities in the local browser
		options.addArguments("--disable-notifications");//for allow or block notifications
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("the required url");
		
	}

}