package com.fdmgroup.testSuites;

import org.junit.runner.JUnitCore;

import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.fdmgroup.stepDefinitionFiles.TestRunner;

@RunWith(Suite.class)
@SuiteClasses({TestRunner.class})
public class EBayTests {
	
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(TestRunner.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
}
