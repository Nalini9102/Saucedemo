package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart 
{

	WebDriver driver;
	String prodName;
	String prodQuantity;
	WebElement cButton;

	
	public  String getProdName() {
		return driver.findElement(By.className("inventory_item_name")).getText();
	}

	
	public String getProdQuantity() {
		return driver.findElement(By.className("cart_quantity")).getText();
	}

	
	public WebElement getCButton() {
		return driver.findElement(By.className("checkout_button"));
	}

	
	public  Cart(WebDriver driver) {
		super();
		this.driver = driver;
	}

	
	public void checkOut() {
		getCButton().click();
	}
	
}
