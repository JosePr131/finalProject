package lastProj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testRunner {

	public static void main(String[] args) 
	{

		Result result = JUnitCore.runClasses(testSuite.class);
		for (Failure failure : result.getFailures()) {
		System.out.println(failure.toString());
	}	
		System.out.println(result.wasSuccessful());	
	}
}
