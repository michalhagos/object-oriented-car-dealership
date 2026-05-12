# Object-Oriented Car Dealership

## Description
A console-based car dealership application built with Java. This app simulates a
sales manager's desk tool that allows users to search, add, and remove vehicles
from a dealership's inventory. The inventory is stored and updated in a CSV file.

## How It Works
When the application starts it reads the inventory from a CSV file and loads it
into memory. The user is presented with a menu to interact with the dealership's
inventory. Any changes made (adding or removing vehicles) are automatically saved
back to the CSV file.

## Features
- Search vehicles by price range
- Search vehicles by make and model
- Search vehicles by year range
- Search vehicles by color
- Search vehicles by mileage range
- Search vehicles by vehicle type (car, truck, SUV, van)
- List all vehicles in inventory
- Add a new vehicle to inventory
- Remove a vehicle from inventory

## Classes
- **Vehicle** — holds all information about a single vehicle
- **Dealership** — holds dealership info and manages the vehicle inventory
- **DealershipFileManager** — reads and writes the inventory CSV file
- **UserInterface** — handles all user input and displays the menu
- **Program** — entry point of the application

## Inventory File Format
The inventory is stored in a pipe-delimited CSV file located at `src/main/resources/inventory.csv`

The first line contains the dealership information:
M family Used Cars|111 Old Benbrook Rd|817-555-5555`

Every line after that represents one vehicle:
`10112|2023|Toyota|Camry|car|White|15234|24995.00`

The columns are in this order:
`VIN | Year | Make | Model | Type | Color | Odometer | Price`

## How To Run
1. Clone the repository
   `git clone https://github.com/michalhagos/object-oriented-car-dealership.git
2. Open the project in IntelliJ
3. Run `Program.java`
4. Use the menu to interact with the dealership inventory

## Menu Options
1 - Find vehicles by price
2 - Find vehicles by make/model
3 - Find vehicles by year range
4 - Find vehicles by color
5 - Find vehicles by mileage
6 - Find vehicles by type
7 - List all vehicles
8 - Add a vehicle
9 - Remove a vehicle
99 - Quit

## Technologies Used
- Java
- Maven
- IntelliJ IDEA

