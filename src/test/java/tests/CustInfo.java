package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustInfo
{
	WebDriver driver;

	WebElement name;
	WebElement lastNamet;
	WebElement postalCode;
	WebElement continueB;

	
	public WebElement getContinueB() {
		return driver.findElement(By.cssSelector("input[type='submit']"));

	}
	
	
	public WebElement getName() {
		return driver.findElement(By.id("first-name"));
	}
	
	
	public WebElement getLastName() {
		return driver.findElement(By.id("last-name"));
	}

	
	public WebElement getPostalCode() {
		return driver.findElement(By.id("postal-code"));
	}

	
	public void CInfoP(WebDriver driver) {
		
		this.driver = driver;
	}

	
	public void fillIn(String name, String lastName, String postalCode) {
		getName().sendKeys(name);
		getLastName().sendKeys(lastName);
		getPostalCode().sendKeys(postalCode);
	}

	
	public void submit() {
		getContinueB().click();
	}

}
