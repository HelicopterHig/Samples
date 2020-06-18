package com.company;

public class Dec {
    public static void main(String[] args) {
        int first = 15;
        int second = --first;
        System.out.println( second);
        System.out.println( first);
        second *= 2;
        System.out.println( second);
        int third = second - 13;
        System.out.println( third);
        if (first == third){
            System.out.println(--second);
        }else{
            System.out.println(third - first + second);
        }

    }
}
