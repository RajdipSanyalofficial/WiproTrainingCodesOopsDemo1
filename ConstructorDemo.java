/**
 * Java Program to demonstrate constructor
 */

package oopsdemo1;

public class ConstructorDemo {

    public static void main(String[] args)
    {
        //create Trainee object

        Trainee trainee1 =new Trainee(); //invokes implicit constructor automatically
        Trainee trainee2 =new Trainee(); //invokes implicit constructor automatically
        Trainee trainee3 =new Trainee(); //invokes implicit constructor automatically


        // Invokes Parameterized constructor automatically


        Trainee trainee4=new Trainee(200,"Rajdip Sanyal",24000.00f);
        Trainee trainee5=new Trainee(290,"Pritam Karmakar",40000.00f);



        trainee1.display();
        System.out.println();
        // for parameterized constructor
        trainee4.display();
        System.out.println();
        trainee5.display();



    }
}
