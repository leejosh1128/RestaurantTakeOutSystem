package RestaurantTakeOut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantSearch {
	private String[] restaurants = new String[0];
	private Customer cust = new Customer();
	private int custZip = 0;

	public List<Restaurant> getRestaurants() throws Exception {
		custZip = cust.getZip();
		BufferedReader reader = new BufferedReader(new FileReader("/RestaurantTakeOutSystem/src/RestaurantTakeOut/restaurant.csv"));

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

}
