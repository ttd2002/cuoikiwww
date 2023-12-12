package com.example.wwwcuoikyy.repos;

import com.example.wwwcuoikyy.dto.EmpJoinPro;
import com.example.wwwcuoikyy.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EmpRepo extends JpaRepository<Employee, Long> {
    @Query("SELECT new com.example.wwwcuoikyy.dto.EmpJoinPro (e.id, e.name, e.birthDate, e.empRoles, p.id, p.name) FROM Employee e join Product p on e.id = p.employee.id")
    public List<EmpJoinPro> joinTable();
}
