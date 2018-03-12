package creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountryTest {

    @Test
    public void countryBuilder_Should_Build_Country_Instance() {
        String name = "Spain";
        String capital = "Madrid";
        String language = "Spanish";
        String religion = "Catholic";
        String currency = "Euro";
        double area = 505.990D;
        long population = 46354321L;

        Country country = new Country.CountryBuilder()
                .name(name)
                .capital(capital)
                .language(language)
                .religion(religion)
                .currency(currency)
                .area(area)
                .population(population)
                .build();

        assertEquals(country.getName(), name);
        assertEquals(country.getCapital(), capital);
        assertEquals(country.getLanguage(), language);
        assertEquals(country.getReligion(), religion);
        assertEquals(country.getCurrency(), currency);
        assertEquals(Double.valueOf(country.getArea()), Double.valueOf(area));
        assertEquals(country.getPopulation(), population);
    }
}
