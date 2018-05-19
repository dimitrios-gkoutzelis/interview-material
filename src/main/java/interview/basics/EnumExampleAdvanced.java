package main.java.interview.basics;

public class EnumExampleAdvanced {

    public static void main(String[] args) {

        Capital c = Capital.ATHENS;
        System.out.println("Capital's shortCode for " + c.name() + " is " + c.getShortCode());
    }
}

enum Capital {
    ATHENS("A"),
    MADRID("M"),
    PARIS("P");

    private final String shortCode;

    Capital(String x) {
        this.shortCode = x;
    }

    public String getShortCode() {
        return shortCode;
    }
}
