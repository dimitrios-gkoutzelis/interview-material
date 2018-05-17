package main.java.interview.inheritance;

// A subclass can only extend a single Class but can extend multiple interfaces
public class Violin extends Instrument implements Weigheable, ZurichInsurable{

    private int chordNumber;

    public Violin(int chordNumber, String name) {
        this.chordNumber = chordNumber;
        this.name = name;
    }

    public double getChordNumber() {
        return chordNumber;

    }

    public void setChordNumber(int chordNumber) {
        this.chordNumber = chordNumber;
    }

    public void printDetails() {
        displayName();
        System.out.println("Violin has " + chordNumber + " chords");
    }

    public void showMaxWeight() {
        System.out.println("Max weight is " + MAX_WEIGHT);
    }

    public void displayInsurer() {
        System.out.println("Insurer is " + INSURER);
    }
}
