public class Film {
    private String filmId;
    private String title;
    private int durationMinutes;
    private String language;

    public Film(String filmId, String title, int durationMinutes, String language) {
        this.filmId = filmId;
        this.title = title;
        this.durationMinutes = durationMinutes;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }
}
