package myntra_rosmariya_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import myntra_rosmariya_pageobjects.baseclass;
import myntra_rosmariya_pageobjects.myntrapageobjects;

public class add_product_cart extends baseclass {
	
	@Test
	public void addtocart() throws InterruptedException
	{
		driver.get(baseUrl);
		myntrapageobjects prod = new myntrapageobjects(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		prod.Popalert();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5500)");
		
		prod.mamacitoproduct();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		prod.add_address(ADDRESS);
		prod.Locate();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		prod.buritto_dish();
		prod.addtocart();
		driver.navigate().refresh();
		prod.buritto_dish1();

		prod.addtocart();
		prod.buritto_dish2();
		prod.addtocart();
		
		
		// Have checked whether the product is added by checking the price Not equal to null 
		
		if(driver.findElement(By.xpath("//span[@class='item--price']"))!= null){
			System.out.println("Added to cart successfully");
			}
		else{
			System.out.println("Cannot be added");
			}
	}

}
