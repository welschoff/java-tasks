package Übung7;

public class aufgabe2 {
    
    public static void main( String[] args ) {
        int a= 5;
        a = a++;

       System.out.println(a);

       // a = a++ funktioniert nicht, da es 5 = 5 + 1 entspricht und man einer Zahl keiner Rechnung zuweisen kann. Deswegen bleibt die Ausgabe bei 5. 
       // Um die Variable a um 1 zu erhöhen müsste man lediglich a++ angeben.
    }
}
