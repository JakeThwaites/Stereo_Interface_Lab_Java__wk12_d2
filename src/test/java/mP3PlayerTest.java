import Devices.Stereo;
import Devices.mP3Player;
import Parts.Component;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class mP3PlayerTest {

    private Stereo stereo;
    private mP3Player mP3;

    @Before
    public void setUp() {
        mP3 = new mP3Player();
        stereo = new Stereo("Jake's Stereo", new HashMap<String, Component>());
    }

    @Test
    public void canConnect() {
        assertEquals("Connected to Jake's Stereo", mP3.connect(stereo));
    }
}
