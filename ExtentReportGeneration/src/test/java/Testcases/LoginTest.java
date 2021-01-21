package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Reports.ExtentManager;

public class LoginTest 
{
	ExtentTest test;
	ExtentReports reports;
	
	@BeforeMethod
	public void init() 
	{
		reports = ExtentManager.getReports();

		test =  reports.createTest("LoginTest");
	}
	
	@AfterMethod
	public void quit()
	{
		
		reports.flush();  //finalizes and generates the report
	}
	
	@Test
	public void login() throws IOException
	{

		test.log(Status.INFO, "Beginning of the Testcase");
		test.log(Status.INFO, "Starting Browser");
		test.log(Status.FAIL, "Error 404");
		test.addScreenCaptureFromPath("/home/anu/workspace/New_Eclipse/ExtentReportGeneration/Temp.png", "error");
//		AssertJUnit.fail("Something isnt right");
		test.log(Status.INFO, "Logging in");
		test.log(Status.INFO, "Test Case Passed");

	}
}
