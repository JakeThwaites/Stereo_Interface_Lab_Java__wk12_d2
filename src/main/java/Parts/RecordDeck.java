package Parts;


import java.util.ArrayList;

public class RecordDeck extends Component {

    ArrayList<Integer> playSpeeds;

    public RecordDeck(String make, String model) {
        super(make, model);
        this.playSpeeds = new ArrayList<>();
        this.playSpeeds.add(10);
        playSpeeds.add(5000);
        playSpeeds.add(96);
        playSpeeds.add(30);
        playSpeeds.add(4);
    }

    public String play(){
        return "scratch scratch...";
    }

    public ArrayList<Integer> getPlaySpeeds() {
        return playSpeeds;
    }
}
