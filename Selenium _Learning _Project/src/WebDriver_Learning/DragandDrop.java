package WebDriver_Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement dragElement = driver.findElement(By.id("draggable"));
		WebElement dropElement = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);//Configure the action
		//Get Action
		Action dragAndDrop = builder.clickAndHold(dragElement).moveToElement(dropElement).release(dropElement).build();
		//Execute Action
		dragAndDrop.perform();
		driver.close();
		driver.quit();
		
		

	}
}