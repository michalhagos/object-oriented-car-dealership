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
    // gets all vehicles from the dealership and displays them
// this is the first method I implement to test the file loading works
    public void processGetAllVehiclesRequest() {
        // get the full inventory list from the dealership
        ArrayList<Vehicle> allVehicles = dealership.getAllVehicles();
        // pass the list to the helper method to display it
        this.displayVehicles(allVehicles);
    }

    // This Method will ask user for price range and display matching vehicles

    public void processGetByPriceRequest() {

    }

    // This Method will ask user for make and model and display matching vehicles

    public void processGetByMakeModelRequest() {

    }

    // This Method will ask user for year range and display matching vehicles

    public void processGetByYearRequest() {

    }

    // This Method will ask user for color and display matching vehicles

    public void processGetByColorRequest() {

    }

    // This Method will ask user for mileage range and display matching vehicles
/
    public void processGetByMileageRequest() {

    }

    // This Method  will ask user for vehicle type and display matching vehicles

    public void processGetByVehicleTypeRequest() {

    }

    // This Method will ask user for vehicle info and add it to the dealership

    public void processAddVehicleRequest() {

    }

    //This Method will ask user for a vin and remove that vehicle from the dealership

    public void processRemoveVehicleRequest() {

    }







}
