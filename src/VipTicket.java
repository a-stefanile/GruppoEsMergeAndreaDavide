public class VipTicket extends Ticket {

    public VipTicket(Film film) {
        super(film, 15.0);
    }

    @Override
    public String getTicketType() {
        return "VIP";
    }
}