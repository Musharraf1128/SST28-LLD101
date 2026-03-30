import java.time.LocalDateTime;

public class Receipt {
    private String receiptId;
    private Car car;
    private Spot spot;
    private Gate entryGate;
    private LocalDateTime entryTime;

    public Receipt(String receiptId, Car car, Spot spot, Gate entryGate, LocalDateTime entryTime) {
        this.receiptId = receiptId;
        this.car = car;
        this.spot = spot;
        this.entryGate = entryGate;
        this.entryTime = entryTime;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public Car getCar() {
        return car;
    }

    public Spot getSpot() {
        return spot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
