package com.company;
import java.util.Scanner;

public class Twodivison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = 0;

        /*while ( a <= b){


            System.out.println();
        }*/
        for ( ; a <=b ; a++){
            if ( a % 2 == 0){
                System.out.println( a);
            }
        }
    }
}
