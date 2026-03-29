package de.bcxp.challenge;

import de.bcxp.challenge.reader.CsvReader;
import de.bcxp.challenge.handler.WeatherHandler;
import de.bcxp.challenge.handler.CountryHandler;

import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        CsvReader reader = new CsvReader();
        
        //Task 1
        List<String[]> weatherData = reader.ReturnCsvAsList("src/main/resources/de/bcxp/challenge/weather.csv", ',');

        WeatherHandler weatherHandler = new WeatherHandler();
        String dayWithSmallestTempSpread = weatherHandler.ReturnDayWithSmallestTempSpread(weatherData);
        System.out.printf("Day with smallest temperature spread: %s%n", dayWithSmallestTempSpread);

        //Task 2
        List<String[]> countryData = reader.ReturnCsvAsList("src/main/resources/de/bcxp/challenge/countries.csv", ';');

        CountryHandler countryHandler = new CountryHandler();
        String countryWithHighestPopDensity = countryHandler.ReturnCountryWithHighestPopDensity(countryData);
        System.out.printf("Country with highest population density: %s%n", countryWithHighestPopDensity);
    }
}
