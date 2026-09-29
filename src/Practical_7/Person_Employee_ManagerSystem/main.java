package Practical_7.Person_Employee_ManagerSystem;


public class main {
    public static void main(String[] args) {

        Employee emp = new Employee("Rajesh", 20, 101, 35000);

        Manager mgr = new Manager(
                "Amit",
                35,
                201,
                75000,
                12,
                "IT"
        );

        emp.displayEmployeeDetails();
        emp.work();

        System.out.println();

        mgr.displayManagerDetails();
        mgr.work();
    }
}
