package cards;

public class Pip implements Card {
    private final int value;
    public Pip(int value) throws Exception {
        if (value < 2 || value > 10) {
            throw new Exception("Error - Valor inválido");
        }
        this.value = value;
    }
    @Override
    public int getValue() {
        return this.value;
    }
    @Override
    public String toString() {
        return "Pip Card (" + this.getValue() + ")";
    }
}
