package com.bridgelabz.basics;

// 2 types of methods
// static and non-static

// 3 types of variables.
// Local , Instance , Static

// Local Variables
// Declared within the method or a block
// It is mandatory to initialize
// Can be accessed only within the method or block where it is declared.
public class VariableTypes {

    // Static variable declared within the class but outside of any of the methods
    // Declared using static keyword
    // Will get the memory when class loading is happening by class loader after compi
    // It is not mandatory to initialize.
    // If I am not inititalizing , it will take the default value according to the data type
    // There will be only one copy of this variable at class level which will be shared throughout the class
    // Will be accessed directly within the same class
    // Outside the class , we can access using class name.

    static int staticVar; // 0

    // Instance variable declared within the class but outside of any of the methods
    // Declared without using static keyword
    // Will get the memory when Object of the class is created
    // It is not mandatory to initialize.
    // If I am not inititalizing , it will take the default value according to the data type
    // There will be only one copy of the variable at Object level.
    // Will be accessed using the object everywhere except non-static method of the same class

    int instanceVar; // 0

    static void m1(){
        System.out.println("m1()");
        System.out.println("before " + staticVar); // 0
        staticVar = 10;
        System.out.println("after " + staticVar); // 10
    }

    // Non-static method => Object Level Method

    void m3(){
        System.out.println("m3");
    }
    void m2(){
        System.out.println(staticVar);
        m1();
        m3();
        int instanceVar = 10;
        System.out.println("m2()");
        System.out.println(instanceVar);  // priority will be given to local variable if the variable name is same as instance Variable
        System.out.println(this.instanceVar); // To access to instance variable , I require 'this' keyword
        // this keyword refers to the current object
        // Current object =>  the object with which m2() is called
    }

    public static void main(String[] args) {
        System.out.println("main()");
        System.out.println("bef " + staticVar); // 0
        m1();
        System.out.println(staticVar); // 10
        staticVar = 20;
        System.out.println("aft " + staticVar); // 20

        VariableTypes obj1 = new VariableTypes(); // instance variable gets the memory and initialization happens
        obj1.m2();
        System.out.println(obj1.instanceVar);

//        System.out.println(instanceVar);
    }
}
