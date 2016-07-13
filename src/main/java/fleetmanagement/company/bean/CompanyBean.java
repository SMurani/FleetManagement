package fleetmanagement.company.bean;

import fleetmanagement.company.dao.CompanyDaoI;
import fleetmanagement.company.model.Company;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by sammy on 7/13/16.
 */
@Stateless
public class CompanyBean implements CompanyBeanI {
    @Inject
    private CompanyDaoI companyDao;


    public void add(Company company){
        if(company == null || company.getName() == null)
            return;

        companyDao.add(company);

    }

}
