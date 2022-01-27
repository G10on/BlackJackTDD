package tests.compounds;

import compounds.Deck;
import cards.*;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class testDeck {
    @Test
    public void testPipDeck() throws Exception {
        ArrayList<Card> testDeck = new ArrayList<>();
        Deck deck = new Deck();
        for (int i = 2; i <= 10; i++) {
            testDeck.add(new Pip(i)); deck.addCard(new Pip(i));
        }
        assertEquals(testDeck.toString(), deck.getDeck().toString());
    }
    @Test
    public void testFaceDeck() {
        Deck deck = new Deck();
        ArrayList<Card> testDeck = new ArrayList<>();
        Card ten1 = new Face();
        Card ten2 = new Face();
        Card ten3 = new Face();
        Card ten4 = new Face();
        deck.addCard(ten1);
        deck.addCard(ten2);
        deck.addCard(ten3);
        deck.addCard(ten4);
        testDeck.add(ten1);
        testDeck.add(ten2);
        testDeck.add(ten3);
        testDeck.add(ten4);
        assertEquals(testDeck.toString(), deck.getDeck().toString());
    }
    @Test
    public void testAceDeck() {
        Deck deck = new Deck();
        Card ace = new Ace();
        deck.addCard(ace);
        assertEquals("[Ace (11)]" , deck.getDeck().toString());
    }
    @Test
    public void testMixDeck() throws Exception {
        ArrayList<Card> testDeck = new ArrayList<>();
        Deck deck = new Deck();
        Card ten1 = new Face();
        Card ten2 = new Face();
        Card ten3 = new Face();
        Card ten4 = new Face();
        
        for (int i = 2; i <= 5; i++) {
            testDeck.add(new Pip(i)); deck.addCard(new Pip(i));
        }
        deck.addCard(ten1);
        deck.addCard(ten2);
        deck.addCard(ten3);
        deck.addCard(ten4);
        testDeck.add(ten1);
        testDeck.add(ten2);
        testDeck.add(ten3);
        testDeck.add(ten4);
        Card ace = new Ace();
        deck.addCard(ace);
        testDeck.add(ace);
        assertEquals(testDeck.toString(), deck.getDeck().toString());
    }
}