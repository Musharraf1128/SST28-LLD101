import java.util.*;

public class CafeteriaSystem {
    private final Map<String, MenuItem> menu = new LinkedHashMap<>();
    private final InvoiceRepository store;
    private final PricingCalculator pricing;
    private final TaxRule taxRule;
    private final DiscountRule discountRule;
    private final InvoiceFormatter formatter;
    private int invoiceSeq = 1000;

    public CafeteriaSystem(InvoiceRepository store, PricingCalculator pricing, 
                          TaxRule taxRule, DiscountRule discountRule, InvoiceFormatter formatter) {
        this.store = store;
        this.pricing = pricing;
        this.taxRule = taxRule;
        this.discountRule = discountRule;
        this.formatter = formatter;
    }

    public void addToMenu(MenuItem i) { menu.put(i.id, i); }

    public void checkout(String customerType, List<OrderLine> lines) {
        String invId = "INV-" + (++invoiceSeq);
        
        double subtotal = pricing.calculateSubtotal(lines, menu);
        String orderLines = pricing.formatOrderLines(lines, menu);
        
        double tax = taxRule.calculateTax(customerType, subtotal);
        double discount = discountRule.calculateDiscount(customerType, subtotal, lines.size());
        double total = subtotal + tax - discount;
        
        String invoiceContent = orderLines + 
            formatter.formatSummary(subtotal, tax, discount, total);
        
        String printable = formatter.format(formatter.formatHeader(invId) + invoiceContent);
        System.out.print(printable);

        store.save(invId, printable);
        System.out.println(formatter.formatFooter(invId, store.countLines(invId)));
    }
}
