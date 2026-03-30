import java.time.LocalDateTime;

public class InvoiceService {

    public Invoice generateInvoice(Receipt receipt) {
        double amount = 50.0;
        receipt.getSpot().removeCar();
        System.out.println("Car " + receipt.getCar().getLicensePlate() + " exited. Amount: " + amount);
        return new Invoice("I-001", receipt, LocalDateTime.now(), amount);
    }
}
