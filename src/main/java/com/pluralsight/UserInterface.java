package com.pluralsight;

import java.util.ArrayList;

public class UserInterface {

    // the dealership object this User interface will interact with
    // loaded from the inventory.csv file when the app starts
    private Dealership dealership;


    // this method loads the dealership from the CSV file
    // called at the start of display() before the menu runs
    private void init() {
        // create the file manager so we can read the CSV
        DealershipFileManager fileManager = new DealershipFileManager();
        // load the dealership and store it in this class
        this.dealership = fileManager.getDealership();
    }


    // this is helper method that displays a list of vehicles. called by every search
    private void displayVehicles(ArrayList<Vehicle> vehicles) {
        System.out.println();
        // loop through every vehicle in the list and print it
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }










}
