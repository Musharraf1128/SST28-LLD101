import java.util.*;

class StudentOutputFormatter {
    String formatConfirmation(StudentRecord student) {
        return student.toString();
    }
    
    String formatError(List<String> errors) {
        StringBuilder sb = new StringBuilder("ERROR: cannot register\n");
        for (String e : errors) {
            sb.append("- ").append(e).append("\n");
        }
        return sb.toString();
    }
}