/**
 * Instance and Main Class in a single class file
 */

package oopsdemo1;

import java.util.Scanner;

public class ThisKeywordDemo {
    private int number;
    private String text;

    //This keyword refers to current object in a method call
    public void setValues(int number, String text)
    {
        this.number=number;
        this.text=text;

    }

    public void display()
    {
        System.out.println("Number :"+this.number);
        System.out.println("text :"+this.text);
    }

    public static void main(String[] args)
    {
        ThisKeywordDemo demo =new ThisKeywordDemo();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        int num=sc.nextInt();

        System.out.println("Enter the text :");
        String text=sc.next();

        demo.setValues(num,text); //Invoke method
        demo.display();
    }
}
