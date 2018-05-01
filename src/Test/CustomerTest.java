package Test;

import static org.junit.Assert.*;
import  RestaurantTakeOut.Customer;

import org.junit.Test;

public class CustomerTest
{
	Customer cust = new Customer();
	@Test
	public void testGetUserName() {
		cust.setUserName("a");

		assertEquals("The customer name should be a","a",cust.getUserName());
	}

	@Test
	public void testGetZip()
	{
		cust.setZip(55403);
		assertEquals("The customer zipCode should be 55403",55403 ,cust.getZip());
	}

}
