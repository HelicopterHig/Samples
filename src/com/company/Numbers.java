package com.company;
import java.util.Scanner;
public class Numbers {



        public static void main(String[] args) {
            // put your code here
            Scanner sc = new Scanner(System.in);
            int  a = sc.nextInt();
            int  b = sc.nextInt();
            int  c = sc.nextInt();

            if (( a > b) && (a > c)) {
                System.out.println(a);
            }else if (b > c ) {
                System.out.println ( b);
            }else {
                System.out.println(c);
            }

        }

}
