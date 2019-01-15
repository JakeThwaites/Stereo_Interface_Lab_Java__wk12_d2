package Devices;

import Parts.Component;

import java.util.HashMap;

public class Stereo {
    private HashMap<String, Component> components;
    private String name;
    private int volume;

    public Stereo(String name, HashMap<String, Component> components) {
        this.name = name;
        this.components = components;
        this.volume = 0;
    }

    public HashMap<String, Component> getComponents() {
        return components;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public void raiseVolume() {
        if (this.volume < 5) {
            this.volume += 1;
        }
    }

    public void lowerVolume() {
        if (this.volume > 0) {
            this.volume -= 1;
        }
    }

    public String playComponent(String componentName) {
        if (this.components.get(componentName) != null) {
           return this.components.get(componentName).play();
        }
        else {
            return "You don't have no " + componentName + ", chump!";
        }

    }

}
