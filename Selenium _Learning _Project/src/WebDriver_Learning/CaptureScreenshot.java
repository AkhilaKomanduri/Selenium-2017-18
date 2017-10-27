package WebDriver_Learning;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/RaviAkhi/Desktop/Selenium Dump/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		//java code for date and time
		DateFormat df = new SimpleDateFormat("yyyy_MM_ddhh_ss_mm");
		Date d = new Date();
		String time = df.format(d);
		System.out.println(time);
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//take path to save screenshot see below path address
		FileUtils.copyFile(scrfile, new File("/Users/RaviAkhi/Desktop/ScreenshotExample"+time+" .png"));
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
		
	}

}
