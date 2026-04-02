package com.anand.concurrency.models;

import java.util.HashMap;
import java.util.List;

public class Parking extends BaseModel {

    private List<Gates> entryGates;
    private List<Gates> exitGates;

    private List<Floors> parkingFloors;

    //if you want to add status, addit
    private ParkingLotStatus parkingLotStatus;

    public HashMap<VehicleTypes,Integer> allowedVehicleTypes;
    public Parking(){

    }

    public Parking(List<Gates> entryGates, List<Gates> exitGates, List<Floors> parkingFloors, ParkingLotStatus parkingLotStatus, HashMap<VehicleTypes, Integer> allowedVehicleTypes) {
        this.entryGates = entryGates;
        this.exitGates = exitGates;
        this.parkingFloors = parkingFloors;
        this.parkingLotStatus = parkingLotStatus;
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public List<Gates> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gates> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gates> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gates> exitGates) {
        this.exitGates = exitGates;
    }

    public List<Floors> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<Floors> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public HashMap<VehicleTypes, Integer> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(HashMap<VehicleTypes, Integer> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }
}
