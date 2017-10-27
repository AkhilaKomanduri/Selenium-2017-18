package WebDriver_Learning;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWebTable {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("http://only-testing-blog.blogspot.co.uk/2013/10/table.html");
		//To get row count	
int rc=driver.findElements(By.xpath("//*[@id='post-body-7620983160655848331']/div[1]/table/tbody/tr")).size();
System.out.println("Row Count: "+rc);
//To get column count
int cc =driver.findElements(By.xpath("//*[@id='post-body-7620983160655848331']/div[1]/table/tbody/tr[1]/td")).size();
System.out.println("Column Count: "+cc);
//To get cell count
int cec = driver.findElements(By.xpath("//*[@id='post-body-7620983160655848331']/div[1]/table/tbody/tr/td")).size();
System.out.println("Cell Count:"+cec);
			//Print all cell data
for(int i=1;i<=rc;i++)
{
	for(int j = 1; j<=cc; j++)
	{
		//Get data from cell
		String Name = driver.findElement(By.xpath("//*[@id='post-body-7620983160655848331']/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.println(Name);
	}
}
	
	//Close browser
driver.close();
//quit object
driver.quit();
	}

	}
