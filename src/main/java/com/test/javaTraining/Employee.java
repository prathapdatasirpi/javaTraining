package com.test.javaTraining;

public class Employee {
    // Creating instance variable
    String name;
    int empId;
    // Creating constructor for Employee with name and empId
    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
        System.out.println("Assigned Employee name : " + name + " and Id :" + empId + " to the class variables using constructor");
    }
    void printEmployeeDetails() {
        System.out.println("Employee name : " + this.name);
        System.out.println("Employee Id : " + this.empId);
    }
}
