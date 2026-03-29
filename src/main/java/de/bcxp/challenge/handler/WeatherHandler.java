package de.bcxp.challenge.handler;

import java.util.List;

public class WeatherHandler {

    //List WeatherData = WeatherData

    //Calculates the temperature spread of a given data row
    public int CalculateRowTempSpread(String[] dayData) {
        int tempSpread = Integer.parseInt(dayData[1])-Integer.parseInt(dayData[2]);
        return tempSpread;
    }

    //Calculates the smallest temperature spread of the weather data set
    public String ReturnDayWithSmallestTempSpread (List<String[]> weatherData) {
        int dayWithSmallestTempSpread = 1;
        for (int i = 1; i < weatherData.size(); i++) {
            if (CalculateRowTempSpread(weatherData.get(i))
                    < CalculateRowTempSpread(weatherData.get(dayWithSmallestTempSpread))) {
                dayWithSmallestTempSpread = i;
            }
        }
        return Integer.toString(dayWithSmallestTempSpread);
    }
}
