package fleetmanagement.company.dao;

import fleetmanagement.company.model.Company;

import java.util.List;

/**
 * Created by sammy on 7/13/16.
 */
public interface CompanyDaoI {
    Company add(Company company);

    Company load(Company company);

    List<Company> list(Company filter);

    void delete(Long companyId);
}
