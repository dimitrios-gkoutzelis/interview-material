package main.java.interview.designpatterns;

public class BuilderPattern {

    public static class Builder {
        private String name;
        private String age;
        private String city;
        private String country;
        private String continent;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(String age) {
            this.age = age;
            return this;
        }


        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        /**
         * This guarantees that we have the minimum fields required to make this class and fail otherwise
         */
        public BuilderPattern build() {

            if (name == null) throw new IllegalStateException("Name is mandatory");

            return new BuilderPattern(name, age, city, country);
        }
    }

    private String name;
    private String age;
    private String city;
    private String country;
    private String continent = ""; // Optional

    public BuilderPattern(String name, String age, String city, String country) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
