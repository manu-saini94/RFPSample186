package com.bridgelabz.basics;

// Primitive and Non-Primitive
// Primtive(8) -> byte short int long float double char boolean
// Non-Primtive -> Arrays,Class,Interface,Enum

public class DataTypes {

    public static void main(String[] args) {
        byte b = 1;   //0   //1 byte
        short s = 2;  //0   //2 byte
        int i = 7;    //0   //4 byte
        long l = 10;  //0   //8 byte
        float f = 3.1F; // 0.0F  //4 byte
        double d = 7.8; // 0.0   //8 byte
        boolean bool = true; // false  //1 bit
        char c = 'A'; // \u0000  // 2 byte

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);

        //***********************************

        int[] arr = new int[10];
        int x = 10;
        String str = "ABC";  // null

        System.out.println(arr);
        System.out.println(str);


    }
}
