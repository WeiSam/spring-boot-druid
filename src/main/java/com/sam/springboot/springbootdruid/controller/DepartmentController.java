package com.sam.springboot.springbootdruid.controller;

import com.sam.springboot.springbootdruid.Mapper.DepartmentMapper;
import com.sam.springboot.springbootdruid.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartmentById(@PathVariable("id") Integer id){
        return departmentMapper.getDepartmentById(id);
    }

    @GetMapping("/dept")
    public Department insertDepartment(Department department){
        departmentMapper.insertDepartment(department);
        return department;
    }

    @GetMapping("/dept/delete/{id}")
    public int deleteDepartmentById(@PathVariable("id") Integer id){
        return departmentMapper.deleteDepartmentById(id);
    }
}
