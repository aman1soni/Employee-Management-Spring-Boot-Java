package com.nagarro.employeemgmtsprinboot.services;

import com.nagarro.employeemgmtsprinboot.dao.EmployeeDao;
import com.nagarro.employeemgmtsprinboot.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This is service class. Used to access Dao layer.
 */

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public Employee findEmployeebyId(int eid) {
        return this.employeeDao.findById(eid);
    }

    public Employee addEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }
}
