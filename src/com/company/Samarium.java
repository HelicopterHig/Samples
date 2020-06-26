package com.company;

import java.util.Scanner;

public class Samarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = 0;
        int m = 0;
        int q = 0;

        // for (; b > 0; ){
        for (;b != 0; )
        {
            a = b % 10;
            b = b / 10;

           // q = ++a;
            m = m + a;
           // b = m;
        // b = a;
           // b = b - m;
          //  System.out.println("b = " + b);
          //  System.out.println("a =" + a);
         //   System.out.println("q =" + q);
           // System.out.println("m =" + m);

        }
        System.out.println("m =" + m);
       /* System.out.println("b = " + b);
        System.out.println("a =" + a);
        System.out.println("q =" + q);*/
        //}
      /*  System.out.println( "m = " +  m  );
        System.out.println( "a =" + a);*/

    }
}
