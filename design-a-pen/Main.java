public class Main {
    public static void main(String[] args) {
        Pen fountain = PenFactory.createPen("FOUNTAIN", "Blue");
        fountain.open();
        fountain.write();
        fountain.close();

        System.out.println("---");

        Pen marker = PenFactory.createPen("MARKER", "Red");
        marker.open();
        marker.write();
        marker.close();

        System.out.println("---");

        Pen sketch = PenFactory.createPen("SKETCH", "Green");
        sketch.open();
        sketch.write();
        sketch.close();
    }
}
