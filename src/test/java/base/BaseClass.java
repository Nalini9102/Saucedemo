package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import tests.Cart;
import tests.Checkout;
import tests.Confirmation;
import tests.CustInfo;
import tests.LogPage;
import tests.Product;

public class BaseClass 
{
	
	
	WebDriver driver;
	LogPage lP;
	Product pP;
	Cart cP;
	CustInfo cInfoP;
	Checkout coutP;
	Confirmation confirmP;

	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver",("user.dir")+"/Driver/chromedriver");
		this.driver = new ChromeDriver();
		this.lP = new LogPage();
		this.pP = new Product(driver);
		this.cP = new Cart(driver);
		this.cInfoP = new CustInfo();
		this.coutP = new Checkout(driver);
		this.confirmP = new Confirmation(driver);

		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		System.out.println("Program");
	}

}
