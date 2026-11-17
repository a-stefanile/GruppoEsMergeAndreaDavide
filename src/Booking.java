public class Booking {
    private Ticket ticket;
    private DiscountStrategy discountStrategy;
    private double finalPrice;

    public Booking(Ticket ticket,DiscountStrategy discountStrategy) {
        this.ticket = ticket;
        this.discountStrategy = discountStrategy;
        this.finalPrice = discountStrategy.calculateDiscountPrice(ticket.getPrice());
    }

    public Ticket getTicket(){
        return ticket;
    };

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void printDetails (){
        System.out.println("Booking Details:");
        System.out.println("Film: " +ticket.getFilm().getTitle());
        System.out.println("Ticket type: " +ticket.getTicketType());
        System.out.println("Base price: "+ticket.getPrice());
        System.out.println("Discount Strategy: " + discountStrategy.description());
        System.out.println("Final Price: " + finalPrice);
    }
}
