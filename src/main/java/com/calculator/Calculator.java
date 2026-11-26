package com.calculator;

import java.util.Scanner;

public class Calculator {
	  public boolean isPositive(int number) {
	        if (number > 0) {
	            return true;
	        } else if(number < 0){
	            return false;
	        }
	        else if(number > 0){
	            return true;
	        }
	        else {
	        	return false;
	        }
	        
	    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Addition = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
  

}