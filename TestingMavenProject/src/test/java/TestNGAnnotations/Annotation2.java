package TestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sun.xml.internal.ws.api.pipe.Fiber.Listener;

import ListenerTestNG.ListenerTestNG;

public class Annotation2 extends Base
{
	@Test(groups = "sanity")
	public void Test11()
	{
		System.out.println("Executing : testCase11");
	}
	@Test(groups = "sanity",priority = 1,dataProvider = "getData")
	public void Test22(String name,String age)
	{
		System.out.println("Executing : testCase22");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		Assert.assertEquals("edt", "edt", "Actual and Expected values do not match");
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="Anupekha";
		data[0][1]="33";
		
		data[1][0]="Ankit";
		data[1][1]="35";
		
		return data;
	}
}


