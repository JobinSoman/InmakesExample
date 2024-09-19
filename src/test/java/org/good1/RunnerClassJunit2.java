package org.good1;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClassJunit2 
{
	@Test
	public void SuiteExecution()
	{
		Result rc=JUnitCore.runClasses(FaceBook.class,Inmakes.class,Amazon.class);
		System.out.println("Total run time is "+rc.getRunTime());
		System.out.println("Total run count is"+rc.getRunCount());
		System.out.println("Total failure count is "+rc.getFailureCount());
		System.out.println("Total ignore count is "+rc.getIgnoreCount());
		
		List<Failure> failures=rc.getFailures();
		for (Failure fails : failures) 
		{
			System.out.println(fails);
		}
	}
}
