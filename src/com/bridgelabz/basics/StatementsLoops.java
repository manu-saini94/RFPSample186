package com.bridgelabz.basics;

import java.util.Scanner;

// 3 types of variables.
// Local , Instance , Static
public class StatementsLoops {

    // Local Variables
    // Declared within the method or a block
    // It is mandatory to initialize
    // Can be accessed only within the method or block where it is declared.

    static {
        System.out.println("static block");
        m1();
    }

    static void m1(){
        System.out.println("m1()");
        int x = 30;
        System.out.println(x);
//        System.out.println(i);
    }

    static int sum(int a, int b){
        System.out.println("sum()");

        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        // A variable is a container where we can store the data.
        System.out.println("main()");
        int i = 9;
        System.out.println(i);
 //     System.out.println(x);
         m1();
        int addition = sum(4,7);
        System.out.println(addition);

        if(i == 10){
            int x = 20;
            System.out.println("if block");

        } else{
            int y = 30;
            System.out.println("else block");
        }


        if (i == 10) {
            int x = 20;
            System.out.println("if block i = 10");
        }else
        if (i < 10) {
            System.out.println("i < 10");
        } else {
            int y = 30;
            System.out.println("else block");
        }

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();

        switch (ch){
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            case 3:
                System.out.println("This is case 3");
                break;
            default:
                System.out.println("This is default");
        }


        // Loops => for, while, do-while

        for (int j = 0; j < 10; j++) {
            int k = 10;
            System.out.print(j + " ");
        }
//        System.out.println(k);

        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int a = 10;
        System.out.println(a);
        int sum = a++ + ++a + ++a + ++a + a++;  // 10 + 12 + 13 + 14 = 63
        System.out.println(a);  // 15
        System.out.println("sum => " + sum);

        int m = 0;
        while (m < 10) {
            System.out.print(m + " ");
            m++;
        }

        System.out.println();
        int n = 0;
        do {
            System.out.print(n + " ");
            n++;
        } while (n < 10);

    }

}
