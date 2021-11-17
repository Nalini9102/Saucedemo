package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Confirmation 
{
	
WebDriver driver;
	
	String orderConfirm;
	
	String assertText;
	
	public  String orderConfirmText() {
		return driver.findElement(By.className("complete-header")).getText();
	}

	
	public String getAssertText() {
		return "THANK YOU FOR YOUR ORDER";
	}

	
	public  Confirmation(WebDriver driver) {
		super();
		this.driver = driver;
	}

}
