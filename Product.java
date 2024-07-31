/**
 * Java OOP to enter Product details , calculate discount price and display details.
 */

package oopsdemo1;

import java.util.Scanner;

public class Product {


    private int productId, qty;
    private String name;
    private float price, discount, finalPrice;

    public void inputProductDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product ID, Quantity , Name, Price and Discount % :");
        productId = scanner.nextInt();
        qty = scanner.nextInt();
        name = scanner.next();
        price = scanner.nextFloat();
        discount = scanner.nextFloat();
    }

    public void calculateDiscount() {
        finalPrice = -((discount / 100) * (price * qty)) + (price * qty);
    }

    public void displayProductDetails() {
        System.out.println("************* Product details ***********");
        System.out.println("Product Id         :  " + productId);
        System.out.println("Product Name       :  " + name);
        System.out.println("Price per item     :  " + price);
        System.out.println("Product Quantity   :  " + qty);
        System.out.println("Total Price        :  " + price * qty);
        System.out.println("Discount           :  " + discount + "%");
        System.out.println("-------------------------------------------------");
        System.out.println("Final Price        :  " + finalPrice);
        System.out.println("-------------------------------------------------");

    }
}