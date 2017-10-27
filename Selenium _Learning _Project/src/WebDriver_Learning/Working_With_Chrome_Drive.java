package WebDriver_Learning;



	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Working_With_Chrome_Drive {

		public static void main(String[] args) {
	     
			System.setProperty("webdriver.chrome.driver","/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
	    
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("http://apps.qaplanet.in/qahrm/login.php");
			
			driver.findElement(By.name("txtUserName")).clear();
			driver.findElement(By.name("txtUserName")).sendKeys("qaplanet2");
		    driver.findElement(By.name("txtPassword")).clear();
		    
		    driver.findElement(By.name("txtPassword")).sendKeys("user2");
		    driver.findElement(By.name("Submit")).click();
		    
		    driver.findElement(By.linkText("Logout")).click();
		
		    driver.close();
		    
		    driver.quit();
		    
	
		

		
		
		}

	}


