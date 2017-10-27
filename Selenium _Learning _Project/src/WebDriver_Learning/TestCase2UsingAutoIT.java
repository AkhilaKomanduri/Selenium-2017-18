package WebDriver_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Add Employee and verify Employee List
public class TestCase2UsingAutoIT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		//Maximise Browser
		driver.manage().window().maximize();
		//Wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		Actions act = new Actions(driver);
		//Open orange HRM
		driver.get("http://192.168.0.18/orangehrm-2.5.0.2/login.php");
		//Verify home page
		String title = driver.getTitle();
		if(title.equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Home page is displayed");
		}
		else
		{
			System.out.println("Home page is not displayed");
		}
		//Create web elements for user name, password, login and clear
		WebElement objectUN = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("")));
		WebElement objectPWD = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("")));
		WebElement objectLOGIN = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("")));
		WebElement objectCLEAR = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("")));
				//Verify user name and password
				if(objectUN.isDisplayed() && objectPWD.isDisplayed())
		{
			System.out.println("UserName and Password is displayed");
		}
		else
		{
			System.out.println("Username and Password is not displayed");
		}
		//Verify login and clear
		if(objectLOGIN.isDisplayed() && objectCLEAR.isDisplayed())
		{
			System.out.println("Login and Clear is diplayed");
		}
		else
		{
			System.out.println("Login and Clear is not displayed");
			
			//Enter valid username password and click login
			String UN = "akhila";
			String PWD = "12345";
			//Login to OrangeHRM
			objectUN.clear();
			objectUN.sendKeys(UN);
			objectPWD.sendKeys(PWD);
			objectLOGIN.click();
			
			//verify orangehrm page displayed and verify below details welcome message change password and logout links.
			boolean title1 = wait.until(ExpectedConditions.titleContains(""));
			if(title1) {
				System.out.println("OrangeHRM is diplayed");
			}
			else
			{
				System.out.println("OrangeHRM is not displayed");
			}
			//Verify welcome text
			
			title1 = wait.until(ExpectedConditions.titleContains(""));
			if(title1) {
				System.out.println("Orange HRM is displayed");
			}
			else
			{
				System.out.println("Orange HRM is not displayed");
			}
			//Get welcome text
			String wel =driver.findElement(By.xpath("")).getText();
			//Verify Welcome text
			if(wel.equals("Welcome))
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
					
		
		
		
	}
		
		
		

	}

}
