package fleetmanagement.company.api;

import fleetmanagement.company.bean.CompanyBeanI;
import fleetmanagement.company.model.Company;

import javax.ws.rs.Path;

/**
 * Created by sammy on 7/13/16.
 */
@Path("/company")
public class CompanyApi {


        private CompanyBeanI companyBean;

        @Path("/add")
        public String add(Company company){

            companyBean.add(company);

            return "{success: true}";
        }
}
