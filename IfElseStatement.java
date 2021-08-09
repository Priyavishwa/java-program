package com.company;

/**
 * Author : Priya V
 */

public class IfElseStatement {
    public static void main(String[] args){
        //Print your branch name
        String branch = "IT";
        if(branch == "IT"){
            System.out.println("Information Technology");
        }else if (branch == "Electronic"){
            System.out.println("Electronic");
        }else if (branch == "Electrical"){
            System.out.println("Electrical");
        }else {
            System.out.println("Invalid branch");
        }
    }
}
