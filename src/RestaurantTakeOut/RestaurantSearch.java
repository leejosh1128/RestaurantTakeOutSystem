package RestaurantTakeOut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantSearch {
	
	private Customer cust = new Customer();
	private Restaurant rest = new Restaurant();


	private int restZip1 = 0;
	private int restZip2 = 0;
	final int DELIVERYRANGE = 50;

	public List<Restaurant> getRestaurants() throws Exception {
		cust.getZip();
		BufferedReader reader = new BufferedReader(new FileReader("restaurant.csv"));

		String line = null;
		Scanner scanner = null;
		int index = 0;
		List<Restaurant> restList = new ArrayList<>();
		while ((line = reader.readLine()) != null) {
			Restaurant rest = new Restaurant();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data = scanner.next();
				if (index == 0)

					rest.setRestId(Integer.parseInt(data));
				else if (index == 1)
					rest.setRestName(data);
				else if (index == 2)
					rest.setRestZip(Integer.parseInt(data));
				else if (index == 3)

					rest.setRestNumber(data);

				else if (index == 4)
					rest.setRestDesc(data);
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			restList.add(rest);

		}
		reader.close();
		Restaurant rest = new Restaurant();
		for (int n = 0; n < restList.size(); n++) {

			rest = restList.get(n);
			System.out.println(rest.getRestName());
		}

		return restList;

	}

	public List<Restaurant> deliverRestaurant(List<Restaurant> restList, int customerZip) {

	
		restZip1 = customerZip - DELIVERYRANGE;
		restZip2 = customerZip + DELIVERYRANGE;
		List<Restaurant> deliRestList = new ArrayList<>();

		for (int n = 0; n < restList.size(); n++) {
			rest = restList.get(n);
			
			if (rest.getRestZip() >= restZip1 && rest.getRestZip() <= restZip2) {
				deliRestList.add(rest);
			}

		}
		
		return deliRestList;

	}
	public int pickRestaurant(List<Restaurant> deliRestList) {
		int restaurant=0;
		System.out.println("Please pick your resturtant");
		System.out.println("The restaurants will deliver to your place:");
		//List<Restaurant> pickRest;
		int[]pickRestId=new int[deliRestList.size()];
		String[]pickRestName=new String[deliRestList.size()];
		for (int n = 0; n < deliRestList.size(); n++) {

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
	//	System.out.println("You picked "+pickRest.get(0).getRestId()+"       "+pickRest.get(0).getRestName() );
		
		
		
		
		
		
		return restaurant;
	}
}
