package org.example;

import org.example.vehicles.*;

import java.util.ArrayList;

public class PublicTransportService {
    InventoryOfVehicles vehicles = new InventoryOfVehicles();
    public void addVehicles() {
        Bus bus = new Bus("asdf", 10,0,6);
        Tram tram = new Tram("ggfg", 10,7);
        Trolleybus trolleybus = new Trolleybus("hshsh", 40, 10);
        vehicles.addVehicle(tram);
        vehicles.addVehicle(trolleybus);
        vehicles.addVehicle(bus);
    }
    public void howManyVehiclesOfType(){
        System.out.println("Electric: " + vehicles.getElectricVehicles() +
                ", Hybrid: " + vehicles.getHybridVehicles() +
                ", Gas: " + vehicles.getGasVehicles());
    }

}
