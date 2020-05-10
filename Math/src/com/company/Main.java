package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        math_operators();
    }

    public static void math_operators(){
        Scanner num = new Scanner(System.in);
        int first, second, sum, subs, multiply, divide;
        System.out.println("Write first number");
        first = num.nextInt();
        System.out.println("Write second number");
        second = num.nextInt();
        sum = first + second;
        subs = first - second;
        multiply = first * second;
        divide = first / second;

        System.out.println("Sum of this numbers is " + sum);
        System.out.println("Sum after substract " + subs);
        System.out.println("Sum after multiple " + multiply);
        System.out.println("Sum after divide " + divide);
    }
}
