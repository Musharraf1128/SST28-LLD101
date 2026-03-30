public class SketchPen extends Pen {
    public SketchPen(String inkColor, WritingBehaviour writingBehaviour, OpenMechanism openMechanism) {
        super(inkColor, writingBehaviour, openMechanism);
    }

    public void write() {
        System.out.println("SketchPen writing in " + inkColor);
        writingBehaviour.write();
    }
}
