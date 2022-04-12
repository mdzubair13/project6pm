package org.sample;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Runner {
	
		@Test
		public void tc() {
			Result x = JUnitCore.runClasses(a.class,b.class);
			System.out.println(x.getRunTime());
			System.out.println(x.getRunCount());
			System.out.println(x.getFailureCount());
			System.out.println(x.getIgnoreCount());
			

		}
	
			
	
}
