package WebDriver_Learning;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadChromeFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		String downloadFilepath = "/Users/RaviAkhi/Desktop";
		HashMap<String, Object>chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups",0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--test-type");
		options.addArguments("--disable-extensions");//to disable browser extension popup
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);
		driver.get("http://www.seleniumhq.org/download/");
		WebElement d = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/table[1]/tbody/tr[2]/td[4]/a"));
		d.sendKeys(Keys.ARROW_DOWN);
		d.click();
	
		
		
		
		

	}

}
