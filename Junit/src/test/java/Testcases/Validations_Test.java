package Testcases;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Validations_Test 
{
	@Rule
	public ErrorCollector errcol= new ErrorCollector();
	
	@Test
	public void validate()
	{
		String expectedResult = "A"; //from xls or properties file
		String actualResult = "Akl";
		System.out.println("Start");
		try
		{
		Assert.assertEquals(expectedResult, actualResult);
		}
		catch(Throwable e)
		{
			System.out.println("Some error occured  "+e.getMessage());
			errcol.addError(e);
		}
		System.out.println("End");
		/*
		 * Assert.assertTrue("Error message", 4>28); //if the Condition given is false
		 * then show the given error message else passed
		 * Assert.assertFalse("Button is enabled", 15<9); //If condition is false then
		 * throw error (pass) else fail Assert.fail("Had to be logged-in but didn't");
		 */
		
		//If you want to collect all the errors and continue with the test case the use error collector
		//Assertion do not come under exception, hence use throwable
		
		try
		{
			Assert.assertTrue("The link isn't available", 89<7);
		}
		catch(Throwable e)
		{
			System.out.println("Some error occured  "+e.getMessage());
			errcol.addError(e);
		}
		
//		Assert.fail("User isn't logged into the system.");
		
	}

}
