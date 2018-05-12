package Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import RestaurantTakeOut.Restaurant;
import RestaurantTakeOut.RestaurantSearch;
import RestaurantTakeOut.UserInput;

public class RestaurantSearchTest {
RestaurantSearch test=new RestaurantSearch();
	@Test
	public void testGetRestaurants() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("restaurant.csv"));
		String line = null;
		Scanner scan = new Scanner("1");
		List<Restaurant> restList=new ArrayList<>();
		restList.add(new Restaurant(1,"Tea House",55131,"6126126000","Chinese"));
		
//		restList.add(new Restaurant(2,"Olive Garden",55171,"6126126001","Intlian" ));
//		restList.add(new Restaurant(3,"In and Out",55211,"6126126002","American"));
//		restList.add(new Restaurant(4,"El Mexican Restaurant",55251,"6126126003","Mecican"));
//		restList.add(new Restaurant(5,"Little Sechuan ",55291,"6126126004","Chinese"));
//		restList.add(new Restaurant(6,"Super Burger",55331,"6126126005","American"));
//		restList.add(new Restaurant(7,"Soul Restaurant",55371,"6126126006","Korean"));
//		restList.add(new Restaurant(8,"Best Pizza",55411,"6126126007","Intlian"));
//		restList.add(new Restaurant(9,"Christos Greek Restaurant",55451,"6126126008","Greek"));
//		restList.add(new Restaurant(10,"Best Gill",55488,"6126126009","American"));
	
	//	assertEquals(restList,test.getRestaurants());
	}

	@Test
	public void testDeliverRestaurant() {
		
	}

	@Test
	public void testPickRestaurant() {
		List<Restaurant> deliRestList=new ArrayList<>();
		deliRestList.add(new Restaurant(2,"Olive Garden",55171,"6126126001","Intlian" ));
		deliRestList.add(new Restaurant(3,"In and Out",55211,"6126126002","American"));
		deliRestList.add(new Restaurant(4,"El Mexican Restaurant",55251,"6126126003","Mecican"));
		
		int restaurant=0;
		System.out.println("Please pick your resturtant");
		System.out.println("The restaurants will deliver to your place:");
		//List<Restaurant> pickRest;
		int[]pickRestId=new int[deliRestList.size()];
		String[]pickRestName=new String[deliRestList.size()];
		for (int n = 0; n < deliRestList.size(); n++) {
Restaurant rest=new Restaurant();
			rest = deliRestList.get(n);
			
			System.out.println("Restaurant ID: "+rest.getRestId()+" Restaurant Name: "+rest.getRestName());
			pickRestId[n]=rest.getRestId();
			pickRestName[n]=rest.getRestName();
		}
				
		UserInput userInput=new UserInput();
		int pickRest=userInput.pickRest(pickRestId);
		System.out.println("You choose "+pickRestName[pickRest]);
	//pickRest=	userInput.pickRest(deliRestList);
		
		restaurant=pickRestId[pickRest];
	}

}
