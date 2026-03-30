public class Chair {
    private int row;
    private int number;
    private ChairType chairType;

    public Chair(int row, int number, ChairType chairType) {
        this.row = row;
        this.number = number;
        this.chairType = chairType;
    }

    public int getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }

    public ChairType getChairType() {
        return chairType;
    }
}
