package fleetmanagement.company.model;
//import fleetmanagement.common.model;

import fleetmanagement.common.model.Address;

/**
 * Created by sammy on 7/13/16.
 */
public class Company {



        private String name;

        private String regNo;

        private Address address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRegNo() {
            return regNo;
        }

        public void setRegNo(String regNo) {
            this.regNo = regNo;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

}
