package RestaurantTakeOut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class UserInput {
	private String username = "";
	private int zip = 0;
	int[] userPickRestId;
	// total Price

	public String setUsername() {
		System.out.println("Your username:");
		Scanner scanName = new Scanner(System.in);

		username = scanName.nextLine();

		return username;
	}

	public int setZip() {
		try {
			while (true) {
				System.out.println("Please enter your zip code");
				Scanner scan = new Scanner(System.in);
				zip = scan.nextInt();

				if (zip >= 55101 && zip <= 55488) {

					return zip;

				} else {
					System.out.println("Sorry, we only deliever Minneapolis & St. Paul area.");
				}
			}
		} catch (Exception e) {
			System.out.println("Please enter a number.");
			return setZip();

		}

	}

	// public returnRestSearch(int pick) {
	//
	// }
	public int pickRest(int[] pickRestId) {

		userPickRestId = pickRestId;
		int pickRestaurant = 0;
		try {
			while (true) {
				System.out.println("Please enter the restaurant ID to pick the restaurant.");
				// System.out.println("0. Enter 0 to enter your zip code again.");
				Scanner pickScan = new Scanner(System.in);
				int pickId = pickScan.nextInt();
				// if(pickId==0) {
				// RestaurantSearch restSearch=new RestaurantSearch();
				// return returnRestSearch(pickId);
				// }
				boolean contains = IntStream.of(userPickRestId).anyMatch(x -> x == pickId);

				if (contains == true) {
					for (int n = 0; n < userPickRestId.length; n++) {
						if (pickId == userPickRestId[n]) {
							System.out.println("Your pick the ID " + pickId);
							return n;
						}
					}

				}
				// if(pickRestId.stream().anyMatch(dl->dl.getRestId()==pickId)) {
				// for(int n = 0; n < pickRestId.size(); n++) {
				// if (pickId == pickRestId.get(n).getRestId()) {
				// pickRestaurant.add(pickRestId.get(n));
				// }
				// return pickRestaurant;
				// }
				// }

				// if (pickId == deliRestList.get(n).getRestId()) {
				// pickRestaurant.add(deliRestList.get(n));
				else {
					System.out.println("Sorry, you have to choose a valid ID.");
					return pickRest(userPickRestId);
				}

			}

		} catch (Exception e) {
			System.out.println("Please enter a number.");
			return pickRest(pickRestId);

		}

	}

	
}
