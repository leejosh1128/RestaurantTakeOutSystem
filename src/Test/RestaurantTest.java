package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import RestaurantTakeOut.Restaurant;

public class RestaurantTest {

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
