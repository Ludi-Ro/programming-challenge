package de.bcxp.challenge.handler;

import de.bcxp.challenge.reader.CsvReader;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherHandlerTest {

    CsvReader reader = new CsvReader();
    List<String[]> weatherData = reader.ReturnCsvAsList("src/main/resources/de/bcxp/challenge/weather.csv", ',');
    WeatherHandler weatherHandler = new WeatherHandler();

    @Test
    void getTemperatureSpread() {
        int tempSpread = weatherHandler.CalculateRowTempSpread(weatherData.get(1));
        assertEquals(29, tempSpread, "Temperature spread not calculated correctly");
    }

    @Test
    void getDayWithSmallestTempSpread() {
        String dayWithSmallestTempSpread = weatherHandler.ReturnDayWithSmallestTempSpread(weatherData);
        assertEquals("14", dayWithSmallestTempSpread, "Day with smallest temperature spread not chosen correctly");
    }
}
