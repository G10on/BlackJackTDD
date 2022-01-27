package tests.game;

import blackjack.BlackJack;
import cards.Ace;
import cards.Face;
import cards.Pip;
import compounds.Deck;
import players.Croupier;
import players.Player;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTests {
    
    // Caso 1 del enunciado
    @Test
    public void case1() throws Exception {
        Deck deck = new Deck();
        Player ply1 = new Player();
        Player ply2 = new Player();
        Player ply3 = new Player();
        Croupier crp = new Croupier();
        ply1.addCard(new Face());
        ply1.addCard(new Ace());
        ply2.addCard(new Pip(10));
        ply2.addCard(new Pip(5));
        ply2.addCard(new Pip(6));
        ply3.addCard(new Pip(3));
        ply3.addCard(new Pip(6));
        ply3.addCard(new Ace());
        ply3.addCard(new Pip(3));
        ply3.addCard(new Ace());
        ply3.addCard(new Face());
        crp.addCard(new Pip(9));
        crp.addCard(new Pip(7));
        deck.addCard(new Pip(5));
        deck.addCard(new Pip(4));
        deck.addCard(new Face());
        deck.addCard(new Pip(2));
        ArrayList<String> winList = new ArrayList<>();
        winList.add("Player1");
        assertEquals(winList, BlackJack.getWinners(ply1.getCards(),
                ply2.getCards(),
                ply3.getCards(),
                crp.getCards(),
                deck.getDeck()));
    }
    
    // Caso 2 del enunciado
    @Test
    public void case2() throws Exception {
        Deck deck = new Deck();
        Player ply1 = new Player();
        Player ply2 = new Player();
        Player ply3 = new Player();
        Croupier crp = new Croupier();
        ply1.addCard(new Pip(10));
        ply1.addCard(new Face());
        ply2.addCard(new Pip(10));
        ply2.addCard(new Pip(2));
        ply2.addCard(new Pip(6));
        ply3.addCard(new Pip(8));
        ply3.addCard(new Pip(8));
        ply3.addCard(new Pip(5));
        crp.addCard(new Pip(5));
        crp.addCard(new Pip(10));
        deck.addCard(new Ace());
        deck.addCard(new Pip(3));
        deck.addCard(new Face());
        deck.addCard(new Pip(2));
        ArrayList<String> winList = new ArrayList<>();
        winList.add("Player1"); winList.add("Player3");
        assertEquals(winList, BlackJack.getWinners(ply1.getCards(),
                ply2.getCards(),
                ply3.getCards(),
                crp.getCards(),
                deck.getDeck()));
    }
    
    
    @Test
    public void case3() throws Exception {
        Deck deck = new Deck();
        Player ply1 = new Player();
        Player ply2 = new Player();
        Player ply3 = new Player();
        Croupier crp = new Croupier();
        ply1.addCard(new Ace());
        ply1.addCard(new Pip(2));
        ply1.addCard(new Pip(8));
        ply2.addCard(new Pip(6));
        ply2.addCard(new Ace());
        ply2.addCard(new Face());
        ply2.addCard(new Pip(6));
        ply3.addCard(new Pip(9));
        ply3.addCard(new Pip(3));
        ply3.addCard(new Face());
        crp.addCard(new Pip(10));
        crp.addCard(new Face());
        deck.addCard(new Pip(9));
        deck.addCard(new Pip(9));
        deck.addCard(new Pip(3));
        deck.addCard(new Face());
        ArrayList<String> winList = new ArrayList<>();
        winList.add("Player1");
        assertEquals(winList, BlackJack.getWinners(ply1.getCards(),
                ply2.getCards(),
                ply3.getCards(),
                crp.getCards(),
                deck.getDeck()));
    }
    
    @Test
    public void case4() throws Exception {
        Deck deck = new Deck();
        Player ply1 = new Player();
        Player ply2 = new Player();
        Player ply3 = new Player();
        Croupier crp = new Croupier();
        ply1.addCard(new Ace());
        ply1.addCard(new Pip(5));
        ply1.addCard(new Pip(2));
        ply1.addCard(new Pip(10));
        ply1.addCard(new Pip(7));
        ply2.addCard(new Pip(6));
        ply2.addCard(new Ace());
        ply2.addCard(new Face());
        ply2.addCard(new Pip(6));
        ply3.addCard(new Pip(9));
        ply3.addCard(new Pip(3));
        ply3.addCard(new Face());
        crp.addCard(new Pip(5));
        crp.addCard(new Pip(9));
        deck.addCard(new Pip(8));
        deck.addCard(new Pip(2));
        deck.addCard(new Face());
        deck.addCard(new Pip(7));
        ArrayList<String> winList = new ArrayList<>();
        winList.add("Croupier");
        assertEquals(winList, BlackJack.getWinners(ply1.getCards(),
                ply2.getCards(),
                ply3.getCards(),
                crp.getCards(),
                deck.getDeck()));
    }
    
    
        @Test
    public void case5() throws Exception {
        Deck deck = new Deck();
        Player ply1 = new Player();
        Player ply2 = new Player();
        Player ply3 = new Player();
        Croupier crp = new Croupier();
        ply1.addCard(new Pip(2));
        ply1.addCard(new Pip(10));
        ply1.addCard(new Ace());
        ply1.addCard(new Face());
        ply2.addCard(new Pip(2));
        ply2.addCard(new Face());
        ply2.addCard(new Pip(4));
        ply2.addCard(new Pip(6));
        ply3.addCard(new Pip(5));
        ply3.addCard(new Face());
        ply3.addCard(new Pip(9));
        crp.addCard(new Pip(2));
        crp.addCard(new Pip(4));
        deck.addCard(new Face());
        deck.addCard(new Pip(5));
        deck.addCard(new Pip(5));
        deck.addCard(new Pip(3));
        ArrayList<String> winList = new ArrayList<>();
        winList.add("Croupier");
        assertEquals(winList, BlackJack.getWinners(ply1.getCards(),
                ply2.getCards(),
                ply3.getCards(),
                crp.getCards(),
                deck.getDeck()));
    }
    
    
    @Test
    public void case6() throws Exception {
        Deck deck = new Deck();
        Player ply1 = new Player();
        Player ply2 = new Player();
        Player ply3 = new Player();
        Croupier crp = new Croupier();
        ply1.addCard(new Ace());
        ply1.addCard(new Pip(2));
        ply1.addCard(new Pip(8));
        ply2.addCard(new Pip(6));
        ply2.addCard(new Ace());
        ply2.addCard(new Face());
        ply2.addCard(new Pip(6));
        ply3.addCard(new Pip(9));
        ply3.addCard(new Pip(3));
        ply3.addCard(new Face());
        crp.addCard(new Ace());
        crp.addCard(new Face());
        deck.addCard(new Pip(9));
        deck.addCard(new Pip(9));
        deck.addCard(new Pip(3));
        deck.addCard(new Face());
        ArrayList<String> winList = new ArrayList<>();
        winList.add("Croupier");
        assertEquals(winList, BlackJack.getWinners(ply1.getCards(),
                ply2.getCards(),
                ply3.getCards(),
                crp.getCards(),
                deck.getDeck()));
    }
}