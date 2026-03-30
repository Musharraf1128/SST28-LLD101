import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create spots
        List<Spot> spots = new ArrayList<>();
        spots.add(new Spot(1, SpotType.COMPACT));
        spots.add(new Spot(2, SpotType.REGULAR));
        spots.add(new Spot(3, SpotType.LARGE));

        // Create level and garage
        List<Level> levels = new ArrayList<>();
        levels.add(new Level(1, spots));
        ParkingGarage garage = new ParkingGarage("City Garage", levels);

        // Setup services
        SpotAllocationStrategy strategy = new FirstAvailableStrategy();
        ReceiptService receiptService = new ReceiptService(strategy, garage);
        InvoiceService invoiceService = new InvoiceService();

        // Car enters
        Gate entryGate = new Gate("G1");
        Car car = new Car("KA-01-1234", "White");
        Receipt receipt = receiptService.issueReceipt(car, entryGate, SpotType.REGULAR);

        // Car exits
        if (receipt != null) {
            Invoice invoice = invoiceService.generateInvoice(receipt);
        }
    }
}
