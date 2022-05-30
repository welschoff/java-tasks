package Übung6;

import java.util.Scanner;

public class aufgabe5 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int monate = sc.nextInt();
        
        int erwachsene = 2;
        int babys = 0;
        int reifeRatten = 0;
        int gesamt;

        for (int monat = 0; monat <= monate; monat++) {

            gesamt = erwachsene + reifeRatten + babys;

            if (monat >= 2) {
                erwachsene = reifeRatten + erwachsene;
            }

            reifeRatten = babys;
            babys = erwachsene *6;

            System.out.println("Anzahl Ratten nach " + monat + " Monaten ist " + gesamt);
            
            sc.close();
        }

    }
}
