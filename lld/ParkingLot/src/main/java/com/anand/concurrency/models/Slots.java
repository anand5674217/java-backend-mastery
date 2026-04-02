package com.anand.concurrency.models;

import java.util.ArrayList;
import java.util.List;

public class Slots extends BaseModel {
    private int slotNumber;
    private SlotStatus slotStatus;
    private List<VehicleTypes> allowedVehicleTypes;

    public Slots() {
        this.allowedVehicleTypes = new ArrayList<>();
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public SlotStatus getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(SlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }

    public List<VehicleTypes> getAllowedVehicleTypes() {
        return List.copyOf(allowedVehicleTypes);
    }

    public void setAllowedVehicleTypes(List<VehicleTypes> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes == null ? new ArrayList<>() : new ArrayList<>(allowedVehicleTypes);
    }
}
