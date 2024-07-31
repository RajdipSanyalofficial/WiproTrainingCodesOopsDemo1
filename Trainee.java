/**
 *
 */

package oopsdemo1;

public class Trainee {

    //properties
   private int id;
    private String name;
   private float salary;

   //constructor -- special method with same name of class and no return type
    //              used for initialization of object properties.

    //No-args / Implicit Constructor
    Trainee()
    {
        System.out.println("I am a No-Args Constructor");
        this.id=101;
        name="Rajdip Sanyal";
        salary=5000.00f;

    }

    //Generate Parameterized constructor
    // Right click -> generate -> Constructor using fields -> select all fields -> ok

    public Trainee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    //Method

    public void display()
    {
        System.out.println("Id    :"+this.id);
        System.out.println("Name    :"+this.name);
        System.out.println("Salary    :"+this.salary);

    }


}
