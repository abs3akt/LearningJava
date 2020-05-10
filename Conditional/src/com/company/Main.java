package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        conditional();
    }

    public static void conditional(){
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue;
        System.out.println("Enter first number ");
        first = num.nextInt();
        isTrue = first == 51;

        if (first >= second && isTrue){
            System.out.println("First Num is " + first + "\n");
        }else if(first == 45){
            System.out.println("Second Num is " + second);
        }else {
            System.out.println("Num is False");
        }

        switch (first) {
            case 41:
                System.out.println("first is " + first);
                break;
            case 50:
                System.out.println("first is " + first);
                break;
            case 600:
                System.out.println("first is " + first);
                break;
            case 43:
                System.out.println("first is " + first);
                break;
            default:
                System.out.println("default");
                break;
        }

    }




}
