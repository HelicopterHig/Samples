package com.company;

import java.util.Scanner;

public class Line {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = 0;
        int i = 0;

        while (true) {
            int b = sc.nextInt();
            m += b;
            ++i;

            if ( i == a) {
                System.out.println( m);
                break;
            }
        }

    }
}
