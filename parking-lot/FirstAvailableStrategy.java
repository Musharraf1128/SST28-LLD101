public class FirstAvailableStrategy implements SpotAllocationStrategy {

    @Override
    public Spot findSpot(ParkingGarage garage, SpotType type) {
        for (Level level : garage.getLevels()) {
            for (Spot spot : level.getSpots()) {
                if (spot.isFree() && spot.getSpotType() == type) {
                    return spot;
                }
            }
        }
        return null;
    }
}
