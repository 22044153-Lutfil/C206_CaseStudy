
public class Payment {
	
	private int orderID;
	private double totalPrice;
	private String paymentMethod;
	
	public Payment(int orderID, double totalPrice, String paymentMethod) {
		this.orderID = orderID;
		this.totalPrice = totalPrice;
		this.paymentMethod = paymentMethod;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
