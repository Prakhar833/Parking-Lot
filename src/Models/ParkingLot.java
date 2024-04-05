package Models;

import Stratergies.BillingStratergy;
import Stratergies.ParkingPlaceAllotmentStratergy;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;

    private ParkingPlaceAllotmentStratergy allotmentStratergy;

    private BillingStratergy billingStratergy;

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public ParkingPlaceAllotmentStratergy getAllotmentStratergy() {
        return allotmentStratergy;
    }

    public void setAllotmentStratergy(ParkingPlaceAllotmentStratergy allotmentStratergy) {
        this.allotmentStratergy = allotmentStratergy;
    }

    public BillingStratergy getBillingStratergy() {
        return billingStratergy;
    }

    public void setBillingStratergy(BillingStratergy billingStratergy) {
        this.billingStratergy = billingStratergy;
    }
}
