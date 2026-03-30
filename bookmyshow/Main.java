import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Movie Booking System ===");

        // Setup cinema with chairs
        List<Chair> chairs = new ArrayList<>();
        chairs.add(new Chair(1, 1, ChairType.STANDARD));
        chairs.add(new Chair(1, 2, ChairType.STANDARD));
        chairs.add(new Chair(2, 1, ChairType.PREMIUM));
        Cinema cinema = new Cinema("C1", "PVR Cinemas", chairs);

        // Create a film and screening
        Film film = new Film("F1", "Inception", 148, "English");

        List<ScreeningChair> screeningChairs = new ArrayList<>();
        for (Chair chair : chairs) {
            screeningChairs.add(new ScreeningChair(chair));
        }
        Screening screening = new Screening("S1", film, cinema, "18:00", "20:30", screeningChairs);

        // Customer books seats
        Customer customer = new Customer("U1", "Rahul");

        List<ScreeningChair> selected = new ArrayList<>();
        selected.add(screeningChairs.get(0));
        selected.add(screeningChairs.get(1));

        ReservationService service = new ReservationService();
        Booking booking = service.createBooking(customer, screening, selected);

        if (booking != null) {
            System.out.println("Booking " + booking.getBookingId() + " created for " + customer.getName());

            // Pay via card
            PaymentMethod payment = new CardPayment();
            service.processPayment(payment, booking.getTotalPrice());
        }

        System.out.println("=== Done ===");
    }
}
