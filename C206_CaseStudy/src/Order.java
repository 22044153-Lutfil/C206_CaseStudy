
public class Order {
	private int orderID;
	private String orderItem;
	private int orderQuantity;
	private double orderPrice;
	private String orderStatus;
	
	public Order(int orderID, String orderItem, int orderQuantity, double orderPrice, String orderStatus) {
		this.orderID = orderID;
		this.orderItem = orderItem;
		this.orderQuantity = orderQuantity;
		this.orderPrice = orderPrice;
		this.orderStatus = orderStatus;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
