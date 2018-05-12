package Test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import RestaurantTakeOut.Customer;
import RestaurantTakeOut.UserInput;

public class UserInputTest {
UserInput userInput=new UserInput();
Customer cust=new Customer();
	@Test
	public void testSetUsername() {
		Scanner scan = new Scanner("a");
		cust.setUserName(scan.nextLine());
		assertEquals("a",cust.getUserName());
	}

	@Test
	public void testSetZip() {
		cust.setZip(55411);
		assertEquals(55411,cust.getZip());
	}


}
