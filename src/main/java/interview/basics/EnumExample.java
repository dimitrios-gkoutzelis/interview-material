package main.java.interview.basics;

public class EnumExample {

    public static void main(String[] args) {

        // Creating an ENUM
        Address address = new Address(Country.GREECE, "Agias Paraskeuis 10");
        System.out.println("My address is " + address);

        // Using ENUM in Switch: Possible only in Java 8, not before
        switch (address.getCountry()) {
            case GREECE:
                System.out.println("Wow you're Greek?");
                break;
            default:
                System.out.println("boring country.");
        }

        // Loop through all enum variables
        for (Country c: Country.values()) {
            System.out.println("Country: " + c);
        }
    }
}

class Address {
    private Country country;
    private String streetName;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Address(Country country, String streetName) {
        this.country = country;
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}

enum Country {
    SWITZERLAND,
    GREECE,
    UK
}
