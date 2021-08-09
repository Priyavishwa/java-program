package com.company;

public class StarPattern2 {
    public static void main(String[] args) {
        int n = 5;
        // this loop is set from 1 to n
        for(int i=1; i<=n; i++){
            //j<=i here for loop is set to 1 to i value
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
