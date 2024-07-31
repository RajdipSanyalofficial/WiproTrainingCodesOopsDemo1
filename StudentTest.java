/**
 * Java program to test Student class methods
 */

package oopsdemo1;

public class StudentTest {

    public static void main(String[] args)
    {
        //create reference and objects of student class
        Student s1 =new Student();
        Student s2 = new Student();


        // Invoke methods of student class using dot(.) operator

        s1.inputStudentDetails();
        float total=s1.calculateMarks();
        s1.display();
        System.out.println("The total marks displayed from main() :"+total);

        s2.inputStudentDetails();
        float total2=s2.calculateMarks();
        s2.display();
        System.out.println("The total marks displayed from main() :"+total2);
    }
}
