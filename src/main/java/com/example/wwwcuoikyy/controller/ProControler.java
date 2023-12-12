package com.example.wwwcuoikyy.controller;

import com.example.wwwcuoikyy.models.Employee;
import com.example.wwwcuoikyy.models.Product;
import com.example.wwwcuoikyy.repos.EmpRepo;
import com.example.wwwcuoikyy.repos.ProRepo;
import com.example.wwwcuoikyy.services.EmpService;
import com.example.wwwcuoikyy.services.ProService;
import com.example.wwwcuoikyy.services.ProServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/testAdmin")
public class ProControler {
    @Autowired
    private ProService proService;

    @Autowired
    private EmpService empService;
    @GetMapping("/Home")
    public String test(Model model){

        List<Product> lst = proService.getAll();
        model.addAttribute("list", lst);

        List<Employee> lstEmp = empService.getAllEmp();
        model.addAttribute("listEmp", lstEmp);
        return "Admin/index";
    }

    @GetMapping("/ShowFormAdd")
    public String add(Model model){
        Product product = new Product();
        model.addAttribute("product",product);

        List<Employee> lstEmp = empService.getAllEmp();
        model.addAttribute("lst", lstEmp);
        return "Admin/add-Product";
    }

    @PostMapping("/action")
    public String addAction(@ModelAttribute("product") Product product){
        proService.addPro(product);
        return "redirect:/testAdmin/Home";
    }
    @GetMapping("/ShowFormEdit/{id}")
    public String edit(@PathVariable(value = "id") long id, Model model){
        Product product = proService.getById(id);
        model.addAttribute("product",product);
        return "Admin/edit-Product";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") long id){
        this.proService.delete(id);
        return "redirect:/testAdmin/Home";
    }
    @GetMapping("/ShowFormAddEmp")
    public String addEmp(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "Admin/add-Employee";
    }
    @PostMapping("/add-Emp")
    public String addActionEmp(@ModelAttribute("employee") Employee employee){
        empService.addEmp(employee);
        return "redirect:/testAdmin/Home";
    }
}
