package com.company;

import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args) {
        // takes the input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
