package Practical_7.Company_Employee_System;


public class Employee {

    private int employeeId;
    private String employeeName;
    private String designation;
    private double salary;

    public Employee(int employeeId, String employeeName, String designation, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void work() {
        System.out.println(employeeName + " is working as " + designation);
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}
