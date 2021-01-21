package SuiteB;

import org.testng.annotations.Test;

public class TestB 
{
	@Test
	public void testA() throws InterruptedException
	{
		System.out.println("_______________________________");
		System.out.println("Beginning of testcase B");
		Thread.sleep(1000);
		System.out.println("Concluding testcase B");
	}
}
