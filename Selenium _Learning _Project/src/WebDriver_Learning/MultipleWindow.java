package WebDriver_Learning;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Iterator<String> in = driver.getWindowHandles().iterator();
		String mainPage = in.next();
		String child1 = in.next();
		String child2 = in.next();
		driver.switchTo().window(child1);//switch control to 1st child window
		//here you can perform any operation on child1 window if u want 
		driver.close();
		//close 1st child window
		driver.switchTo().window(child2);//switch control to 2nd child window here you can perform any operation on child2 window if u want
		driver.close();
		//close 2nd child window
		driver.switchTo().window(mainPage);
		//swith control to main page to naukari.com
		driver.close();
		
		
		

	}

}
