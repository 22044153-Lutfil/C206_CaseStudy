import static org.junit.Assert.assertTrue;

public class Menu {
	private int menuId;
	private String menuName;
	private String menuDescription;
	private double menuPrice;
	private String vendorName;
	
	public Menu(int menuId, String menuName, String menuDescription, double menuPrice, String vendorName) {
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuDescription = menuDescription;
		this.menuPrice = menuPrice;
		this.vendorName = vendorName;
		assertTrue("C206_CaseStudy_SampleTest ",true);
		
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuDescription() {
		return menuDescription;
	}

	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}

	public double getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(double menuPrice) {
		this.menuPrice = menuPrice;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

}
