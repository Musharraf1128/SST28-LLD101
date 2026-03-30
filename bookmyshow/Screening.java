import java.util.List;

public class Screening {
    private String screeningId;
    private Film film;
    private Cinema cinema;
    private String startTime;
    private String endTime;
    private List<ScreeningChair> chairs;

    public Screening(String screeningId, Film film, Cinema cinema, String startTime, String endTime, List<ScreeningChair> chairs) {
        this.screeningId = screeningId;
        this.film = film;
        this.cinema = cinema;
        this.startTime = startTime;
        this.endTime = endTime;
        this.chairs = chairs;
    }

    public Film getFilm() {
        return film;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public List<ScreeningChair> getChairs() {
        return chairs;
    }
}
