package com.selenium.org.Learn_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {
	WebDriver driver;
	
	public WebDriver startBrowser() {
        driver = new ChromeDriver();
        ConfigReader config = new ConfigReader();
        driver.get(config.getAppURL());
        return driver; 
	
}
}