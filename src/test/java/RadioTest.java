import Parts.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void setUp(){
        radio = new Radio("Sony", "Tunilicious MAX");
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Tunilicious MAX", radio.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Next up, the Backstreet Boys!", radio.play());
    }

    @Test
    public void canTune() {
        assertEquals("You're listening to Radio 3", radio.tune("Radio 3"));
    }
}
