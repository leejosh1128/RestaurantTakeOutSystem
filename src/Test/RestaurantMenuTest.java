package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import RestaurantTakeOut.RestaurantMenu;

public class RestaurantMenuTest {

	RestaurantMenu menu = new RestaurantMenu();
	@Test
	public void testRestaurantMenu() {
		
	}

	@Test
	public void testRestaurantMenuIntStringStringFloat() {
		RestaurantMenu mn = new RestaurantMenu(1,"a","orange",(float)10);
		assertEquals("The id should be 1", 1, mn.getRestid());
		assertEquals("The name should be a", "a", mn.getRestName());
		assertEquals("The dish should be orange", "orange", mn.getDishName());

	}

	@Test
	public void testSetRestid() {
		menu.setRestid(1);
		assertEquals("The id should be 1", 1, menu.getRestid());
	}

	@Test
	public void testSetRestName() {
		menu.setRestName("abc");
		assertEquals("The name should be abc", "abc", menu.getRestName());
	}

	@Test
	public void testSetDishName() {
		menu.setDishName("name");
		assertEquals("name",menu.getDishName());
	}

	@Test
	public void testSetDishPrice() {
		menu.setDishPrice((float) (1.23));
		assertEquals(1.23,menu.getDishPrice(),0.0002);
	}

	@Test
	public void testGetRestid() {
		menu.setRestid(1);
		assertEquals("The id should be 1", 1, menu.getRestid());
	}

	@Test
	public void testGetRestName() {
		menu.setRestName("abc");
		assertEquals("The name should be abc", "abc", menu.getRestName());
	}

	@Test
	public void testGetDishName() {
		menu.setDishName("dish");
		assertEquals("dish",menu.getDishName());
	}

	@Test
	public void testGetDishPrice() {
		menu.setDishPrice((float) (1.23));
		assertEquals(1.23,menu.getDishPrice(),0.0002);
		
	}

}
