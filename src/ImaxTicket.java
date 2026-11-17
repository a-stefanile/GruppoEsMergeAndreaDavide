public class ImaxTicket extends Ticket {

    public ImaxTicket(Film film) {
        super(film, 12.0);
    }

    @Override
    public String getTicketType() {
        return "IMAX";
    }
}