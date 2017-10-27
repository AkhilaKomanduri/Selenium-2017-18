package WebDriver_Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ProxyForDRIVER {

	public static void main(String[] args) {
		String PROXY = "localhost:8080";
		org.openqa.selenium.Proxy Proxy = new org.openqa.selenium.Proxy();
		Proxy.setHttpProxy(PROXY).setFtpProxy(PROXY).setSslProxy(PROXY);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, Proxy);
		System.setProperty("webdriver.chrome.driver","/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		WebDriver driver = new ChromeDriver(cap);
		driver.get("https://www.google.co.uk/");

	}

}
// to stop other networks working we need to use proxy
