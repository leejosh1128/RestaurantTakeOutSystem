package RestaurantTakeOut;

import java.util.List;


public class Order {
	String dishName="";
	int numberOfDish=0;
	float unitPrice=0;    
	public Order() {

	}

	public Order( String name, int number,float price) {
		dishName=name;
		numberOfDish=number;
		unitPrice=price;

	}
	public void setOrderName(String name) {
		dishName = name;
	}
	public void setOrderNumber(int number) {
		numberOfDish=number;
	}
	public void setOrderPrice(float price) {
		unitPrice = price;
	}
	public String getOrderName() {
		return this.dishName;
	}
	public int getOrderNumber() {
		return this.numberOfDish;
	}
	public  float getOrderPrice() {
		return this.unitPrice;
	}
}
