import java.time.LocalDateTime;

public class ReceiptService {
    private SpotAllocationStrategy strategy;
    private ParkingGarage garage;

    public ReceiptService(SpotAllocationStrategy strategy, ParkingGarage garage) {
        this.strategy = strategy;
        this.garage = garage;
    }

    public Receipt issueReceipt(Car car, Gate gate, SpotType spotType) {
        Spot spot = strategy.findSpot(garage, spotType);
        if (spot != null) {
            spot.parkCar(car);
            System.out.println("Car " + car.getLicensePlate() + " parked at spot " + spot.getSpotNumber());
            return new Receipt("R-001", car, spot, gate, LocalDateTime.now());
        }
        System.out.println("No spot available for type: " + spotType);
        return null;
    }
}
