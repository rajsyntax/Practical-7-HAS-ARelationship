package Practical_7.Company_Employee_System;


public class Company {

    private String companyName;
    private String location;

    private Employee[] employees = new Employee[10];
    private int count = 0;

    public Company(String companyName, String location) {
        this.companyName = companyName;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
        employees[count] = employee;
        count++;
    }

    public void removeEmployee(Employee employee) {

        for (int i = 0; i < count; i++) {

            if (employees[i] == employee) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;
                break;
            }
        }
    }

    public void displayEmployees() {

        System.out.println("\nCompany Name: " + companyName);
        System.out.println("Location: " + location);

        System.out.println("\nEmployee List:");

        for (int i = 0; i < count; i++) {
            employees[i].displayEmployeeDetails();
        }
    }

    public void calculateTotalSalary() {

        double total = 0;

        for (int i = 0; i < count; i++) {
            total += employees[i].getSalary();
        }

        System.out.println("Total Monthly Salary = " + total);
    }
}
