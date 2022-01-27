package blackjack;

import cards.Ace;
import cards.Card;
import java.util.ArrayList;

public class BlackJack {

    private static ArrayList<Card> fillCroupier(ArrayList<Card> croupierCards, ArrayList<Card> deckCards) {
        while (sumPoints(croupierCards) <= 16) {
            croupierCards.add(deckCards.remove(0));
        }
        return croupierCards;
    }
    
    public static ArrayList<String> getWinners(ArrayList<Card> player1,
            ArrayList<Card> player2, ArrayList<Card> player3,
            ArrayList<Card> croupier, ArrayList<Card> deck) {
        ArrayList<String> winList = new ArrayList<String>();
        ArrayList<ArrayList<Card>> players = new ArrayList<>();
        players.add(player1); players.add(player2); players.add(player3);
        croupier = fillCroupier(croupier, deck);
        int croupierPoints = sumPoints(croupier);
        if (sumPoints(croupier) > 21) {
            for (int i = 0; i < 3; i++) {
                if (sumPoints(players.get(i)) <= 21) {
                    winList.add("Player " + ( i + 1 ));
                }
            }
        } else if (isBlackJack(croupier)) {
            winList.add("Croupier");
        } else {
            for (int i = 0; i < 3; i++) {
                int playerPoints = sumPoints(players.get(i));
                if ( isBlackJack(players.get(i)) || (playerPoints <= 21 &&
                        playerPoints > croupierPoints)) {
                    winList.add("Player" + ( i + 1 ));
                }
            }
        }
        if (winList.isEmpty()) winList.add("Croupier");
        return winList;
    }
    
    public static int sumPoints(ArrayList<Card> playerCards) {
        int p = 0;
        int aces = 0;
        for (Card card : playerCards) {
            if (card instanceof Ace) aces++;
            p += card.getValue();
            if (p > 21 && aces > 0) {
                aces--;
                p -= 10;
            }
        }
        return p;
    }

    private static boolean isBlackJack(ArrayList<Card> cards) {
        return cards.size() == 2 && sumPoints(cards) == 21;
    }
}