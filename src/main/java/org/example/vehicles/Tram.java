package org.example.vehicles;

public class Tram extends Vehicle{
    public Tram(String licencePlate, int maxCapacity, int lastServicedate) {
        super(licencePlate, maxCapacity, lastServicedate);
        this.fuelType = FuelType.electric;
    }
    private int yearsInService = 0;
}
