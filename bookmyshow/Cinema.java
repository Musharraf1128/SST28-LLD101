import java.util.List;

public class Cinema {
    private String cinemaId;
    private String name;
    private List<Chair> chairs;

    public Cinema(String cinemaId, String name, List<Chair> chairs) {
        this.cinemaId = cinemaId;
        this.name = name;
        this.chairs = chairs;
    }

    public String getName() {
        return name;
    }

    public List<Chair> getChairs() {
        return chairs;
    }
}
