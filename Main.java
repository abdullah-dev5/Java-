package com.pluralsights.organized;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter Five Digits Number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int f=a%100000;
        int d=f/10000;
        System.out.println(d);
        f=a%10000;
        d=f/1000;
        System.out.println(d);
        f=a%1000;
        d=f/100;
        System.out.println(d);
        f=a%100;
        d=f/10;
        System.out.println(d);
        f=a%10;
        d=f/1;
        System.out.println(d);

    }
}














