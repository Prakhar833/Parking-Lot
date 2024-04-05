package Models;

import java.util.List;

public class ParkingFloor {
    private int FloorNumber;
    private List<ParkingSlot> parkingSlot;

    public int getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        FloorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(List<ParkingSlot> parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
}
