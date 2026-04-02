package com.anand.concurrency.models;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Parking extends BaseModel {

    private List<Gates> entryGates;
    private List<Gates> exitGates;
    private List<Floors> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private Map<VehicleTypes, Integer> allowedVehicleTypes;

    public Parking() {
        this.allowedVehicleTypes = new EnumMap<>(VehicleTypes.class);
    }

    public Parking(List<Gates> entryGates, List<Gates> exitGates, List<Floors> parkingFloors,
                   ParkingLotStatus parkingLotStatus, Map<VehicleTypes, Integer> allowedVehicleTypes) {
        this.entryGates = entryGates;
        this.exitGates = exitGates;
        this.parkingFloors = parkingFloors;
        this.parkingLotStatus = parkingLotStatus;
        setAllowedVehicleTypes(allowedVehicleTypes);
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

    public Map<VehicleTypes, Integer> getAllowedVehicleTypes() {
        return new EnumMap<>(allowedVehicleTypes);
    }

    public void setAllowedVehicleTypes(Map<VehicleTypes, Integer> allowedVehicleTypes) {
        this.allowedVehicleTypes = new EnumMap<>(VehicleTypes.class);
        if (allowedVehicleTypes != null) {
            this.allowedVehicleTypes.putAll(allowedVehicleTypes);
        }
    }
}
