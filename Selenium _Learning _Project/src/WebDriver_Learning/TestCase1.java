package WebDriver_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		//Maximise Browser
		driver.manage().window().maximize();
		//Open Orange HRM
		driver.get("http://192.168.0.18/orangehrm-2.5.0.2/login.php");
		//Wait 2 sec
		Thread.sleep(2000);
		//Verify home page
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Home page displayed");
		}
		else
		{
			System.out.println("Failed to open Home page");
			return;
		}
		//Create web elements for username, password, login and clear 
		WebElement objUserName = driver.findElement(By.name("txtUserName"));
		WebElement objPassword = driver.findElement(By.name("txtPassword"));
		WebElement objLogin = driver.findElement(By.name("Submit"));
		WebElement objClear = driver.findElement(By.name("clear"));
		//Verify User Name
		if(objUserName.isDisplayed())
		{
			System.out.println("User name displayed");
		}
		//Verify login and clear
		if(objLogin.isDisplayed()&&objClear.isDisplayed())
		{
			System.out.println("Login and clear buttons are displayed");
		}
	//----------------------------
		String strUserName ="akhila";
		String strPassword ="12345";
	//-------------------------------
		//Login to orangeHRM
		objUserName.clear();
		objUserName.sendKeys(strUserName);
		objPassword.clear();
		objPassword.sendKeys(strPassword);
		objLogin.click();
		//wait 2 sec
		Thread.sleep(2000);
		//Verify OrangeHRM
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("OrangeHRM displayed");
		}
		else
		{
			System.out.println("Failed to Login");
		}
		
		//Get Welcome text
		String strWelText = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
		//Verify welcome Text 
		if(strWelText.equals("Welcome "+strUserName))
		{
			System.out.println(("Welcome"+strUserName+"displayed"));
		}
			//Create web elements for change password and logout WebElement
		WebElement objChangePassword = driver.findElement(By.linkText("Change Password"));
		WebElement objLogout=driver.findElement(By.linkText("Logout"));
		//Verify change password and logout
		if(objChangePassword.isDisplayed()&&objLogout.isDisplayed())
		{
			System.out.println("Change password and logout are displayed");
			
			//Click on logout
			objLogout.click();
			//wait 2sec
			Thread.sleep(2000);
			//Verify Homepage
			if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
			{
				System.out.println("Signoff Successful and home page displayed");
			}
			else
			{
				System.out.println("Failed to sign off");
				return;
			}
				driver.close();
				//driver.quit();
			}
		}
}


