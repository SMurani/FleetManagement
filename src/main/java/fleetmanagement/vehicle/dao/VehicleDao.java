package fleetmanagement.vehicle.dao;
import java.util.ArrayList;
import java.util.List;
import fleetmanagement.vehicle.model.Vehicle;

public class VehicleDao implements VehicleDaoI{

  


    public void delete(Long id) {

    }
    public List<Vehicle> list(Vehicle filter) {
        List<Vehicle>  vehicles = new ArrayList<Vehicle>();
        Vehicle vehicle = new Vehicle();

        vehicle.setRegNo("KCH 123W");
        vehicle.setCapacity(24);
        vehicle.setAcuisitionDate("12.05.2015");
        vehicle.setVehicleModel("Nissan");
        vehicles.add(vehicle);

        vehicle = new Vehicle();
        vehicle.setRegNo("KCH 123W");
        vehicle.setCapacity(24);
        vehicle.setAcuisitionDate("12.05.2015");
        vehicle.setVehicleModel("Nissan");
        vehicles.add(vehicle);



        return vehicles;
    }

	public Vehicle add(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	public Vehicle load(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}
}
