package com.company;
import java.util.Scanner;

public class Lad {

        public static void main(String[] args) {
            // put your code here
            Scanner sc = new Scanner(System.in);
            int lad_x = sc.nextInt();
            int lad_y = sc.nextInt();
            int oth_x = sc.nextInt();
            int oth_y = sc.nextInt(); //1 8 5 8

            if ( ((lad_x == oth_x) || (lad_x != oth_x)) && ((lad_y == oth_y) || (lad_y != oth_y))) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

