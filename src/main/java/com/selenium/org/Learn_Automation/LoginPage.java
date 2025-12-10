/**
 * 
 */
package com.selenium.org.Learn_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class LoginPage {
	
	WebDriver driver;
	WebElement userName;
	WebElement Password;
	WebElement submit;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public void enterUserName(String username) {
		
		userName = driver.findElement(By.id("username"));
		userName.sendKeys(username);
		
	}
	
public void enterPassword(String password) {
		
	Password = driver.findElement(By.id("password"));
	Password.sendKeys(password);
		
	}

public void clickSubmit() {
	
	submit = driver.findElement(By.id("submit"));
	submit.click();
		
	}
}
