package com.company;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //   int a = sc.nextInt();
        int m = 0;

        while(true) {
            int b = sc.nextInt();

            if ( b % 7 == 0){
                ///  continue;
                break;
            }
            if (b % 10 == 7){
                m +=  b;
                continue;
                //break;
            }




          //  break;
        }
        System.out.println( m);
    }

}
