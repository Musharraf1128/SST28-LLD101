import java.time.LocalDateTime;

public class Invoice {
    private String invoiceId;
    private Receipt receipt;
    private LocalDateTime exitTime;
    private double amount;

    public Invoice(String invoiceId, Receipt receipt, LocalDateTime exitTime, double amount) {
        this.invoiceId = invoiceId;
        this.receipt = receipt;
        this.exitTime = exitTime;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
