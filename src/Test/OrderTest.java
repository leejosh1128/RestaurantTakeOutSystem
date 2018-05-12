package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import RestaurantTakeOut.Order;

public class OrderTest {
Order test=new Order();
	@SuppressWarnings("deprecation")
	@Test
	public void testOrder() {
		Order ord = new Order ("abc", 1, (float)10.00);
		assertEquals("abc",ord.getOrderName());
		assertEquals(1,ord.getOrderNumber());
	
		
	}

	@Test
	public void testOrderStringIntFloat() {
		
	}

	@Test
	public void testSetOrderName() {
		test.setOrderName("name");
		assertEquals("name",test.getOrderName());
	}

	@Test
	public void testSetOrderNumber() {
		test.setOrderNumber(3);
		assertEquals(3,test.getOrderNumber());
	}

	@Test
	public void testSetOrderPrice() {
		test.setOrderPrice(0);
		assertEquals(0,test.getOrderPrice(), 0.0002);
	}

	@Test
	public void testGetOrderName() {
		test.setOrderName("name");
		assertEquals("name",test.getOrderName());
	}

	@Test
	public void testGetOrderNumber() {
		test.setOrderNumber(2);
		assertEquals(2,test.getOrderNumber());
	}

	
	@Test
	public void testGetOrderPrice() {
		test.setOrderPrice(2);
		assertEquals(2,test.getOrderPrice(), 0.0002);
	}

}
