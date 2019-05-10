package com.msita.service.impl;

import com.msita.dao.CompanyDao;
import com.msita.entity.CompanyEntity;
import com.msita.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Transactional
    public void createCompany(final CompanyEntity companyEntity) {
        companyDao.createCompany(companyEntity);
    }

    @Transactional
    public List<CompanyEntity> getAllCompanies() {
        return companyDao.getAllCompanies();
    }

    @Transactional
    public CompanyEntity getCompanyEntity(final int companyId) {
        return companyDao.getCompanyEntity(companyId);
    }
}
