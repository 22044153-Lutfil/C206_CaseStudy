import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	// prepare test data
	private User uu1;
	private User uu2;
	private User uu3;
	private School ss1;
	private School ss2;
	private School ss3;
	private Menu mm1;
	private Menu mm2;
	private Menu mm3;
	private Order oo1;
	private Order oo2;
	private Order oo3;
	private Payment pp1;
	private Payment pp2;
	private Payment pp3;
	private Vendor vv1;
	private Vendor vv2;
	private Vendor vv3;

	private ArrayList<User> userList;
	private ArrayList<School> schoolList;
	private ArrayList<Menu> menuList;
	private ArrayList<Order> orderList;
	private ArrayList<Payment> paymentList;
	private ArrayList<Vendor> vendorList;

	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// prepare test data
		uu1 = new User(11, "Syihan", "syihanhzmi@gmail.com", 89072354);
		uu2 = new User(12, "Muniz", "juanmuniz@gmail.com", 98987654);
		uu3 = new User(13, "Arif", "arifaiman@gmail.com", 84149855);

		ss1 = new School(12, "Marsiling Secondary School", 63651987, "81 Woodlands Street 70");
		ss2 = new School(13, "St Gabriel Secondary School", 63651978, "84 Woodlands Drive 80");
		ss3 = new School(14, "Admiralty Secondary School", 63651999, "83 Woodlands Street 80");

		mm1 = new Menu(11, "Curry Noodles", "Potatoes", 4.00, "HUNGRYDAD");
		mm2 = new Menu(12, "Chicken Chop", "Black Pepper", 4.50, "MOM'S COOK");
		mm3 = new Menu(13, "Cream Pasta", "Ham & Mushroom", 3.50, "PEGOPA");

		oo1 = new Order(14, "Curry Noodles", 5, 20.00, "Delivered");
		oo2 = new Order(15, "Chicken Chop", 5, 27.00, "Processing");
		oo3 = new Order(16, "Cream Pasta", 5, 17.50, "Delivered");

		pp1 = new Payment(11, 20.00, "Card");
		pp2 = new Payment(12, 27.00, "Card");
		pp3 = new Payment(13, 17.50, "Card");

		vv1 = new Vendor(16, "HUNGRYDAD", 83329784, "Curry Noodles");
		vv2 = new Vendor(17, "MOM'S COOK", 83329784, "Chicken Chop");
		vv3 = new Vendor(18, "PEGOPA", 83329784, "Cream Pasta");


		userList = new ArrayList<User>();
		schoolList = new ArrayList<School>();
		menuList = new ArrayList<Menu>();
		orderList = new ArrayList<Order>();
		paymentList = new ArrayList<Payment>();
		vendorList = new ArrayList<Vendor>();

	}


	@Test
	public void testAddUser() {
		// Item list is not null and it is empty
		assertNotNull("Test if there is valid User arraylist to add to", userList);
		assertEquals("Test that the User arraylist is empty.", 0, userList.size());
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addUser(userList, uu1);		
		assertEquals("Test that the User arraylist size is 1.", 1, userList.size());


		// Add an item
		C206_CaseStudy.addUser(userList, uu2);
		assertEquals("Test that the User arraylist size is now 2.", 2, userList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that User is added to the end of the list.", uu2, userList.get(1));

		// Add an item that already exists in the list
		C206_CaseStudy.addUser(userList, uu2);
		assertEquals("Test that the User arraylist size is unchange.", 2, userList.size());

		// Add an item that has missing detail
		User uu_missing = new User(14, "", "oscararri@gmail.com", 89072355);
		C206_CaseStudy.addUser(userList, uu_missing);
		assertEquals("Test that the User arraylist size is unchange.", 2, userList.size());
	}

	@Test
	public void testAddSchool() {
		//fail("Not yet implemented");
		// write your code here 

		// Item list is not null and it is empty
		assertNotNull("Test if there is valid School arraylist to add to", schoolList);
		assertEquals("Test that the School arraylist is empty.", 0, schoolList.size());
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addSchool(schoolList, ss1);		
		assertEquals("Test that the School arraylist size is 1.", 1, schoolList.size());



		// Add an item
		C206_CaseStudy.addSchool(schoolList, ss2);
		assertEquals("Test that the School arraylist size is now 2.", 2, schoolList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that School is added to the end of the list.", ss2, schoolList.get(1));

		// Add an item that already exists in the list
		C206_CaseStudy.addSchool(schoolList, ss2);
		assertEquals("Test that the School arraylist size is unchange.", 2, schoolList.size());

		// Add an item that has missing detail
		School ss_missing = new School(12, "", 63651987, "81 Woodlands Street 80");
		C206_CaseStudy.addSchool(schoolList, ss_missing);
		assertEquals("Test that the School arraylist size is unchange.", 2, schoolList.size());

	}

	@Test
	public void testAddMenu() {
		//fail("Not yet implemented");
		// write your code here 

		// Item list is not null and it is empty
		assertNotNull("Test if there is valid Menu arraylist to add to", menuList);
		assertEquals("Test that the Menu arraylist is empty.", 0, menuList.size());
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addMenu(menuList, mm1);		
		assertEquals("Test that the Menu arraylist size is 1.", 1, menuList.size());



		// Add an item
		C206_CaseStudy.addMenu(menuList, mm2);
		assertEquals("Test that the Menu arraylist size is now 2.", 2, menuList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that Menu is added to the end of the list.", mm2, menuList.get(1));

		// Add an item that already exists in the list
		C206_CaseStudy.addMenu(menuList, mm2);
		assertEquals("Test that the Menu arraylist size is unchange.", 2, menuList.size());

		// Add an item that has missing detail
		Menu mm_missing = new Menu(14, "", "Potatoes", 4.00, "HUNGRYDAD");
		C206_CaseStudy.addMenu(menuList, mm_missing);
		assertEquals("Test that the Menu arraylist size is unchange.", 2, menuList.size());

	}

	@Test
	public void testAddOrder() {
		//fail("Not yet implemented");
		// write your code here 

		// Item list is not null and it is empty
		assertNotNull("Test if there is valid Order arraylist to add to", orderList);
		assertEquals("Test that the Order arraylist is empty.", 0, orderList.size());
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addOrder(orderList, oo1);		
		assertEquals("Test that the Order arraylist size is 1.", 1, orderList.size());



		// Add an item
		C206_CaseStudy.addOrder(orderList, oo2);
		assertEquals("Test that the order arraylist size is now 2.", 2, orderList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that order is added to the end of the list.", oo2, orderList.get(1));

		// Add an item that already exists in the list
		C206_CaseStudy.addOrder(orderList, oo2);
		assertEquals("Test that the order arraylist size is unchange.", 2, orderList.size());

		// Add an item that has missing detail
		Order oo_missing = new Order(17, "", 5, 20.00, "Delivered");
		C206_CaseStudy.addOrder(orderList, oo_missing);
		assertEquals("Test that the order arraylist size is unchange.", 2, orderList.size());

	}

	@Test
	public void testAddPayment() {
		//fail("Not yet implemented");
		// write your code here 

		// Item list is not null and it is empty
		assertNotNull("Test if there is valid Payment arraylist to add to", paymentList);
		assertEquals("Test that the Payment arraylist is empty.", 0, paymentList.size());
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addPayment(paymentList, pp1);		
		assertEquals("Test that the Payment arraylist size is 1.", 1, paymentList.size());



		// Add an item
		C206_CaseStudy.addPayment(paymentList, pp2);
		assertEquals("Test that the Payment arraylist size is now 2.", 2, paymentList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that Payment is added to the end of the list.", pp2, paymentList.get(1));

		// Add an item that already exists in the list
		C206_CaseStudy.addPayment(paymentList, pp2);
		assertEquals("Test that the Payment arraylist size is unchange.", 2, paymentList.size());

		// Add an item that has missing detail
		Payment pp_missing = new Payment(14, 17.50, "");
		C206_CaseStudy.addPayment(paymentList, pp_missing);
		assertEquals("Test that the Payment arraylist size is unchange.", 2, paymentList.size());

	}


	@Test
	public void testAddVendor() {
		//fail("Not yet implemented");
		// write your code here 

		// Item list is not null and it is empty
		assertNotNull("Test if there is valid vendor arraylist to add to", vendorList);
		assertEquals("Test that the vendor arraylist is empty.", 0, vendorList.size());
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addVendor(vendorList, vv1);		
		assertEquals("Test that the School arraylist size is 1.", 1, vendorList.size());



		// Add an item
		C206_CaseStudy.addVendor(vendorList, vv2);
		assertEquals("Test that the vendor arraylist size is now 2.", 2, vendorList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that vendor is added to the end of the list.", vv2, vendorList.get(1));

		// Add an item that already exists in the list
		C206_CaseStudy.addVendor(vendorList, vv2);
		assertEquals("Test that the vendor arraylist size is unchange.", 2, vendorList.size());

		// Add an item that has missing detail
		Vendor vv_missing = new Vendor(19, "", 83329790, "Chicken Chop");
		C206_CaseStudy.addVendor(vendorList, vv_missing);
		assertEquals("Test that the vendor arraylist size is unchange.", 2, vendorList.size());

	}

	@Test
	public void testRetrieveUser() {
		//Test Case 1
		// Test if Item list is not null and empty
		assertNotNull("Test if there is valid user arraylist to add to", userList);
		assertEquals("Test that the user arraylist is empty.", 0, userList.size());
		// Attempt to retrieve the users 
		String allUser= C206_CaseStudy.retrieveUser(userList);
		String testOutput = "";
		// Test if the output is empty
		assertEquals("Test that nothing is displayed", testOutput, allUser);

		//Test Case 2
		C206_CaseStudy.addUser(userList, uu1);
		C206_CaseStudy.addUser(userList, uu2);
		// Test that the list is not empty
		assertEquals("Test that user arraylist size is 2.", 2, userList.size());
		// Attempt to retrieve the users 
		allUser= C206_CaseStudy.retrieveUser(userList);
		testOutput = String.format("%-10d %-10s %-30s %-20d\n", 11, "Syihan", "syihanhzmi@gmail.com", 89072354);
		testOutput += String.format("%-10d %-10s %-30s %-20d\n", 12, "Muniz", "juanmuniz@gmail.com", 98987654);
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allUser);

		//Test Case 3
		C206_CaseStudy.addUser(userList, uu3);
		assertEquals("Test that user arraylist size is 2.", 3, userList.size());
		// Attempt to retrieve the users 
		allUser = C206_CaseStudy.retrieveUser(userList);
		testOutput = String.format("%-10d %-10s %-30s %-20d\n", 11, "Syihan", "syihanhzmi@gmail.com", 89072354);
		testOutput += String.format("%-10d %-10s %-30s %-20d\n",12, "Muniz", "juanmuniz@gmail.com", 98987654);
		testOutput += String.format("%-10d %-10s %-30s %-20d\n",13, "Arif", "arifaiman@gmail.com", 84149855);
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allUser);
	}

	@Test
	public void testRetrieveSchool() {
		//Test Case 1
		// Test if Item list is not null and empty
		assertNotNull("Test if there is valid school arraylist to add to", schoolList);
		assertEquals("Test that the school arraylist is empty.", 0, schoolList.size());
		// Attempt to retrieve the schools 
		String allSchool= C206_CaseStudy.retrieveSchool(schoolList);
		String testOutput = "";
		// Test if the output is empty
		assertEquals("Test that nothing is displayed", testOutput, allSchool);

		//Test Case 2
		C206_CaseStudy.addSchool(schoolList, ss1);
		C206_CaseStudy.addSchool(schoolList, ss2);
		// Test that the list is not empty
		assertEquals("Test that school arraylist size is 2.", 2, schoolList.size());
		// Attempt to retrieve the schools 
		allSchool= C206_CaseStudy.retrieveSchool(schoolList);
		testOutput = String.format("%-10d %-30s %-10d %-20s\n", 12, "Marsiling Secondary School", 63651987, "81 Woodlands Street 70");
		testOutput += String.format("%-10d %-30s %-10d %-20s\n", 13, "St Gabriel Secondary School", 63651978, "84 Woodlands Drive 80");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allSchool);

		//Test Case 3
		C206_CaseStudy.addSchool(schoolList, ss3);
		assertEquals("Test that school arraylist size is 2.", 3, schoolList.size());
		// Attempt to retrieve the schools 
		allSchool = C206_CaseStudy.retrieveSchool(schoolList);
		testOutput = String.format("%-10d %-30s %-10d %-20s\n", 12, "Marsiling Secondary School", 63651987, "81 Woodlands Street 70");
		testOutput += String.format("%-10d %-30s %-10d %-20s\n",13, "St Gabriel Secondary School", 63651978, "84 Woodlands Drive 80");
		testOutput += String.format("%-10d %-30s %-10d %-20s\n",14, "Admiralty Secondary School", 63651999, "83 Woodlands Street 80");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allSchool);
	}

	@Test
	public void testRetrieveMenu() {
		//Test Case 1
		// Test if Item list is not null and empty
		assertNotNull("Test if there is valid menu arraylist to add to", menuList);
		assertEquals("Test that the menu arraylist is empty.", 0, menuList.size());
		// Attempt to retrieve the menu 
		String allMenu= C206_CaseStudy.retrieveMenu(menuList);
		String testOutput = "";
		// Test if the output is empty
		assertEquals("Test that nothing is displayed", testOutput, allMenu);

		//Test Case 2
		C206_CaseStudy.addMenu(menuList, mm1);
		C206_CaseStudy.addMenu(menuList, mm2);
		// Test that the list is not empty
		assertEquals("Test that menu arraylist size is 2.", 2, menuList.size());
		// Attempt to retrieve the menu 
		allMenu= C206_CaseStudy.retrieveMenu(menuList);
		testOutput = String.format("%-10d %-15s %-20s %-10.2f %-20s\n", 11, "Curry Noodles", "Potatoes", 4.00, "HUNGRYDAD");
		testOutput += String.format("%-10d %-15s %-20s %-10.2f %-20s\n", 12, "Chicken Chop", "Black Pepper", 4.50, "MOM'S COOK");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allMenu);

		//Test Case 3
		C206_CaseStudy.addMenu(menuList, mm3);
		assertEquals("Test that menu arraylist size is 2.", 3, menuList.size());
		// Attempt to retrieve the menu 
		allMenu = C206_CaseStudy.retrieveMenu(menuList);
		testOutput = String.format("%-10d %-15s %-20s %-10.2f %-20s\n", 11, "Curry Noodles", "Potatoes", 4.00, "HUNGRYDAD");
		testOutput += String.format("%-10d %-15s %-20s %-10.2f %-20s\n",12, "Chicken Chop", "Black Pepper", 4.50, "MOM'S COOK");
		testOutput += String.format("%-10d %-15s %-20s %-10.2f %-20s\n",13, "Cream Pasta", "Ham & Mushroom", 3.50, "PEGOPA");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allMenu);
	}

	@Test
	public void testRetrieveOrder() {
		//Test Case 1
		// Test if Item list is not null and empty
		assertNotNull("Test if there is valid order arraylist to add to", orderList);
		assertEquals("Test that the order arraylist is empty.", 0, orderList.size());
		// Attempt to retrieve the orders 
		String allOrder= C206_CaseStudy.retrieveOrder(orderList);
		String testOutput = "";
		// Test if the output is empty
		assertEquals("Test that nothing is displayed", testOutput, allOrder);

		//Test Case 2
		C206_CaseStudy.addOrder(orderList, oo1);
		C206_CaseStudy.addOrder(orderList, oo2);
		// Test that the list is not empty
		assertEquals("Test that order arraylist size is 2.", 2, orderList.size());
		// Attempt to retrieve the orders 
		allOrder= C206_CaseStudy.retrieveOrder(orderList);
		testOutput = String.format("%-10d %-20s %-15d %-10.2f %-20s\n", 14, "Curry Noodles", 5, 20.00, "Delivered");
		testOutput += String.format("%-10d %-20s %-15d %-10.2f %-20s\n", 15, "Chicken Chop", 5, 27.00, "Processing");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allOrder);

		//Test Case 3
		C206_CaseStudy.addOrder(orderList, oo3);
		assertEquals("Test that order arraylist size is 2.", 3, orderList.size());
		// Attempt to retrieve the orders 
		allOrder = C206_CaseStudy.retrieveOrder(orderList);
		testOutput = String.format("%-10d %-20s %-15d %-10.2f %-20s\n", 14, "Curry Noodles", 5, 20.00, "Delivered");
		testOutput += String.format("%-10d %-20s %-15d %-10.2f %-20s\n",15, "Chicken Chop", 5, 27.00, "Processing");
		testOutput += String.format("%-10d %-20s %-15d %-10.2f %-20s\n",16, "Cream Pasta", 5, 17.50, "Delivered");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allOrder);
	}

	@Test
	public void testRetrievePayment() {
		//Test Case 1
		// Test if Item list is not null and empty
		assertNotNull("Test if there is valid payment arraylist to add to", paymentList);
		assertEquals("Test that the payment arraylist is empty.", 0, paymentList.size());
		// Attempt to retrieve the payments 
		String allPayment= C206_CaseStudy.retrievePayment(paymentList);
		String testOutput = "";
		// Test if the output is empty
		assertEquals("Test that nothing is displayed", testOutput, allPayment);

		//Test Case 2
		C206_CaseStudy.addPayment(paymentList, pp1);
		C206_CaseStudy.addPayment(paymentList, pp2);
		// Test that the list is not empty
		assertEquals("Test that payment arraylist size is 2.", 2, paymentList.size());
		// Attempt to retrieve the payments 
		allPayment= C206_CaseStudy.retrievePayment(paymentList);
		testOutput = String.format("%-10d %-20.2f %-20s\n", 11, 20.00, "Card");
		testOutput += String.format("%-10d %-20.2f %-20s\n", 12, 27.00, "Card");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allPayment);

		//Test Case 3
		C206_CaseStudy.addPayment(paymentList, pp3);
		assertEquals("Test that Camcorder arraylist size is 2.", 3, paymentList.size());
		// Attempt to retrieve the payments 
		allPayment = C206_CaseStudy.retrievePayment(paymentList);
		testOutput = String.format("%-10d %-20.2f %-20s\n", 11, 20.00, "Card");
		testOutput += String.format("%-10d %-20.2f %-20s\n",12, 27.00, "Card");
		testOutput += String.format("%-10d %-20.2f %-20s\n",13, 17.50, "Card");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allPayment);
	}

	@Test
	public void testRetrieveVendor() {
		//Test Case 1
		// Test if Item list is not null and empty
		assertNotNull("Test if there is valid vendor arraylist to add to", vendorList);
		assertEquals("Test that the vendor arraylist is empty.", 0, vendorList.size());
		// Attempt to retrieve the vendors 
		String allVendor= C206_CaseStudy.retrieveVendor(vendorList);
		String testOutput = "";
		// Test if the output is empty
		assertEquals("Test that nothing is displayed", testOutput, allVendor);

		//Test Case 2
		C206_CaseStudy.addVendor(vendorList, vv1);
		C206_CaseStudy.addVendor(vendorList, vv2);
		// Test that the list is not empty
		assertEquals("Test that vendor arraylist size is 2.", 2, vendorList.size());
		// Attempt to retrieve the vendors 
		allVendor= C206_CaseStudy.retrieveVendor(vendorList);
		testOutput = String.format("%-10d %-20s %-15d %-20s\n", 16, "HUNGRYDAD", 83329784, "Curry Noodles");
		testOutput += String.format("%-10d %-20s %-15d %-20s\n", 17, "MOM'S COOK", 83329784, "Chicken Chop");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allVendor);

		//Test Case 3
		C206_CaseStudy.addVendor(vendorList, vv3);
		assertEquals("Test that vendor arraylist size is 2.", 3, vendorList.size());
		// Attempt to retrieve the vendors 
		allVendor = C206_CaseStudy.retrieveVendor(vendorList);
		testOutput = String.format("%-10d %-20s %-15d %-20s\n", 16, "HUNGRYDAD", 83329784, "Curry Noodles");
		testOutput += String.format("%-10d %-20s %-15d %-20s\n",17, "MOM'S COOK", 83329784, "Chicken Chop");
		testOutput += String.format("%-10d %-20s %-15d %-20s\n",18, "PEGOPA", 83329784, "Cream Pasta");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allVendor);
	}

	@Test
    public void testDeleteUser() {
		
		// Test if Item list is not null and empty
		assertNotNull("Test if there is valid user arraylist to add to", userList);
		assertEquals("Test that the School arraylist is empty.", 0, userList.size());
		
		C206_CaseStudy.addUser(userList, uu1);		
		assertEquals("Test that the User arraylist size is 1.", 1, userList.size());

		// Add an item
		C206_CaseStudy.addUser(userList, uu2);
		assertEquals("Test that the User arraylist size is now 2.", 2, userList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that User is added to the end of the list.", uu2, userList.get(1));

		// Delete user
		userList.remove(uu1);
		
		// List decrease by 1
		assertEquals("Test that the user arraylist is 1 after being deleted.", 1, userList.size());
		
	}
	
	@Test
	public void testDeleteSchool() {
		//fail("Not yet implemented");
		// write your code here 

		// Item list is not null and it is empty
		assertNotNull("Test if there is valid School arraylist to add to", schoolList);
		assertEquals("Test that the School arraylist is empty.", 0, schoolList.size());
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addSchool(schoolList, ss1);		
		assertEquals("Test that the School arraylist size is 1.", 1, schoolList.size());



		// Add an item
		C206_CaseStudy.addSchool(schoolList, ss2);
		assertEquals("Test that the School arraylist size is now 2.", 2, schoolList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that School is added to the end of the list.", ss2, schoolList.get(1));

		// Add an item that already exists in the list
		C206_CaseStudy.addSchool(schoolList, ss2);
		assertEquals("Test that the School arraylist size is unchange.", 2, schoolList.size());

		// Delete school
		schoolList.remove(ss1);
		
		// List decrease by 1
		assertEquals("Test that the user arraylist is 1 after being deleted.", 1, schoolList.size());
	}

	@Test
	public void testDeleteMenu() {
		//fail("Not yet implemented");
		// write your code here 

		// Item list is not null and it is empty
		assertNotNull("Test if there is valid Menu arraylist to add to", menuList);
		assertEquals("Test that the Menu arraylist is empty.", 0, menuList.size());
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addMenu(menuList, mm1);		
		assertEquals("Test that the Menu arraylist size is 1.", 1, menuList.size());



		// Add an item
		C206_CaseStudy.addMenu(menuList, mm2);
		assertEquals("Test that the Menu arraylist size is now 2.", 2, menuList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that Menu is added to the end of the list.", mm2, menuList.get(1));

		// Delete menu
		menuList.remove(mm1);
		
		// List decrease by 1
		assertEquals("Test that the user arraylist is 1 after being deleted.", 1, menuList.size());
	}

	@Test
	public void testDeleteOrder() {
		//fail("Not yet implemented");
		// write your code here 

		// Item list is not null and it is empty
		assertNotNull("Test if there is valid Order arraylist to add to", orderList);
		assertEquals("Test that the Order arraylist is empty.", 0, orderList.size());
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addOrder(orderList, oo1);		
		assertEquals("Test that the Order arraylist size is 1.", 1, orderList.size());



		// Add an item
		C206_CaseStudy.addOrder(orderList, oo2);
		assertEquals("Test that the order arraylist size is now 2.", 2, orderList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that order is added to the end of the list.", oo2, orderList.get(1));

		// Delete order
		orderList.remove(oo1);

		// List decrease by 1
		assertEquals("Test that the user arraylist is 1 after being deleted.", 1, orderList.size());
	}

	@Test
	public void testDeletePayment() {
		//fail("Not yet implemented");
		// write your code here 

		// Item list is not null and it is empty
		assertNotNull("Test if there is valid Payment arraylist to add to", paymentList);
		assertEquals("Test that the Payment arraylist is empty.", 0, paymentList.size());
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addPayment(paymentList, pp1);		
		assertEquals("Test that the Payment arraylist size is 1.", 1, paymentList.size());



		// Add an item
		C206_CaseStudy.addPayment(paymentList, pp2);
		assertEquals("Test that the Payment arraylist size is now 2.", 2, paymentList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that Payment is added to the end of the list.", pp2, paymentList.get(1));

		// Delete payment
		paymentList.remove(pp1);

		// List decrease by 1
		assertEquals("Test that the user arraylist is 1 after being deleted.", 1, paymentList.size());

	}

	@Test
	public void testDeleteVendor() {
		//fail("Not yet implemented");
		// write your code here 

		// Item list is not null and it is empty
		assertNotNull("Test if there is valid vendor arraylist to add to", vendorList);
		assertEquals("Test that the vendor arraylist is empty.", 0, vendorList.size());
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addVendor(vendorList, vv1);		
		assertEquals("Test that the School arraylist size is 1.", 1, vendorList.size());


		// Add an item
		C206_CaseStudy.addVendor(vendorList, vv2);
		assertEquals("Test that the vendor arraylist size is now 2.", 2, vendorList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that vendor is added to the end of the list.", vv2, vendorList.get(1));

		// Delete vendor
		vendorList.remove(vv1);

		// List decrease by 1
		assertEquals("Test that the user arraylist is 1 after being deleted.", 1, vendorList.size());
	}


	@After
	public void tearDown() throws Exception {
		uu1 = null;
		uu2 = null;
		uu3 = null;
		ss1 = null;
		ss2 = null;
		ss3 = null;
		mm1 = null;
		mm2 = null;
		mm3 = null;
		oo1 = null;
		oo2 = null;
		oo3 = null;
		pp1 = null;
		pp2 = null;
		pp3 = null;
		vv1 = null;
		vv2 = null;
		vv3 = null;
		userList = null;
		schoolList = null;
		menuList = null;
		orderList = null;
		paymentList = null;
		vendorList = null;

	}

}
