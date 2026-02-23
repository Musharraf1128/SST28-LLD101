import java.util.*;

interface InvoiceRepository {
    void save(String invoiceId, String content);
    int countLines(String invoiceId);
}

class FileStore implements InvoiceRepository {
    private final Map<String, String> store = new HashMap<>();
    
    public void save(String invoiceId, String content) {
        store.put(invoiceId, content);
    }
    
    public int countLines(String invoiceId) {
        String content = store.getOrDefault(invoiceId, "");
        return content.split("\\n").length;
    }
}