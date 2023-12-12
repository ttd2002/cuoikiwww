package com.example.wwwcuoikyy;

import com.example.wwwcuoikyy.models.EmpRoles;
import com.example.wwwcuoikyy.models.Employee;
import com.example.wwwcuoikyy.models.Product;
import com.example.wwwcuoikyy.repos.EmpRepo;
import com.example.wwwcuoikyy.repos.ProRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootApplication
public class WwwCuoiKyyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WwwCuoiKyyApplication.class, args);
    }

    @Autowired
    private EmpRepo empRepo;
    @Autowired
    private ProRepo proRepo;

    @Bean
    CommandLineRunner create(){
        return args -> {
            String str = "09/12/2002";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
            LocalDate dateTime = LocalDate.parse(str, formatter);
            Employee emp1 = new Employee("Dai",dateTime, EmpRoles.ADMINISTRATION,null);

            Product pro1 = new Product("Giay adidos", emp1);
            Product pro2 = new Product("ao nile", emp1);
            List<Product> pros1 = List.of(pro1, pro2);

            emp1.setProducts(pros1);


            String str1 = "25/05/2002";
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d/MM/yyyy");
            LocalDate dateTime1 = LocalDate.parse(str, formatter);
            Employee emp2 = new Employee("Hao",dateTime1, EmpRoles.STAFF,null);

            Product pro3 = new Product("Giay ba lan xi a ga", emp2);
            Product pro4 = new Product("dep to ong", emp2);
            List<Product> pros2 = List.of(pro3, pro4);

            emp2.setProducts(pros2);

            empRepo.save(emp1);
            empRepo.save(emp2);


            proRepo.save(pro1);
            proRepo.save(pro2);

            proRepo.save(pro3);
            proRepo.save(pro4);

        };
    }
}
