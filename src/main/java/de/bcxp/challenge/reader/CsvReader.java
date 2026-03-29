package de.bcxp.challenge.reader;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.List;

import com.opencsv.exceptions.CsvException;
import java.io.IOException;


public class CsvReader {

    //Transforms the weather.csv file to a List filled with String arrays (rows)
    public List<String[]> ReturnCsvAsList (String csvFile) {
        try{
            CSVReader reader = new CSVReader(new FileReader(csvFile));

            List<String[]> csvAsList = reader.readAll();
            return csvAsList;

        } catch (IOException | CsvException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
