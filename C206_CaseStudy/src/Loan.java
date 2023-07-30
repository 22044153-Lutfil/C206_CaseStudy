import java.time.LocalDate;

public class Loan {
    private User user;
    private Laptop laptop;
    private LocalDate requestDate;
    private LocalDate expectedReturnDate;

    // Constructor
    public Loan(User user, Laptop laptop, LocalDate requestDate, LocalDate expectedReturnDate) {
        this.user = user;
        this.laptop = laptop;
        this.requestDate = requestDate;
        this.expectedReturnDate = expectedReturnDate;
    }

    
    // Getters and setters 
}
