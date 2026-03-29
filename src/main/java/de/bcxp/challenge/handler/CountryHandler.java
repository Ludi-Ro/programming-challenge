package de.bcxp.challenge.handler;

import java.util.List;

public class CountryHandler {

    //Calculates the Population density of a given data row
    public double calculatePopulationDensityOfRow(String[] singleCountryData) {

        //Filters and replaces that one wierd number-format
        if(singleCountryData[3].contains(",")) {
            singleCountryData[3] = singleCountryData[3].replace(".","");
            singleCountryData[3] = singleCountryData[3].replace(",",".");
        }
        double populationDensity = Double.parseDouble(singleCountryData[3]) / Double.parseDouble(singleCountryData[4]);
        return populationDensity;
    }

    //Calculates the country with the highest population per square kilometre
    public String returnCountryWithHighestPopDensity(List<String[]> countryData) {
        int countryWithHighestPopDensity = 1;
        for (int i = 1; i < countryData.size(); i++) {
            if (calculatePopulationDensityOfRow(countryData.get(i))
                    > calculatePopulationDensityOfRow(countryData.get(countryWithHighestPopDensity))) {
                countryWithHighestPopDensity = i;
            }
        }
        return countryData.get(countryWithHighestPopDensity)[0];
    }

}
