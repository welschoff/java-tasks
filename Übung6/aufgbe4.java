package Übung6;

import java.util.Scanner;

public class aufgbe4 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie Ihr Anfangskapital ein:");

        double ak = sc.nextInt();
        double jahre = 30;
        double zinssatz = 0.10;
        double ek = ak;
        double gekürzt;

        double ekFormel = ak * Math.pow(1 + zinssatz, jahre);
        ekFormel = Math.floor(ekFormel * 100.0) / 100.0;
        System.out.println("Version1= " + ekFormel);


        for (int i = 0; i <= jahre; i++) {
            ek = (ek * (1 + zinssatz));
            sc.close();
        }
        
        gekürzt = Math.floor(ek * 100) / 100;
        System.out.println("Version2= " + gekürzt);
        System.out.println("Diff=" + (gekürzt - ekFormel));
        System.out.println("Diff=" + (gekürzt - ekFormel) * 100000);
    }
}
