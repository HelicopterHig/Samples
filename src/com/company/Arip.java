package com.company;

import java.util.Scanner;

public class Arip {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double m = 0;
    double b = 0;

        while (true){
            int a = sc.nextInt();
            m = m + a;
            b++;

            if (a == 0){
                System.out.println((m )/(b - 1 ));
            break;
            }
        }
    }
}
