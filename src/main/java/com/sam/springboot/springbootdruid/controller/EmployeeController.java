package com.sam.springboot.springbootdruid.controller;

import com.sam.springboot.springbootdruid.Mapper.EmployeeMapper;
import com.sam.springboot.springbootdruid.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id){
        return employeeMapper.getEmployeeById(id);
    }
}
