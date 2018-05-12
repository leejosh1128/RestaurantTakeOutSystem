package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import RestaurantTakeOut.Restaurant;

public class RestaurantTest {
  
	Restaurant test = new Restaurant();
	@Test
	public void testRestaurant() {
		
	}

	@Test
	public void testRestaurantIntStringIntStringString() {
		Restaurant test1 = new Restaurant(1,"abc",55403,"123","rest");
		assertEquals("The id should be 1", 1, test1.getRestId());
		assertEquals("The name should be abc", "abc", test1.getRestName());
		assertEquals("The result should be 55403", 55403, test1.getRestZip());
		assertEquals("The result should be 123", "123", test1.getRestNumber());
		assertEquals("The result should be rest", "rest", test1.getRestDesc());
		
	}

	@Test
	public void testSetRestName() {
		
		test.setRestName("name");
		
		assertEquals("name",test.getRestName());
	}

	@Test
	public void testSetRestZip() {
		Restaurant test = new Restaurant();
		test.setRestZip(55444);
		assertEquals(55444,test.getRestZip());
	}

	@Test
	public void testSetRestId() {
		Restaurant test = new Restaurant();
		test.setRestId(1);;
		assertEquals(1,test.getRestId());
	}

	@Test
	public void testSetRestNumber() {
		Restaurant test = new Restaurant();
		test.setRestNumber("12345");
		assertEquals("12345",test.getRestNumber());
	}

	@Test
	public void testSetRestDesc() {
		Restaurant test = new Restaurant();
		test.setRestDesc("chinese rest");
		assertEquals("chinese rest",test.getRestDesc());
	}

	@Test
	public void testGetRestName() {
		Restaurant test = new Restaurant();
		test.setRestName("name");
		
		assertEquals("name",test.getRestName());
	}

	@Test
	public void testGetRestZip() {
		Restaurant test = new Restaurant();
		test.setRestZip(55444);
		assertEquals(55444,test.getRestZip());
	}

	@Test
	public void testGetRestId() {
		Restaurant test = new Restaurant();
		test.setRestId(1);;
		assertEquals(1,test.getRestId());
	}

	@Test
	public void testGetRestDesc() {
		Restaurant test = new Restaurant();
		test.setRestDesc("chinese rest");
		assertEquals("chinese rest",test.getRestDesc());
	}

	@Test
	public void testGetRestNumber() {
		Restaurant test = new Restaurant();
		test.setRestNumber("12345");
		assertEquals("12345",test.getRestNumber());
	}

}
