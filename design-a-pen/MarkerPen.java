public class MarkerPen extends Pen {
    public MarkerPen(String inkColor, WritingBehaviour writingBehaviour, OpenMechanism openMechanism) {
        super(inkColor, writingBehaviour, openMechanism);
    }

    public void write() {
        System.out.println("MarkerPen writing in " + inkColor);
        writingBehaviour.write();
    }
}
