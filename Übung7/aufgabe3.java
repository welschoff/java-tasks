package Übung7;

public class aufgabe3 {
    
    public static void main(String[] args) {

        int a = 0;
        int summe;

        for(int i = 10; i <= 200; i+=10 ) {

            summe = a + i;
            System.out.println(summe + " int");
            byte b = (byte)summe;
            System.out.println(b + " byte");
            float c = (float)summe;
            System.out.println(c + " float");
        }
    }

}
