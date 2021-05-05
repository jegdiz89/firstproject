package org.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SuiteLevel {
	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(SuiteLevelExecution.class);
		
		int failureCount = runClasses.getFailureCount();
		System.out.println("Filiure count is:" +failureCount);
		
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println("Ignore count is :"+ignoreCount);
		
		int runCount = runClasses.getRunCount();
		System.out.println("Run count is: "+runCount);
		
		long runTime = runClasses.getRunTime();
		System.out.println("Total Run time is:"+runTime);
		
		List<Failure> failures = runClasses.getFailures();
		
		for (int i = 0; i < failures.size(); i++) {
			System.out.println(failures.get(i));
		}
	}
	
}
