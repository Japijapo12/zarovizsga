package hu.nive.ujratervezes.zarovizsga.kennel;

public class Dog {

    private String name;
    private int happiness = 0;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void feed() {

    }

    public void play(int hours) {
        this.happiness =  this.happiness * hours;

    }

}
