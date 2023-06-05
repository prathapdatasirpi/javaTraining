package com.test.javaTraining;

public class Employee {
    // Creating instance variable
    String name;
    int empId;
    long salary;
    // Creating constructor for Employee with name, empId and salary
    Employee(String name, int empId, long salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }
    // Declaring a public method/Function in class
    public void printEmployeeDetails() {
        System.out.println("Employee name : " + this.name);
        System.out.println("Employee Id : " + this.empId); 
        //calling private method accessible only within class
        this.printEmployeeSalary();
    }
    //Declaring private method
    private void printEmployeeSalary() {
        System.out.println("Employee salary in private method: " + this.salary);
        // Calling protected method within class
        this.assignSalary(50000);
    }
    // Declaring protected method
    protected void assignSalary(long salary) {
        this.salary = salary;
        System.out.println("Employee salary in protected method : " + this.salary);
    }
}
