package com.selenium.org.Learn_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LaunchBrowser {
	WebDriver driver;
	
	public WebDriver startBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");

        driver = new ChromeDriver();
        ConfigReader config = new ConfigReader();
        driver.get(config.getAppURL());
        return driver; 
	
}
}