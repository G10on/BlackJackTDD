package players;

import cards.Card;
import java.util.ArrayList;

public class Player implements Participant {
    private final ArrayList<Card> cards = new ArrayList<Card>();
    @Override
    public void addCard(Card card) {
        cards.add(card);
    }
    @Override
    public ArrayList<Card> getCards() {
        return cards;
    }
}
