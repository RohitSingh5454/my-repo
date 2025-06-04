package com.example.demoCompositeKey.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_data")

public class EmployeesData {
    @EmbeddedId
    private EmployeesDataId EmployeesDataId;
    private String name;
    private String email;
    private String city;
    String str="Pawan";
    private int number;

    public EmployeesData() {
    }

    public EmployeesData(String name, String email,String city) {
        this.name = name;
        this.email = email;
        this.city=city;
    }
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city=city;
    }

    public EmployeesDataId getEmployeesDataId() {
        return EmployeesDataId;
    }

    public void setEmployeesDataId(EmployeesDataId EmployeesDataId) {
        this.EmployeesDataId = EmployeesDataId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
