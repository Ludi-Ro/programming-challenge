package de.bcxp.challenge.Reader;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.List;

import com.opencsv.exceptions.CsvException;
import java.io.IOException;


public class CsvReader {
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
