package Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import RestaurantTakeOut.MenuSearch;
import RestaurantTakeOut.Restaurant;
import RestaurantTakeOut.RestaurantMenu;

public class MenuSearchTest {
MenuSearch test=new MenuSearch();
	@Test
	public void testGetRestaurantMenu() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("Restaurant menu.csv"));
		String line = reader.readLine();
		RestaurantMenu rest = new RestaurantMenu();
		List<RestaurantMenu> menuList = new ArrayList<>();
		List<RestaurantMenu> allMenuList = new ArrayList<>();
		MenuSearch menuSearch = new MenuSearch();
		String data ="1";
		
//		rest.setRestid(1);
//		rest.setRestName("abc");		
//		rest.setDishName("apple");
//		rest.setDishPrice((float) 10.00);
//		allMenuList.add(rest);
		List<Restaurant> restList=new ArrayList<>();
//		restList.add(new Restaurant(1,"Tea House ",55131,"6126126000","Chinese"));		
//		restList.add(new Restaurant(2,"Olive Garden",55171,"6126126001","Intlian" ));
//		restList.add(new Restaurant(3,"In and Out",55211,"6126126002","American"));
//		restList.add(new Restaurant(4,"El Mexican Restaurant",55251,"6126126003","Mecican"));
//		restList.add(new Restaurant(5,"Little Sechuan ",55291,"6126126004","Chinese"));
//		restList.add(new Restaurant(6,"Super Burger",55331,"6126126005","American"));
//		restList.add(new Restaurant(7,"Soul Restaurant",55371,"6126126006","Korean"));
//		restList.add(new Restaurant(8,"Best Pizza",55411,"6126126007","Intlian"));
//		restList.add(new Restaurant(9,"Christos Greek Restaurant",55451,"6126126008","Greek"));
//		restList.add(new Restaurant(0,"Best Gill",55488,"6126126009","American"));
		


	//	assertEquals(restList,test.getRestaurantMenu(1));
	}

}
