package com.bridgelabz.oops;

import com.bridgelabz.basics.AccessSpecifiers;

public class Sample3 extends AccessSpecifiers {

    public static void main(String[] args) {
        AccessSpecifiers obj = new AccessSpecifiers();
//        System.out.println(obj.x1);
//        obj.m1();
//        AccessSpecifiers.method1();
//        System.out.println(AccessSpecifiers.y1);

//        System.out.println(obj.x2);
//        obj.m2();
//        System.out.println(AccessSpecifiers.y2);
//        AccessSpecifiers.method2();

        System.out.println(obj.x3);
        obj.m3();
        System.out.println(AccessSpecifiers.y3);
        AccessSpecifiers.method3();

        Sample3 obj2 = new Sample3();
        System.out.println(obj2.x4);
        obj2.m4();
        System.out.println(AccessSpecifiers.y4);
        AccessSpecifiers.method4();
    }
}
