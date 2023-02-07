package org.example.vehicles;

public class Trolleybus extends Vehicle{
    public Trolleybus(String licencePlate, int maxCapacity, int lastServicedate) {
        super(licencePlate, maxCapacity, lastServicedate);
        this.fuelType = FuelType.hybrid;
    }

}
