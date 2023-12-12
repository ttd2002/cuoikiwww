package com.example.wwwcuoikyy.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "emp_name")
    private String name;
    @Column(name = "birth_Date")

    private LocalDate birthDate;
    @Column(name = "role")

    private EmpRoles empRoles;

    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Product> products;

    public Employee() {
    }

    public Employee(String name, LocalDate birthDate, EmpRoles empRoles, List<Product> products) {
        this.name = name;
        this.birthDate = birthDate;
        this.empRoles = empRoles;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public EmpRoles getEmpRoles() {
        return empRoles;
    }

    public void setEmpRoles(EmpRoles empRoles) {
        this.empRoles = empRoles;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", empRoles=" + empRoles +
                ", products=" + products +
                '}';
    }
}
