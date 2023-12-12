package com.example.wwwcuoikyy.services;

import com.example.wwwcuoikyy.dto.EmpJoinPro;
import com.example.wwwcuoikyy.models.Employee;

import java.util.List;

public interface EmpService {
    public List<EmpJoinPro> joinTale(String name);
    public List<Employee> getAllEmp();

    public Employee getEmpById(long id);
    public void addEmp(Employee employee);
}
