/**
 * Program to add two Complex Numbers - Real and Imaginary
 */

package oopsdemo1;

public class Complex {

    private double real;
    private double imaginary;

    // Generate Constructor - all fields
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //methods to add 2 complex numbers
    public void add(Complex obj)
    {
        //complex1.real+=complex2.real
        this.real+=obj.real;

        //complex1.imaginary+=complex2.imaginary
        this.imaginary+=obj.imaginary;
    }

    public void display()
    {
        System.out.println("The addition of 2 complex number is :");
        System.out.println("r"+this.real+" i"+this.imaginary);
    }
}
