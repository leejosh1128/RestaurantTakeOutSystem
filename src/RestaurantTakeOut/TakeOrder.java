package RestaurantTakeOut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeOrder {
	float totalPrice = 0;
List<Order> orderList=new ArrayList<>();

int listIndex=0;
	public List<Order> takeOrder(List<RestaurantMenu> menuList) {
		System.out.println("-----------------------------------");

		int num = 1;
		String[] number = new String[menuList.size()];
		String[] dishName = new String[menuList.size()];
		float[] dishPrice = new float[menuList.size()];
		for (int n = 0; n < menuList.size(); n++) {

			System.out.println((n + 1) + ". Resturant Name " + menuList.get(n).getRestName() + ". Dish name "
					+ menuList.get(n).getDishName() + ". Unit Price " + menuList.get(n).getDishPrice());
			dishName[n] = menuList.get(n).getDishName();
			dishPrice[n] = menuList.get(n).getDishPrice();
			num++;

		}
		System.out.println(num + ". Finish Order.");

		boolean run = true;
		try {
			while (run) {
				System.out.println("Please make you choice: ");
				Scanner orderScan = new Scanner(System.in);
				int orderPick = orderScan.nextInt();

				if (orderPick > 0 && orderPick < num) {
					System.out.println("You pick " + dishName[orderPick-1]);
					System.out.println("How many do you want?");
					System.out.println("Enter 0 if you don't want any.");
					Scanner numScan = new Scanner(System.in);
					int orderNumber = 0;
					try {

						orderNumber = numScan.nextInt();
						if (orderNumber >= 0) {
							Order order=new Order();
							totalPrice = orderNumber * dishPrice[orderPick-1] + totalPrice;
							order.setOrderName(dishName[orderPick-1]);
							order.setOrderNumber(orderNumber);
							order.setOrderPrice(dishPrice[orderPick-1]);
							
							orderList.add(order);
							
							listIndex=listIndex+1;
							return takeOrder(menuList);
						}
					} catch (Exception e) {
						System.out.println("Please enter a postive number");
					}

				}

				else if (orderPick == num) {
					run = false;
				}

				else {
					System.out.println("Sorry, you have to choose a valid ID.");

				}

			}

		} catch (Exception e) {
			System.out.println("Please enter a            number.");
			return takeOrder(menuList);

		}
		System.out.println("total price " + totalPrice);
		
		
		
		return orderList;

	}
}
