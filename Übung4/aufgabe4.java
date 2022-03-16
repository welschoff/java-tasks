package Übung4;

public class aufgabe4 {

public static void main(String[] args) {

    int zahl = 123;
    int summe = 0;

    while (zahl > 0) {
        summe += zahl % 10;
        zahl /= 10;
    }
    System.out.println(summe);
}    
}

