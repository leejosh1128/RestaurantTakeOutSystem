package RestaurantTakeOut;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	Customer cust = new Customer();
	@Test
	public void testGetUserName() {
		cust.setUserName("a");
		cust.setZip(55403);
		assertEquals("The customer name should be a","a",cust.getUserName());
	}

	@Test
	public void testGetZip() {
		fail("Not yet implemented");
	}

}
