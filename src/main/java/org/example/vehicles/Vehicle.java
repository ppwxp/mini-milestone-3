package org.example.vehicles;

import org.example.vehicles.FuelType;

import java.util.UUID;

public abstract class Vehicle {
    protected String uniqueID = UUID.randomUUID().toString();
    protected String licencePlate;
    protected int maxCapacity;
    protected VehicleStatus status;
    protected FuelType fuelType;

    public Vehicle(String licencePlate, int maxCapacity, int lastServicedate) {
        this.licencePlate = licencePlate;
        this.maxCapacity = maxCapacity;
        this.lastServicedate = lastServicedate;
        if (lastServicedate >= 0 && lastServicedate <= 6 ){
            this.status = VehicleStatus.inOperation;
        } else if (lastServicedate >= 7 && lastServicedate <= 36) {
            this.status = VehicleStatus.needRepair;
        } else if (lastServicedate <= 37) {
            this.status = VehicleStatus.forScrap;
        }else{
            throw new RuntimeException("Bad service date");
        }

    }
    protected int lastServicedate;

}
