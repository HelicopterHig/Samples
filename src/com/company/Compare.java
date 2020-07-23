package com.company;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean is_more;
        int m = 0;
        int z = 0;
        ///for ( int i = 0; i != a; i++){
        while(true){
            int b = sc.nextInt();

           // m += b;
            if ( b > m ){
                z = b;
               //
                // break;
            }

           if (  m == a){
            //m = 0;
             break;
          }
           ++m;
           // if ( )
            System.out.println( z);
        }



    }
}
