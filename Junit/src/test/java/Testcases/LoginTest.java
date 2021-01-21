package Testcases;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

//Step 1
@RunWith(Parameterized.class)

public class LoginTest 
{
	//STep2 - Declare Global variable
	String Username;
	String password;
	String Browser;
	
	//Step3 - Build a constructor
	public LoginTest(String username, String password,String browser)
	{
		this.Username=username;  //this refers to the global variable and on right side it is the local variable passed in the constructor
		this.password=password;
		this.Browser=browser;
	}
	
	@Test
	public void loginTest()
	{
		System.out.println(Username + ": " +password + "  : " + Browser);
	}
	
	//STep4 - create annotations for parameters
	
	@Parameters
	public static Collection<Object[]> getData()
	{
		Object[][] data = new Object[4][3];
		//1st Row
		data[0][0]="U1";
		data[0][1]="P1";
		data[0][2]="Firefox";
		
		//2nd Row
		data[1][0]="U2";
		data[1][1]="P2";
		data[1][2]="Chromium";
		
		//3rd Row
		data[2][0]="U3";
		data[2][1]="P3";
		data[2][2]="Explorer";
		
		//4th Row
		data[3][0]="U4";
		data[3][1]="P4";
		data[3][2]="Safari";
		
		return Arrays.asList(data);
	}
}
