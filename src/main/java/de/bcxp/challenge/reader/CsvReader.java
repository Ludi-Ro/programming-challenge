package de.bcxp.challenge.reader;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.IOException;


public class CsvReader {

    //Transforms the weather.csv file to a List filled with String arrays (rows)
    public List<String[]> ReturnCsvAsList (String csvFile, char separator) {
        try{
            CSVParser parser = new CSVParserBuilder()
                    .withSeparator(separator)
                    .build();

            CSVReader reader = new CSVReaderBuilder(new FileReader(csvFile))
                    .withCSVParser(parser)
                    .build();

            List<String[]> csvAsList = reader.readAll();
            return csvAsList;

        } catch (IOException | CsvException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
