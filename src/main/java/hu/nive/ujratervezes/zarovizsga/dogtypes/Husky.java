package hu.nive.ujratervezes.zarovizsga.dogtypes;

public class Husky extends Dog  {

    public Husky(String name, int happiness) {
        super(name);
    }



    public void feed() {
        super.setHappiness(getHappiness() + 4);
    }

    public void play(int hours) {
        super.setHappiness(hours * 3);
    }
}
