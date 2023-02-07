package org.example.vehicles;

import java.util.ArrayList;

public class InventoryOfVehicles {

    private int electricVehicles = 0;
    private int gasVehicles = 0;
    private int hybridVehicles = 0;
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle (Vehicle vehicle){
        addVehiclesTypes(vehicle);
        vehicles.add(vehicle);

    }
    public void addVehiclesTypes(Vehicle vehicle){

            if (vehicle.getFuelType() == FuelType.electric){
                electricVehicles += 1;
            } else if (vehicle.getFuelType() == FuelType.hybrid) {
                hybridVehicles += 1;
            } else {
                gasVehicles += 1;
            }
    }
    public int getElectricVehicles() {
        return electricVehicles;
    }

    public int getGasVehicles() {
        return gasVehicles;
    }

    public int getHybridVehicles() {
        return hybridVehicles;
    }

}
