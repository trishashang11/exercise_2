package com.exercise_2;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int num1=20;
        int num2=10;

        //arithmetic operators
        System.out.println("arithmetic operators");
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" * "+num2+" = "+num1*num2);
        System.out.println(num1+" / "+num2+" = "+num1/num2);
        System.out.println(num1+" % "+num2+" = "+num1%num2);

        System.out.println("");

        //comparison operators
        System.out.println("comparison operators");
        System.out.println("first number: "+num1+" second number: "+num2);
        if (num1>num2){
            System.out.println("first number is greater than second number");
        }else if (num1<num2){
            System.out.println("first number is less than second number");
        }else if (num1>=num2){
            System.out.println("first number is greater than or equal to second number");
        }else if (num1<=num2){
            System.out.println("first number is less than or equal to second number");
        }else if (num1==num2){
            System.out.println("first number is equal to second number");
        }else if (num1!=num2){
            System.out.println("first number is not equal to second number");
        }

        System.out.println("");

        //assignment operation
        System.out.println("assignment operation");
        int num=8;

        num +=3;
        System.out.println(num);
        num -=3;
        System.out.println(num);
        num *=3;
        System.out.println(num);
        num /=3;
        System.out.println(num);
        num %=3;
        System.out.println(num);

        System.out.println("");

        //increment and decrement operators
        System.out.println("increment and decrement operators");
        int numberApple=5;
        numberApple++;
        System.out.println(numberApple);

        int numberOranges=5;
        numberOranges--;
        System.out.println(numberOranges);

        int incrementOperatorA=5;
        int incrementOperatorB=5;

        int incrementOperatorC=incrementOperatorA*incrementOperatorB++;
        System.out.println(incrementOperatorC);

        int incrementOperatorD=incrementOperatorA*--incrementOperatorB;
        System.out.println(incrementOperatorD);

        byte b2=127;
        b2 %=7;
        byte b3=120;
        b3 &=40;
        short s1=300;
        s1 ^=100;
        byte b4=127;
        b4 >>=3;
        System.out.println(b2);

        System.out.println("");

        //type casting
        System.out.println("type casting");

        byte number=5;
        /* widening castring
        byte -> short -> char -> int -> long -> float -> double */
        short myShort=9;
        double myDouble=myShort;

        System.out.println(myShort);
        System.out.println(myDouble);

         /* narrowing castring
        double -> float -> long -> int -> char -> short -> byte */
        double mysecondDouble=9.78;
        short mysecondShort=(short) mysecondDouble;

        System.out.println(mysecondDouble);
        System.out.println(mysecondShort);
        System.out.println("");
        // conditional statements
        System.out.println("conditional statement");

        if(20>10){
            System.out.println("20 is greater than 10");
        }
        //or
        int time=18;
        String result=(time<18)?"Good day.":"Good evening.";
        System.out.println(result);

        System.out.println("");

        int day=7;

        System.out.println("if else statement");
        if(day==1){
            System.out.println("Monday");
        }else if (day==2){
            System.out.println("Tuesday");
        }else if (day==3){
            System.out.println("Wednesday");
        }
        else if (day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }
        else System.out.println("its another day");
        System.out.println("");
        //or
        System.out.println("or");
        String whatDay=(day==5)?"Friday":"its another day";
        System.out.println(whatDay);
        //or
        System.out.println("");
        System.out.println("switch case statement");
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("its another day");
        }

        //while loop
        System.out.println("");
        System.out.println("while loop");
        int x=1;

        while (x<=10){
            System.out.println("increment number"+x);
            x++;
        }
        //while loop exercise
        System.out.println("while loop exercise");
        System.out.println("problem: write a method with a while loop\n" +
                "        to prints 1 through n in square brackets.\n" +
                "        for example, if n=6 print.");
      int n=1;
        while (n<=6){
            System.out.print("["+n+"]");
            n++;
        }

        System.out.println("");
        Scanner sc=new Scanner(System.in)
        System.out.println("input number");
        int sum=sc.nextInt();
        while (sum<=5){
            System.out.print((sum+1)+"");
            sum++;
        }



    }
}
