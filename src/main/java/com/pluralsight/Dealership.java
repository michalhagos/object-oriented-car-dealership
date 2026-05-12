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







}
