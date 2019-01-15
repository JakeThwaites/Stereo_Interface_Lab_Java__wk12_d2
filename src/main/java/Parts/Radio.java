package Parts;

public class Radio extends Component{

    public Radio(String make, String model) {
        super(make, model);
    }

    public String play() {
        return "Next up, the Backstreet Boys!";
    }

    public String tune(String station) {
        return "You're listening to " + station;
    }

}
