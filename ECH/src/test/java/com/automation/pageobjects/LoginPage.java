package com.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver =ldriver;
		
	}
@FindBy(xpath="//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]/span[1]") WebElement loginApp;

@FindBy(name="email") WebElement uname;

@FindBy(name="password") WebElement npass;

@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]") WebElement loginbutton;

public void Logintocrm(String userapp,String passapp) {
	
	try {
		Thread.sleep(9000);
	loginApp.click();
	Thread.sleep(5000);
	uname.sendKeys(userapp);
	npass.sendKeys(passapp);
	Thread.sleep(3000);
	loginbutton.click();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
