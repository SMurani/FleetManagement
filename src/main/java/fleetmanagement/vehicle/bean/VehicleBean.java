package fleetmanagement.vehicle.bean;

import fleetmanagement.vehicle.dao.VehicleDaoI;
import fleetmanagement.vehicle.model.Vehicle;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class VehicleBean implements VehicleBeanI{

    @Inject
    private VehicleDaoI vehicleDao;

    public void add(Vehicle vehicle){
        if(vehicle == null || vehicle.getVehicleModel() == null ||vehicle.getRegNo() == null)
            return;

        vehicleDao.add(vehicle);
    }

    public List<Vehicle> list(){
        return vehicleDao.list(new Vehicle());
    }

	

}
