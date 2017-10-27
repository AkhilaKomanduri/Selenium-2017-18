package WebDriver_Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.uk/");
		//Get Title attribute of Edit box
		String ToolTip = driver.findElement(By.id("lst-ib")).getAttribute("title");
		System.out.println(ToolTip);
		//Close browser
		driver.close();
		//quit object
		driver.quit();
		

	}

}
//output = search (to find the attribute - eg: search)