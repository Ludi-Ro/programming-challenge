package de.bcxp.challenge.handler;

import java.util.List;

public class WeatherHandler {

    //List WeatherData = WeatherData

    //Calucaltes the Temperatur Spread of a given data row
    public int CalculateRowTempSpread(String[] dayData) {
        int tempSpread = Integer.parseInt(dayData[1])-Integer.parseInt(dayData[2]);
        return tempSpread;
    }

    //Calucaltes the smallest Temperatur Spread of the weather data set
    public String ReturnDayWithSmallestTempSpread (List<String[]> weatherData) {
        String dayWithSmallestTempSpread = "1";
        for (int i = 1; i < weatherData.size(); i++) {
            if (CalculateRowTempSpread(weatherData.get(i))
                    < CalculateRowTempSpread(weatherData.get(Integer.parseInt(dayWithSmallestTempSpread)))) {
                dayWithSmallestTempSpread = Integer.toString(i);
            }
        }
        return dayWithSmallestTempSpread;
    }
}
