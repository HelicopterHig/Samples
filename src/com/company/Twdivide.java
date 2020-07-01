package com.company;

import java.util.Scanner;
public class Twdivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt() ;
        int q = 0;
        int m = 0;

        while (true){
            int a = sc.nextInt();
            ++q;


            if ( a % 2 == 0){
                ++m;
            }
            if ( q == b){
                System.out.println(m);
                break;
            }
        }
    }
}
