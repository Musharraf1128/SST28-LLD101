public class ScreeningChair {
    private Chair chair;
    private boolean booked;

    public ScreeningChair(Chair chair) {
        this.chair = chair;
        this.booked = false;
    }

    public boolean isBooked() {
        return booked;
    }

    public void book() {
        this.booked = true;
    }

    public void release() {
        this.booked = false;
    }

    public Chair getChair() {
        return chair;
    }
}
