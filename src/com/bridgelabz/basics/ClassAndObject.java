package com.bridgelabz.basics;

class Dog{

    // Compiler will create a default constructor if we are not creating ourselves.
    // If we are creating any constructor, then compiler will not create any default constructor
    Dog(){

    }

}

public class ClassAndObject {

    public static void main(String[] args) {

        // Constructor is a special method having same name as class name
        // Contructor is required to initialize an object
        // new keyword along with constructor call is called object creation


        Dog obj1 = new Dog(); // memory allocation is happening for the object.
        Dog obj2 = obj1; // Both obj1 and obj2 references are pointing to the same object


    }
}
