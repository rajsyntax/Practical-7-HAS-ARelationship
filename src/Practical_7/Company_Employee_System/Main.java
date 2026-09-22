package Practical_7.Company_Employee_System;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rajesh", "Developer", 30000);
        Employee e2 = new Employee(102, "Amit", "Tester", 25000);
        Employee e3 = new Employee(103, "Priya", "Manager", 50000);
        Employee e4 = new Employee(104, "Ravi", "Designer", 28000);
        Employee e5 = new Employee(105, "Neha", "HR", 35000);

        Company c1 = new Company("Tech Solutions", "Ahmedabad");

        // Add Employees
        c1.addEmployee(e1);
        c1.addEmployee(e2);
        c1.addEmployee(e3);
        c1.addEmployee(e4);
        c1.addEmployee(e5);

        System.out.println("Employees After Adding");
        c1.displayEmployees();
        c1.calculateTotalSalary();

        // Remove Employee
        c1.removeEmployee(e3);

        System.out.println("\nAfter Removing Employee ID 103");
        c1.displayEmployees();
        c1.calculateTotalSalary();

        // Employee still exists independently
        System.out.println("\nEmployee Exists Independently:");
        e3.work();
    }
}
