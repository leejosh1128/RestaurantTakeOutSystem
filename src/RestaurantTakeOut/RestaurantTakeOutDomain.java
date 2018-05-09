package RestaurantTakeOut;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RestaurantTakeOutDomain {
	public boolean run() throws Exception {
		System.out.println("Wecome to TimberVikings Restaurant Takeout System.");
		System.out.println("Please enter your username and zip code.");
		UserInput user = new UserInput();

		Customer customerInform = new Customer(user.setUsername(), user.setZip());

		System.out.println("Welcome our dear customer " + customerInform.getUserName());
		System.out.println("Here are the resturtant that for you. ");

		RestaurantSearch restSearch = new RestaurantSearch();
		// restSearch.getRestaurants();
		// restSearch.deliverRestaurant(restSearch.getRestaurants(),customerInform.getZip());
		List<Restaurant> deliRestList = restSearch.deliverRestaurant(restSearch.getRestaurants(),
				customerInform.getZip());
		//reenter user information if needed.
		System.out.println("0. Enter 0 to reenter your information.");
		System.out.println("1. Enter 1 to pick the restaurant which can deliver to you.");
		try {
			boolean choose = true;
			while (choose) {

				Scanner pickScan = new Scanner(System.in);
				String pick = pickScan.next();

				if (pick.equals("0")) {
					return run();
				}
				if (pick.equals("1")) {
					choose = false;
				} else {
					System.out.println("Sorry, you have to enter 1 or 2.");
				}
			}
		} catch (Exception e) {
			System.out.println("Please enter a number.");
		}

		int pickRestaurantId = restSearch.pickRestaurant(deliRestList);
		MenuSearch menuSearch = new MenuSearch();
		List<RestaurantMenu> menuList = menuSearch.getRestaurantMenu(pickRestaurantId);
		user.takeOrder(menuList);
		return true;
	}
}
