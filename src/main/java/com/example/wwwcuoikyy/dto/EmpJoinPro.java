package com.example.wwwcuoikyy.dto;

import com.example.wwwcuoikyy.models.EmpRoles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmpJoinPro {
    private long emp_id;
    private String emp_name;
    private LocalDate birthD;
    private EmpRoles role;
    private long pro_id;
    private String pro_name;
}
