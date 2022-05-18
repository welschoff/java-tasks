package Übung5;

import java.util.Scanner;

public class aufgabe3_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number you want ot add");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x + y);

        sc.close();
    }
    
}
