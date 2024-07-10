package com.javapractice;

public class EmployeeInfo {
    public static void main(String[] args) {
        System.out.println("primitive data types / variables in java");
        /*
        String is a sequence of characters. In java String is an object
        String is not a primitive data type
         */
        String EmployeeName;
        EmployeeName ="prasanth";
        System.out.println("EmployeeName : " + EmployeeName);
        /*
        char is 16 bit unicode character. It is used to store a single character.
         */
        char Gender;
        Gender = 'M';
        System.out.println("Gender :" + Gender);
        /*
        byte is an '8-bit' signed integer. It has minimum value is -128 and maximum value is 127
         */
        byte age;
        age = 45;
        System.out.println("age : " + age);
        /*
        short is an '16-bit' signed integer. It has minimum value is -32768 and maximum value is 32767
         */
        short PerMonthSalary;
        PerMonthSalary = 30000;
        System.out.println("PerMonthSalary : " + PerMonthSalary);
        /*
        int is an '32-bit' signed integer. It is one of the commonly used data type in whole numbers
         */
        int AnualSalary;
        AnualSalary = 360000;
        System.out.println("AnualSalary : " + AnualSalary);
        /*
        float : A single precision '32-bit' IEEE 754 floating point
        It is used to save memory in large arrays of floating point numbers
         */
        float Incenstives;
        Incenstives = 3674.27F;
        System.out.println("Incenstives : " + Incenstives);
        /*
        boolean is a type with two possible values. Either true or flase
         */
        boolean IsPermanentEmployee;
        IsPermanentEmployee = true;
        System.out.println("IsPermanentEmployee : " + IsPermanentEmployee);
        /*
        long is an '64-bit' signed integer. It is used in wider range that int is needed
         */
        long EmployeeNumber;
        EmployeeNumber = 977644837L;
        System.out.println("EmployeeNumber : " + EmployeeNumber);
        /*
        double : A double precision '64-bit' IEEE 754 floating point
        It is generally used for decimal values just like float
         */
        double AverageAnualIncome;
        AverageAnualIncome = 3200000.20;
        System.out.println("AverageAnualIncome : " + AverageAnualIncome);


    }
}
