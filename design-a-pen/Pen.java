public abstract class Pen {
    protected String inkColor;
    protected WritingBehaviour writingBehaviour;
    protected OpenMechanism openMechanism;

    public Pen(String inkColor, WritingBehaviour writingBehaviour, OpenMechanism openMechanism) {
        this.inkColor = inkColor;
        this.writingBehaviour = writingBehaviour;
        this.openMechanism = openMechanism;
    }

    public void open() {
        openMechanism.open();
    }

    public abstract void write();

    public void close() {
        System.out.println("Closing pen");
    }
}
