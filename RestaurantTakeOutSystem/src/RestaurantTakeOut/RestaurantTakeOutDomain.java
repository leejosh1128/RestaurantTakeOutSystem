package RestaurantTakeOut;

import java.util.List;

public class RestaurantTakeOutDomain {
	public boolean run() throws Exception{
		System.out.println("Wecome to TimberVikings Restaurant Takeout System.");
		System.out.println("Please enter your username and zip code.");
		UserInput user=new UserInput();

		Customer customerInform=new Customer(user.setUsername(),user.setZip());
		
		System.out.println("Welcome our dear customer "+customerInform.getUserName() );
		System.out.println("Here are the resturtant that for you. ");
		
		RestaurantSearch restSearch=new RestaurantSearch();
		//restSearch.getRestaurants();
		//restSearch.deliverRestaurant(restSearch.getRestaurants(),customerInform.getZip());
		List<Restaurant> deliRestList=restSearch.deliverRestaurant(restSearch.getRestaurants(),customerInform.getZip());
		restSearch.pickRestaurant(deliRestList);
		
		return true;
		}
}
