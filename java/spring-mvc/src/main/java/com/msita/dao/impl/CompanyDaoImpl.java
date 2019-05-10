package com.msita.dao.impl;

import com.msita.dao.CompanyDao;
import com.msita.entity.CompanyEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("companyDao")
public class CompanyDaoImpl implements CompanyDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void createCompany(final CompanyEntity companyEntity) {
        Session session = sessionFactory.getCurrentSession();
        session.save(companyEntity);
    }

    public List<CompanyEntity> getAllCompanies() {
        Session session = sessionFactory.getCurrentSession();
        Query query =
                session.createQuery("FROM CompanyEntity");
        return query.list();
    }

    public CompanyEntity getCompanyEntity(final int companyId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(CompanyEntity.class, companyId);
    }
}
