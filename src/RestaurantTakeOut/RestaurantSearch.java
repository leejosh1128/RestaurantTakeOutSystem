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
	public String pickRestaurant(List<Restaurant> deliRestList) {
		String restaurant="";
		System.out.println("Please pick your resturtant");
		System.out.println("The restaurants will deliver to your place:");
		for (int n = 0; n < deliRestList.size(); n++) {

			rest = deliRestList.get(n);
			
			System.out.println("Restaurant ID: "+rest.getRestId()+" Restaurant Name: "+rest.getRestName());
			
		}
		System.out.println("Please enter the restaurant ID to pick the restaurant.");
		Scanner userPick=new Scanner(System.in);
		
		
		
		
		
		
		
		
		return restaurant;
	}
}
