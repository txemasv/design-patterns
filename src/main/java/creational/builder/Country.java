package creational.builder;

public class Country {

    private String name;
    private String capital;
    private String language;
    private String religion;
    private String currency;
    private double area;
    private long population;

    private Country(CountryBuilder builder) {
        name = builder.name;
        capital = builder.capital;
        language = builder.language;
        religion = builder.religion;
        currency = builder.currency;
        area = builder.area;
        population = builder.population;
    }

    public static class CountryBuilder {
        private String name;
        private String capital;
        private String language;
        private String religion;
        private String currency;
        double area;
        long population;

        public CountryBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CountryBuilder capital(String name) {
            this.capital = name;
            return this;
        }

        public CountryBuilder language(String name) {
            this.language = name;
            return this;
        }

        public CountryBuilder religion(String name) {
            this.religion = name;
            return this;
        }

        public CountryBuilder currency(String name) {
            this.currency = name;
            return this;
        }

        public CountryBuilder area(double km2) {
            this.area = km2;
            return this;
        }

        public CountryBuilder population(long quantity) {
            this.population = quantity;
            return this;
        }

        public Country build() {
            if (name == null) {
                throw new IllegalStateException("The value of 'name' can't be null");
            }
            if (capital == null) {
                throw new IllegalStateException("The value of 'capital' can't be null");
            }
            if (language == null) {
                throw new IllegalStateException("The value of 'language' can't be null");
            }
            if (religion == null) {
                throw new IllegalStateException("The value of 'religion' can't be null");
            }
            if (currency == null) {
                throw new IllegalStateException("The value of 'currency' can't be null");
            }
            return new Country(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getLanguage() {
        return language;
    }

    public String getReligion() {
        return religion;
    }

    public String getCurrency() {
        return currency;
    }

    public double getArea() {
        return area;
    }

    public long getPopulation() {
        return population;
    }
}
