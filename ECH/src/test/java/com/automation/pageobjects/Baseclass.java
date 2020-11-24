package com.automation.pageobjects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utils.Browserfactory;
import com.automation.utils.ConfigDataProvider;
import com.automation.utils.ExcelDataProvider;
import com.automation.utils.Helper;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.externalconfig.model.Config;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Baseclass {
	
	public ExcelDataProvider excel;
   public WebDriver driver;
   public ConfigDataProvider config;
   public ExtentReports report;
   public ExtentTest logger;
   
   @BeforeSuite
   public void setUpSuit() {
	   
	   Reporter.log("Satting up report", true);
	    excel = new ExcelDataProvider();
	    config = new ConfigDataProvider();
	    
	  
	   ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"./Reports/FreeCRM_"+Helper.getCurrentDateTime()+".html"));
	   
	   report= new ExtentReports();
	   report.attachReporter(extent);
	   
	   Reporter.log("Satting complate", true);
   }
   
	
	@BeforeClass
	public void setup() {
		
		Reporter.log("Browser going to start", true);
		driver= Browserfactory.startApplication(driver, config.getBrowser(), config.getStringURL());
	}
	@AfterClass
	public void teardown() {
		Browserfactory.quitBrowser(driver);
		
		
	}
	@AfterMethod
	public void teardownMethod(ITestResult result) throws IOException {
		
		Reporter.log("Test about to end", true);
		
		if (result.getStatus()==ITestResult.FAILURE) {
			
			logger.fail("Test Fail", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());

		}
		
		else if(result.getStatus()==ITestResult.SUCCESS) {
			
			logger.pass("Test Pass", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());

		}
		report.flush();
		Reporter.log("Test Complated << End >>", true);
		
	}

}
