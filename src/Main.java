
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Booking> bookings = new ArrayList<>();

        TicketFactory factory = new TicketFactory();

        boolean isOpen = true;

        Film film = new Film(
                "Interstellar",
                "Sci-Fi",
                169,
                "13+"
        );

        do {

            System.out.println("\n===== CINEMA TICKET SYSTEM =====");

            // Ticket selection
            String ticketType = "";
            boolean validTicket = false;

            while (!validTicket) {

                System.out.println("\nChoose your ticket (VIP, Normal, IMAX):");

                ticketType = scanner.nextLine().trim().toLowerCase();

                if (ticketType.equals("vip")
                        || ticketType.equals("normal")
                        || ticketType.equals("imax")) {

                    validTicket = true;

                } else {
                    System.out.println("Invalid ticket, choose a valid one.");
                }
            }

            // Discount selection
            String discount = "";
            boolean validDiscount = false;

            while (!validDiscount) {

                System.out.println("\nChoose your discount (Normal, Student, Elderly):");

                discount = scanner.nextLine().trim().toLowerCase();

                if (discount.equals("normal")
                        || discount.equals("student")
                        || discount.equals("elderly")) {

                    validDiscount = true;

                } else {
                    System.out.println("Invalid discount, choose a valid one.");
                }
            }

            // Strategy selection
            DiscountStrategy discountStrategy;

            switch (discount) {

                case "student":
                    discountStrategy = new StudentDiscount();
                    break;

                case "elderly":
                    discountStrategy = new ElderlyDiscount();
                    break;

                default:
                    discountStrategy = new NormalPayment();
                    break;
            }
            Ticket ticket = factory.createTicket(ticketType, film);
            Booking booking = new Booking(ticket, discountStrategy);
            bookings.add(booking);
            System.out.println("\n The ticket has been created!");
            booking.printDetails();

            System.out.print("\nDo you want to book another ticket? (s/n): ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("n")) {
                isOpen = false;
            }

        } while (isOpen);

        System.out.println("Number of tickets : " + bookings.size());
        double incassoTotale = 0;
        for (Booking b : bookings) {
            incassoTotale += b.getFinalPrice();
        }

        System.out.println("Total money earned: €" + String.format("%.2f", incassoTotale));

        scanner.close();

    }
}


/*
* Mini Progetto Merge:
1) creare una nuova repo (nomerepo: GruppoEsMergeNome1Nome2Nome3)
2) inizializzate un progetto java come primo commit.
3) scegliete uno dei seguenti temi: Biblioteca, Supermercato, Garage(Meccanico), Cinema o tema libero.
NB!) Ognuno deve avere il proprio ramo.
NB!) Dovete raggiungere almeno 4 merge prima di finire (anche di più servono ovviamente)
NB!) suddividete il carico di lavoro in modo da non lasciare fermo nessuno.
* */