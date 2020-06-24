package com.company;

import java.util.Scanner;

public class Sqareof {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = sc.nextInt();
        int m = 1;
       // int c = 1;

        /*while ( a <= b){


            System.out.println();
        }*/
        for (; a <= b; a++) {
            //if ( a % 2 == 0){
            m = a * m ;
            //a++;
            // System.out.println( m );
            // }
        }
        System.out.println(m);
    }
}
