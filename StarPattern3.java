package com.company;

import java.util.Scanner;

public class StarPattern3 {
    public static void main(String[] args) {
        // takes the input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        //int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();// goes to next line
        }

    }
}
