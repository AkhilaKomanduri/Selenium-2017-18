package WebDriver_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class IntroductionToSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://192.168.0.18/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).clear();
		driver.findElement(By.name("txtUserName")).sendKeys("akhila");
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("12345");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		driver.quit();
		
		

	}

}
