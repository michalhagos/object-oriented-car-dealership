package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    // adding private fields to the dealership class
    // the name of the dealership
    private String name;
    // the address of the dealership
    private String address;
    // the phone number of the dealership
    private String phone;
    // the list of all vehicles in the dealership inventory
    private ArrayList<Vehicle> inventory;

    // added a constructor that sets the dealership info and initializes the empty inventory list
// our inventory must be instantiated here so it is ready to hold vehicles
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        // initialize the inventory list so it is ready to hold vehicles
        this.inventory = new ArrayList<>();
    }

    // added setters and getters
    // returns the name of the dealership
    public String getName() {
        return name;
    }

    // updates the name of the dealership
    public void setName(String name) {
        this.name = name;
    }

    // returns the address of the dealership
    public String getAddress() {
        return address;
    }

    // updates the address of the dealership
    public void setAddress(String address) {
        this.address = address;
    }

    // returns the phone number of the dealership
    public String getPhone() {
        return phone;
    }

    // updates the phone number of the dealership
    public void setPhone(String phone) {
        this.phone = phone;
    }


    // returns the full inventory list of all vehicles
    public ArrayList<Vehicle> getAllVehicles() {
        return this.inventory;
    }

    // adds a new vehicle to the dealership inventory
    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    // here are getters that need to return an array list but set to null for right now

    // returns vehicles within the given price range .returning null for now

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    // returns vehicles matching the given make and model returns null for now

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    // returns vehicles within the given year range. returns null for now

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        return null;
    }

    // returns vehicles matching the given color. returns null for now

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    // returns vehicles within the given mileage range. returns null for now

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    // returns vehicles matching the given vehicle type. returns null for now

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }


    // removes a vehicle from the dealership inventory

    public void removeVehicle(Vehicle vehicle) {

    }










}
