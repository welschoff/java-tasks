package Übung6;

import java.util.Scanner;

public class aufgbe4 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie Ihr Anfangskapital ein:");

        double ak = sc.nextInt();
        double jahre = 30;
        double zinssatz = 1.10;
        double ek = ak;
        double gekürzt;
        

        for (int i = 0; i <= jahre; i++) {
            ek = ek * zinssatz;
            sc.close();
        }
        gekürzt = ek * 100;
        System.out.println(Math.floor(gekürzt) / 100);
        System.out.println((Math.floor(gekürzt) / 100) - ak);
        System.out.println((Math.floor(gekürzt * 100000) / 100 - ak));
    }
}
