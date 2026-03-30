import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    private List<Booking> bookings = new ArrayList<>();

    public Booking createBooking(Customer customer, Screening screening, List<ScreeningChair> selectedChairs) {
        for (ScreeningChair chair : selectedChairs) {
            if (chair.isBooked()) {
                System.out.println("Chair already booked! Cannot proceed.");
                return null;
            }
        }

        for (ScreeningChair chair : selectedChairs) {
            chair.book();
        }

        double price = selectedChairs.size() * 200.0;
        Booking booking = new Booking("B-001", customer, screening, selectedChairs, price);
        bookings.add(booking);
        return booking;
    }

    public void cancelBooking(Booking booking) {
        booking.cancel();
        bookings.remove(booking);
    }

    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
