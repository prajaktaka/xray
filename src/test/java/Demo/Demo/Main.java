package Demo.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Pages.Clothing;
import Pages.Fashion;
import Pages.Home_page;
import Pages.Quantity;
import Pages.Twitter;
import Pages.View_cart;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Main
{
		WebDriver driver;
		Home_page homePage;
		Fashion fash;
		Clothing clothing;
		Twitter twitter;
		Quantity quantity;
		View_cart view;
		
		@BeforeTest
		public void TestSetUp() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
			driver.get("https://demo.opencart.com/");	
			driver.manage().window().maximize();
		
		}
		
		@Test
	    public void Testng() throws InterruptedException 
	    {	
			homePage=new Home_page(driver);
			homePage.Click_On_Fashion();
			//fash=new Fashion(driver);
			//fash.Click_On_Fashion();
			//clothing=new Clothing(driver);
			//clothing.Click_On_Firstprod();
			//twitter=new Twitter(driver);
			//twitter.Click_On_Twit();
			quantity=new Quantity(driver);
			quantity.Click_On_Add();
			//view=new View_cart(driver);
			//view.Click_On_View(); 
			
		}
		
		
}