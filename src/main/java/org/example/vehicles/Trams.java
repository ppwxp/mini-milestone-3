package org.example.vehicles;

public class Trams extends Vehicle{
    public Trams(String licencePlate, int maxCapacity, int lastServicedate) {
        super(licencePlate, maxCapacity, lastServicedate);
        this.fuelType = FuelType.electric;
    }
    private int yearsInService = 0;
}
