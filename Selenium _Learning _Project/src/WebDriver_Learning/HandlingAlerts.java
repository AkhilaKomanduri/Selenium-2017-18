package WebDriver_Learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static void main(String[] args) 
	throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//wait.until(ExpectedConditions.titles("The Internet"));
		Thread.sleep(2000);
		if(driver.getTitle().equals("The Internet"))
				{
			System.out.println("The Internet page is displayed");
				}
		//Alert Pop up Handling.
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		//To locate alert
		Alert A = driver.switchTo().alert();
		//To read the text from alert popup.
		if(A.getText().equals("I am a JS Alert"))
				{
			System.out.println("I am a JS Alerts is displayed");
				}
		//To accept/Click Ok on alert popup.
		A.accept();
//Confirmation Pop up Handling.
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	Alert A2=driver.switchTo().alert();
	String Alert2 = A2.getText();
	Thread.sleep(2000);
	//To click on cancel button of confirmation box.
	A2.dismiss();
	//Prompt Pop up Handling.
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	Alert A3 = driver.switchTo().alert();
	String Alert3 =A3.getText();
	Thread.sleep(2000);
	//To type text in text box of prompt popup.
	A3.sendKeys("Hurayy!Mental Selinem");
	A3.accept();
	Thread.sleep(2000);
	driver.close();
	driver.quit();
	}
}
	

		
