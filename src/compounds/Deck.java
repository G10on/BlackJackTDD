package compounds;

import cards.Card;
import java.util.ArrayList;
public class Deck {
    ArrayList<Card> deckCards = new ArrayList<>();
    public void addCard(Card card) {
        deckCards.add(card);
    }
    public ArrayList<Card> getDeck() {
        return deckCards;
    }
    @Override
    public String toString() {
        return getDeck().toString();
    }
}
