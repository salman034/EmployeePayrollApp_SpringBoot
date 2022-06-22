package com.bridgelabz.employeepayrollapp.dto;

public class EmployeePayrollDTO {
    public  String name;
    public long salary;

    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name=" + name + " : salary="+ salary;
    }
}