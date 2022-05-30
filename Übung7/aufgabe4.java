package Übung7;

import java.util.Scanner;

public class aufgabe4 {
    
    public static void main ( String args [ ]) { 
        
        Scanner sc = new Scanner ( System . in ) ;
        String s = sc.next();

        // weitere Variablenvereinbarungen , wenn noetig 

        int kleinbuchstaben = 0;
        int großbuchstaben = 0;
        int ziffern = 0;

        for (int i = 0; i < s.length(); i++) { // s wird von vorne bis hinten durchlaufen
            char c = s.charAt(i);
            
            if(Character.isLowerCase(c)) kleinbuchstaben++;
            
            if(Character.isUpperCase(c)) großbuchstaben++;

            if(Character.isDigit(c)) ziffern++;
        }
        System.out.println(großbuchstaben + " Großbuchstabe/n");
        System.out.println(kleinbuchstaben + " Kleinbuchstabe/n");
        System.out.println(ziffern + " Ziffern");

        sc.close();
        } 
}
