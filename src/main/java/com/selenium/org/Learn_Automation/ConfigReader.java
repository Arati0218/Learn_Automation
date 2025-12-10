/**
 * 
 */
package com.selenium.org.Learn_Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 */
public class ConfigReader {
	
	private Properties properties;

    public ConfigReader() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAppURL() {
        return properties.getProperty("url");
    }
    public String getUsername() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }
}


