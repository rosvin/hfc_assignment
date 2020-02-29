package myntra_rosmariya_pageobjects;




import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.Readconfig;




public class baseclass {
	
	Readconfig readconfig = new Readconfig();
	
	public String baseUrl = readconfig.getApplicationUrl();
    public String ADDRESS = readconfig.getAddress();
	public static WebDriver driver;
    
@BeforeClass
	public void setup()
	{
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
	}}
/*@AfterClass
    public void tearDown()
      {
          driver.quit();
      }
   
}*/
