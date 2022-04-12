package org.demo;

import org.base.HelperClass;
import org.pojo.FbPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample extends HelperClass{
	
	FbPojo f;
	@BeforeClass
	private void bfClass() {
		launchChromeBrower();
		
	}
	
	
	@Test(priority=-45)
	private void tc2() {
		
		url("https://www.facebook.com/");
		
		f= new FbPojo();
		
		fillText(f.getTxtuser(),"greens");
		fillText(f.getTxtpass(),"1234567");
	

	}
	
	@Test(priority=2)
	private void tc1() {
		maxi();

	}


	@Test(priority=0)
	private void tc3() {
	
		
		btnClick(f.getBtn());
		
	}

	
	@BeforeMethod
	private void bf() {
		dateAndTime();
	}
	
	@AfterMethod
	private void af() {
		dateAndTime();
	}
	
}


