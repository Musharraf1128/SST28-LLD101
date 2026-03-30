public class PenFactory {
    public static Pen createPen(String type, String inkColor) {
        switch (type.toUpperCase()) {
            case "FOUNTAIN":
                return new FountainPen(inkColor, new SmoothWriting(), new CapOpen());
            case "MARKER":
                return new MarkerPen(inkColor, new BoldWriting(), new CapOpen());
            case "SKETCH":
                return new SketchPen(inkColor, new FineWriting(), new TwistOpen());
            default:
                throw new IllegalArgumentException("Unknown pen type: " + type);
        }
    }
}
