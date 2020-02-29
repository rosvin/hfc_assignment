package myntra_rosmariya_pageobjects;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myntrapageobjects {

	
	WebDriver ldriver;
	
	public myntrapageobjects (WebDriver rdriver)
	{	
     ldriver = rdriver;
     PageFactory.initElements(rdriver,this);
	}
	
    @FindBy(css = "body.is--ctl-index.is--act-index.clubkitchen.is--no-sidebar:nth-child(2) div.page-wrap:nth-child(2) section.content-main.content--home.container.block-group.is--fullscreen div.content-main--inner div.content--wrapper div.content.content--home div.content--emotions div.emotion--wrapper:nth-child(10) section.emotion--container.emotion--column-12.emotion--mode-fluid.emotion--0 div.emotion--element.col-1.row-1.start-col-1.start-row-1.col-xs-5.start-col-xs-2.row-xs-5.start-row-xs-10.col-s-5.start-col-s-2.row-s-5.start-row-s-10.col-m-5.start-col-m-1.row-m-16.start-row-m-8.col-l-6.start-col-l-1.row-l-7.start-row-l-10.col-xl-5.start-col-xl-2.row-xl-6.start-row-xl-10:nth-child(2) div.restaurant--description.left > a.button-home.is--primary:nth-child(2)")
    WebElement product;
    @FindBy(xpath = "//input[@id='address-input']")
    WebElement productbag;
    @FindBy(xpath = "//input[@class='btn--honest blattgold--form-banner-submit']")
    WebElement location;
    @FindBy (xpath ="//*[@id=\"cookie-policy\"]/div/div[2]/button")
    WebElement pop;
    
    
    //selection of product
    //bag
    @FindBy(xpath = "//div[@class='product--category category--596']//div[2]//div[1]//div[2]//div[1]//form[1]//button[1]")
    WebElement buritto;
    @FindBy(xpath ="//button[@id='topup-modal--close']")
    WebElement add_dish;
    @FindBy(xpath ="//div[@class='product--category category--596']//div[4]//div[1]//div[2]//div[1]//form[1]//button[1]")
    WebElement buritto1;
    @FindBy(xpath ="//div[@class='product--category category--598']//div[4]//div[1]//div[2]//div[1]//form[1]//button[1]")
    WebElement buritto3;
  
    
    public void Popalert()
    {
    	pop.click();
    }
    public void mamacitoproduct()
    {
    	product.click();
    }
    public void add_address(String ADDRESS)
    {
    	productbag.sendKeys(ADDRESS);
    }
   
    public void Locate()
    {
    	location.click();
    }

    public void buritto_dish()
    {
    	buritto.click();
    }
    public void addtocart()
    {
    	add_dish.click();
    }
    public void buritto_dish1()
    {
    	buritto.click();
    }
    public void buritto_dish2()
    {
    	buritto3.click();
    }
   
    }


	
	