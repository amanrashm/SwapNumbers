package com.aman;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
	// write your code here
        //WAP TO SWAP TWO NUMBERS
        System.out.println("Enter Number One");
        Scanner x = new Scanner(System.in);
        int A =x.nextInt();
        System.out.println("Enter Number Two");
        int B =x.nextInt();
        A=A-B; //Subtracting the second variable from the first variable and assign that value to the first variable.
        B=A+B; //Adding the value of both the variables and assign it to the second variable.
        A=B-A; //Subtracting the value of the first variable from the second variable and assign that value to the first variable.
        System.out.println("After Swapping numbers are: ");
        System.out.println(A);
        System.out.println(B);
    }
}
