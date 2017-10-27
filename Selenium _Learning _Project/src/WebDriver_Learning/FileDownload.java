package WebDriver_Learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver Prof = new ChromeDriverProfile();
		driver.setPreference("browser.download.dir","/Users/RaviAkhi/Desktop");
		Prof.setPreference("","");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");

	}

}
