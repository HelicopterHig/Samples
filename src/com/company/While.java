package com.company;
import java.util.Scanner;
import java.lang.*;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int i = 0;
       // int m = 0;
        //if () {
        //}
        while ( i <= q ) {

            //m = (int) (Math.sqrt(i) % 1);
            if ( (Math.sqrt(i) % 1) == 0  ){

                System.out.println(i);

               //System.out.println( i);
            }
            i = ++i;
        }

    }
}
