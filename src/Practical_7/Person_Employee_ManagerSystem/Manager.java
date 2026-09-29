package Practical_7.Person_Employee_ManagerSystem;


public class Manager extends Employee {

    private int teamSize;
    private String department;

    public Manager(String name, int age, int employeeId,
                   double salary, int teamSize, String department) {

        super(name, age, employeeId, salary);
        this.teamSize = teamSize;
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name +
                " is managing the " +
                department + " department.");
    }

    public void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}