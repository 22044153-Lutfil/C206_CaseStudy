
public class Vendor {
	
	private int vendorID;
	private String vendorName;
	private int vendorContact;
	private String vendorMenu;
	
	public Vendor(int vendorID, String vendorName, int vendorContact, String vendorMenu) {
		this.vendorID = vendorID;
		this.vendorName = vendorName;
		this.vendorContact = vendorContact;
		this.vendorMenu = vendorMenu;
	}

	public int getVendorID() {
		return vendorID;
	}

	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public int getVendorContact() {
		return vendorContact;
	}

	public void setVendorContact(int vendorContact) {
		this.vendorContact = vendorContact;
	}

	public String getVendorMenu() {
		return vendorMenu;
	}

	public void setVendorMenu(String vendorMenu) {
		this.vendorMenu = vendorMenu;
	}

	
}

