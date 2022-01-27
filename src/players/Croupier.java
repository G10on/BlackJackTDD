package players;

import cards.Card;
import java.util.ArrayList;

public class Croupier implements Participant{
    ArrayList<Card> cards = new ArrayList<>();
    @Override
    public void addCard(Card card) {
        cards.add(card);
    }
    @Override
    public ArrayList<Card> getCards() {
        return cards;
    }
}
