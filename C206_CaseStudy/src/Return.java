import java.time.LocalDate;

public class Return {
    private Laptop laptop;
    private LocalDate returnDate;
    private String returnCondition; // For tracking any notes about the laptop's condition upon return, e.g., good, damaged, etc.

    // Constructor
    public Return(Laptop laptop, LocalDate returnDate, String returnCondition) {
        this.laptop = laptop;
        this.returnDate = returnDate;
        this.returnCondition = returnCondition;
    }

    // Getters and setters 
    
}