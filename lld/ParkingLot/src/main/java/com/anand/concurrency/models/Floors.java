package com.anand.concurrency.models;

import java.util.List;

public class Floors extends BaseModel{

   private int floorNumber;

  private  List<Slots> slotsList;
  //private   List<VehicleTypes> allowedVehicleTypes;
   private FloorStatus floorStatus;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Slots> getSlotsList() {
        return slotsList;
    }

    public void setSlotsList(List<Slots> slotsList) {
        this.slotsList = slotsList;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }
}
