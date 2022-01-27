package tests.compounds;

import cards.Ace;
import cards.Card;
import cards.Face;
import cards.Pip;
import compounds.Deck;
import players.Croupier;
import players.Player;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testPlayers {
    
    @Test
    public void testPlayersPip() throws Exception {
        Player ply = new Player();
        ArrayList<Card> testDeck = new ArrayList<>();
        for (int i = 4; i <= 8; i++) {
            ply.addCard(new Pip(i)); testDeck.add(new Pip(i));
        }
        assertEquals(testDeck.toString(), ply.getCards().toString());
    }

    @Test
    public void testPlayersFace() {
        Player ply = new Player();
        ArrayList<Card> testDeck = new ArrayList<>();
        Card ten1 = new Face();
        Card ten2 = new Face();
        Card ten3 = new Face();
        Card ten4 = new Face();
        ply.addCard(ten1);
        ply.addCard(ten2);
        ply.addCard(ten3);
        ply.addCard(ten4);
        testDeck.add(ten1);
        testDeck.add(ten2);
        testDeck.add(ten3);
        testDeck.add(ten4);
        assertEquals(testDeck.toString(), ply.getCards().toString());
    }
    
    @Test
    public void testPlayersAce() {
        Player ply = new Player();
        Card ace = new Ace();
        ply.addCard(ace);
        assertEquals("[Ace (11)]" , ply.getCards().toString());
    }
    
    @Test
    public void testPlayersMixed() throws Exception {
        ArrayList<Card> testDeck = new ArrayList<>();
        Player ply = new Player();
        Card ten1 = new Face();
        Card ten2 = new Face();
        Card ten3 = new Face();
        Card ten4 = new Face();
        
        for (int i = 2; i <= 5; i++) {
            testDeck.add(new Pip(i)); ply.addCard(new Pip(i));
        }
        ply.addCard(ten1);
        ply.addCard(ten2);
        ply.addCard(ten3);
        ply.addCard(ten4);
        testDeck.add(ten1);
        testDeck.add(ten2);
        testDeck.add(ten3);
        testDeck.add(ten4);
        Card ace = new Ace();
        ply.addCard(ace);
        testDeck.add(ace);
        assertEquals(testDeck.toString(), ply.getCards().toString());
    }
    
    @Test
    public void testCroupierPip() throws Exception {
        Croupier crp = new Croupier();
        ArrayList<Card> testDeck = new ArrayList<>();
        for (int i = 4; i <= 8; i++) {
            crp.addCard(new Pip(i)); testDeck.add(new Pip(i));
        }
        assertEquals(testDeck.toString(), crp.getCards().toString());
    }
    
    @Test
    public void testCroupierFace() {
        Croupier crp = new Croupier();
        ArrayList<Card> testDeck = new ArrayList<>();
        Card ten1 = new Face();
        Card ten2 = new Face();
        Card ten3 = new Face();
        Card ten4 = new Face();
        crp.addCard(ten1);
        crp.addCard(ten2);
        crp.addCard(ten3);
        crp.addCard(ten4);
        testDeck.add(ten1);
        testDeck.add(ten2);
        testDeck.add(ten3);
        testDeck.add(ten4);
        assertEquals(testDeck.toString(), crp.getCards().toString());
    }
    
    @Test
    public void testCroupierAce() {
        Croupier crp = new Croupier();
        Card ace = new Ace();
        crp.addCard(ace);
        assertEquals("[Ace (11)]" , crp.getCards().toString());
    }
    
    @Test
    public void testCroupierMixed() throws Exception {
        ArrayList<Card> testDeck = new ArrayList<>();
        Croupier crp = new Croupier();
        Card ten1 = new Face();
        Card ten2 = new Face();
        Card ten3 = new Face();
        Card ten4 = new Face();
        
        for (int i = 2; i <= 5; i++) {
            testDeck.add(new Pip(i)); crp.addCard(new Pip(i));
        }
        crp.addCard(ten1);
        crp.addCard(ten2);
        crp.addCard(ten3);
        crp.addCard(ten4);
        testDeck.add(ten1);
        testDeck.add(ten2);
        testDeck.add(ten3);
        testDeck.add(ten4);
        Card ace = new Ace();
        crp.addCard(ace);
        testDeck.add(ace);
        assertEquals(testDeck.toString(), crp.getCards().toString());
    }
    
}
