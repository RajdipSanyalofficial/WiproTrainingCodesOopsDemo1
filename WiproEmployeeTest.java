/**
 * User program to test Employee class Methods
 * Program to display Salary slip of Employee
 */


package oopsdemo1;

public class WiproEmployeeTest {

    //create objects of Employee class

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        //Invoke methods
        System.out.println("*************Enter Wipro Employee Salary Slip ***********");
        employee1.inputEmployeeDetails();
        employee1.calculateNetSalary();
        employee1.displayNetSalary();

        employee2.inputEmployeeDetails();
        employee2.calculateNetSalary();
        employee2.displayNetSalary();

        employee3.inputEmployeeDetails();
        employee3.calculateNetSalary();
        employee3.displayNetSalary();

    }
}
