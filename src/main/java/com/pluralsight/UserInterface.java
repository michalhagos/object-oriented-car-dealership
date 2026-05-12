package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        // ask the user for the minimum price
        System.out.print("Enter minimum price: ");
        double min = Double.parseDouble(scanner.nextLine());

        // ask the user for the maximum price
        System.out.print("Enter maximum price: ");
        double max = Double.parseDouble(scanner.nextLine());

        // get matching vehicles from the dealership and display them
        ArrayList<Vehicle> results = dealership.getVehiclesByPrice(min, max);
        this.displayVehicles(results);
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
    // starts the application and runs the menu loop
// called from Program to kick everything off
    public void display() {
        // load the dealership from the CSV file before showing the menu
        this.init();

        // create a scanner to read the user's menu choices
        Scanner theScanner = new Scanner(System.in);

        // this controls whether the menu keeps running
        boolean menuRunning = true;

        while (menuRunning) {
            // show the menu options to the user
            System.out.println("\n=== Car Dealership Menu ===");
            System.out.println("1 - Find vehicles by price");
            System.out.println("2 - Find vehicles by make/model");
            System.out.println("3 - Find vehicles by year range");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find vehicles by mileage");
            System.out.println("6 - Find vehicles by type");
            System.out.println("7 - List all vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("99 - Quit");
            System.out.print("Enter option: ");

            // read the user's choice safely
            // if they type something that is not a number we handle it gracefully
            int option;
            if (theScanner.hasNextInt()) {
                // user typed a valid number so we take it
                option = theScanner.nextInt();
                // eat the leftover newline so the next scanner read works correctly
                theScanner.nextLine();
            } else {
                // user typed something invalid so we discard it
                theScanner.nextLine();
                // set option to -1 so the switch hits the default case
                option = -1;
            }

            // call the correct method based on what the user chose
            switch (option) {
                case 1:
                    this.processGetByPriceRequest();
                    break;
                case 2:
                    this.processGetByMakeModelRequest();
                    break;
                case 3:
                    this.processGetByYearRequest();
                    break;
                case 4:
                    this.processGetByColorRequest();
                    break;
                case 5:
                    this.processGetByMileageRequest();
                    break;
                case 6:
                    this.processGetByVehicleTypeRequest();
                    break;
                case 7:
                    this.processGetAllVehiclesRequest();
                    break;
                case 8:
                    this.processAddVehicleRequest();
                    break;
                case 9:
                    this.processRemoveVehicleRequest();
                    break;
                case 99:
                    // stop the menu loop and say goodbye
                    menuRunning = false;
                    System.out.println("Have a great day!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }






}
