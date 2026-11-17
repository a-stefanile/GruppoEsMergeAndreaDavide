public abstract class Ticket {

    private Film film;
    private double price;

    public Ticket(Film film, double price) {
        this.film = film;
        this.price = price;
    }

    public Film getFilm() {
        return film;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getTicketType();

    public void showTicketDetails() {
        System.out.println("Film: " + film.getTitle());
        System.out.println("Ticket: " + getTicketType());
        System.out.println("Price: " + price + " euro");
    }
}
