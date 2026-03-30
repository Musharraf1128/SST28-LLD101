public class FountainPen extends Pen {
    public FountainPen(String inkColor, WritingBehaviour writingBehaviour, OpenMechanism openMechanism) {
        super(inkColor, writingBehaviour, openMechanism);
    }

    public void write() {
        System.out.println("FountainPen writing in " + inkColor);
        writingBehaviour.write();
    }
}
