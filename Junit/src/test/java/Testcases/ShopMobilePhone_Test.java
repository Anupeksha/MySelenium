package Testcases;

import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShopMobilePhone_Test 
{
		
	@Test // Annotations that it is a test
	public void SearchForMobile ()
	{
		System.out.println("Searching for Mobile");
	}
	
	//@Ignore
	@Test // Annotations that it is a test
	public void SelectMobile ()
	{
		System.out.println("Selecting Mobile");
	}
	
	@Test // Annotations that it is a test
	public void CheckOutOrder ()
	{
		Assume.assumeTrue(false);
		System.out.println("Checking Out Cart");
	}
}
