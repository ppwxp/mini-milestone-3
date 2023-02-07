package org.example;

public class Main {
    public static void main(String[] args) {

        PublicTransportService publicTransportService = new PublicTransportService();
        publicTransportService.addVehicles();
        publicTransportService.howManyVehiclesOfType();
    }
}