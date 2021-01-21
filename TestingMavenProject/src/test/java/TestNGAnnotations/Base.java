package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base 
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	@BeforeGroups
	public void beforeGroups()
	{
		System.out.println("@BeforeGroups");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("@AfterSuite");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("@AfterTest");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("@AfterClass");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("@AfterMethod");
	}
	
	@AfterGroups
	public void AfterGroups()
	{
		System.out.println("@AfterGroups");
	}
	
	

}
