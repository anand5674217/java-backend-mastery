package com.anand.concurrency.models;

import java.util.Date;

public class Ticket extends BaseModel {
    private Vehicle vehicle;
    private Date entryTime;
    private Gates gate;
    private Operator operator;
    private Floors parkingFloors;
    private Slots parkingSlot;
    private FeeCalculationStrategy feeCalculationStrategy;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return entryTime == null ? null : new Date(entryTime.getTime());
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime == null ? null : new Date(entryTime.getTime());
    }

    public Gates getGate() {
        return gate;
    }

    public void setGate(Gates gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Floors getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(Floors parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public Slots getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(Slots parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public FeeCalculationStrategy getFeeCalculationStrategy() {
        return feeCalculationStrategy;
    }

    public void setFeeCalculationStrategy(FeeCalculationStrategy feeCalculationStrategy) {
        this.feeCalculationStrategy = feeCalculationStrategy;
    }
}
