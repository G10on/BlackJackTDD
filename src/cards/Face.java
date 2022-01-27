package cards;

public class Face implements Card {
    @Override
    public int getValue() {
        return 10;
    }
    @Override
    public String toString() {
        return "Face (" + this.getValue() + ")";
    }
}