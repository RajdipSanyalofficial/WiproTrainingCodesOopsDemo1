/**
 * Java program to add 2 complex numbers- real and imaginary
 */

package oopsdemo1;

public class ComplexTest {

    public static void main(String[] args) {

        //create object of complex number - real and imaginary parts
        //Invokes parameterized constructor automatically for initialization of object
        Complex complex1 = new Complex(10.3,67.4);
        Complex complex2=new Complex(0.7,3.6);

        Complex complex3 = new Complex(1.00,2.50);
        Complex complex4 =new Complex(20.70,3.6);


        complex1.add(complex2); // Invokes add() method by passing object in complex2
        complex1.display();

        complex3.add(complex4);
        complex3.display();
    }
}
