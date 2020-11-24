package com.automation.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.automation.pageobjects.Baseclass;
import com.automation.pageobjects.LoginPage;
import com.automation.utils.ExcelDataProvider;
import com.automation.utils.Helper;

public class LoginTest extends Baseclass {
	
	
	
	

	@Test
	public void loginApp()
	{
		
	
	    logger= report.createTest("Login to CER") ;
	       
	       
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("strate Application");
		
		loginpage.Logintocrm(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Succes");
		

	
	}
	
	
}
