package com.example.demoCompositeKey.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmployeesDataId implements Serializable {

    private int emp_Id;
    private String dept_Id;

    public EmployeesDataId(int emp_Id, String dept_Id) {
        this.emp_Id = emp_Id;
        this.dept_Id = dept_Id;
    }

    public EmployeesDataId() {
    }

    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getDept_Id() {
        return dept_Id;
    }

    public void setDept_Id(String dept_Id) {
        this.dept_Id = dept_Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeesDataId that = (EmployeesDataId) o;
        return emp_Id == that.emp_Id && Objects.equals(dept_Id, that.dept_Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emp_Id, dept_Id);
    }
}
