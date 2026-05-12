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







}
