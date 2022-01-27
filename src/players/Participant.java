package players;

import cards.Card;
import java.util.ArrayList;

interface Participant {
    public void addCard(Card card);
    public ArrayList<Card> getCards();
}
