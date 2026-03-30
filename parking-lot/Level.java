import java.util.List;

public class Level {
    private int levelNumber;
    private List<Spot> spots;

    public Level(int levelNumber, List<Spot> spots) {
        this.levelNumber = levelNumber;
        this.spots = spots;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public List<Spot> getSpots() {
        return spots;
    }
}
