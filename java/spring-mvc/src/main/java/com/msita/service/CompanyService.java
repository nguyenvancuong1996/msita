package com.msita.service;

import com.msita.entity.CompanyEntity;

import java.util.List;

public interface CompanyService {

    void createCompany(CompanyEntity companyEntity);

    List<CompanyEntity> getAllCompanies();

    CompanyEntity getCompanyEntity(int companyId);
}
