package fleetmanagement.vehicle.bean;

import fleetmanagement.vehicle.model.Vehicle;

import java.util.List;

public interface VehicleBeanI {
    void add(Vehicle vehicle);

    List<Vehicle> list();

}
