package oopsdemo1;

public class TimeMain {

    public static void main(String[] args)
    {


        System.out.print("Time t1 :");
        Time t1 = new Time(14,30,55);
        System.out.println("Time t2 :");
        Time t2 = new Time(15,11,13);

        t1.add(t2); // t1 is accessed using add() method using this keyword
        t1.display();


    }


}
