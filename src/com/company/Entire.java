package com.company;
import  java.util.Scanner;

public class Entire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = 0;


        for (  ; a <= b; ++a) {

            m +=a ;
           // System.out.println( m  );

           // a = ++a;
        }
        System.out.println( m  );

    }
}
