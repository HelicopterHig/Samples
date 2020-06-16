package com.company;
import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int q = (a * 100 )+ b;
        int z = (c * 100 )+ d;
        int p = z - q;
        int e = 0;
        int f = 0;

        if (z >= q) {
          //  if ( c > a ) {
             //   e = (c - 1) - a ;
            //    f = e * 100 + f;
              //  if ( p < 100) {
                   // e = 0;
                    f = (z - q) % 100 ;
                    e = ((( z - q)/100) );
               // }
              //  e = ( q - z)/ 100;
                System.out.print(e + " "  );
                System.out.print(f );
           // }//else {
                //System.out.println("мало");

             //   System.out.print(e  );
              //  System.out.print(f );
            } else {
            System.out.println("мало");
            }

        }

    }
