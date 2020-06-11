package com.company;
/*
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        if (( b > 0 ) || (b < 0)) {
            if (b > 0) {
                System.out.println("Ваше число положительное");
            } else {
                System.out.println("Ваше число отрицательное");
            }
        }else {
                System.out.println("Ваше число 0");
            }
        }




    }
