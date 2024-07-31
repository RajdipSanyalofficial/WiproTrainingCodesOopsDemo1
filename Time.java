/**
 *
 * Java program to perform addition of 2 Times
 *  * t1 --> 12 : 45 :55
 *  * t2 --> 10 : 30 :30
 *  *        23    16 :25
 *  *
 *  * t1 + t2
 *  *   if sec> 60 .. mins should be incremented by 1 & sec -60 ,
 *  *   if min> 60  ... hrs should be incremented by 1 & min -60
 */

package oopsdemo1;

public class Time {

    private int hrs,min,sec;

    public Time(int hrs, int min, int sec) {
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
        System.out.println(this.hrs+" : "+this.min+" : "+this.sec);
    }

    public void add (Time obj) {
        this.hrs += obj.hrs;
        this.min += obj.min;
        this.sec += obj.sec;


        if (this.sec >= 60) {
            this.sec -= 60;
            this.min++;
        } else if (this.min > 60) {
            this.min -= 60;
            this.hrs++;
        }
    }


    public void display()
    {
        System.out.println("The addition of  t1 and t2 is :");
        System.out.println(this.hrs+" : "+this.min+" : "+this.sec);
    }
}
