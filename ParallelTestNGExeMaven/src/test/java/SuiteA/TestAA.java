package SuiteA;

import org.testng.annotations.Test;

public class TestAA 
{
	@Test
	public void testAnt() throws InterruptedException
	{
		System.out.println("_______________________________");
		System.out.println("Beginning of testcase Another");
		Thread.sleep(1000);
		System.out.println("Concluding testcase Another");
	}
}
