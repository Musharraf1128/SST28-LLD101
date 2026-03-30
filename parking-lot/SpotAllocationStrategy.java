public interface SpotAllocationStrategy {
    Spot findSpot(ParkingGarage garage, SpotType type);
}
