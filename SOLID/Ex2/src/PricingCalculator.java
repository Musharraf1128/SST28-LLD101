import java.util.*;

class PricingCalculator {
    double calculateSubtotal(List<OrderLine> lines, Map<String, MenuItem> menu) {
        double subtotal = 0.0;
        for (OrderLine l : lines) {
            MenuItem item = menu.get(l.itemId);
            subtotal += item.price * l.qty;
        }
        return subtotal;
    }
    
    String formatOrderLines(List<OrderLine> lines, Map<String, MenuItem> menu) {
        StringBuilder out = new StringBuilder();
        for (OrderLine l : lines) {
            MenuItem item = menu.get(l.itemId);
            double lineTotal = item.price * l.qty;
            out.append(String.format("- %s x%d = %.2f\n", item.name, l.qty, lineTotal));
        }
        return out.toString();
    }
}