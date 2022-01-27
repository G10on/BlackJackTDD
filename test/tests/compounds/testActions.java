package tests.compounds;

import blackjack.BlackJack;
import cards.Ace;
import cards.Face;
import cards.Pip;
import players.Player;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testActions {
    
    @Test
    public void testAcePoints() {
        Player ply = new Player();
        ply.addCard(new Ace()); ply.addCard(new Ace()); ply.addCard(new Ace());
        assertEquals(13, BlackJack.sumPoints(ply.getCards()));
    }
    
    @Test
    public void testPipPoints() throws Exception {
        Player ply = new Player();
        for (int i = 2; i <= 6; i+=2) {
            ply.addCard(new Pip(i));
        }
        assertEquals(12, BlackJack.sumPoints(ply.getCards()));
    }
    
    @Test
    public void testFacePoints() {
        Player ply = new Player();
        for (int i = 1; i <= 3; i++) {
            ply.addCard(new Face());
        }
        assertEquals(30, BlackJack.sumPoints(ply.getCards()));
    }
    
    @Test
    public void testMixedPoints() throws Exception {
        Player ply = new Player();
        ply.addCard(new Pip(4)); ply.addCard(new Pip(5)); 
        ply.addCard(new Ace()); ply.addCard(new Face());
        assertEquals(20, BlackJack.sumPoints(ply.getCards()));
    }
}
