package com.bridgelabz.basics;

// public , private , protected , default
public class AccessSpecifiers {

    private int x1;
    private static int y1;
    private void m1(){

    }
    private static void method1(){

    }

    int x2;
    static int y2;
    void m2(){

    }
    static void method2(){

    }


    public int x3;
    public static int y3;
    public void m3(){

    }
    public static void method3(){

    }

    protected int x4;
    protected static int y4;
    protected void m4(){

    }
    protected static void method4(){

    }

    public static void main(String[] args) {
       AccessSpecifiers obj = new AccessSpecifiers();
        System.out.println(obj.x1);
        obj.m1();
        System.out.println(y1);
        method1();

        System.out.println(obj.x2);
        obj.m2();
        System.out.println(y2);
        method2();

        System.out.println(obj.x3);
        obj.m3();
        System.out.println(y3);
        method3();

        System.out.println(obj.x4);
        obj.m4();
        System.out.println(y4);
        method4();


    }
}
