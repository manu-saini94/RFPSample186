package com.bridgelabz.basics;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Calculator");
        int empPresent = (int)Math.floor(Math.random()*10) %2;
        if(empPresent == 1)
            System.out.println("Employee Present");
        else
            System.out.println("Emplolyee Absent");
    }
}
