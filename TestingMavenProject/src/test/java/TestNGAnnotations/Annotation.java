package TestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ListenerTestNG.ListenerTestNG;

public class Annotation extends Base
{
	@Test(groups = "smoke",priority = 2)
	@Parameters("browser")
	public void Test1(String browser)
	{
		System.out.println("Executing : testCase1 in"+ browser);
		//Assert.assertEquals("Actual", "Expected");
		Assert.assertTrue(8<90);
	}
	@Test(groups = "sanity",priority = 1)
	public void Test2()
	{
		System.out.println("Executing : testCase2");
		//System.out.println("Name : "+name);
//		System.out.println("Age : "+age);
		Assert.assertEquals("edt", "edt", "Actual and Expected values do not match");
	}

}
