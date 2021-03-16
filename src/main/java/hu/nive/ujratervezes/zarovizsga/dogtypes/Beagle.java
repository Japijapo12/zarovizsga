package hu.nive.ujratervezes.zarovizsga.dogtypes;

public class Beagle extends Dog {


    public Beagle(String name, int happiness) {
        super(name);
    }



    public void feed() {
        super.setHappiness(getHappiness() + 2);
    }

    public void play(int hours) {
        super.setHappiness(hours * 3);
    }
}
