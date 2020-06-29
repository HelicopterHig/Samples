package com.company;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        int m = 1;
        String q;
        //  String q;


     //   for (; m != 0; ) {
            while ((a  != 0)){

            m = a / 2;
            b = a % 2;
            a = m;
            //System.out.println( b);
           // q = b + " b"  ;
                System.out.print(b);



        }
    }
}

