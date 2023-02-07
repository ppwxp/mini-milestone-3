package org.example.vehicles;

public class Bus extends Vehicle{
    private final int pollutionIndicator;
    public Bus(String licencePlate, int maxCapacity, int lastServicedate, int pollutionIndicator) {
        super(licencePlate, maxCapacity, lastServicedate);
        this.fuelType = FuelType.gas;
        this.pollutionIndicator = pollutionIndicator;
        if (pollutionIndicator > 5) {
            this.status = VehicleStatus.inOperation;
        } else if (pollutionIndicator >= 3 && pollutionIndicator <= 5 && lastServicedate > 12) {
            this.status = VehicleStatus.needRepair;
        }else{
            this.status = VehicleStatus.forScrap;
        }
    }






}
