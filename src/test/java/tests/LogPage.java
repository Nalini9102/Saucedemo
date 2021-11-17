package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogPage 
{

WebDriver driver;
	
	WebElement username;
	WebElement password;
	WebElement logButton;
	
	public WebElement getUsername() {
		return driver.findElement(By.id("user-name"));
	}
	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	public WebElement getLogButton() {
		return driver.findElement(By.id("login-button"));
	}
	
	public void Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void inputUsername(String username) {
		getUsername().sendKeys(username);
	}
	
	public void inputPassword(String password) {
		getPassword().sendKeys(password);
	}
	
	public void clickLoginButton() {
		getLogButton().click();
	}
	
}
