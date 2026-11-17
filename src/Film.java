public class Film {

    private String title;
    private String genre;
    private int duration;
    private String ageRating;

    public Film(String title, String genre, int duration, String ageRating) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.ageRating = ageRating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void showFilmDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Age Rating: " + ageRating);
    }
}