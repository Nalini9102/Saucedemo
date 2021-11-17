package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product
{

	WebDriver driver;
	WebElement productsHeaderText;
	WebElement firstProduct;
	WebElement shoppingCart;

	public WebElement getShoppingCart() {
		return driver.findElement(By.id("shopping_cart_container"));
	}

	public String getProductsHeaderText() 
	{
		return driver.findElement(By.className("header_secondary_container")).getText();
	}

	public WebElement getFirstProduct() {
		return driver.findElement(By
				.xpath("//*[@id=\"inventory_container\"]/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
	}

	public  Product(WebDriver driver) {
		this.driver = driver;
	}

	public void addFirstProduct() {
		getFirstProduct().click();
	}

	public void goToShoppingCart() {
		getShoppingCart().click();
	}
}
