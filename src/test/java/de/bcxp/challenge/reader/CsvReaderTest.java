package de.bcxp.challenge.reader;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvReaderTest {

    CsvReader reader = new CsvReader();

    @Test
    void LoadWeatherCsv() {

        List<String[]> weatherData = reader.ReturnCsvAsList("src/main/resources/de/bcxp/challenge/weather.csv", ',');
        assertEquals("88", weatherData.get(1)[1], "Max temperature of the first Day is not correct" );
    }

    @Test
    void LoadCountriesCsv() {
        List<String[]> countryData = reader.ReturnCsvAsList("src/main/resources/de/bcxp/challenge/countries.csv", ';');
        assertEquals("8926000", countryData.get(1)[3], "Population of Austria is not correct" );
    }
}
