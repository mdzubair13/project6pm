package org.sample;

import org.base.HelperClass;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pojo.FbPojo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a extends HelperClass {

	
	@Parameters({"Browser"})
	@Test
	private void t(String name) {
		
		if (name.startsWith("chr")) {
			launchChromeBrower();
		}
		
		else if (name.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			

		}
		driver.get("https://www.facebook.com/");
		maxi();
	}
	
		
		
		

	
	
	
	
	}
	
	
	
	
	
	



	
