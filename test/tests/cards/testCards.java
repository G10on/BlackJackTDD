package tests.cards;

import cards.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class testCards {
    
    @Test
    public void testPipCards() throws Exception {
        for (int i = 2; i <= 10; i++) {
            Card pipCard = new Pip(i);
            assertEquals(i, pipCard.getValue());
        }
    }
    @Test(expected = Exception.class)
    public void testBadPipCards() throws Exception {
        for (int i = -10; i <= 1; i++) {
            Card pipCard = new Pip(i);
        }
        for (int i = 11; i <= 20; i++) {
            Card pipCard = new Pip(i);
        }
    }
    @Test
    
    public void testFaceCard() {
        Card faceCard = new Face();
        assertEquals(10, faceCard.getValue());
    }
    @Test
    public void testAceCards() {
        Card ace = new Ace();
        assertEquals(11, ace.getValue());
    }
}
