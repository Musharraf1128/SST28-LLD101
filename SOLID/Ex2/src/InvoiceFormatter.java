import java.util.*;

interface InvoiceFormatter {
    String format(String content);
    String formatHeader(String invoiceId);
    String formatFooter(String invoiceId, int lineCount);
    String formatSummary(double subtotal, double tax, double discount, double total);
}

class DefaultInvoiceFormatter implements InvoiceFormatter {
    public String format(String content) {
        return content;
    }
    
    public String formatHeader(String invoiceId) {
        return "Invoice# " + invoiceId + "\n";
    }
    
    public String formatFooter(String invoiceId, int lineCount) {
        return "Saved invoice: " + invoiceId + " (lines=" + lineCount + ")\n";
    }
    
    public String formatSummary(double subtotal, double tax, double discount, double total) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Subtotal: %.2f\n", subtotal));
        sb.append(String.format("Tax(%.0f%%): %.2f\n", tax, tax));
        sb.append(String.format("Discount: -%.2f\n", discount));
        sb.append(String.format("TOTAL: %.2f\n", total));
        return sb.toString();
    }
}
