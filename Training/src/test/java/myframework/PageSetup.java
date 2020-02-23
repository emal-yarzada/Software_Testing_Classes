package myframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class PageSetup {
	public WebDriver driver;
  @Test
  public void f() throws IOException {
	  
  }
  @BeforeMethod
  @Parameters ({"browser", "URL"})
	  public void beforeMethod(String browser, String URL) throws InterruptedException {
		  if (browser.equalsIgnoreCase("chrome"))
		  {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  }
		  else if (browser.equals("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\emal_\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get(URL);
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  }
  
  @AfterMethod
  public void afterMethod() {

  }
  
  public void ScreenShot () throws IOException
  {
	  String timenew;
	//DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	  //Date d = new Date();
	  //String time = df.format(d);
	  timenew = "mypic";
	  File pics = (File) ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(pics, new File ("C:\\Users\\emal_\\eclipse-workspace\\Training\\Passed ScreenShots\\"+timenew+".jpg"));
	 
	{
		
	}
	
}

}


