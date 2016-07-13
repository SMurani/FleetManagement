package fleetmanagement.vehicle.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="vehicle_vehicles")

public class Vehicle implements Serializable{


		@Id@GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
		
		@NotNull
		@Column(name="vehicle_model")
        private String vehicleModel;
		
		@Column(name = "reg_no")
		@NotNull
        private String regNo;
		
		@Column(name = "vehicle_capacity")
		@NotNull
        private int capacity;
		
		@Column(name = "acuisition_date")
		@NotNull
        private String acuisitionDate;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getVehicleModel() {
            return vehicleModel;
        }

        public void setVehicleModel(String vehicleModel) {
            this.vehicleModel = vehicleModel;
        }

        public String getRegNo() {
            return regNo;
        }

        public void setRegNo(String regNo) {
            this.regNo = regNo;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public String getAcuisitionDate() {
            return acuisitionDate;
        }

        public void setAcuisitionDate(String acuisitionDate) {
            this.acuisitionDate = acuisitionDate;
        }



}
