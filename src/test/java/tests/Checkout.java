package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout 
{

	
WebDriver driver;
	
	WebElement finaOrder;
	
	
	public  WebElement getFinalOrder() {
		return driver.findElement(By.className("cart_button"));
	}
	
	
	public  String finishButtonText() {
		return getFinalOrder().getText();
	}
	
	
	public  Checkout(WebDriver driver) {
		super();
		this.driver = driver;
	}

	
	public void finalizePurchase() {
		getFinalOrder().click();
	}
}
