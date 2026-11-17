public class TicketFactory {

    public Ticket createTicket(String type, Film film) {

        switch (type.toLowerCase()) {

            case "vip":
                return new VipTicket(film);

            case "normal":
                return new NormalTicket(film);

            case "imax":
                return new ImaxTicket(film);

            default:
                throw new IllegalArgumentException("Ticket type not valid");
        }
    }
}
