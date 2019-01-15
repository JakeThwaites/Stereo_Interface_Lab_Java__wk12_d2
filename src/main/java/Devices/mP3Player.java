package Devices;

import Interfaces.IConnect;

public class mP3Player implements IConnect {

    public String connect(Stereo stereo) {
        return "Connected to " + stereo.getName();
    }

}
