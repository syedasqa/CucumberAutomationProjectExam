package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver driver;

	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void takeScreenShot(WebDriver driver) {
		TakesScreenshot takesScreenShot = (TakesScreenshot) driver;
		File sourceFile = takesScreenShot.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		
		String label = formatter.format(date);
		
		try {
			System.out.println(System.getProperty("user.dir"));
			FileUtils.copyFile(sourceFile,
					new File(System.getProperty("user.dir") + "/Screenshots/" + label + ".png"));
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
