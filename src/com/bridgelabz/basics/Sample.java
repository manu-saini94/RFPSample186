package com.bridgelabz.basics;

public class Sample {

    public static void main(String[] args) {
        System.out.println(VariableTypes.staticVar);
        VariableTypes.m1();
//        System.out.println(staticVar);
        VariableTypes obj1 = new VariableTypes();
        System.out.println(obj1.instanceVar);
        obj1.m2();

        obj1.m1();
        System.out.println(obj1.staticVar);



    }
}
