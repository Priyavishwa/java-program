package com.company;

/**
* Author : Priya V
 */

public class MyDataType {
    public static void main(String[] args){
        //The byte data type can store whole numbers from -128 to 127
        byte myNum = 100;
        System.out.println(myNum);

        // short data type can store whole numbers from -32768 to 32767
        short myNum2 = 5000;
        System.out.println(myNum2);

        // int data type
        int myNum3 = 10000;
        System.out.println(myNum3);

        // long data type
        long myNum4 = 150000000000L;
        System.out.println(myNum4);

        // float data type
        float myNum5 = 5.75f;
        System.out.println(myNum5);

        // double data type
        double myNum6 = 19.99d;
        System.out.println(myNum6);

        // scientific number
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        // Boolean data type
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // Char data type is used to store a single character
        char myGrade = 'B';
        System.out.println(myGrade);

        // To print ASCII value
        char a=65, b=66, c=67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // String data type
        String greeting = "Hello world";
        System.out.println(greeting);
    }

}
