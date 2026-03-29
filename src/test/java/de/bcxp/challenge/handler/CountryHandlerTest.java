package de.bcxp.challenge.handler;

import de.bcxp.challenge.reader.CsvReader;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryHandlerTest {

    CsvReader reader = new CsvReader();
    List<String[]> countryData = reader.ReturnCsvAsList("src/main/resources/de/bcxp/challenge/countries.csv", ';');
    CountryHandler countryHandler = new CountryHandler();

    @Test
    void getPopulationDensity() {
        double popDensity = countryHandler.CalculatePopulationDensityOfRow(countryData.get(1));
        assertEquals(106.44565022956293, popDensity, "Population density not calculated correctly");
    }

    @Test
    void getCountryWithHighestPopDensity() {
        String countryWithHighestPopDensity = countryHandler.ReturnCountryWithHighestPopDensity(countryData);
        assertEquals("Malta", countryWithHighestPopDensity, "Country with highest population density not chosen correctly");
    }
}
