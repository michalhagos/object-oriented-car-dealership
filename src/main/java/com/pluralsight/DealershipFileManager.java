package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {

    // the path to the inventory CSV file that holds the dealership and vehicle data

    private final String FILE_PATH = "src/main/resources/inventory.csv";

    // reads the inventory CSV file and builds a fully loaded Dealership object
// returns the dealership with all its vehicles populated from the file
    public Dealership getDealership() {
        // the dealership object we will build and return
        Dealership theDealership = null;

        try {
            // open the CSV file for reading line by line
            BufferedReader inventoryReader = new BufferedReader(new FileReader(FILE_PATH));

        } catch (Exception e) {
            System.out.println("Error reading dealership file: " + e.getMessage());
        }

        return theDealership;
    }








}
