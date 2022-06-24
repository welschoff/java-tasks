package Übung8;

public class aufgabe5 {
    
    static int x = 5;
    static int y = 10;
    static int multiplikation = x * y;
    public static void main(String[] args) {
        System.out.println(multiplikation);

        int addition = 0;

        for(int i = 5; i <= multiplikation; i++) {
            addition = i;
        }

        System.out.println(addition);

        rekursiv(5);
    }

    public static void rekursiv(int x) {
        ++x;
        if(x < multiplikation) {
            rekursiv(x);
        }
        System.out.println(x);
    }
}
