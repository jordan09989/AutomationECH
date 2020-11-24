package com.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() {
		
	
	File src = new File("./Config/Config.properties");
	
    try {
		FileInputStream fis = new FileInputStream(src);
		
		     pro = new Properties();
		     
		     pro.load(fis);
	
	} catch (Exception e) {
		System.out.println("Data are not found"+e.getMessage());
	}

}
	
	public String getDataFromConfig(String keyToSearch) {
		
		return pro.getProperty(keyToSearch);
		
	}
	
	public String getBrowser() {
		
		return pro.getProperty("Browser");
		
	}
	public String getStringURL() {
		return pro.getProperty("qaURL");
		
	}
}