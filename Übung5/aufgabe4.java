package Übung5;

import java.util.Scanner;

public class aufgabe4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double wert;
        double mws;
        double summe;

        System.out.println("Geben Sie den Artikel und die Anzahl an:");
        String artikel = sc.next();
        double anzahl = sc.nextInt();

        if (artikel.equals("Playstation")) {
            wert = 199;
            mws = 0.19;
            summe = (wert * 119) / 100;
        } else if (artikel.equals("Lakritzstangen")) {
            wert = 0.3;
            mws = 0.07;
            summe = (wert * 107) / 100;
        } else if (artikel.equals("Gummibaerchen")) {
            wert = 0.05;
            mws = 0.07;
            summe = (wert * 107) / 100;
        } else {
            wert = 0;
            mws = 0;
            summe = 0;
        }
        
        System.out.println(artikel + " =" + " Nettosumme: " + (anzahl * wert + "€") + " Mehrwertsteueranteil: " + (anzahl * wert * mws + "€") + " Gesamtsumme: " + (summe * anzahl + "€" ));

        sc.close();
    }
}
