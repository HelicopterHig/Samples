package com.company;
import java.util.Scanner;


public class Elephant {
        public static void main(String[] args) {
            // put your code here
            Scanner sc = new Scanner(System.in);
            int el_x = sc.nextInt();
            int el_y = sc.nextInt();
            int oth_x = sc.nextInt();
            int oth_y = sc.nextInt();
            // int abs = el_x - el_y
            // int abs

           // if ((( Math.abs(el_x - el_y )) == ( Math.abs(oth_x - oth_y) ) ) )
           // if (( el_x - oth_y == el_y - oth_x ) || ( el_x + oth_y == el_y + oth_x))
            if (( el_x - oth_y == el_y - oth_x ) || ( el_x + oth_y == el_y + oth_x))
            {
                System.out.println("YES");
               // System.out.println( Math.abs(el_x - el_y ));
            }else{
                System.out.println("NO");
                System.out.println( Math.abs(el_x - el_y ));
            }
        }

}
