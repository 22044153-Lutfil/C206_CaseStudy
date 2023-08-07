import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int TYPE_VENDOR = 6;
	private static final int TYPE_PAYMENT = 5;
	private static final int TYPE_ORDER = 4;
	private static final int TYPE_MENU = 3;
	private static final int TYPE_SCHOOL = 2;
	private static final int OPTION_DELETE = TYPE_MENU;
	private static final int OPTION_ADD = TYPE_SCHOOL;
	private static final int OPTION_VIEWALL = 1;
	private static final int TYPE_USER = 1;
	private static final int OPTION_QUIT = TYPE_ORDER;

	public static void main(String[] args) {

		ArrayList<User> userList = new ArrayList<User>();
		ArrayList<School> schoolList = new ArrayList<School>();
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		ArrayList<Order> orderList = new ArrayList<Order>();
		ArrayList<Payment> paymentList = new ArrayList<Payment>();
		ArrayList<Vendor> vendorList = new ArrayList<Vendor>();


		userList.add(new User(01, "Feroz", "ferozbhrdn@gmail.com", 84149854));
		schoolList.add(new School(02, "Woodgrove Secondary School", 63651987, "81 Woodlands Street 80"));
		menuList.add(new Menu(01, "Nasi Lemak ", "Chicken & Sambal", 3.00, "MOM'S COOK"));
		orderList.add(new Order(01, "Nasi Lemak", 5, 15.00, "Delivered"));
		paymentList.add(new Payment(01, 15.00, "Card"));
		vendorList.add(new Vendor(01, "MOM'S COOK", 83329784, "Nasi Lemak"));


		int option = 0;

		while (option != OPTION_QUIT) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == OPTION_VIEWALL) {
				// View all items

				C206_CaseStudy.setHeader("VIEW ALL");			
				typeMenu();

				int type = Helper.readInt("Enter option to select type > ");

				if (type == TYPE_USER) {
					C206_CaseStudy.viewAllUser(userList);

				} else if (type == TYPE_SCHOOL) {
					C206_CaseStudy.viewAllSchool(schoolList);

				} else if (type == TYPE_MENU) {
					C206_CaseStudy.viewAllMenu(menuList);

				} else if (type == TYPE_ORDER) {
					C206_CaseStudy.viewAllOrder(orderList);

				} else if (type == TYPE_PAYMENT) {
					C206_CaseStudy.viewAllPayment(paymentList);

				} else if (type == TYPE_VENDOR) {
					C206_CaseStudy.viewAllVendor(vendorList);

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_ADD) {
				// Add a new item
				C206_CaseStudy.setHeader("ADD");			
				typeMenu();

				int type = Helper.readInt("Enter option to select type > ");

				if (type == TYPE_USER) {
					// Add a user
					User uu = inputUser();
					C206_CaseStudy.addUser(userList, uu);
					System.out.println("User added");

				} else if (type == TYPE_SCHOOL) {
					// Add a school
					School ss = inputSchool();
					C206_CaseStudy.addSchool(schoolList, ss);
					System.out.println("School added");

				} else if (type == TYPE_MENU) {
					// Add a menu
					Menu mm = inputMenu();
					C206_CaseStudy.addMenu(menuList, mm);
					System.out.println("Menu added");

				} else if (type == TYPE_ORDER) {
					// Add a order
					Order oo = inputOrder();
					C206_CaseStudy.addOrder(orderList, oo);
					System.out.println("Order added");

				} else if (type == TYPE_PAYMENT) {
					// Add a payment
					Payment pp = inputPayment();
					C206_CaseStudy.addPayment(paymentList, pp);
					System.out.println("Payment added");

				} else if (type == TYPE_VENDOR) {
					// Add a vendor
					Vendor vv = inputVendor();
					C206_CaseStudy.addVendor(vendorList, vv);
					System.out.println("Vendor added");

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_DELETE) {
				// Loan item
				C206_CaseStudy.setHeader("DELETE");			
				typeMenu();

				int type = Helper.readInt("Enter option to select type > ");

				if (type == TYPE_USER) {
					C206_CaseStudy.deleteUser(userList);
					System.out.println("User deleted");

				} else if (type == TYPE_SCHOOL) {
					C206_CaseStudy.deleteSchool(schoolList);
					System.out.println("School deleted");

				} else if (type == TYPE_MENU) {
					C206_CaseStudy.deleteMenu(menuList);
					System.out.println("Menu deleted");

				} else if (type == TYPE_ORDER) {
					C206_CaseStudy.deleteOrder(orderList);
					System.out.println("Order deleted");

				} else if (type == TYPE_PAYMENT) {
					C206_CaseStudy.deletePayment(paymentList);
					System.out.println("Payment deleted");

				} else if (type == TYPE_VENDOR) {
					C206_CaseStudy.deleteVendor(vendorList);
					System.out.println("Vendor deleted");

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_QUIT) {
				System.out.println("Bye!");

			} else {
				System.out.println("Invalid option");
			}

		}

	}

	public static void typeMenu() {
		C206_CaseStudy.setHeader("TYPES");
		System.out.println("1. User");
		System.out.println("2. School");
		System.out.println("3. Menu");
		System.out.println("4. Order");
		System.out.println("5. Payment");
		System.out.println("6. Vendor");
	}

	public static void menu() {
		C206_CaseStudy.setHeader("SCHOOL LUNCH BOX ORDERING SYSTEM");
		System.out.println("1. View all");
		System.out.println("2. Add");
		System.out.println("3. Delete");
		System.out.println("4. Quit");

		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}


	//================================= Option 1 View items (CRUD- Read) =================================

	public static String retrieveUser(ArrayList<User> userList) {
		String output = "";

		for (int i = 0; i < userList.size(); i++) {
			output += String.format("%-10d %-10s %-30s %-20d\n", userList.get(i).getUserId(),
					userList.get(i).getUsername(),userList.get(i).getEmail(),userList.get(i).getPhoneNumber());

		}

		return output;
	}




	public static void viewAllUser(ArrayList<User> userList) {
		C206_CaseStudy.setHeader("USER LIST");
		String output = String.format("%-10s %-10s %-30s %-10s\n", "USER ID", "USERNAME",
				"EMAIL", "PHONE NUMBER");
		output += retrieveUser(userList);	
		System.out.println(output);
	}

	public static String retrieveSchool(ArrayList<School> schoolList) {
		String output = "";

		for (int i = 0; i < schoolList.size(); i++) {
			output += String.format("%-10d %-30s %-10d %-20s\n", schoolList.get(i).getSchoolID(),
					schoolList.get(i).getSchoolName(),schoolList.get(i).schoolContact(),schoolList.get(i).getSchoolAddress());
		}


		return output;
	}

	public static void viewAllSchool(ArrayList<School> schoolList) {
		C206_CaseStudy.setHeader("SCHOOL LIST");
		String output = String.format("%-10s %-30s %-10s %-10s\n", "SCHOOL ID", "SCHOOL NAME",
				"CONTACT", "SCHOOL ADDRESS");
		output += retrieveSchool(schoolList);	
		System.out.println(output);
	}

	public static String retrieveMenu(ArrayList<Menu> menuList) {
		String output = "";

		for (int i = 0; i < menuList.size(); i++) {
			output += String.format("%-10d %-15s %-20s %-10.2f %-20s\n", menuList.get(i).getMenuId(),
					menuList.get(i).getMenuName(),menuList.get(i).getMenuDescription(),
					menuList.get(i).getMenuPrice(), menuList.get(i).getVendorName());
		}


		return output;

	}

	public static void viewAllMenu(ArrayList<Menu> menuList) {
		C206_CaseStudy.setHeader("MENU LIST");
		String output = String.format("%-10s %-15s %-20s %-10s %-20s\n", "MENU ID", "NAME", "DESCRIPTION",
				"PRICE", "VENDOR NAME");
		output += retrieveMenu(menuList);	
		System.out.println(output);
	}

	public static String retrieveOrder(ArrayList<Order> orderList) {
		String output = "";

		for (int i = 0; i < orderList.size(); i++) {
			output += String.format("%-10d %-20s %-15d %-10.2f %-20s\n", orderList.get(i).getOrderID(),
					orderList.get(i).getOrderItem(),orderList.get(i).getOrderQuantity(),
					orderList.get(i).getOrderPrice(), orderList.get(i).getOrderStatus());
		}


		return output;
	}

	public static void viewAllOrder(ArrayList<Order> orderList) {
		C206_CaseStudy.setHeader("ORDER LIST");
		String output = String.format("%-10s %-20s %-15s %-10s %-10s\n", "ORDER ID", "ITEM", "QUANTITY",
				"PRICE", "STATUS");
		output += retrieveOrder(orderList);	
		System.out.println(output);
	}


	public static String retrievePayment(ArrayList<Payment> paymentList) {
		String output = "";

		for (int i = 0; i < paymentList.size(); i++) {
			output += String.format("%-10d %-20.2f %-20s\n", paymentList.get(i).getOrderID(),
					paymentList.get(i).getTotalPrice(),paymentList.get(i).getPaymentMethod());
		}


		return output;
	}

	public static void viewAllPayment(ArrayList<Payment> paymentList) {
		C206_CaseStudy.setHeader("PAYMENT LIST");
		String output = String.format("%-10s %-20s %-20s\n", "ORDER ID", "TOTAL PRICE",
				"PAYMENT METHOD");
		output += retrievePayment(paymentList);	
		System.out.println(output);
	}

	public static String retrieveVendor(ArrayList<Vendor> vendorList) {
		String output = "";

		for (int i = 0; i < vendorList.size(); i++) {
			output += String.format("%-10d %-20s %-15d %-20s\n", vendorList.get(i).getVendorID(),
					vendorList.get(i).getVendorName(),vendorList.get(i).getVendorContact(),
					vendorList.get(i).getVendorMenu());
		}


		return output;
	}

	public static void viewAllVendor(ArrayList<Vendor> vendorList) {
		C206_CaseStudy.setHeader("VENDOR LIST");
		String output = String.format("%-10s %-20s %-15s %-10s\n", "VENDOR ID", "VENDOR NAME",
				"CONTACT", "VENDOR MENU");
		output += retrieveVendor(vendorList);	
		System.out.println(output);
	}

	//================================= Option 2 Add an item (CRUD - Create) =================================
	public static User inputUser() {
		int userId = Helper.readInt("Enter user id > ");
		String username = Helper.readString("Enter username > ");
		String email = Helper.readString("Enter email > ");
		int phoneNumber = Helper.readInt("Enter phone number > ");

		User uu = new User(userId, username, email, phoneNumber);
		return uu;

	}
	public static void addUser(ArrayList<User> userList, User uu) {
		User user;
		for(int i = 0; i < userList.size(); i++) {
			user = userList.get(i);
			if (user.getUserId()== uu.getUserId())
				return;
		}
		if ((uu.getUserId() == 0) || (uu.getUsername().isEmpty()) || (uu.getEmail().isEmpty() || 
				(uu.getPhoneNumber () == 0))) {
			return;
		}

		userList.add(uu);

	}

	public static School inputSchool() {	
		int schoolID = Helper.readInt("Enter school id > ");
		String schoolName = Helper.readString("Enter school name > ");
		int schoolContact = Helper.readInt("Enter school contact > ");
		String schoolAddress = Helper.readString("Enter school address > ");

		School ss = new School(schoolID, schoolName, schoolContact, schoolAddress);

		return ss;

	}	
	public static void addSchool(ArrayList<School> schoolList, School ss) {
		School school;
		for(int i = 0; i < schoolList.size(); i++) {
			school = schoolList.get(i);
			if (school.getSchoolID()== ss.getSchoolID())
				return;
		}
		if ((ss.getSchoolID() == 0) || (ss.getSchoolName().isEmpty()) || (ss.schoolContact() == 0) || 
				(ss.getSchoolAddress().isEmpty())) {
			return;
		}
		schoolList.add(ss);

	}

	public static Menu inputMenu() {	
		int menuId = Helper.readInt("Enter menu id > ");
		String menuName = Helper.readString("Enter menu name > ");
		String menuDescription = Helper.readString("Enter menu descrption > ");
		double menuPrice = Helper.readDouble("Enter menu price > ");
		String vendorName = Helper.readString("Enter vendor name > ");

		Menu ss = new Menu(menuId, menuName, menuDescription, menuPrice, vendorName);

		return ss;

	}	

	public static void addMenu(ArrayList<Menu> menuList, Menu mm) {
		Menu menu;
		for(int i = 0; i < menuList.size(); i++) {
			menu = menuList.get(i);
			if (menu.getMenuId()== mm.getMenuId())
				return;
		}
		if ((mm.getMenuId() == 0) || (mm.getMenuName().isEmpty()) || (mm.getMenuPrice() == 0) 
				||(mm.getMenuDescription().isEmpty()) || 
				(mm.getVendorName().isEmpty())) {
			return;
		}

		menuList.add(mm);

	}

	public static Order inputOrder() {	
		int orderID = Helper.readInt("Enter order id > ");
		String orderItem = Helper.readString("Enter ordered item > ");
		int orderQuantity = Helper.readInt("Enter order quantity > ");
		double orderPrice = Helper.readDouble("Enter order price > ");
		String orderStatus = Helper.readString("Enter order status > ");

		Order oo = new Order(orderID, orderItem, orderQuantity, orderPrice, orderStatus);

		return oo;

	}	
	public static void addOrder(ArrayList<Order> orderList, Order oo) {
		Order order;
		for(int i = 0; i < orderList.size(); i++) {
			order = orderList.get(i);
			if (order.getOrderID()== oo.getOrderID())
				return;
		}
		if ((oo.getOrderID() == 0) || (oo.getOrderItem().isEmpty()) || (oo.getOrderQuantity() == 0) 
				||(oo.getOrderPrice() == 0) || 
				(oo.getOrderStatus().isEmpty())) {
			return;
		}
		orderList.add(oo);

	}

	public static Payment inputPayment() {	
		int orderID = Helper.readInt("Enter order id > ");
		double totalPrice = Helper.readDouble("Enter total price > ");
		String paymentMethod = Helper.readString("Enter payment method > ");

		Payment pp = new Payment(orderID, totalPrice, paymentMethod);

		return pp;

	}	
	public static void addPayment(ArrayList<Payment> paymentList, Payment pp) {
		Payment payment;
		for(int i = 0; i < paymentList.size(); i++) {
			payment = paymentList.get(i);
			if (payment.getOrderID()== pp.getOrderID())
				return;
		}
		if ((pp.getOrderID() == 0) || (pp.getTotalPrice() == 0) || 
				(pp.getPaymentMethod().isEmpty())) {
			return;
		}
		paymentList.add(pp);

	}

	public static Vendor inputVendor() {	
		int vendorID = Helper.readInt("Enter vendor ID > ");
		String vendorName = Helper.readString("Enter vendor name > ");
		int vendorContact = Helper.readInt("Enter vendor contact > ");
		String vendoMenu = Helper.readString("Enter vendor menu > ");

		Vendor vv = new Vendor(vendorID, vendorName, vendorContact, vendoMenu);

		return vv;

	}	

	public static void addVendor(ArrayList<Vendor> vendorList, Vendor vv) {
		Vendor vendor;
		for(int i = 0; i < vendorList.size(); i++) {
			vendor = vendorList.get(i);
			if (vendor.getVendorID()== vv.getVendorID())
				return;
		}

		if ((vv.getVendorID() == 0) || (vv.getVendorName().isEmpty()) || (vv.getVendorContact() == 0) 
				||(vv.getVendorMenu().isEmpty())) {
			return;
		}
		vendorList.add(vv);

	}


	//================================= Option 3 Delete an item (CRUD - Update) =================================
	public static void deleteUser(ArrayList<User> userList) {

		int deleteUserId = Helper.readInt("Enter user id to delete > ");

		for(int i = 0; i < userList.size(); i++) {
			if (deleteUserId == userList.get(i).getUserId()) {
				userList.remove(i);
			}
			else {
				System.out.println("User not found");
			}
		}

	}

	public static void deleteSchool(ArrayList<School> schoolList) {

		int deleteSchoolId = Helper.readInt("Enter school id to delete > ");

		for(int i = 0; i < schoolList.size(); i++) {
			if (deleteSchoolId == schoolList.get(i).getSchoolID()) {
				schoolList.remove(i);
			}
			else {
				System.out.println("School not found");
			}
		}

	}

	public static void deleteMenu(ArrayList<Menu> menuList) {

		int deleteMenuId = Helper.readInt("Enter menu id u want to delete > ");

		for(int i = 0; i < menuList.size(); i++) {
			if (deleteMenuId == menuList.get(i).getMenuId()) {
				menuList.remove(i);
			}
			else {
				System.out.println("Menu not found");
			}
		}

	}

	public static void deleteOrder(ArrayList<Order> orderList) {

		int deleteOrderId = Helper.readInt("Enter order id u want to delete > ");

		for(int i = 0; i < orderList.size(); i++) {
			if (deleteOrderId == orderList.get(i).getOrderID()) {
				orderList.remove(i);
			}
			else {
				System.out.println("Order not found");
			}
		}

	}


	public static void deletePayment(ArrayList<Payment> paymentList) {

		int deletePaymentId = Helper.readInt("Enter order id u want to delete > ");

		for(int i = 0; i < paymentList.size(); i++) {
			if (deletePaymentId == paymentList.get(i).getOrderID()) {
				paymentList.remove(i);
			}
			else {
				System.out.println("Payment not found");
			}
		}

	}

	public static void deleteVendor(ArrayList<Vendor> vendorList) {

		int deleteVendorId = Helper.readInt("Enter user id u want to delete > ");

		for(int i = 0; i < vendorList.size(); i++) {
			if (deleteVendorId == vendorList.get(i).getVendorID()) {
				vendorList.remove(i);
			}
			else {
				System.out.println("Vendor not found");
			}
		}

	}

}
