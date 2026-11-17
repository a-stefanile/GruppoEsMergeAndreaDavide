public class NormalTicket extends Ticket {

    public NormalTicket(Film film) {
        super(film, 8.0);
    }

    @Override
    public String getTicketType() {
        return "NORMAL";
    }
}