package com.example.wwwcuoikyy.services;

import com.example.wwwcuoikyy.dto.EmpJoinPro;
import com.example.wwwcuoikyy.repos.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImp implements EmpService{

    @Autowired
    private EmpRepo empRepo;
    @Override
    public List<EmpJoinPro> joinTale() {
        return empRepo.joinTable();
    }
}
