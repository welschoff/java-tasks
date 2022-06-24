package Übung9;

import java.io.FileReader;
import java.io.IOException;

public class aufgabe4 {
public static void main(String[] args) {
    
    try {
        // öffne Datei
        FileReader f = new FileReader(args[0]);

        // lese ein Zeichen nach dem anderen
        // ( dies muss hier wegen der durchgefuehrten Operation int sein )
        int gelesenesZeichen;
        int anzahl = 0;
        while((gelesenesZeichen = f.read()) != -1) {
            
            char c = (char)gelesenesZeichen;

            // ...hier kommt Ihr Teil mit dem gelesenen Zeichen in der Variable c
            if(c >= 65 && c <= 90 | c >=97 && c<= 122) {
                anzahl++;
            } 
            }
            System.out.println(anzahl);
        f.close();
    } catch (IOException e) {
        System.out.println("Datei nicht vorhanden");
        System.exit(1);
    }
}
}