import Parts.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recorddeck;

    @Before
    public void before(){
        recorddeck = new RecordDeck("Dyson", "Sound BLAST 3000");
    }

    @Test
    public void hasMake(){
        assertEquals("Dyson", recorddeck.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Sound BLAST 3000", recorddeck.getModel());
    }

    @Test
    public void hasPlaySpeeds(){
        assertEquals(5, recorddeck.getPlaySpeeds().size());
    }

    @Test
    public void canPlay(){
        assertEquals("scratch scratch...", recorddeck.play());
    }
}
