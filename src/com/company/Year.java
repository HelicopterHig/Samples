package com.company;

import java.util.Scanner;

public class Year {



        public static void main(String[] args) {
            // put your code her
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            int res = year % 100 ;
            int ln = year % 400;

            if (( res != 0 )&& ( ln == 0) || ( year % 4 == 0) ) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

