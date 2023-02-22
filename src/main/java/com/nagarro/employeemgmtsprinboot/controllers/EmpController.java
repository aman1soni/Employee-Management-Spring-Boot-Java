package com.nagarro.employeemgmtsprinboot.controllers;

import com.nagarro.employeemgmtsprinboot.dao.EmployeeDao;
import com.nagarro.employeemgmtsprinboot.models.Employee;
import com.nagarro.employeemgmtsprinboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * This is the REST Controller class. Data are return as
 * ResponseEntity to another Application i.e. service.
 * Defined, methods basis on required request mapping.
 */

@RestController
public class EmpController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/dashboard")
    public ResponseEntity<List<Employee>> getEmployees()
    {
        List<Employee> employees = this.employeeDao.findAll();
        if (employees.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(employees));
    }

    @GetMapping("/getemployee/{eid}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int eid){
        //check
        System.out.println("EID is"+eid);
        Employee employee = this.employeeService.findEmployeebyId(eid);
        if(employee==null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(employee));
    }

    @PostMapping("/addemployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){

        Employee employee_ = null;
        try {
            employee_  = employeeService.addEmployee(employee);
            return ResponseEntity.of(Optional.of(employee_));
        }
        catch(Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/updateemployee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee employee_ = null;
        try {
            employee_  = employeeService.updateEmployee(employee);
            return ResponseEntity.of(Optional.of(employee_));
        }
        catch(Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
