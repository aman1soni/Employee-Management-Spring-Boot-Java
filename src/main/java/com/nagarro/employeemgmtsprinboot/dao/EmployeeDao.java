package com.nagarro.employeemgmtsprinboot.dao;

import com.nagarro.employeemgmtsprinboot.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * This is the Repository interface which extends JpaRepository
 * and used methods to perform operation.
 */

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    public Employee findById(int eid);

}
