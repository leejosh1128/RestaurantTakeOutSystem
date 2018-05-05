package RestaurantTakeOut;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class RestaurantMenu {
	private int restId;
	private String restName;
	private String restDishName;
	private Float dishPrice;

	public RestaurantMenu() {

	}

	public RestaurantMenu(int id, String restaurantName, String dishName, Float price) {

		restId = id;
		restName = restaurantName;
		restDishName = dishName;
		dishPrice = price;
	}
	public void setRestid(int id) {
		restId = id;
	}

	public void setRestName(String restaurantName) {
		restName = restaurantName;
	}

	public void setDishName(String dishName) {
		restDishName = dishName;
	}

	public void setDishPrice(Float price) {
		dishPrice = price;
	}
	
	public int getRestid() {
		return restId;
	}

	public String getRestName() {
		return restName;
	}

	public String getDishName() {
		return restDishName;
	}

	public Float getDishPrice() {
		return dishPrice;
	}
}
