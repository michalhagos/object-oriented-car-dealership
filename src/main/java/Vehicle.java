public class Vehicle {

    // creating the fields I need inside the vehicle class
    // unique identifier for the vehicle the VIN number
    private int vin;
    // the year the vehicle was manufactured
    private int year;
    // the make of the vehicle - Ford, Honda, Toyota etc
    private String make;
    // the model of the vehicle example Explorer, Civic
    private String model;
    // the type of vehicle - car, truck, SUV, van
    private String vehicleType;
    // the color of the vehicle
    private String color;
    // how many miles the vehicle has been driven
    private int odometer;
    // the price of the vehicle
    private double price;

    // created a constructor sets all fields when a new vehicle is created
    public Vehicle(int vin, int year, String make, String model,
                   String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }












}
