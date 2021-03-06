import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    int desiredValue;
    Card card;

    @Before
    public void setUp() {
        desiredValue = 12;
        card = new Card(desiredValue);
    }

    @Test
    public void testGetValue() {
        assertEquals(desiredValue, card.getValue());
    }

    @Test
    public void testToString() {
        String cardStr = card.toString();
        assertEquals("12", cardStr);
    }

    @Test
    public void testEquals() {
        Card testCard = new Card(desiredValue);
        assertEquals(card, testCard);
    }
}
