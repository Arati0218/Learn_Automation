package com.selenium.org.Learn_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LaunchBrowser {
	WebDriver driver;
	
	public WebDriver startBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--no-sandbox");
	    options.addArguments("--disable-dev-shm-usage");
	    options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        ConfigReader config = new ConfigReader();
        driver.get(config.getAppURL());
        return driver; 
	
}
}