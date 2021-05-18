package com.kippbenjamin;
import java.util.Scanner;
/*
Create a shopping cart program with Java in the terminal
allow users to enter new items to their cart and calculate the total at check out.

- Get data from user
- Need to dynamically add items to an array
- Need to be able to add the price of items to another array
- Add error handling for incorrect users inputs
- Add message for user
*/

public class Main {
    String[] storeItems = {"MacBook", "Surface", "Linux", "Dell", "Samsung"};
    String[] items = {};
    int[] price = {};
    String[] cart = {};

     public void addToCart() {
        System.out.println("Welcome to my terminal store. \nHello shopper, chose from our selected items to add to your cart. \nYou can add items to your cart and get the total. Happy Shopping!!!");
        for (int i = 0; i < storeItems.length; i++) {
            System.out.println(storeItems[i]);
        }
        Scanner userInput = new Scanner(System.in);
        System.out.println("What items would you like to add? ");
        String value = userInput.next().trim();
        System.out.println(value + " has been saved in your cart!");
    }

    public void addPrice() {

    }

    public static void main(String[] args) {
         Main cartObj = new Main();
        cartObj.addToCart();
    }
}
