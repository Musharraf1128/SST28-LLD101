import java.util.*;

class InputParser {
    ParsedInput parse(String raw) {
        Map<String,String> kv = new LinkedHashMap<>();
        String[] parts = raw.split(";");
        for (String p : parts) {
            String[] t = p.split("=", 2);
            if (t.length == 2) kv.put(t[0].trim(), t[1].trim());
        }
        
        String name = kv.getOrDefault("name", "");
        String email = kv.getOrDefault("email", "");
        String phone = kv.getOrDefault("phone", "");
        String program = kv.getOrDefault("program", "");
        
        return new ParsedInput(name, email, phone, program);
    }
}

class ParsedInput {
    final String name;
    final String email;
    final String phone;
    final String program;
    
    ParsedInput(String name, String email, String phone, String program) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.program = program;
    }
}