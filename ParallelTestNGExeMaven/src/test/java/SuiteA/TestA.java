package SuiteA;

import org.testng.annotations.Test;

public class TestA
{
	@Test
	public void testA() throws InterruptedException
	{
		System.out.println("_______________________________");
		System.out.println("Beginning of testcase A");
		Thread.sleep(1000);
		System.out.println("Concluding testcase A");
	}
}
