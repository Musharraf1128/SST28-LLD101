import java.util.List;

public class Booking {
    private String bookingId;
    private Customer customer;
    private Screening screening;
    private List<ScreeningChair> bookedChairs;
    private double totalPrice;
    private String status;

    public Booking(String bookingId, Customer customer, Screening screening, List<ScreeningChair> bookedChairs, double totalPrice) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.screening = screening;
        this.bookedChairs = bookedChairs;
        this.totalPrice = totalPrice;
        this.status = "CONFIRMED";
    }

    public String getBookingId() {
        return bookingId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void cancel() {
        this.status = "CANCELLED";
        for (ScreeningChair chair : bookedChairs) {
            chair.release();
        }
    }
}
