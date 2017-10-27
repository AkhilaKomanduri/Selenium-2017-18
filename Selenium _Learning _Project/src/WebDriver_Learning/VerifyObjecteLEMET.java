package WebDriver_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyObjecteLEMET {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://192.168.0.18/orangehrm-2.5.0.2/login.php");
		driver.manage().window().maximize();
		WebElement objElement = driver.findElement(By.name("txtUserName"));
		objElement.clear();
		objElement.sendKeys("Data");
		//To verify element present or not
		objElement.isDisplayed();
		//To verify element Enabled or not
		objElement.isEnabled();
		//To select element selected or not
		objElement.isSelected();
		//To get text from element
		String strText=objElement.getText();
		String strValue=objElement.getAttribute("propertyname");	

	}

}
