import java.util.*;

public class HostelFeeCalculator {
    private final BookingRepository repo;
    private final List<PricingComponent> pricingComponents;

    public HostelFeeCalculator(BookingRepository repo, List<PricingComponent> pricingComponents) {
        this.repo = repo;
        this.pricingComponents = pricingComponents;
    }

    public void process(BookingRequest req) {
        Money monthly = calculateMonthly(req);
        Money deposit = new Money(5000.00);

        ReceiptPrinter.print(req, monthly, deposit);

        String bookingId = "H-" + (7000 + new Random(1).nextInt(1000));
        repo.save(bookingId, req, monthly, deposit);
    }

    private Money calculateMonthly(BookingRequest req) {
        double total = 0.0;
        for (PricingComponent component : pricingComponents) {
            total += component.getPrice(req).amount;
        }
        return new Money(total);
    }
}
