package WebDriver_Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTPSHandlerChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);
		driver.get("https://www.google.co.uk/");
		driver.close();
		driver.quit();
		
		
	}

}
//to open security http applications we use this code