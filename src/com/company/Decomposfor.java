package com.company;
import  java.util.Scanner;


public class Decomposfor {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int m = 0;


            for (  ; a <= b; ++a) {
                for ( ; ((a % 3) == 0 && (a % 5) != 0); ++a  ){
                    m = ++m;
                }
                //  m +=a ;
                // System.out.println( m  );

                // a = ++a;
            }
            System.out.println( m  );

        }
    }



