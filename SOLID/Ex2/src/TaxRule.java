import java.util.*;

interface TaxRule {
    double calculateTax(String customerType, double subtotal);
    double getTaxPercentage(String customerType);
}

class DefaultTaxRule implements TaxRule {
    private static final Map<String, Double> TAX_RATES = Map.of(
        "student", 5.0,
        "staff", 8.0,
        "guest", 10.0
    );
    
    public double calculateTax(String customerType, double subtotal) {
        return subtotal * (getTaxPercentage(customerType) / 100.0);
    }
    
    public double getTaxPercentage(String customerType) {
        return TAX_RATES.getOrDefault(customerType, 10.0);
    }
}