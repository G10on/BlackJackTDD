package cards;

public class Ace implements Card {
    @Override
    public int getValue() {
        return 11;
    }
    @Override
    public String toString() {
        return "Ace (" + this.getValue() + ")";
    }
}