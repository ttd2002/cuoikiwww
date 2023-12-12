package com.example.wwwcuoikyy.controller;

import com.example.wwwcuoikyy.dto.EmpJoinPro;
import com.example.wwwcuoikyy.models.Product;
import com.example.wwwcuoikyy.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Client")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/ListEmpJoinPro")
    public String test(Model model){

        List<EmpJoinPro> lst = empService.joinTale();
        model.addAttribute("list", lst);
        return "Client/empJoinPro";
    }
}
