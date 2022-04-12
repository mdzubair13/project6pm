package org.sample;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class b {
	
	

	@Test
	public void tc3() {
		System.out.println("TC-3");
	}
	@Test
	public void tc4() {
		Assert.assertTrue(false);
		System.out.println("Tc-4");

	}
	
	@Test
	private void tc5() {
	System.out.println("TC-5");

	}
	
		
	
}
