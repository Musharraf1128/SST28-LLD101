import java.util.List;

public class ParkingGarage {
    private String name;
    private List<Level> levels;

    public ParkingGarage(String name, List<Level> levels) {
        this.name = name;
        this.levels = levels;
    }

    public String getName() {
        return name;
    }

    public List<Level> getLevels() {
        return levels;
    }
}
