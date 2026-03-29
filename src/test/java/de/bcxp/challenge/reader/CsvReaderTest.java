package de.bcxp.challenge.reader;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvReaderTest {

    @Test
    void LoadWeatherCsv() {
        CsvReader reader = new CsvReader();
        List<String[]> weatherData = reader.ReturnCsvAsList("src/main/resources/de/bcxp/challenge/weather.csv");
        assertEquals("88", weatherData.get(1)[1], "Max temperature of the first Day is not correct" );
    }
}
