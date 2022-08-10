package com.bridgelabz.basics;

public class Sample2 {

    public static void main(String[] args) {
        AccessSpecifiers obj = new AccessSpecifiers();
//        System.out.println(obj.x1);
////        obj.m1();
////        AccessSpecifiers.method1();
////        System.out.println(AccessSpecifiers.y1);

        System.out.println(obj.x2);
        obj.m2();
        System.out.println(AccessSpecifiers.y2);
        AccessSpecifiers.method2();

        System.out.println(obj.x3);
        obj.m3();
        System.out.println(AccessSpecifiers.y3);
        AccessSpecifiers.method3();

        System.out.println(obj.x4);
        obj.m4();
        System.out.println(AccessSpecifiers.y4);
        AccessSpecifiers.method4();

        System.out.println("code done by me");
        System.out.println("branch2 changes");

    }
}
