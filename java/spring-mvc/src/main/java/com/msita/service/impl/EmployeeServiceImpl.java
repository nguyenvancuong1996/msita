package com.msita.service.impl;

import com.msita.dao.EmployeeDao;
import com.msita.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    public void createEmployee(final EmployeeEntity employeeEntity) {
        employeeDao.createEmployee(employeeEntity);
    }
}
