package WebDriver_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HandlingDropdown {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//Open web page
		driver.navigate().to("http://www.ufthelp.com/p/testpage.html");
	//wait for dropdown element
		WebElement E = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("drpdwnTopics")));
		//select object
		Select sel = new Select(E);
		//Select element using item name
		sel.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		//select by index
		sel.selectByIndex(0);
		//select by value property
		sel.selectByValue("HTML");
		Thread.sleep(2000);
		sel.selectByValue("JAVA");
		Thread.sleep(2000);
		sel.selectByValue("CSS");
		//To get all options
		List<WebElement> Li = sel.getOptions();
		//get count of all item
		System.out.println(Li.size());
		//Way 1 using for loop
		for(int i =0;i<Li.size();i++)
		{
			//get item name
			String name = Li.get(i).getText();
			System.out.println(name);
		}
		//way 2 using for each loop
		for(WebElement A:Li)
		{
			System.out.println(A.getText());}
		//close browser
		driver.close();
		//quit browser
		driver.quit();
		
		}
	}

