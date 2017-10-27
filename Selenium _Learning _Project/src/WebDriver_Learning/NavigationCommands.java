package WebDriver_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(3000);
		//Navigate browser to backward
		driver.navigate().back();
		//Navigate browser to forward
		driver.navigate().forward();

	}

}
