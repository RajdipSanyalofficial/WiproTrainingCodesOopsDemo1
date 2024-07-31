/**
 * Program to define a class with properties and methods for student object to implement OOPS
 */

package oopsdemo1;

import java.util.Scanner;

// Instance class
public class Student {

    //Define properties/state/attributes
    private int rollNumber;
    private String name,course;
    private float marks1,marks2,marks3,total;

    Scanner sc= new Scanner(System.in);

    // Define methods/behaviour/actions of a student object
    public void inputStudentDetails()
    {
        System.out.println("Enter Roll Number,Name & Course :");
        rollNumber=sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
        course=sc.next();

        System.out.println("Enter Marks for 3 Subjects :");
        marks1=sc.nextFloat();
        marks2=sc.nextFloat();
        marks3=sc.nextFloat();
    }

    public float calculateMarks()
    {
        total=marks1+marks2+marks3;
        return total;
    }

    public void display()
    {
        System.out.println("************ Student Details ************");
        System.out.println("Roll Number         : "+rollNumber);
        System.out.println("Student Name        : "+name);
        System.out.println("Course              : "+course);
        System.out.println("Total Marks         : "+total);
        System.out.println("*****************************************");
    }
}
