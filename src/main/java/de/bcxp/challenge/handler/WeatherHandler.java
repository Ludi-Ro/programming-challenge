package de.bcxp.challenge.handler;

import java.util.List;

public class WeatherHandler {

    //Calculates the temperature spread of a given data row
    public int calculateRowTempSpread(String[] dayData) {
        int tempSpread = Integer.parseInt(dayData[1])-Integer.parseInt(dayData[2]);
        return tempSpread;
    }

    //Calculates the smallest temperature spread of the weather data set
    public String returnDayWithSmallestTempSpread(List<String[]> weatherData) {
        int dayWithSmallestTempSpread = 1;
        for (int i = 1; i < weatherData.size(); i++) {
            if (calculateRowTempSpread(weatherData.get(i))
                    < calculateRowTempSpread(weatherData.get(dayWithSmallestTempSpread))) {
                dayWithSmallestTempSpread = i;
            }
        }
        return Integer.toString(dayWithSmallestTempSpread);
    }
}
