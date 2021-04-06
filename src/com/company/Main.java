package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("chon cach chuyen doi");
        System.out.println("number 1: C => F");
        System.out.println("number 2: F => C");
        System.out.println("number 0: end.");
        double num = sc.nextInt();
        if(num == 1){
            double c = enter(sc);
            double resultC = changeC(c);
            System.out.println("do F la : " + resultC);
        }else if(num == 2){
            double f = enters(sc);
            double resultF = changeF(f);
            System.out.println("do C la : " + resultF);
        }else if(num == 0){
            System.out.println("end change");
        }
    }
    public static double enters(Scanner sc){
        System.out.println("enter F");
        double f = sc.nextDouble();
        return f;
    }
    public static double enter(Scanner sc){
        System.out.println(" enter C");
        double c = sc.nextDouble();
        return c;
    }
    public static double changeC(double c){
        double f = (1.8*c)+32;
        return f;
    }
    public static double changeF(double f){
        double c = (f - 32)/1.8;
        return c;
    }
}
