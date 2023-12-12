package com.example.wwwcuoikyy.controller;

import com.example.wwwcuoikyy.dto.EmpJoinPro;
import com.example.wwwcuoikyy.models.Employee;
import com.example.wwwcuoikyy.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Client")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/ListEmpJoinPro")
    public String test(Model model){
        Employee emp = new Employee();
        List<EmpJoinPro> lst = empService.joinTale("");
        List<Employee> emps = empService.getAllEmp();
        model.addAttribute("list", lst);
        model.addAttribute("lst", emps);
        model.addAttribute("employee", emp);

        return "Client/empJoinPro";
    }
    @PostMapping("/actionGetName")
    public String addAction(@ModelAttribute("employee") Employee employee, Model model){
        Employee emp = new Employee();
        Employee empp= empService.getEmpById(employee.getId());
        List<EmpJoinPro> lst = empService.joinTale(empp.getName());
        List<Employee> emps = empService.getAllEmp();
        model.addAttribute("list", lst);
        model.addAttribute("lst", emps);
        model.addAttribute("employee", emp);

        return "Client/empJoinPro";
    }

}
