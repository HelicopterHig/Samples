package com.company;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;

public class Uniq {
    public static void main(String[] args) throws IOException {
       /* String name = "home/mr/Documents/door.txt";
        Path path = Paths.get(name);
        Scanner sc = new Scanner(path);
        sc.useDelimiter(" ");*/
        Scanner sc = new Scanner(System.in);
        HashSet<String> lines = new HashSet();
        while (  sc.hasNextLine() ){
            String line = sc.nextLine();
            if (!lines.contains(line)  ){
                System.out.println(line);
                lines.add(line);
            }


        }





    }
}
