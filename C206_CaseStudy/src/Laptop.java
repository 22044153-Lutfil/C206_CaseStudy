public class Laptop {
    private String serialNumber;
    private String brand;
    private String model;
    private boolean available;

    // Constructor
    public Laptop(String serialNumber, String brand, String model) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.available = true; // New laptops are assumed to be available by default
    }
}