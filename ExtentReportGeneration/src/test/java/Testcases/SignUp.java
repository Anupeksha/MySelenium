package Testcases;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ReportService;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Reports.ExtentManager;

public class SignUp 
{

	ExtentTest test;
	ExtentReports reports;
	
	@BeforeMethod
	public void init() 
	{
		reports = ExtentManager.getReports();
		test =  reports.createTest("Sign Up");
	}
	
	@AfterMethod
	public void quit()
	{
		reports.flush();
	}
	
	@Test
	public void login()
	{

		test.log(Status.INFO, "Beginning of the Testcase");
		test.log(Status.INFO, "Starting Browser");
//		test.log(Status.FAIL, "Error 404");
//		Assert.fail("Something isnt right");
		test.log(Status.INFO, "Registering in");
		test.log(Status.INFO, "Test Case Passed");

	}
}
