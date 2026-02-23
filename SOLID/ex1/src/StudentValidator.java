import java.util.*;

class StudentValidator {
    private static final Set<String> VALID_PROGRAMS = Set.of("CSE", "AI", "SWE");
    
    List<String> validate(ParsedInput input) {
        List<String> errors = new ArrayList<>();
        
        if (input.name.isBlank()) errors.add("name is required");
        if (input.email.isBlank() || !input.email.contains("@")) errors.add("email is invalid");
        if (input.phone.isBlank() || !input.phone.chars().allMatch(Character::isDigit)) errors.add("phone is invalid");
        if (!VALID_PROGRAMS.contains(input.program)) errors.add("program is invalid");
        
        return errors;
    }
    
    boolean isValid(ParsedInput input) {
        return validate(input).isEmpty();
    }
}