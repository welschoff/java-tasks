package Übung3;
public class aufgabe6 {
    
    public static void main(String[] args){
        
        boolean result;

        boolean wert1 = true;
        boolean wert2 = true;

        for (int i = 0; i < 4; i++) {        
            result = !((!wert1) && wert2);
            System.out.println("wert1: " + wert1 + " wert2: " + wert2 + " result = " + result);

            wert1 = !wert1;

            if (i == 2) wert2 = !wert2;
        }
     }
}