package Testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


	//It makes sure that all the test cases in the project are run one by one in a batch
	
	@RunWith(Suite.class)
	@SuiteClasses(
			{
				LoginTest.class,
				ShopMobilePhone_Test.class,
				Validations_Test.class
			})
	
	public class CustomProjectRunner 
	{
		
	}
	
	// Reports, run - command prompt - ANT/Maven, Exe file, Jenkins
	
	//ANT is a built tool which helps you to run the test from command prompt
	
/*
  How do I tell the location of jars how do I store the class files
 */
	 
