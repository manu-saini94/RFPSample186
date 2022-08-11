package com.bridgelabz.basics;


// Naming Convention
// class,interface,enum => Pascal case . Eg=>  EmployeeWage
// variables, methods => Camel case. Eg=> dieCount , showDetails()
// Constants => Uppercase with underscores . Eg=> WAGE_PER_HOUR
public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;

    static final int FULL_DAY_HOUR = 8;


    public static void main(String[] args) {


        System.out.println("Welcome to Employee Wage Calculator");
        int empPresent = (int)Math.floor(Math.random()*10) %2;
        int empWage = 0;
        if(empPresent == 1) {
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee Present");
        } else
            System.out.println("Emplolyee Absent");

        System.out.println("Employee Daily Wage => "+ empWage);
    }
}
