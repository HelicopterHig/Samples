package com.company;
import java.util.Scanner;

public class Unicorn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int dx = x1 - x2;
        int dy = y1 - y2;

        if (dx < 0) {
            dx = -dx;
        }
        if (dy < 0) {
            dy = -dy;
        }

        if ((dx + dy) == 3 && (dx != 0) && (dy != 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}




