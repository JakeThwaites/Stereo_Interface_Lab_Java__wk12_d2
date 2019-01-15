import Devices.Stereo;
import Parts.Component;
import Parts.Radio;
import Parts.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Radio radio;
    private RecordDeck recordDeck;
    private Stereo stereo;
    private HashMap<String, Component> componentList;

    @Before
    public void setUp() {
        radio = new Radio("Sony", "Good Radio");
        recordDeck = new RecordDeck("Dyson", "Good Deck");
        componentList = new HashMap<>();
        componentList.put("Radio", radio);
        componentList.put("Record Deck", recordDeck);
        stereo = new Stereo("Jake's Stereo", componentList);
    }

    @Test
    public void hasName() {
        assertEquals("Jake's Stereo", stereo.getName());
    }

    @Test
    public void hasComponentList() {
        assertEquals(componentList, stereo.getComponents());
    }

    @Test
    public void startsWith0Volume() {
        assertEquals(0, stereo.getVolume());
    }

    @Test
    public void canRaiseVolume() {
        stereo.raiseVolume();
        assertEquals(1, stereo.getVolume());
    }

    @Test
    public void canLowerVolume() {
        stereo.raiseVolume();
        stereo.raiseVolume();
        assertEquals(2, stereo.getVolume());
        stereo.lowerVolume();
        assertEquals(1, stereo.getVolume());
    }

    @Test
    public void canPlayComponent() {
        assertEquals("Next up, the Backstreet Boys!", stereo.playComponent("Radio"));
    }

    @Test
    public void cantPlayMissingComponent(){
        assertEquals("You don't have no CD Player, chump!", stereo.playComponent("CD Player"));
    }
}
