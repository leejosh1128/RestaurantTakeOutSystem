package RestaurantTakeOut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSearch {
	private List<RestaurantMenu> menuList = new ArrayList<>();

	public List<RestaurantMenu> getRestaurantMenu(String restId) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader("Restaurant menu.csv"));

		String line = null;
		Scanner scanner = null;
		int index = 0;

		while ((line = reader.readLine()) != null) {
			RestaurantMenu rest = new RestaurantMenu();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data = scanner.next();
				if (index == 0)

					rest.setRestid(Integer.parseInt(data));
				else if (index == 1)
					rest.setRestName(data);
				else if (index == 2)
					rest.setDishName(data);
				else if (index == 3) {
//					Float price=Float.parseFloat(data);
//					DecimalFormat df = new DecimalFormat("0.00");
//					df.setMaximumFractionDigits(2);
					rest.setDishPrice(Float.parseFloat(data) );

				} else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			menuList.add(rest);
			//

		}
		reader.close();

		return null;

	}

}
