/**
 * Program to enter Employee details, calculate net salary and display salary slip
 */


package oopsdemo1;

import java.util.Scanner;

//Instance class - Encapsulation - packing properties and methods in a unit
public class Employee {

    //Data abstraction - Define properties and methods as per application in hand

    private int empId;
    private String firstName,lastName,desig;
    private double basic,hra,da,grossSalary,netSalary;
    private static final double TAX=1000;

    Scanner sc = new Scanner(System.in);

    // DefaultConstructor() - Java compiler creates default constructor for initialization
    //object properties.

    //define methods
    public void inputEmployeeDetails()
    {
        System.out.println("Enter Employee ID, First Name, Last Name & Designation :");
        empId=sc.nextInt();
        firstName=sc.next();// input single word
        lastName=sc.next();
        sc.nextLine();
        desig=sc.nextLine();// input multiple Words
        System.out.println("Enter Employee Basic Salary :");
        basic=sc.nextDouble();
    }

    public void calculateNetSalary()
    {
        hra=basic*0.25;
        da=basic*0.15;
        grossSalary=basic+hra+da;
        netSalary=grossSalary-TAX;
    }

    public void displayNetSalary()
    {
        System.out.println("************* Employee Salary Slip ***********");
        System.out.println("Employee Id   :  "+empId);
        System.out.println("Employee Name :  "+firstName+" "+lastName+" - "+desig);
        System.out.println("Basic Salary  :  "+basic);
        System.out.println("HRA           :  "+hra);
        System.out.println("DA 			      :  "+da);
        System.out.println("Gross Salary  :  "+grossSalary);
        System.out.println("Tax           :  "+TAX);
        System.out.println("-------------------------------------------------");
        System.out.println("Net Salary    :  "+netSalary);
        System.out.println("-------------------------------------------------");
    }

}
