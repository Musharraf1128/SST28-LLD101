public class Spot {
    private int spotNumber;
    private SpotType spotType;
    private Car parkedCar;

    public Spot(int spotNumber, SpotType spotType) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
    }

    public boolean isFree() {
        return parkedCar == null;
    }

    public void parkCar(Car car) {
        this.parkedCar = car;
    }

    public void removeCar() {
        this.parkedCar = null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public SpotType getSpotType() {
        return spotType;
    }
}
