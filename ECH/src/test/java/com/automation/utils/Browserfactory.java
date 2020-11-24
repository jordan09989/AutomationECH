package com.automation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Browserfactory {
	
	public static WebDriver startApplication(WebDriver driver, String BrowserName, String appURL)
	{
	if (BrowserName.equals("Chrome")) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	} 
	else if (BrowserName.equals("firefox"))
	{
		System.setProperty("webdriver.chrome.driver"," ./chromedriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}	
	else if (BrowserName.equals("IE")) 
	{
		System.setProperty("webdriver.chrome.driver"," ./chromedriver.exe");
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	}
	else
	{
	System.out.println("Broweser does not sopport thre broweser");	
	
	}
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(appURL);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	return driver;
	}
	
	public static void quitBrowser(WebDriver driver)

	{
		driver.quit();
	}

}
