package com.msita.dao.impl;

import com.msita.dao.EmployeeDao;
import com.msita.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void createEmployee(final EmployeeEntity employeeEntity) {
        Session session = sessionFactory.getCurrentSession();
        session.save(employeeEntity);
    }
}
