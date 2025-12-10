package com.selenium.org.Learn_Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 

public class LoginPageTest {

	public static void main(String[] args) {
		
	
		LaunchBrowser browser = new LaunchBrowser();
		WebDriver driver =browser.startBrowser();
		LoginPage login = new LoginPage(driver);
		ConfigReader config = new ConfigReader();
		
		
		login.enterUserName(config.getUsername());
		
	    login.enterPassword(config.getPassword());
	 
	    login.clickSubmit();
	    
	    WebElement verifyLogin = login.driver.findElement(By.id("modern-store-modified"));
	  String SuccessfulLogin= verifyLogin.getText();
	  
	  if(SuccessfulLogin.contains("Logged In Successfully")) {
		  System.out.print("login successfull");   
	  }
	  
	  driver.quit();
	
	}

}
