package com.msita.dao;

import com.msita.entity.CompanyEntity;

import java.util.List;

public interface CompanyDao {

    void createCompany(CompanyEntity companyEntity);

    List<CompanyEntity> getAllCompanies();

    CompanyEntity getCompanyEntity(int companyId);
}
