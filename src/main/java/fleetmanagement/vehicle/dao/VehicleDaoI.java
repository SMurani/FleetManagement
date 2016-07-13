package fleetmanagement.vehicle.dao;
import fleetmanagement.vehicle.model.Vehicle;

import java.util.List;

public interface VehicleDaoI {
	
    Vehicle add(Vehicle vehicle);
    Vehicle load(Vehicle vehicle);
    List<Vehicle>list (Vehicle filter);
    void delete (Long id);


}
