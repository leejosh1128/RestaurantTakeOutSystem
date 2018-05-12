package Test;

import static org.junit.Assert.*;
import  RestaurantTakeOut.Customer;

import org.junit.Test;

public class CustomerTest
{
	Customer cust = new Customer();

	@Test
	public void testCustomer() {
		cust.setUserName("a");
		cust.setZip(55403);
		assertEquals("The customer zipCode should be 55403",55403 ,cust.getZip());
		assertEquals("The customer zipCode should be 55403","a" ,cust.getUserName());
	}

	@Test
	public void testCustomerStringInt() {
		Customer cus = new Customer("abc",55401);
		assertEquals("The customer name should be abc","abc" ,cus.getUserName());
		assertEquals("The customer zipCode should be 55401",55401 ,cus.getZip());
	}

	@Test
	public void testSetUserName() {
		cust.setUserName("a");
		assertEquals("The customer zipCode should be 55403","a" ,cust.getUserName());
	}

	@Test
	public void testSetZip() {
		cust.setZip(55403);
		assertEquals("The customer zipCode should be 55403",55403 ,cust.getZip());
	}
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
