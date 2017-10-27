package WebDriver_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		List<WebElement> st=driver.findElements(By.xpath("//*[@id=\"lst-ib\"]"));
				Thread.sleep(2000);
				{
					for(int i =0; i<st.size(); i++)
					System.out.println(st.get(i).getText());
				}
		
		
		

	}

}
