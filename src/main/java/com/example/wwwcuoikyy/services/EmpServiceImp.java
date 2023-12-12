package com.example.wwwcuoikyy.services;

import com.example.wwwcuoikyy.dto.EmpJoinPro;
import com.example.wwwcuoikyy.models.Employee;
import com.example.wwwcuoikyy.repos.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImp implements EmpService{

    @Autowired
    private EmpRepo empRepo;
    @Override
    public List<EmpJoinPro> joinTale(String name) {
        return empRepo.joinTable(name);
    }

    @Override
    public List<Employee> getAllEmp() {
        return empRepo.findAll();
    }

    @Override
    public Employee getEmpById(long id) {
        return empRepo.findById(id).get();
    }

    @Override
    public void addEmp(Employee employee) {
        empRepo.save(employee);
    }
}
