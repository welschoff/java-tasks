package Übung9;

import java.util.Arrays;

public class aufgabe3 {
    
    public static void main(String[] args) {

        double[] x = {5.0, 9.0, 11.0, 45.0, 21.0, 26.0, 7.0, 65.0};

        double summe = 0.0;

        for(int i = 0; i < x.length; i++) {
            summe += x[i];
        }

        double mittelwert = summe / x.length;
        System.out.println("Mittelwert " + mittelwert);
        
        Arrays.sort(x);
        double kleinereZahl = 0.0;
        double größereZahl = 0.0;
        
        for(int i = 0; i < x.length; i++) {
            if(x[i] < mittelwert && x[i] > kleinereZahl) {
                kleinereZahl = x[i];
            }
        }
        System.out.println("Nächstkleinere Zahl " + kleinereZahl);

        for(int i = 0; i < x.length; i++) {
            if(x[i] > mittelwert) {
                größereZahl = x[i];
                break;
            }
        }
        System.out.println("Nächstgrößere Zahl " + größereZahl);

        double zahl1 = mittelwert - kleinereZahl;
        double zahl2 = größereZahl - mittelwert;

        if(zahl1 < zahl2) {
            System.out.println(kleinereZahl);
        } else {
            System.out.println(größereZahl);
        }
    }
}
