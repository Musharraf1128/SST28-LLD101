import java.util.*;

public class OnboardingService {
    private final FakeDb db;
    private final InputParser parser;
    private final StudentValidator validator;
    private final StudentOutputFormatter formatter;

    public OnboardingService(FakeDb db) {
        this.db = db;
        this.parser = new InputParser();
        this.validator = new StudentValidator();
        this.formatter = new StudentOutputFormatter();
    }

    public void registerFromRawInput(String raw) {
        System.out.println("INPUT: " + raw);

        ParsedInput input = parser.parse(raw);
        
        if (!validator.isValid(input)) {
            System.out.println(formatter.formatError(validator.validate(input)));
            return;
        }

        String id = IdUtil.nextStudentId(db.count());
        StudentRecord rec = new StudentRecord(id, input.name, input.email, input.phone, input.program);

        db.save(rec);

        System.out.println("OK: created student " + id);
        System.out.println("Saved. Total students: " + db.count());
        System.out.println("CONFIRMATION:");
        System.out.println(formatter.formatConfirmation(rec));
    }
}
