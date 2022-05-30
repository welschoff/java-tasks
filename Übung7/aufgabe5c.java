package Übung7;

import java.util.Scanner;

public class aufgabe5c {
 
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;

        if (i < 0) {
           a = 1;
           System.out.println("a = " + a);
           b = 2;
           System.out.println("b = " + b);
        } else {
            c = 3;
            System.out.println("c = " + c);
        }

        
        sc.close();
}
}
