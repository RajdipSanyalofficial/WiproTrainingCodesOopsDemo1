/**
 * Java Program to Demonstrate Encapsulation using  Setter() and Getter() methods
 */

package oopsdemo1;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args)
    {
        Book b1=new Book();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Book Id, Book Name,Price,Publisher :");
        int bookId=scanner.nextInt();
        scanner.nextLine();
        String bookName=scanner.nextLine();
        float price= scanner.nextFloat();
        scanner.nextLine();
        String publisher=scanner.nextLine();

        //Invoke setter methods - input

        b1.setBookId(bookId);
        b1.setBookName(bookName);
        b1.setPrice(price);
        b1.setPublisher(publisher);

        //Invoke getter methods for - output

        System.out.println("*********************Book Details****************");
        System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
        System.out.println("The Discount Price is :"+b1.calculateDiscountPrice());


        Book b2 =new Book();

        b2.setBookId(2000);
        b2.setBookName("Python Programming");
        b2.setPrice(700.25f);
        b2.setPublisher("Prime Publisher");

        //Invoke getter methods - output

        System.out.println("*****************Book Details***********");

        System.out.println("Book Id :"+b2.getBookId());
        System.out.println("Book Name :"+b2.getBookName());
        System.out.println("Price :"+b2.getPrice());
        System.out.println("Publisher :"+b2.getPublisher());
        System.out.println("Discount Price :"+b2.calculateDiscountPrice()); //Invoke use method
        System.out.println("******************************************");

        System.out.println();
        //Display Object properties using toString() method

        System.out.println(b1); // invokes toString() method of book class .

        //  If toString() is not present in book class , it will print hashcode of book objects.

        System.out.println(b2); //


    }
}
