import java.util.*;

interface DiscountRule {
    double calculateDiscount(String customerType, double subtotal, int itemCount);
}

class DefaultDiscountRule implements DiscountRule {
    private static final Map<String, Double> DISCOUNT_RATES = Map.of(
        "student", 5.0,
        "staff", 10.0,
        "guest", 0.0
    );
    
    public double calculateDiscount(String customerType, double subtotal, int itemCount) {
        double rate = DISCOUNT_RATES.getOrDefault(customerType, 0.0);
        return subtotal * (rate / 100.0);
    }
}