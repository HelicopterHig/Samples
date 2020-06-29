package com.company;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b ;
        int m = 0 ;
        int i = 0;

        while ( true ){
            int a = sc.nextInt();
            if ( m < a){
                m = a;
                ++i;
            }else if  ( a ==0){
            System.out.println( i-1 );
            break;
            }
        }
    }
}
